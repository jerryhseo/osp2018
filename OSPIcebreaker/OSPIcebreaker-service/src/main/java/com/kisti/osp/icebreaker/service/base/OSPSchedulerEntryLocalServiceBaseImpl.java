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

package com.kisti.osp.icebreaker.service.base;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalService;
import com.kisti.osp.icebreaker.service.persistence.JobDataPersistence;
import com.kisti.osp.icebreaker.service.persistence.JobPersistence;
import com.kisti.osp.icebreaker.service.persistence.OSPSchedulerEntryPersistence;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetLinkPersistence;
import com.liferay.asset.kernel.service.persistence.AssetTagPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the osp scheduler entry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.kisti.osp.icebreaker.service.impl.OSPSchedulerEntryLocalServiceImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.icebreaker.service.impl.OSPSchedulerEntryLocalServiceImpl
 * @see com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class OSPSchedulerEntryLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements OSPSchedulerEntryLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil} to access the osp scheduler entry local service.
	 */

	/**
	 * Adds the osp scheduler entry to the database. Also notifies the appropriate model listeners.
	 *
	 * @param ospSchedulerEntry the osp scheduler entry
	 * @return the osp scheduler entry that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OSPSchedulerEntry addOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry) {
		ospSchedulerEntry.setNew(true);

		return ospSchedulerEntryPersistence.update(ospSchedulerEntry);
	}

	/**
	 * Creates a new osp scheduler entry with the primary key. Does not add the osp scheduler entry to the database.
	 *
	 * @param schedulerEntryId the primary key for the new osp scheduler entry
	 * @return the new osp scheduler entry
	 */
	@Override
	public OSPSchedulerEntry createOSPSchedulerEntry(long schedulerEntryId) {
		return ospSchedulerEntryPersistence.create(schedulerEntryId);
	}

	/**
	 * Deletes the osp scheduler entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schedulerEntryId the primary key of the osp scheduler entry
	 * @return the osp scheduler entry that was removed
	 * @throws PortalException if a osp scheduler entry with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OSPSchedulerEntry deleteOSPSchedulerEntry(long schedulerEntryId)
		throws PortalException {
		return ospSchedulerEntryPersistence.remove(schedulerEntryId);
	}

	/**
	 * Deletes the osp scheduler entry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ospSchedulerEntry the osp scheduler entry
	 * @return the osp scheduler entry that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OSPSchedulerEntry deleteOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry) {
		return ospSchedulerEntryPersistence.remove(ospSchedulerEntry);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(OSPSchedulerEntry.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ospSchedulerEntryPersistence.findWithDynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return ospSchedulerEntryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

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
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return ospSchedulerEntryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return ospSchedulerEntryPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return ospSchedulerEntryPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public OSPSchedulerEntry fetchOSPSchedulerEntry(long schedulerEntryId) {
		return ospSchedulerEntryPersistence.fetchByPrimaryKey(schedulerEntryId);
	}

	/**
	 * Returns the osp scheduler entry matching the UUID and group.
	 *
	 * @param uuid the osp scheduler entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osp scheduler entry, or <code>null</code> if a matching osp scheduler entry could not be found
	 */
	@Override
	public OSPSchedulerEntry fetchOSPSchedulerEntryByUuidAndGroupId(
		String uuid, long groupId) {
		return ospSchedulerEntryPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osp scheduler entry with the primary key.
	 *
	 * @param schedulerEntryId the primary key of the osp scheduler entry
	 * @return the osp scheduler entry
	 * @throws PortalException if a osp scheduler entry with the primary key could not be found
	 */
	@Override
	public OSPSchedulerEntry getOSPSchedulerEntry(long schedulerEntryId)
		throws PortalException {
		return ospSchedulerEntryPersistence.findByPrimaryKey(schedulerEntryId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(ospSchedulerEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OSPSchedulerEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("schedulerEntryId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(ospSchedulerEntryLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(OSPSchedulerEntry.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"schedulerEntryId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(ospSchedulerEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OSPSchedulerEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("schedulerEntryId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<OSPSchedulerEntry>() {
				@Override
				public void performAction(OSPSchedulerEntry ospSchedulerEntry)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						ospSchedulerEntry);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(OSPSchedulerEntry.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return ospSchedulerEntryLocalService.deleteOSPSchedulerEntry((OSPSchedulerEntry)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return ospSchedulerEntryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the osp scheduler entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the osp scheduler entries
	 * @param companyId the primary key of the company
	 * @return the matching osp scheduler entries, or an empty list if no matches were found
	 */
	@Override
	public List<OSPSchedulerEntry> getOSPSchedulerEntriesByUuidAndCompanyId(
		String uuid, long companyId) {
		return ospSchedulerEntryPersistence.findByUuid_C(uuid, companyId);
	}

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
	@Override
	public List<OSPSchedulerEntry> getOSPSchedulerEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OSPSchedulerEntry> orderByComparator) {
		return ospSchedulerEntryPersistence.findByUuid_C(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	 * Returns the osp scheduler entry matching the UUID and group.
	 *
	 * @param uuid the osp scheduler entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osp scheduler entry
	 * @throws PortalException if a matching osp scheduler entry could not be found
	 */
	@Override
	public OSPSchedulerEntry getOSPSchedulerEntryByUuidAndGroupId(String uuid,
		long groupId) throws PortalException {
		return ospSchedulerEntryPersistence.findByUUID_G(uuid, groupId);
	}

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
	@Override
	public List<OSPSchedulerEntry> getOSPSchedulerEntries(int start, int end) {
		return ospSchedulerEntryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of osp scheduler entries.
	 *
	 * @return the number of osp scheduler entries
	 */
	@Override
	public int getOSPSchedulerEntriesCount() {
		return ospSchedulerEntryPersistence.countAll();
	}

	/**
	 * Updates the osp scheduler entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param ospSchedulerEntry the osp scheduler entry
	 * @return the osp scheduler entry that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OSPSchedulerEntry updateOSPSchedulerEntry(
		OSPSchedulerEntry ospSchedulerEntry) {
		return ospSchedulerEntryPersistence.update(ospSchedulerEntry);
	}

	/**
	 * Returns the job local service.
	 *
	 * @return the job local service
	 */
	public com.kisti.osp.icebreaker.service.JobLocalService getJobLocalService() {
		return jobLocalService;
	}

	/**
	 * Sets the job local service.
	 *
	 * @param jobLocalService the job local service
	 */
	public void setJobLocalService(
		com.kisti.osp.icebreaker.service.JobLocalService jobLocalService) {
		this.jobLocalService = jobLocalService;
	}

	/**
	 * Returns the job persistence.
	 *
	 * @return the job persistence
	 */
	public JobPersistence getJobPersistence() {
		return jobPersistence;
	}

	/**
	 * Sets the job persistence.
	 *
	 * @param jobPersistence the job persistence
	 */
	public void setJobPersistence(JobPersistence jobPersistence) {
		this.jobPersistence = jobPersistence;
	}

	/**
	 * Returns the job data local service.
	 *
	 * @return the job data local service
	 */
	public com.kisti.osp.icebreaker.service.JobDataLocalService getJobDataLocalService() {
		return jobDataLocalService;
	}

	/**
	 * Sets the job data local service.
	 *
	 * @param jobDataLocalService the job data local service
	 */
	public void setJobDataLocalService(
		com.kisti.osp.icebreaker.service.JobDataLocalService jobDataLocalService) {
		this.jobDataLocalService = jobDataLocalService;
	}

	/**
	 * Returns the job data persistence.
	 *
	 * @return the job data persistence
	 */
	public JobDataPersistence getJobDataPersistence() {
		return jobDataPersistence;
	}

	/**
	 * Sets the job data persistence.
	 *
	 * @param jobDataPersistence the job data persistence
	 */
	public void setJobDataPersistence(JobDataPersistence jobDataPersistence) {
		this.jobDataPersistence = jobDataPersistence;
	}

	/**
	 * Returns the osp scheduler entry local service.
	 *
	 * @return the osp scheduler entry local service
	 */
	public OSPSchedulerEntryLocalService getOSPSchedulerEntryLocalService() {
		return ospSchedulerEntryLocalService;
	}

	/**
	 * Sets the osp scheduler entry local service.
	 *
	 * @param ospSchedulerEntryLocalService the osp scheduler entry local service
	 */
	public void setOSPSchedulerEntryLocalService(
		OSPSchedulerEntryLocalService ospSchedulerEntryLocalService) {
		this.ospSchedulerEntryLocalService = ospSchedulerEntryLocalService;
	}

	/**
	 * Returns the osp scheduler entry persistence.
	 *
	 * @return the osp scheduler entry persistence
	 */
	public OSPSchedulerEntryPersistence getOSPSchedulerEntryPersistence() {
		return ospSchedulerEntryPersistence;
	}

	/**
	 * Sets the osp scheduler entry persistence.
	 *
	 * @param ospSchedulerEntryPersistence the osp scheduler entry persistence
	 */
	public void setOSPSchedulerEntryPersistence(
		OSPSchedulerEntryPersistence ospSchedulerEntryPersistence) {
		this.ospSchedulerEntryPersistence = ospSchedulerEntryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset link local service.
	 *
	 * @return the asset link local service
	 */
	public com.liferay.asset.kernel.service.AssetLinkLocalService getAssetLinkLocalService() {
		return assetLinkLocalService;
	}

	/**
	 * Sets the asset link local service.
	 *
	 * @param assetLinkLocalService the asset link local service
	 */
	public void setAssetLinkLocalService(
		com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService) {
		this.assetLinkLocalService = assetLinkLocalService;
	}

	/**
	 * Returns the asset link persistence.
	 *
	 * @return the asset link persistence
	 */
	public AssetLinkPersistence getAssetLinkPersistence() {
		return assetLinkPersistence;
	}

	/**
	 * Sets the asset link persistence.
	 *
	 * @param assetLinkPersistence the asset link persistence
	 */
	public void setAssetLinkPersistence(
		AssetLinkPersistence assetLinkPersistence) {
		this.assetLinkPersistence = assetLinkPersistence;
	}

	/**
	 * Returns the asset tag local service.
	 *
	 * @return the asset tag local service
	 */
	public com.liferay.asset.kernel.service.AssetTagLocalService getAssetTagLocalService() {
		return assetTagLocalService;
	}

	/**
	 * Sets the asset tag local service.
	 *
	 * @param assetTagLocalService the asset tag local service
	 */
	public void setAssetTagLocalService(
		com.liferay.asset.kernel.service.AssetTagLocalService assetTagLocalService) {
		this.assetTagLocalService = assetTagLocalService;
	}

	/**
	 * Returns the asset tag persistence.
	 *
	 * @return the asset tag persistence
	 */
	public AssetTagPersistence getAssetTagPersistence() {
		return assetTagPersistence;
	}

	/**
	 * Sets the asset tag persistence.
	 *
	 * @param assetTagPersistence the asset tag persistence
	 */
	public void setAssetTagPersistence(AssetTagPersistence assetTagPersistence) {
		this.assetTagPersistence = assetTagPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.kisti.osp.icebreaker.model.OSPSchedulerEntry",
			ospSchedulerEntryLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.kisti.osp.icebreaker.model.OSPSchedulerEntry");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OSPSchedulerEntryLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OSPSchedulerEntry.class;
	}

	protected String getModelClassName() {
		return OSPSchedulerEntry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ospSchedulerEntryPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.kisti.osp.icebreaker.service.JobLocalService.class)
	protected com.kisti.osp.icebreaker.service.JobLocalService jobLocalService;
	@BeanReference(type = JobPersistence.class)
	protected JobPersistence jobPersistence;
	@BeanReference(type = com.kisti.osp.icebreaker.service.JobDataLocalService.class)
	protected com.kisti.osp.icebreaker.service.JobDataLocalService jobDataLocalService;
	@BeanReference(type = JobDataPersistence.class)
	protected JobDataPersistence jobDataPersistence;
	@BeanReference(type = OSPSchedulerEntryLocalService.class)
	protected OSPSchedulerEntryLocalService ospSchedulerEntryLocalService;
	@BeanReference(type = OSPSchedulerEntryPersistence.class)
	protected OSPSchedulerEntryPersistence ospSchedulerEntryPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryLocalService.class)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService;
	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetLinkLocalService.class)
	protected com.liferay.asset.kernel.service.AssetLinkLocalService assetLinkLocalService;
	@ServiceReference(type = AssetLinkPersistence.class)
	protected AssetLinkPersistence assetLinkPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetTagLocalService.class)
	protected com.liferay.asset.kernel.service.AssetTagLocalService assetTagLocalService;
	@ServiceReference(type = AssetTagPersistence.class)
	protected AssetTagPersistence assetTagPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}