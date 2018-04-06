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

package com.kisti.osp.spyglass.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ScienceAppLocalService}.
 *
 * @author Jerry H. Seo
 * @see ScienceAppLocalService
 * @generated
 */
@ProviderType
public class ScienceAppLocalServiceWrapper implements ScienceAppLocalService,
	ServiceWrapper<ScienceAppLocalService> {
	public ScienceAppLocalServiceWrapper(
		ScienceAppLocalService scienceAppLocalService) {
		_scienceAppLocalService = scienceAppLocalService;
	}

	/**
	* Adds the science app to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was added
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp addScienceApp(
		com.kisti.osp.spyglass.model.ScienceApp scienceApp) {
		return _scienceAppLocalService.addScienceApp(scienceApp);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp addScienceApp(
		java.lang.String name, java.lang.String version,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		long iconId,
		java.util.Map<java.util.Locale, java.lang.String> manualMap,
		java.lang.String exeFileName, java.lang.String appType,
		java.lang.String runType, int maxCpus, int defaultCpus,
		java.lang.String inputPorts, java.lang.String logPorts,
		java.lang.String outputPorts, java.lang.String layout, int openLevel,
		java.lang.String license,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scienceAppLocalService.addScienceApp(name, version, titleMap,
			descriptionMap, iconId, manualMap, exeFileName, appType, runType,
			maxCpus, defaultCpus, inputPorts, logPorts, outputPorts, layout,
			openLevel, license, sc);
	}

	/**
	* Creates a new science app with the primary key. Does not add the science app to the database.
	*
	* @param scienceAppId the primary key for the new science app
	* @return the new science app
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp createScienceApp(
		long scienceAppId) {
		return _scienceAppLocalService.createScienceApp(scienceAppId);
	}

	/**
	* Deletes the science app from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was removed
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp deleteScienceApp(
		com.kisti.osp.spyglass.model.ScienceApp scienceApp) {
		return _scienceAppLocalService.deleteScienceApp(scienceApp);
	}

	/**
	* Deletes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app that was removed
	* @throws PortalException if a science app with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp deleteScienceApp(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.deleteScienceApp(scienceAppId);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp fetchScienceApp(
		long scienceAppId) {
		return _scienceAppLocalService.fetchScienceApp(scienceAppId);
	}

	/**
	* Returns the science app matching the UUID and group.
	*
	* @param uuid the science app's UUID
	* @param groupId the primary key of the group
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp fetchScienceAppByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _scienceAppLocalService.fetchScienceAppByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the science app with the primary key.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app
	* @throws PortalException if a science app with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp getScienceApp(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getScienceApp(scienceAppId);
	}

	/**
	* Returns the science app matching the UUID and group.
	*
	* @param uuid the science app's UUID
	* @param groupId the primary key of the group
	* @return the matching science app
	* @throws PortalException if a matching science app could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp getScienceAppByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getScienceAppByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp removeScienceApp(
		com.kisti.osp.spyglass.model.ScienceApp app,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.removeScienceApp(app, sc);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp removeScienceApp(
		java.lang.String scienceAppName, java.lang.String scienceAppVersion,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException,
			com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.removeScienceApp(scienceAppName,
			scienceAppVersion, sc);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp removeScienceApp(
		long scienceAppId, com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.removeScienceApp(scienceAppId, sc);
	}

	/**
	* Updates the science app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was updated
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceApp updateScienceApp(
		com.kisti.osp.spyglass.model.ScienceApp scienceApp) {
		return _scienceAppLocalService.updateScienceApp(scienceApp);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp updateScienceApp(
		com.kisti.osp.spyglass.model.ScienceApp scienceApp,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scienceAppLocalService.updateScienceApp(scienceApp, sc);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceApp updateScienceApp(
		java.lang.String name, java.lang.String version,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		long iconId,
		java.util.Map<java.util.Locale, java.lang.String> manualMap,
		java.lang.String exeFileName, java.lang.String appType,
		java.lang.String runType, int maxCpus, int defaultCpus,
		java.lang.String inputPorts, java.lang.String logPorts,
		java.lang.String outputPorts, java.lang.String layout, int openLevel,
		java.lang.String license,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _scienceAppLocalService.updateScienceApp(name, version,
			titleMap, descriptionMap, iconId, manualMap, exeFileName, appType,
			runType, maxCpus, defaultCpus, inputPorts, logPorts, outputPorts,
			layout, openLevel, license, sc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _scienceAppLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _scienceAppLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _scienceAppLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _scienceAppLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of science apps.
	*
	* @return the number of science apps
	*/
	@Override
	public int getScienceAppsCount() {
		return _scienceAppLocalService.getScienceAppsCount();
	}

	@Override
	public java.lang.String getInputPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getInputPorts(scienceAppId);
	}

	@Override
	public java.lang.String getLayout(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getLayout(scienceAppId);
	}

	@Override
	public java.lang.String getLogPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getLogPorts(scienceAppId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _scienceAppLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getOutputPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.getOutputPorts(scienceAppId);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _scienceAppLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _scienceAppLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _scienceAppLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the science apps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of science apps
	*/
	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceApp> getScienceApps(
		int start, int end) {
		return _scienceAppLocalService.getScienceApps(start, end);
	}

	/**
	* Returns all the science apps matching the UUID and company.
	*
	* @param uuid the UUID of the science apps
	* @param companyId the primary key of the company
	* @return the matching science apps, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceApp> getScienceAppsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _scienceAppLocalService.getScienceAppsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of science apps matching the UUID and company.
	*
	* @param uuid the UUID of the science apps
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching science apps, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceApp> getScienceAppsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.spyglass.model.ScienceApp> orderByComparator) {
		return _scienceAppLocalService.getScienceAppsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceApp> removeScienceApps(
		java.lang.String scienceAppName,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLocalService.removeScienceApps(scienceAppName, sc);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _scienceAppLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _scienceAppLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void removeInputPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.removeInputPorts(scienceAppId);
	}

	@Override
	public void removeLayout(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.removeLayout(scienceAppId);
	}

	@Override
	public void removeLogPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.removeLogPorts(scienceAppId);
	}

	@Override
	public void removeOutputPorts(long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.removeOutputPorts(scienceAppId);
	}

	@Override
	public void setInputPorts(long scienceAppId, java.lang.String inputPorts) {
		_scienceAppLocalService.setInputPorts(scienceAppId, inputPorts);
	}

	@Override
	public void setLayout(long scienceAppId, java.lang.String layout) {
		_scienceAppLocalService.setLayout(scienceAppId, layout);
	}

	@Override
	public void setLogPorts(long scienceAppId, java.lang.String logPorts) {
		_scienceAppLocalService.setLogPorts(scienceAppId, logPorts);
	}

	@Override
	public void setOutputPorts(long scienceAppId, java.lang.String outputPorts) {
		_scienceAppLocalService.setOutputPorts(scienceAppId, outputPorts);
	}

	@Override
	public void updateInputPorts(long scienceAppId, java.lang.String inputPorts)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.updateInputPorts(scienceAppId, inputPorts);
	}

	@Override
	public void updateLayout(long scienceAppId, java.lang.String layout)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.updateLayout(scienceAppId, layout);
	}

	@Override
	public void updateLogPorts(long scienceAppId, java.lang.String logPorts)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.updateLogPorts(scienceAppId, logPorts);
	}

	@Override
	public void updateOutputPorts(long scienceAppId,
		java.lang.String outputPorts)
		throws com.liferay.portal.kernel.exception.PortalException {
		_scienceAppLocalService.updateOutputPorts(scienceAppId, outputPorts);
	}

	@Override
	public ScienceAppLocalService getWrappedService() {
		return _scienceAppLocalService;
	}

	@Override
	public void setWrappedService(ScienceAppLocalService scienceAppLocalService) {
		_scienceAppLocalService = scienceAppLocalService;
	}

	private ScienceAppLocalService _scienceAppLocalService;
}