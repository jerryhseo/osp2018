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

package com.kisti.osp.icebreaker.service;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebreaker.exception.NoSuchOSPSchedulerEntryException;
import com.kisti.osp.icebreaker.model.Job;
import com.kisti.osp.icebreaker.model.OSPScheduler;
import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.template.TemplateException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.IOException;
import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for OSPSchedulerEntry. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Jerry H. Seo
 * @see OSPSchedulerEntryLocalServiceUtil
 * @see com.kisti.osp.icebreaker.service.base.OSPSchedulerEntryLocalServiceBaseImpl
 * @see com.kisti.osp.icebreaker.service.impl.OSPSchedulerEntryLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface OSPSchedulerEntryLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSPSchedulerEntryLocalServiceUtil} to access the osp scheduler entry local service. Add custom service methods to {@link com.kisti.osp.icebreaker.service.impl.OSPSchedulerEntryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Job submitJob(Job job, ServiceContext sc)
		throws PortalException, SystemException, TemplateException, IOException;

	public OSPScheduler createOSPScheduler(java.lang.String className,
		java.lang.String user, java.lang.String password, java.lang.String ip,
		java.lang.String port);

	public OSPScheduler createOSPScheduler(long schedulerEntryId)
		throws PortalException;

	/**
	* Adds the osp scheduler entry to the database. Also notifies the appropriate model listeners.
	*
	* @param ospSchedulerEntry the osp scheduler entry
	* @return the osp scheduler entry that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public OSPSchedulerEntry addOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry);

	public OSPSchedulerEntry addScheduler(java.lang.String name,
		java.lang.String version, java.lang.String serverIp,
		java.lang.String sshPort, java.lang.String schedulerClass,
		java.lang.String accessMethod, java.lang.String authorizedUser,
		java.lang.String authorizedPassword, java.lang.String description,
		java.lang.String templateDir, java.lang.String templateRealDir,
		long[] permissionGroupIds, ServiceContext sc)
		throws PortalException, SystemException;

	/**
	* Creates a new osp scheduler entry with the primary key. Does not add the osp scheduler entry to the database.
	*
	* @param schedulerEntryId the primary key for the new osp scheduler entry
	* @return the new osp scheduler entry
	*/
	public OSPSchedulerEntry createOSPSchedulerEntry(long schedulerEntryId);

	/**
	* Deletes the osp scheduler entry from the database. Also notifies the appropriate model listeners.
	*
	* @param ospSchedulerEntry the osp scheduler entry
	* @return the osp scheduler entry that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public OSPSchedulerEntry deleteOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry);

	/**
	* Deletes the osp scheduler entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param schedulerEntryId the primary key of the osp scheduler entry
	* @return the osp scheduler entry that was removed
	* @throws PortalException if a osp scheduler entry with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public OSPSchedulerEntry deleteOSPSchedulerEntry(long schedulerEntryId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OSPSchedulerEntry fetchOSPSchedulerEntry(long schedulerEntryId);

	/**
	* Returns the osp scheduler entry matching the UUID and group.
	*
	* @param uuid the osp scheduler entry's UUID
	* @param groupId the primary key of the group
	* @return the matching osp scheduler entry, or <code>null</code> if a matching osp scheduler entry could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OSPSchedulerEntry fetchOSPSchedulerEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the osp scheduler entry with the primary key.
	*
	* @param schedulerEntryId the primary key of the osp scheduler entry
	* @return the osp scheduler entry
	* @throws PortalException if a osp scheduler entry with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OSPSchedulerEntry getOSPSchedulerEntry(long schedulerEntryId)
		throws PortalException;

	/**
	* Returns the osp scheduler entry matching the UUID and group.
	*
	* @param uuid the osp scheduler entry's UUID
	* @param groupId the primary key of the group
	* @return the matching osp scheduler entry
	* @throws PortalException if a matching osp scheduler entry could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OSPSchedulerEntry getOSPSchedulerEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OSPSchedulerEntry getSchedulerEntry(java.lang.String name,
		java.lang.String version)
		throws NoSuchOSPSchedulerEntryException, SystemException;

	public OSPSchedulerEntry removeScheduler(java.lang.String name,
		java.lang.String version) throws PortalException, SystemException;

	public OSPSchedulerEntry removeScheduler(long schedulerId)
		throws PortalException, SystemException;

	/**
	* Updates the osp scheduler entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ospSchedulerEntry the osp scheduler entry
	* @return the osp scheduler entry that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public OSPSchedulerEntry updateOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry);

	public OSPSchedulerEntry updateScheduler(OSPSchedulerEntry scheduler,
		long[] permissionGroupIds, ServiceContext sc) throws SystemException;

	public OSPSchedulerEntry updateScheduler(long schedulerId,
		java.lang.String name, java.lang.String version,
		java.lang.String serverIp, java.lang.String sshPort,
		java.lang.String schedulerClass, java.lang.String accessMethod,
		java.lang.String authorizedUser, java.lang.String authorizedPassword,
		java.lang.String description, java.lang.String templateDir,
		java.lang.String templateRealDir, long[] permissionGroupIds,
		int status, ServiceContext sc) throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getSchedulersJson() throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getSchedulersJson(int start, int end)
		throws SystemException;

	public JSONArray toJsonArray(OSPSchedulerEntry scheduler);

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

	public int countSchedulers() throws SystemException;

	public int countSchedulers(long groupId) throws SystemException;

	/**
	* Returns the number of osp scheduler entries.
	*
	* @return the number of osp scheduler entries
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOSPSchedulerEntriesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.OSPSchedulerEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.OSPSchedulerEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the osp scheduler entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.OSPSchedulerEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of osp scheduler entries
	* @param end the upper bound of the range of osp scheduler entries (not inclusive)
	* @return the range of osp scheduler entries
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getOSPSchedulerEntries(int start, int end);

	/**
	* Returns all the osp scheduler entries matching the UUID and company.
	*
	* @param uuid the UUID of the osp scheduler entries
	* @param companyId the primary key of the company
	* @return the matching osp scheduler entries, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getOSPSchedulerEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of osp scheduler entries matching the UUID and company.
	*
	* @param uuid the UUID of the osp scheduler entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of osp scheduler entries
	* @param end the upper bound of the range of osp scheduler entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching osp scheduler entries, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getOSPSchedulerEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<OSPSchedulerEntry> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers() throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers(int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers(java.lang.String name)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers(java.lang.String name,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers(long groupId)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OSPSchedulerEntry> getSchedulers(long groupId, int start,
		int end) throws SystemException;

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

	public void removeSchedulers(java.lang.String name)
		throws PortalException, SystemException;

	public void updateSchedulerPermissions(OSPSchedulerEntry scheduler,
		long[] permissionGroupIds) throws PortalException, SystemException;
}