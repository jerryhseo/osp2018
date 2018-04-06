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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppException;
import com.kisti.osp.spyglass.model.ScienceApp;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the local service interface for ScienceApp. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Jerry H. Seo
 * @see ScienceAppLocalServiceUtil
 * @see com.kisti.osp.spyglass.service.base.ScienceAppLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.impl.ScienceAppLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ScienceAppLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppLocalServiceUtil} to access the science app local service. Add custom service methods to {@link com.kisti.osp.spyglass.service.impl.ScienceAppLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the science app to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ScienceApp addScienceApp(ScienceApp scienceApp);

	public ScienceApp addScienceApp(java.lang.String name,
		java.lang.String version, Map<Locale, java.lang.String> titleMap,
		Map<Locale, java.lang.String> descriptionMap, long iconId,
		Map<Locale, java.lang.String> manualMap, java.lang.String exeFileName,
		java.lang.String appType, java.lang.String runType, int maxCpus,
		int defaultCpus, java.lang.String inputPorts,
		java.lang.String logPorts, java.lang.String outputPorts,
		java.lang.String layout, int openLevel, java.lang.String license,
		ServiceContext sc) throws PortalException, SystemException;

	/**
	* Creates a new science app with the primary key. Does not add the science app to the database.
	*
	* @param scienceAppId the primary key for the new science app
	* @return the new science app
	*/
	public ScienceApp createScienceApp(long scienceAppId);

	/**
	* Deletes the science app from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ScienceApp deleteScienceApp(ScienceApp scienceApp);

	/**
	* Deletes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app that was removed
	* @throws PortalException if a science app with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ScienceApp deleteScienceApp(long scienceAppId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ScienceApp fetchScienceApp(long scienceAppId);

	/**
	* Returns the science app matching the UUID and group.
	*
	* @param uuid the science app's UUID
	* @param groupId the primary key of the group
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ScienceApp fetchScienceAppByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the science app with the primary key.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app
	* @throws PortalException if a science app with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ScienceApp getScienceApp(long scienceAppId)
		throws PortalException;

	/**
	* Returns the science app matching the UUID and group.
	*
	* @param uuid the science app's UUID
	* @param groupId the primary key of the group
	* @return the matching science app
	* @throws PortalException if a matching science app could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ScienceApp getScienceAppByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	public ScienceApp removeScienceApp(ScienceApp app, ServiceContext sc)
		throws PortalException;

	public ScienceApp removeScienceApp(java.lang.String scienceAppName,
		java.lang.String scienceAppVersion, ServiceContext sc)
		throws NoSuchScienceAppException, PortalException;

	public ScienceApp removeScienceApp(long scienceAppId, ServiceContext sc)
		throws PortalException;

	/**
	* Updates the science app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceApp the science app
	* @return the science app that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ScienceApp updateScienceApp(ScienceApp scienceApp);

	public ScienceApp updateScienceApp(ScienceApp scienceApp, ServiceContext sc)
		throws PortalException, SystemException;

	public ScienceApp updateScienceApp(java.lang.String name,
		java.lang.String version, Map<Locale, java.lang.String> titleMap,
		Map<Locale, java.lang.String> descriptionMap, long iconId,
		Map<Locale, java.lang.String> manualMap, java.lang.String exeFileName,
		java.lang.String appType, java.lang.String runType, int maxCpus,
		int defaultCpus, java.lang.String inputPorts,
		java.lang.String logPorts, java.lang.String outputPorts,
		java.lang.String layout, int openLevel, java.lang.String license,
		ServiceContext sc) throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of science apps.
	*
	* @return the number of science apps
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getScienceAppsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getInputPorts(long scienceAppId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getLayout(long scienceAppId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getLogPorts(long scienceAppId)
		throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getOutputPorts(long scienceAppId)
		throws PortalException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ScienceApp> getScienceApps(int start, int end);

	/**
	* Returns all the science apps matching the UUID and company.
	*
	* @param uuid the UUID of the science apps
	* @param companyId the primary key of the company
	* @return the matching science apps, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ScienceApp> getScienceAppsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ScienceApp> getScienceAppsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator);

	public List<ScienceApp> removeScienceApps(java.lang.String scienceAppName,
		ServiceContext sc) throws PortalException;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void removeInputPorts(long scienceAppId) throws PortalException;

	public void removeLayout(long scienceAppId) throws PortalException;

	public void removeLogPorts(long scienceAppId) throws PortalException;

	public void removeOutputPorts(long scienceAppId) throws PortalException;

	public void setInputPorts(long scienceAppId, java.lang.String inputPorts);

	public void setLayout(long scienceAppId, java.lang.String layout);

	public void setLogPorts(long scienceAppId, java.lang.String logPorts);

	public void setOutputPorts(long scienceAppId, java.lang.String outputPorts);

	public void updateInputPorts(long scienceAppId, java.lang.String inputPorts)
		throws PortalException;

	public void updateLayout(long scienceAppId, java.lang.String layout)
		throws PortalException;

	public void updateLogPorts(long scienceAppId, java.lang.String logPorts)
		throws PortalException;

	public void updateOutputPorts(long scienceAppId,
		java.lang.String outputPorts) throws PortalException;
}