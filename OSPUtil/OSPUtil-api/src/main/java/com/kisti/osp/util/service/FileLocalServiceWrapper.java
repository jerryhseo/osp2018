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

package com.kisti.osp.util.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FileLocalService
 * @generated
 */
@ProviderType
public class FileLocalServiceWrapper implements FileLocalService,
	ServiceWrapper<FileLocalService> {
	public FileLocalServiceWrapper(FileLocalService fileLocalService) {
		_fileLocalService = fileLocalService;
	}

	@Override
	public byte[] readFileContent(javax.portlet.PortletRequest portletRequest,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.readFileContent(portletRequest, filePath,
			isJobResult);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getFolderInformation(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String folderPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.getFolderInformation(portletRequest,
			folderPath, filter, isJobResult);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getFileInformation(
		javax.portlet.PortletRequest portletRequest, java.lang.String filePath,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.getFileInformation(portletRequest, filePath,
			isJobResult);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject saveInputFile(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String scienceAppName, java.lang.String scienceAppVersion,
		java.lang.String simulationTime, java.lang.String jobNumber,
		java.lang.String fileName, java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.saveInputFile(portletRequest, scienceAppName,
			scienceAppVersion, simulationTime, jobNumber, fileName, content);
	}

	@Override
	public java.lang.String getCopiedTemporaryFilePath(
		javax.portlet.PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.getCopiedTemporaryFilePath(portletRequest,
			target, prefix, suffix, isJobResult);
	}

	/**
	* Public APIs Section
	*
	* @throws SystemException
	* @throws PortalException
	*/
	@Override
	public java.lang.String getLinkedTemporaryFilePath(
		javax.portlet.PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean deleteOnExit,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.getLinkedTemporaryFilePath(portletRequest,
			target, prefix, suffix, deleteOnExit, isJobResult);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _fileLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String readTextFile(java.nio.file.Path path)
		throws java.io.IOException {
		return _fileLocalService.readTextFile(path);
	}

	@Override
	public java.nio.file.Path copyFile(java.lang.String source,
		java.lang.String target, boolean overwrite) throws java.io.IOException {
		return _fileLocalService.copyFile(source, target, overwrite);
	}

	@Override
	public java.nio.file.Path copyFile(java.lang.String srcPath,
		java.lang.String targetPath) throws java.io.IOException {
		return _fileLocalService.copyFile(srcPath, targetPath);
	}

	@Override
	public java.nio.file.Path createFile(java.lang.String target)
		throws java.io.IOException {
		return _fileLocalService.createFile(target);
	}

	@Override
	public java.nio.file.Path createFile(java.lang.String target,
		boolean overwrite) throws java.io.IOException {
		return _fileLocalService.createFile(target, overwrite);
	}

	@Deprecated
	@Override
	public java.nio.file.Path getJobPath(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String simulationUuid, java.lang.String jobUuid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fileLocalService.getJobPath(portletRequest, simulationUuid,
			jobUuid);
	}

	@Override
	public java.nio.file.Path getRepositoryPath(
		javax.portlet.PortletRequest portletRequest, java.lang.String path,
		com.kisti.osp.constant.OSPRepositoryTypes repoType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fileLocalService.getRepositoryPath(portletRequest, path,
			repoType);
	}

	@Deprecated
	@Override
	public java.nio.file.Path getUserHomePath(
		javax.portlet.PortletRequest portletRequest)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fileLocalService.getUserHomePath(portletRequest);
	}

	@Override
	public java.nio.file.Path moveFile(java.lang.String srcPath,
		java.lang.String targetPath) throws java.io.IOException {
		return _fileLocalService.moveFile(srcPath, targetPath);
	}

	@Override
	public java.nio.file.Path moveFile(java.lang.String srcPath,
		java.lang.String targetPath, boolean overwrite)
		throws java.io.IOException {
		return _fileLocalService.moveFile(srcPath, targetPath, overwrite);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.Object> readOutLogFile(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String simulationUuid, java.lang.String jobUuid,
		long lastPosition)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _fileLocalService.readOutLogFile(portletRequest, simulationUuid,
			jobUuid, lastPosition);
	}

	@Override
	public void checkValidFile(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.checkValidFile(portletRequest, portletResponse,
			filePath, isJobResult);
	}

	@Override
	public void deleteFile(java.lang.String fileName)
		throws java.io.IOException {
		_fileLocalService.deleteFile(fileName);
	}

	@Override
	public void download(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String targetFolder, java.lang.String[] files,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.download(portletRequest, portletResponse,
			targetFolder, files, isJobResult);
	}

	@Override
	public void download(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse, long dlFileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.download(portletRequest, portletResponse,
			dlFileEntryId);
	}

	@Override
	public void downloadFromText(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String fileName, java.lang.String fileContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.downloadFromText(portletRequest, portletResponse,
			fileName, fileContext);
	}

	@Override
	public void duplicated(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.duplicated(portletRequest, portletResponse, filePath,
			isJobResult);
	}

	@Override
	public void getFile(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.getFile(portletRequest, portletResponse, filePath,
			isJobResult);
	}

	@Override
	public void getFirstFileName(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String parentPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.getFirstFileName(portletRequest, portletResponse,
			parentPath, filter, isJobResult);
	}

	@Override
	public void readDLAppEntry(javax.portlet.PortletResponse portletResponse,
		long dlEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.readDLAppEntry(portletResponse, dlEntryId);
	}

	@Override
	public void readFileContent(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String contentType, java.lang.String filePath,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.readFileContent(portletRequest, portletResponse,
			contentType, filePath, isJobResult);
	}

	@Override
	public void readFileContent(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.readFileContent(portletRequest, portletResponse,
			filePath, isJobResult);
	}

	@Override
	public void readFirstFileContent(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String parentPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.readFirstFileContent(portletRequest, portletResponse,
			parentPath, filter, isJobResult);
	}

	@Override
	public void saveFileContent(javax.portlet.PortletRequest portletRequest,
		java.lang.String filePath, java.lang.String content, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.saveFileContent(portletRequest, filePath, content,
			isJobResult);
	}

	@Override
	public void upload(javax.portlet.PortletRequest portletRequest,
		java.lang.String target, java.lang.String uploadFileName,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_fileLocalService.upload(portletRequest, target, uploadFileName,
			isJobResult);
	}

	@Override
	public void writeTextFile(java.lang.String content,
		java.nio.file.Path target) throws java.io.IOException {
		_fileLocalService.writeTextFile(content, target);
	}

	@Override
	public void writeToClient(javax.portlet.PortletResponse portletResponse,
		java.lang.String errorMessage,
		com.liferay.portal.kernel.json.JSONObject data)
		throws java.io.IOException {
		_fileLocalService.writeToClient(portletResponse, errorMessage, data);
	}

	@Override
	public FileLocalService getWrappedService() {
		return _fileLocalService;
	}

	@Override
	public void setWrappedService(FileLocalService fileLocalService) {
		_fileLocalService = fileLocalService;
	}

	private FileLocalService _fileLocalService;
}