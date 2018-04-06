/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.kisti.osp.util.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kisti.osp.constant.OSPPropertyKeys;
import com.kisti.osp.constant.OSPRepositoryTypes;
import com.kisti.osp.util.service.base.FileLocalServiceBaseImpl;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * The implementation of the file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.util.service.FileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FileLocalServiceBaseImpl
 * @see com.kisti.osp.util.service.FileLocalServiceUtil
 */
public class FileLocalServiceImpl extends FileLocalServiceBaseImpl {
	private static Log _log = LogFactoryUtil.getLog(FileLocalServiceImpl.class);
	private String TEMP_DIR_NAME = "temp";
	
	private Path createBaseTemporaryFolderPath( Path realContextPath ) throws IOException{
		Path baseTempFolderPath = realContextPath.resolve("temp");
		if( Files.notExists(baseTempFolderPath) ){
			baseTempFolderPath = Files.createDirectory(baseTempFolderPath);
			baseTempFolderPath.toFile().deleteOnExit();
		}
		return baseTempFolderPath;
	}

	private Path createTemporaryFilePath( Path realContextPath, String prefix,  String suffix, boolean isFile ) throws IOException{
		Path baseTempFolderPath = this.createBaseTemporaryFolderPath(realContextPath);
//		System.out.println("rootFilePath: "+baseTempFolderPath);
		
		Path tempFilePath;
		if( isFile )
			tempFilePath = Files.createTempFile(baseTempFolderPath, prefix, suffix);
		else
			tempFilePath = Files.createTempDirectory(baseTempFolderPath, prefix );
		
		tempFilePath.toFile().deleteOnExit();
//		System.out.println("tempFilePath: "+tempFilePath);
		return tempFilePath;
	}
	
	private Path getUniqueUuidFilePath( Path baseFolderPath, String prefix, String suffix ){
		Path uuidFilePath = null;
		do{
			UUID uuid = UUID.randomUUID();
			Path uuidFileName = Paths.get(prefix+uuid.toString()+suffix);
			uuidFilePath = baseFolderPath.resolve(uuidFileName);
		} while( Files.exists(uuidFilePath) );

		return uuidFilePath;
	}
	
	
	private String extractExtension( String fileName ){
		int lastIndex = fileName.lastIndexOf('.');
		if( lastIndex < 0 )	return fileName;
		
		return fileName.substring(lastIndex);
	}
	
	private JSONArray lookUpFolder( File folder, String filter ) throws IOException{
		if( !folder.isDirectory() || !folder.exists() )		throw new FileNotFoundException(folder.getAbsolutePath());
		
		File[] files;
		if( filter == null || filter.isEmpty() )
			files = folder.listFiles();
		else
			files = folder.listFiles( new FileExtensionFilter(filter) );
		
		JSONArray fileInfos = JSONFactoryUtil.createJSONArray();
		for( File file : files ){
			JSONObject fileInfo = this.getFileInformation(file);
//			System.out.println("File Info: "+fileInfo.toString());
			fileInfos.put(fileInfo);
		}
		
		return fileInfos;
	}
	
	private JSONObject getFileInformation( File file ) throws IOException{
		JSONObject fileInfo = JSONFactoryUtil.createJSONObject();
		fileInfo.put("name", file.getName());
		fileInfo.put("size", this.convert2ReadableFileSize(file.length()));
		fileInfo.put("isFile", file.isFile());
		
		return fileInfo;
	}
	
	private JSONObject getFileInformation( Path filePath ) throws IOException{
		JSONObject fileInfo = JSONFactoryUtil.createJSONObject();
//		System.out.println("To get fileInfo: "+filePath.toString());
		fileInfo.put("name", filePath.getFileName().toString());
		fileInfo.put("size", this.convert2ReadableFileSize(Files.size(filePath)));
		fileInfo.put("isFile", Files.isRegularFile(filePath, LinkOption.NOFOLLOW_LINKS));
		
		return fileInfo;
	}
	
	private String convert2ReadableFileSize(long size) {
	    if(size <= 0) return "0";
	    final String[] units = new String[] { "B", "KB", "MB", "GB", "TB" };
	    int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
	    return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
	}
	
	private class FileExtensionFilter implements FilenameFilter {
		private String extension = "";
		public FileExtensionFilter ( String extension ){
			this.extension = extension;
		}
		
		@Override
		public boolean accept(File directory, String fileName){
			if (fileName.endsWith(this.extension)) 
				return true;
			return false;
		}
	}

	/*****************************************************************
	 * Public APIs Section
	 * @throws SystemException 
	 * @throws PortalException 
	 ****************************************************************/
	
    public String getLinkedTemporaryFilePath(PortletRequest portletRequest, 
        String target, String prefix, String suffix,
        boolean deleteOnExit, boolean isJobResult) 
            throws IOException, PortalException, SystemException{
		User user = PortalUtil.getUser(portletRequest);
		Path targetPath = this.getUserHome(portletRequest, isJobResult).resolve(target);
		if( Files.notExists(targetPath, LinkOption.NOFOLLOW_LINKS) )	throw new FileNotFoundException(targetPath.toString());
		
		Path baseTempFolderPath = OSPPropertyKeys.SystemRootDirPath().resolve(user.getScreenName()).resolve(this.TEMP_DIR_NAME);
		Files.createDirectories(baseTempFolderPath);
		Path tempFilePath = baseTempFolderPath.resolve(targetPath.getFileName());
		
		Path symbolicLink = Files.createSymbolicLink(tempFilePath, targetPath );
//		System.out.println("Symbolic Link: From "+ realTargetPath + " To "+tempFilePath);
		
		if( deleteOnExit )
			symbolicLink.toFile().deleteOnExit();
		
		return symbolicLink.getFileName().toString();
	}

    public String getCopiedTemporaryFilePath(
        PortletRequest portletRequest, String target, String prefix, String suffix, boolean isJobResult)
        throws IOException, PortalException, SystemException{
        final Path targetPath = this.getUserHome(portletRequest, isJobResult).resolve(target);
//		final Path targetPath = this.get_BASE_DIR_PATH().resolve(target);
//		System.out.println("create tempFile");
		if( Files.notExists(targetPath) )	throw new FileNotFoundException(targetPath.toString());
		
		String tempRealPath = portletRequest.getPortletSession().getPortletContext().getRealPath(this.TEMP_DIR_NAME);
		Path baseTempDir = Paths.get( tempRealPath );
		if( !Files.exists(baseTempDir)){
			Files.createDirectory(baseTempDir);
		}
		Path relativeTempPath = baseTempDir.getFileName();
		baseTempDir = this.getUniqueUuidFilePath(baseTempDir, "", "");
		Files.createDirectory( baseTempDir );
		baseTempDir.toFile().deleteOnExit();
		
		relativeTempPath = relativeTempPath.resolve(baseTempDir.getFileName());
		final Path tempFilePath = baseTempDir.resolve(targetPath.getFileName());
		if(isJobResult){
		    Path relTargetPath = Paths.get(target);
		    Iterator<Path> iter = relTargetPath.iterator();
		    int index = 0;
		    while(iter.hasNext()){
		        Path thisPath = iter.next();
		        if(index++ < 2){
		            continue;
		        }
		        relativeTempPath = relativeTempPath.resolve(thisPath);
		    }
		    
		}else{
		    relativeTempPath = relativeTempPath.resolve(target);
		}
		
		if( Files.isRegularFile(targetPath, LinkOption.NOFOLLOW_LINKS) ){
			Files.copy(targetPath, tempFilePath, StandardCopyOption.REPLACE_EXISTING);
		}
		else if ( Files.isDirectory(targetPath, LinkOption.NOFOLLOW_LINKS) ){
			Files.walkFileTree(targetPath,  new OSPFileVisitor( targetPath, tempFilePath) );
		}
		else
			throw new FileNotFoundException(targetPath.toString()+": is not a regular file.");
		
		return relativeTempPath.toString();
	}

	public JSONArray getFolderInformation( 
			PortletRequest portletRequest, 
			String folderPath, 
			String filter,
			boolean isJobResult) throws IOException, PortalException, SystemException{
		Path targetPath = this.getUserHome(portletRequest, isJobResult).resolve(folderPath);
		filter = this.extractExtension(filter);
		
		return this.lookUpFolder(targetPath.toFile(), filter);
	}
	
	public JSONObject getFileInformation( 
			PortletRequest portletRequest, 
			String filePath,
			boolean isJobResult) throws IOException, PortalException, SystemException{
		return this.getFileInformation(this.getUserHome(portletRequest, isJobResult).resolve(filePath));
	}
	
	public Path createFile( String target ) throws IOException{
		return this.createFile(target, true );
	}
	
	public Path createFile( String target, boolean overwrite ) throws IOException{
		Path filePath = OSPPropertyKeys.SystemRootDirPath().resolve(target);
		Path parentPath = Files.createDirectories(filePath.getParent());
		
		if( overwrite )
			Files.deleteIfExists(filePath);
		
		return Files.createFile(filePath);
	}
	
	public void deleteFile( String fileName ) throws IOException{
		Files.deleteIfExists(Paths.get(fileName));
	}
	
	public Path moveFile( String srcPath, String targetPath ) throws IOException{
		return this.moveFile(srcPath, targetPath, false);
	}
	
	public Path moveFile( String srcPath, String targetPath, boolean overwrite ) throws IOException{
		CopyOption[] options;
		Path newPath;
		if( overwrite ){
			options = new CopyOption[]{
				StandardCopyOption.REPLACE_EXISTING
			};
			newPath = Files.move(Paths.get(srcPath), Paths.get(targetPath), options);
		}
		else
			newPath = Files.move(Paths.get(srcPath), Paths.get(targetPath));
		
		return newPath;
	}
	
	public Path copyFile( String srcPath, String targetPath ) throws IOException{
		return this.copyFile(srcPath, targetPath, false);
	}
	
	public Path copyFile( String source, String target, boolean overwrite ) throws IOException{
		Path sourcePath = OSPPropertyKeys.SystemRootDirPath().resolve(source);
		Path targetPath = OSPPropertyKeys.SystemRootDirPath().resolve(target);
		CopyOption[] options;
		Path newPath;
		if( overwrite ){
			options = new CopyOption[]{
				StandardCopyOption.REPLACE_EXISTING
			};
			newPath = Files.copy(sourcePath, targetPath, options);
		}
		else
			newPath = Files.copy(sourcePath, targetPath);
		
		return newPath;
	}
	
	public void duplicated( 
			PortletRequest portletRequest, 
			PortletResponse portletResponse, 
			String filePath,
			boolean isJobResult) throws PortalException, SystemException, IOException{
		Path targetPath = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("duplicated", Files.exists( targetPath ));
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
		ServletResponseUtil.write(httpResponse, result.toString() );
	}
	
	public void upload( 
			PortletRequest portletRequest, 
			String target,
			String uploadFileName,
			boolean isJobResult) throws SystemException, PortalException, IOException{
		Path userHome = this.getUserHome(portletRequest, isJobResult);
		
		Path targetPath = userHome.resolve(target);// Data should be inserted by SystemPropertyService.

		System.out.println("Upload Target: "+targetPath.toString());
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(portletRequest);
		
		System.out.println(uploadRequest.getFileName(uploadFileName));
		
		// Get the uploaded file as a file.
		File uploadedFile = uploadRequest.getFile(uploadFileName);
		
		// Move the existing temporary file to new location.
		Files.copy(uploadedFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public void download(
	    PortletRequest portletRequest, 
        PortletResponse portletResponse, 
        long dlFileEntryId) throws PortalException, SystemException, IOException{
	    HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(portletRequest);
        HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
        
	    DLFileEntry dlFileEntry = DLFileEntryServiceUtil.getFileEntry(dlFileEntryId);
	    InputStream inputStream = dlFileEntry.getContentStream();
        String fileName = dlFileEntry.getTitle();
        ServletResponseUtil.sendFile(
            httpRequest, httpResponse, fileName, inputStream, 
            dlFileEntry.getSize(), "application/octet-stream", "attachment");
	}
	
	public void download(
			PortletRequest portletRequest, 
			PortletResponse portletResponse, 
			String targetFolder, 
			String[] files,
			boolean isJobResult) throws IOException, PortalException, SystemException{
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(portletRequest);
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);

		Path userHome = this.getUserHome(portletRequest, isJobResult);
		Path targetPath = userHome.resolve(targetFolder);
		_log.info("Download Target Path: "+targetPath.toString());
		if( files.length == 1 ){
			Path filePath = targetPath.resolve(files[0]);
			_log.info("Download Target file: "+ filePath.toString());
			ServletResponseUtil.sendFile(httpRequest, httpResponse, filePath.getFileName().toString(), Files.readAllBytes(filePath), "application/octet-stream", "attachment");
		}
		else{
			final Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-xr--");
			final FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);

			Path tempPath = userHome.resolve("temp");
			Files.createDirectories(tempPath, attr );
			
			Path zipPath = tempPath.resolve(targetPath.getFileName()+".zip");
			if( Files.exists(zipPath))
				Files.delete(zipPath);
			Files.createFile(zipPath, attr);
			zipPath.toFile().deleteOnExit();

			Path[] filePaths = new Path[files.length];
			for( int i=0; i<files.length; i++ ){
				_log.debug("File to be ziped: "+files[i]);
				filePaths[i] = targetPath.resolve(files[i]);
			}
			this.zip(filePaths, zipPath);

			ServletResponseUtil.sendFile(httpRequest, httpResponse, zipPath.getFileName().toString(), Files.readAllBytes(zipPath), "application/octet-stream", "attachment");
		}
	}
	   
    public void downloadFromText(
        PortletRequest portletRequest, 
        PortletResponse portletResponse,
        String fileName,
        String fileContext) throws PortalException, SystemException, IOException{
        HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(portletRequest);
        HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
        InputStream inputStream = new ByteArrayInputStream(fileContext.getBytes("UTF-8"));
        ServletResponseUtil.sendFile(
            httpRequest, httpResponse, fileName, inputStream, "text/plain");
    }
	
	private void addZipEntry( ZipOutputStream zipOutputStream, Path fileName, Path base ) throws IOException{
		Path filePath = base.resolve(fileName);
		_log.debug(filePath.toString()+" just to be added");
		_log.debug("fileName: "+fileName.toString());
		_log.debug("base: "+base.toString());
		if( Files.isDirectory(filePath) ){
			String[] subFiles = filePath.toFile().list();
			for( String subFile : subFiles ){
				addZipEntry(zipOutputStream, fileName.resolve(subFile), base);
			}
		}
		else if( Files.isRegularFile(filePath) ){
			ZipEntry zipEntry = new ZipEntry(fileName.toString());
			zipOutputStream.putNextEntry(zipEntry);
			FileInputStream fileInputStream = new FileInputStream( filePath.toString() );
			int length;
			byte[] buffer = new byte[2048];
			while ((length = fileInputStream.read(buffer)) > 0) {
				zipOutputStream.write(buffer, 0, length);
			}
			// Closing the fileInputStream instance
			fileInputStream.close();
			zipOutputStream.closeEntry();
		}
		else{
			System.out.println("Un-known file type: "+filePath.toString());
		}
	}
	
	private void zip( Path[] sources, Path destination ) throws IOException{
		ZipOutputStream zipOutputStream = null;
		try {
			zipOutputStream = new ZipOutputStream(new FileOutputStream(destination.toString()));
		} catch (FileNotFoundException e) {
			_log.error("[ERROR] zip() - destination not found: "+destination.toString());
			throw e;
		}
		
		try {
			for( Path source : sources ){
				this.addZipEntry(zipOutputStream, source.getFileName(), source.getParent());
			}
		} catch (IOException e) {
			_log.error("[ERROR] addZipEntry() while zip()");
			throw e;
		} 
		
		if (zipOutputStream != null) {
			try {
				zipOutputStream.close();
			} catch (IOException iOException) {
				_log.error("[ERROR] zipOutputStream.close() while zip()");
			}
		}
	}
	
    private Path getUserHome(PortletRequest portletRequest, boolean isJobResult)
        throws PortalException, SystemException{
        String userScreenName = PortalUtil.getUser(portletRequest).getScreenName();
        Path userHomePath = OSPPropertyKeys.SystemRootDirPath();
        if(userScreenName.equalsIgnoreCase("edison")){
            userHomePath = userHomePath.resolve("edisonadm");
        }else{
            userHomePath = userHomePath.resolve(userScreenName);
        }
        if(!isJobResult){
            return userHomePath.resolve("repository");
        }else{
            return userHomePath.resolve("jobs");
        }
    }
	
	public void checkValidFile( 
			PortletRequest portletRequest, 
			PortletResponse portletResponse, 
			String filePath,
			boolean isJobResult) throws PortalException, SystemException, IOException{
		Path target = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
		_log.info("checkValidFile()target: "+target.toString());
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("valid", Files.isRegularFile( target ));
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
		ServletResponseUtil.write(httpResponse, result.toString() );
	}
	
	public void readFileContent(
			PortletRequest portletRequest,
			PortletResponse portletResponse,
			String filePath,
			boolean isJobResult) throws PortalException, SystemException, IOException{
	    readFileContent(portletRequest, portletResponse, null, filePath, isJobResult);
	}
	
	public void getFile(
	    PortletRequest portletRequest,
        PortletResponse portletResponse,
        String filePath,
        boolean isJobResult) throws PortalException, SystemException, IOException{
	    
	    HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(portletRequest);
        HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
        Path target = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
	
	    ServletResponseUtil.sendFile(
	        httpRequest, httpResponse, target.getFileName().toString(), Files.readAllBytes(target));
	}
	
	public void readFileContent(
	    PortletRequest portletRequest,
	    PortletResponse portletResponse,
	    String contentType,
	    String filePath,
	    boolean isJobResult) throws PortalException, SystemException, IOException{
	    Path target = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
	    _log.debug("readFileContent() target: "+target.toString());
	    HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
	    _log.info("target file : " + target.toFile().getAbsolutePath());
	    if(contentType != null && !contentType.isEmpty()){
	        httpResponse.setContentType(contentType);
	    }
	    ServletResponseUtil.write(httpResponse, target.toFile() );
	}
	
	public void readFirstFileContent(
				PortletRequest portletRequest,
				PortletResponse portletResponse,
				String parentPath,
				String filter,
	            boolean isJobResult ) throws PortalException, SystemException, IOException{
		Path target = this.getUserHome(portletRequest, isJobResult).resolve(parentPath);
		
		_log.info("target Path : " + target.toString());
		
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
		if(Files.isDirectory(target)){
			File[] subFiles = target.toFile().listFiles( new FileExtensionFilter(filter) );
			for(File file : subFiles){
				if(file.isFile()){
					_log.info("target file : " + file.getAbsolutePath());
					ServletResponseUtil.write(httpResponse, file);
					break;
				}
			}
		}else if(Files.isRegularFile(target)){
			_log.info("readFirstFileContent() target: " + target.toString());
			ServletResponseUtil.write(httpResponse, target.toFile());
		}
	}
	
	public byte[] readFileContent( PortletRequest portletRequest, String filePath, boolean isJobResult) throws PortalException, SystemException, IOException{
		Path target = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
		
		return Files.readAllBytes(target);
	}
	
	public void getFirstFileName(
			PortletRequest portletRequest,
			PortletResponse portletResponse,
			String parentPath,
			String filter,
            boolean isJobResult ) throws PortalException, SystemException, IOException{
		Path target = this.getUserHome(portletRequest, isJobResult).resolve(parentPath);
		_log.info("getFirstFileName()*****");
		_log.info("ParentPath : " + parentPath);
		_log.info("filter : " + filter);
		_log.info("***** getFirstFileName()");
		
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if(Files.isDirectory(target)){
			File[] subFiles = target.toFile().listFiles( new FileExtensionFilter(filter) );
			for(File file : subFiles){
				if(file.isFile()){
					_log.info("target file : " + file.getAbsolutePath());
					result.put("parentPath", file.getParent());
					result.put("fileName", file.getName());
					ServletResponseUtil.write(httpResponse, result.toString());
					break;
				}
			}
		}else if(Files.isRegularFile(target)){
			_log.info("readFirstFileName() target: " + target.toString());
			result.put("parentPath", target.getParent().toString());
			result.put("fileName", target.getFileName().toString());
			ServletResponseUtil.write(httpResponse, result.toString());
		}
	}
	
	public void saveFileContent(
			PortletRequest portletRequest,
			String filePath,
			String content,
			boolean isJobResult) throws PortalException, SystemException, IOException{
		Path target = this.getUserHome(portletRequest, isJobResult).resolve(filePath);
		_log.debug("readFileContent() target: "+target.toString());
		OpenOption[] openOptions = new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING};
		Files.write(target, content.getBytes(StandardCharsets.UTF_8), openOptions);
	}
	
	public JSONObject saveInputFile(
			PortletRequest portletRequest,
			String scienceAppName, 
			String scienceAppVersion,
			String simulationTime,
			String jobNumber,
			String fileName, 
			String content ) throws PortalException, SystemException, IOException{
		
		Path simulationHome = Paths.get(scienceAppName).resolve(scienceAppVersion).resolve(simulationTime);
		Path jobPath = simulationHome.resolve(jobNumber);
		Path inputsPath = jobPath.resolve("inputs");
		
		Path target = this.getUserHome(portletRequest, false).resolve(inputsPath).resolve(fileName);
		_log.info("Target path to save input: "+target.toString());
		
		writeTextFile(content, target);
		
		JSONObject path = JSONFactoryUtil.createJSONObject();
		path.put("parent_", inputsPath.toString());
		path.put("name_", fileName);
		path.put("type_", "file");
		path.put("relative_", true);
		
		return path;
	}

    public void writeTextFile(String content, Path target) throws IOException{
        if(!Files.exists(target.getParent())){
            Files.createDirectories(target.getParent());
        }
        Files.write(target, content.getBytes(StandardCharsets.UTF_8), 
            new OpenOption[]{
                StandardOpenOption.CREATE_NEW, 
                StandardOpenOption.WRITE, 
                StandardOpenOption.TRUNCATE_EXISTING
                }
        );
    }
	
	public void readDLAppEntry ( PortletResponse portletResponse, long dlEntryId ) throws SystemException, IOException{
		FileEntry fileEntry;
		JSONObject resultData = JSONFactoryUtil.createJSONObject();
		try {
			fileEntry = DLAppLocalServiceUtil.getFileEntry(dlEntryId);
		} catch (PortalException e) {
			resultData.put("dlEntryId", dlEntryId);
			this.writeToClient(portletResponse, "Invalid DLEntry ID", resultData);
			return;
		}
		
		InputStream stream;
		try {
			stream = fileEntry.getContentStream();
		} catch (PortalException e) {
			resultData.put("dlEntryId", dlEntryId);
			this.writeToClient(portletResponse, "Invalid DLEntry ID", resultData);
			return;
		}

		String content = new String(FileUtil.getBytes(stream));
		stream.close();
		
		resultData.put("type_", "fileContent");
		resultData.put("context_", content);
		
		this.writeToClient( portletResponse, null, resultData );
	}
	
	public void writeToClient( PortletResponse portletResponse, String errorMessage, JSONObject data ) throws IOException{
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if( errorMessage != null ){
			result.put( "error", errorMessage );
		}
		else{
			result.put( "success", data );
		}
		
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(portletResponse);
		ServletResponseUtil.write(httpResponse, result.toString() );
	}
	
    public Map<String, Object> readOutLogFile(
        PortletRequest portletRequest, 
        String simulationUuid, 
        String jobUuid,
        long lastPosition) throws IOException, PortalException, SystemException{
        Path target = this.getUserHome(portletRequest, true)
            .resolve(simulationUuid + "/" + jobUuid + ".job/" + jobUuid + ".out");
	    TextAndLastPosition outLog = readTextAndLastPosition(target, lastPosition);
	    Map<String, Object> result = new HashMap<String, Object>();
        result.put("outLog", outLog.getText());
        result.put("lastPosition", outLog.getLastPosition());
        return result;
	}
    
    public String readTextFile(Path path) throws IOException{
        return readTextAndLastPosition(path, 0).getText();
    }

    @Deprecated
    public Path getUserHomePath( PortletRequest portletRequest ) throws SystemException, PortalException{
    	return this.getUserHome(portletRequest, false);
    }
    
    @Deprecated
    public Path getJobPath( PortletRequest portletRequest, String simulationUuid, String jobUuid ) throws SystemException, PortalException{
    	return this.getUserHome(portletRequest, true).resolve(simulationUuid + File.separator + jobUuid + ".job"+File.separator + jobUuid + ".out");
    }
    
    public Path getRepositoryPath( PortletRequest portletRequest, String path, OSPRepositoryTypes repoType ) throws PortalException{
    	Path targetPath;
    	switch( repsystemoType ){
    		case INPUT:{
    			Path userHomePath = this.getUserHome(portletRequest, false);
    			targetPath = userHomePath.resolve(path);
    			break;
    		}
    		case OUTPUT:{
    			Path userHomePath = this.getUserHome(portletRequest, true);
    			targetPath = userHomePath.resolve(path);
    			break;
    		}
    		case PROVENANCE:{
    			targetPath = OSPPropertyKeys.ProvenanceRootDirPath().resolve(path);
    			break;
    		}
    		case SPYGLASS:{
    			targetPath = OSPPropertyKeys.SpyGlassRootDirPath().resolve(path);
    			break;
    		}
    		case SCIENCEAPP:{
    			targetPath = OSPPropertyKeys.SpyGlassAppsDirPath().resolve(path);
    			break;
    		}
    		default:
    			targetPath = Paths.get("/");
    	}
    	
    	return targetPath;
    }
    
    private TextAndLastPosition readTextAndLastPosition(Path path, long lastPoistion) throws IOException{
        FileChannel fcIn = FileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        StringBuffer sb = new StringBuffer();
        if(lastPoistion > 0){
         fcIn.position(lastPoistion);   
        }
        while(fcIn.read(buffer) != -1){
            byte[] bytes = new byte[buffer.position()];
            buffer.flip();
            buffer.get(bytes);
            sb.append(new String(bytes));
            buffer.clear();
        }
        lastPoistion = fcIn.position();
        fcIn.close();
        return new TextAndLastPosition(sb.toString(), lastPoistion);
    }
    
    static class TextAndLastPosition{
        private String text;
        private long lastPosition;
        public TextAndLastPosition(String text, long lastPosition){
            this.text = text;
            this.lastPosition = lastPosition;
        }
        public String getText(){
            return text;
        }
        public long getLastPosition(){
            return lastPosition;
        }
    }
    
    static class OSPFileVisitor extends SimpleFileVisitor<Path>{
    	Path targetPath;
    	Path tempFilePath;
    	
    	public OSPFileVisitor( Path targetPath, Path tempPath ){
    		this.targetPath = targetPath;
    		this.tempFilePath = tempPath;
    	}
    	
		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			Path path = targetPath.relativize(dir);
			Path tempPath = tempFilePath.resolve(path);
			if( !Files.exists(tempPath) ){
				Path tempFolder = null;
				try {
					tempFolder = Files.createDirectory(tempPath);
					tempFolder.toFile().deleteOnExit();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return FileVisitResult.CONTINUE;
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
			Path path = targetPath.relativize(file);
			Path tempPath = tempFilePath.resolve(path);
			try {
				Files.copy(file, tempPath, StandardCopyOption.REPLACE_EXISTING);
				tempPath.toFile().deleteOnExit();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return FileVisitResult.CONTINUE;
		}
    }
}