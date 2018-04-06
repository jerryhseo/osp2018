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

import com.kisti.osp.constant.OSPRepositoryTypes;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.io.IOException;

import java.nio.file.Path;

import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

/**
 * Provides the local service interface for File. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FileLocalServiceUtil
 * @see com.kisti.osp.util.service.base.FileLocalServiceBaseImpl
 * @see com.kisti.osp.util.service.impl.FileLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FileLocalService extends BaseLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FileLocalServiceUtil} to access the file local service. Add custom service methods to {@link com.kisti.osp.util.service.impl.FileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public byte[] readFileContent(PortletRequest portletRequest,
		java.lang.String filePath, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getFolderInformation(PortletRequest portletRequest,
		java.lang.String folderPath, java.lang.String filter,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONObject getFileInformation(PortletRequest portletRequest,
		java.lang.String filePath, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public JSONObject saveInputFile(PortletRequest portletRequest,
		java.lang.String scienceAppName, java.lang.String scienceAppVersion,
		java.lang.String simulationTime, java.lang.String jobNumber,
		java.lang.String fileName, java.lang.String content)
		throws PortalException, SystemException, IOException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getCopiedTemporaryFilePath(
		PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	/**
	* Public APIs Section
	*
	* @throws SystemException
	* @throws PortalException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getLinkedTemporaryFilePath(
		PortletRequest portletRequest, java.lang.String target,
		java.lang.String prefix, java.lang.String suffix, boolean deleteOnExit,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public java.lang.String readTextFile(Path path) throws IOException;

	public Path copyFile(java.lang.String source, java.lang.String target,
		boolean overwrite) throws IOException;

	public Path copyFile(java.lang.String srcPath, java.lang.String targetPath)
		throws IOException;

	public Path createFile(java.lang.String target) throws IOException;

	public Path createFile(java.lang.String target, boolean overwrite)
		throws IOException;

	@java.lang.Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Path getJobPath(PortletRequest portletRequest,
		java.lang.String simulationUuid, java.lang.String jobUuid)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Path getRepositoryPath(PortletRequest portletRequest,
		java.lang.String path, OSPRepositoryTypes repoType)
		throws PortalException;

	@java.lang.Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Path getUserHomePath(PortletRequest portletRequest)
		throws PortalException, SystemException;

	public Path moveFile(java.lang.String srcPath, java.lang.String targetPath)
		throws IOException;

	public Path moveFile(java.lang.String srcPath, java.lang.String targetPath,
		boolean overwrite) throws IOException;

	public Map<java.lang.String, java.lang.Object> readOutLogFile(
		PortletRequest portletRequest, java.lang.String simulationUuid,
		java.lang.String jobUuid, long lastPosition)
		throws PortalException, SystemException, IOException;

	public void checkValidFile(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String filePath,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void deleteFile(java.lang.String fileName) throws IOException;

	public void download(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String targetFolder,
		java.lang.String[] files, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void download(PortletRequest portletRequest,
		PortletResponse portletResponse, long dlFileEntryId)
		throws PortalException, SystemException, IOException;

	public void downloadFromText(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String fileName,
		java.lang.String fileContext)
		throws PortalException, SystemException, IOException;

	public void duplicated(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String filePath,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void getFile(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String filePath,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void getFirstFileName(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String parentPath,
		java.lang.String filter, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void readDLAppEntry(PortletResponse portletResponse, long dlEntryId)
		throws SystemException, IOException;

	public void readFileContent(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String contentType,
		java.lang.String filePath, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void readFileContent(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String filePath,
		boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void readFirstFileContent(PortletRequest portletRequest,
		PortletResponse portletResponse, java.lang.String parentPath,
		java.lang.String filter, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void saveFileContent(PortletRequest portletRequest,
		java.lang.String filePath, java.lang.String content, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void upload(PortletRequest portletRequest, java.lang.String target,
		java.lang.String uploadFileName, boolean isJobResult)
		throws PortalException, SystemException, IOException;

	public void writeTextFile(java.lang.String content, Path target)
		throws IOException;

	public void writeToClient(PortletResponse portletResponse,
		java.lang.String errorMessage, JSONObject data)
		throws IOException;
}