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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for File. This utility wraps
 * {@link com.kisti.osp.util.service.impl.FileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FileLocalService
 * @see com.kisti.osp.util.service.base.FileLocalServiceBaseImpl
 * @see com.kisti.osp.util.service.impl.FileLocalServiceImpl
 * @generated
 */
@ProviderType
public class FileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.util.service.impl.FileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static byte[] readFileContent(
		javax.portlet.PortletRequest portletRequest, java.lang.String filePath,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .readFileContent(portletRequest, filePath, isJobResult);
	}

	public static com.liferay.portal.kernel.json.JSONArray getFolderInformation(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String folderPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .getFolderInformation(portletRequest, folderPath, filter,
			isJobResult);
	}

	public static com.liferay.portal.kernel.json.JSONObject getFileInformation(
		javax.portlet.PortletRequest portletRequest, java.lang.String filePath,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .getFileInformation(portletRequest, filePath, isJobResult);
	}

	public static com.liferay.portal.kernel.json.JSONObject saveInputFile(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String scienceAppName, java.lang.String scienceAppVersion,
		java.lang.String simulationTime, java.lang.String jobNumber,
		java.lang.String fileName, java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .saveInputFile(portletRequest, scienceAppName,
			scienceAppVersion, simulationTime, jobNumber, fileName, content);
	}

	public static java.lang.String getCopiedTemporaryFilePath(
		javax.portlet.PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .getCopiedTemporaryFilePath(portletRequest, target, prefix,
			suffix, isJobResult);
	}

	/**
	* Public APIs Section
	*
	* @throws SystemException
	* @throws PortalException
	*/
	public static java.lang.String getLinkedTemporaryFilePath(
		javax.portlet.PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean deleteOnExit,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .getLinkedTemporaryFilePath(portletRequest, target, prefix,
			suffix, deleteOnExit, isJobResult);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String readTextFile(java.nio.file.Path path)
		throws java.io.IOException {
		return getService().readTextFile(path);
	}

	public static java.nio.file.Path copyFile(java.lang.String source,
		java.lang.String target, boolean overwrite) throws java.io.IOException {
		return getService().copyFile(source, target, overwrite);
	}

	public static java.nio.file.Path copyFile(java.lang.String srcPath,
		java.lang.String targetPath) throws java.io.IOException {
		return getService().copyFile(srcPath, targetPath);
	}

	public static java.nio.file.Path createFile(java.lang.String target)
		throws java.io.IOException {
		return getService().createFile(target);
	}

	public static java.nio.file.Path createFile(java.lang.String target,
		boolean overwrite) throws java.io.IOException {
		return getService().createFile(target, overwrite);
	}

	@Deprecated
	public static java.nio.file.Path getJobPath(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String simulationUuid, java.lang.String jobUuid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPath(portletRequest, simulationUuid, jobUuid);
	}

	public static java.nio.file.Path getRepositoryPath(
		javax.portlet.PortletRequest portletRequest, java.lang.String path,
		com.kisti.osp.constant.OSPRepositoryTypes repoType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRepositoryPath(portletRequest, path, repoType);
	}

	@Deprecated
	public static java.nio.file.Path getUserHomePath(
		javax.portlet.PortletRequest portletRequest)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserHomePath(portletRequest);
	}

	public static java.nio.file.Path moveFile(java.lang.String srcPath,
		java.lang.String targetPath) throws java.io.IOException {
		return getService().moveFile(srcPath, targetPath);
	}

	public static java.nio.file.Path moveFile(java.lang.String srcPath,
		java.lang.String targetPath, boolean overwrite)
		throws java.io.IOException {
		return getService().moveFile(srcPath, targetPath, overwrite);
	}

	public static java.util.Map<java.lang.String, java.lang.Object> readOutLogFile(
		javax.portlet.PortletRequest portletRequest,
		java.lang.String simulationUuid, java.lang.String jobUuid,
		long lastPosition)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return getService()
				   .readOutLogFile(portletRequest, simulationUuid, jobUuid,
			lastPosition);
	}

	public static void checkValidFile(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.checkValidFile(portletRequest, portletResponse, filePath,
			isJobResult);
	}

	public static void deleteFile(java.lang.String fileName)
		throws java.io.IOException {
		getService().deleteFile(fileName);
	}

	public static void download(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String targetFolder, java.lang.String[] files,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.download(portletRequest, portletResponse, targetFolder, files,
			isJobResult);
	}

	public static void download(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse, long dlFileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService().download(portletRequest, portletResponse, dlFileEntryId);
	}

	public static void downloadFromText(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String fileName, java.lang.String fileContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.downloadFromText(portletRequest, portletResponse, fileName,
			fileContext);
	}

	public static void duplicated(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.duplicated(portletRequest, portletResponse, filePath, isJobResult);
	}

	public static void getFile(javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.getFile(portletRequest, portletResponse, filePath, isJobResult);
	}

	public static void getFirstFileName(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String parentPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.getFirstFileName(portletRequest, portletResponse, parentPath,
			filter, isJobResult);
	}

	public static void readDLAppEntry(
		javax.portlet.PortletResponse portletResponse, long dlEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService().readDLAppEntry(portletResponse, dlEntryId);
	}

	public static void readFileContent(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String contentType, java.lang.String filePath,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.readFileContent(portletRequest, portletResponse, contentType,
			filePath, isJobResult);
	}

	public static void readFileContent(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String filePath, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.readFileContent(portletRequest, portletResponse, filePath,
			isJobResult);
	}

	public static void readFirstFileContent(
		javax.portlet.PortletRequest portletRequest,
		javax.portlet.PortletResponse portletResponse,
		java.lang.String parentPath, java.lang.String filter,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.readFirstFileContent(portletRequest, portletResponse, parentPath,
			filter, isJobResult);
	}

	public static void saveFileContent(
		javax.portlet.PortletRequest portletRequest, java.lang.String filePath,
		java.lang.String content, boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService()
			.saveFileContent(portletRequest, filePath, content, isJobResult);
	}

	public static void upload(javax.portlet.PortletRequest portletRequest,
		java.lang.String target, java.lang.String uploadFileName,
		boolean isJobResult)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		getService().upload(portletRequest, target, uploadFileName, isJobResult);
	}

	public static void writeTextFile(java.lang.String content,
		java.nio.file.Path target) throws java.io.IOException {
		getService().writeTextFile(content, target);
	}

	public static void writeToClient(
		javax.portlet.PortletResponse portletResponse,
		java.lang.String errorMessage,
		com.liferay.portal.kernel.json.JSONObject data)
		throws java.io.IOException {
		getService().writeToClient(portletResponse, errorMessage, data);
	}

	public static FileLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FileLocalService, FileLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FileLocalService.class);
}