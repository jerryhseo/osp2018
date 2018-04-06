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

package OSPIcecap.service.base;

import OSPIcecap.model.DataType;

import OSPIcecap.service.DataTypeLocalService;

import OSPIcecap.service.persistence.DataCollectionLayoutPersistence;
import OSPIcecap.service.persistence.DataCollectionPersistence;
import OSPIcecap.service.persistence.DataEntryPersistence;
import OSPIcecap.service.persistence.DataTypeAnalyzerLinkPersistence;
import OSPIcecap.service.persistence.DataTypePersistence;
import OSPIcecap.service.persistence.DataTypeStructurePersistence;

import aQute.bnd.annotation.ProviderType;

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
 * Provides the base implementation for the data type local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link OSPIcecap.service.impl.DataTypeLocalServiceImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.impl.DataTypeLocalServiceImpl
 * @see OSPIcecap.service.DataTypeLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class DataTypeLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements DataTypeLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OSPIcecap.service.DataTypeLocalServiceUtil} to access the data type local service.
	 */

	/**
	 * Adds the data type to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dataType the data type
	 * @return the data type that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DataType addDataType(DataType dataType) {
		dataType.setNew(true);

		return dataTypePersistence.update(dataType);
	}

	/**
	 * Creates a new data type with the primary key. Does not add the data type to the database.
	 *
	 * @param typeId the primary key for the new data type
	 * @return the new data type
	 */
	@Override
	public DataType createDataType(long typeId) {
		return dataTypePersistence.create(typeId);
	}

	/**
	 * Deletes the data type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the data type
	 * @return the data type that was removed
	 * @throws PortalException if a data type with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DataType deleteDataType(long typeId) throws PortalException {
		return dataTypePersistence.remove(typeId);
	}

	/**
	 * Deletes the data type from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dataType the data type
	 * @return the data type that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DataType deleteDataType(DataType dataType) {
		return dataTypePersistence.remove(dataType);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DataType.class,
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
		return dataTypePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return dataTypePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return dataTypePersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return dataTypePersistence.countWithDynamicQuery(dynamicQuery);
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
		return dataTypePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DataType fetchDataType(long typeId) {
		return dataTypePersistence.fetchByPrimaryKey(typeId);
	}

	/**
	 * Returns the data type matching the UUID and group.
	 *
	 * @param uuid the data type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching data type, or <code>null</code> if a matching data type could not be found
	 */
	@Override
	public DataType fetchDataTypeByUuidAndGroupId(String uuid, long groupId) {
		return dataTypePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the data type with the primary key.
	 *
	 * @param typeId the primary key of the data type
	 * @return the data type
	 * @throws PortalException if a data type with the primary key could not be found
	 */
	@Override
	public DataType getDataType(long typeId) throws PortalException {
		return dataTypePersistence.findByPrimaryKey(typeId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(dataTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DataType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("typeId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(dataTypeLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(DataType.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("typeId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(dataTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DataType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("typeId");
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

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<DataType>() {
				@Override
				public void performAction(DataType dataType)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						dataType);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(DataType.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return dataTypeLocalService.deleteDataType((DataType)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return dataTypePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the data types matching the UUID and company.
	 *
	 * @param uuid the UUID of the data types
	 * @param companyId the primary key of the company
	 * @return the matching data types, or an empty list if no matches were found
	 */
	@Override
	public List<DataType> getDataTypesByUuidAndCompanyId(String uuid,
		long companyId) {
		return dataTypePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of data types matching the UUID and company.
	 *
	 * @param uuid the UUID of the data types
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of data types
	 * @param end the upper bound of the range of data types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching data types, or an empty list if no matches were found
	 */
	@Override
	public List<DataType> getDataTypesByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return dataTypePersistence.findByUuid_C(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	 * Returns the data type matching the UUID and group.
	 *
	 * @param uuid the data type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching data type
	 * @throws PortalException if a matching data type could not be found
	 */
	@Override
	public DataType getDataTypeByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {
		return dataTypePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the data types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data types
	 * @param end the upper bound of the range of data types (not inclusive)
	 * @return the range of data types
	 */
	@Override
	public List<DataType> getDataTypes(int start, int end) {
		return dataTypePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of data types.
	 *
	 * @return the number of data types
	 */
	@Override
	public int getDataTypesCount() {
		return dataTypePersistence.countAll();
	}

	/**
	 * Updates the data type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dataType the data type
	 * @return the data type that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DataType updateDataType(DataType dataType) {
		return dataTypePersistence.update(dataType);
	}

	/**
	 * Returns the data collection local service.
	 *
	 * @return the data collection local service
	 */
	public OSPIcecap.service.DataCollectionLocalService getDataCollectionLocalService() {
		return dataCollectionLocalService;
	}

	/**
	 * Sets the data collection local service.
	 *
	 * @param dataCollectionLocalService the data collection local service
	 */
	public void setDataCollectionLocalService(
		OSPIcecap.service.DataCollectionLocalService dataCollectionLocalService) {
		this.dataCollectionLocalService = dataCollectionLocalService;
	}

	/**
	 * Returns the data collection persistence.
	 *
	 * @return the data collection persistence
	 */
	public DataCollectionPersistence getDataCollectionPersistence() {
		return dataCollectionPersistence;
	}

	/**
	 * Sets the data collection persistence.
	 *
	 * @param dataCollectionPersistence the data collection persistence
	 */
	public void setDataCollectionPersistence(
		DataCollectionPersistence dataCollectionPersistence) {
		this.dataCollectionPersistence = dataCollectionPersistence;
	}

	/**
	 * Returns the data collection layout local service.
	 *
	 * @return the data collection layout local service
	 */
	public OSPIcecap.service.DataCollectionLayoutLocalService getDataCollectionLayoutLocalService() {
		return dataCollectionLayoutLocalService;
	}

	/**
	 * Sets the data collection layout local service.
	 *
	 * @param dataCollectionLayoutLocalService the data collection layout local service
	 */
	public void setDataCollectionLayoutLocalService(
		OSPIcecap.service.DataCollectionLayoutLocalService dataCollectionLayoutLocalService) {
		this.dataCollectionLayoutLocalService = dataCollectionLayoutLocalService;
	}

	/**
	 * Returns the data collection layout persistence.
	 *
	 * @return the data collection layout persistence
	 */
	public DataCollectionLayoutPersistence getDataCollectionLayoutPersistence() {
		return dataCollectionLayoutPersistence;
	}

	/**
	 * Sets the data collection layout persistence.
	 *
	 * @param dataCollectionLayoutPersistence the data collection layout persistence
	 */
	public void setDataCollectionLayoutPersistence(
		DataCollectionLayoutPersistence dataCollectionLayoutPersistence) {
		this.dataCollectionLayoutPersistence = dataCollectionLayoutPersistence;
	}

	/**
	 * Returns the data entry local service.
	 *
	 * @return the data entry local service
	 */
	public OSPIcecap.service.DataEntryLocalService getDataEntryLocalService() {
		return dataEntryLocalService;
	}

	/**
	 * Sets the data entry local service.
	 *
	 * @param dataEntryLocalService the data entry local service
	 */
	public void setDataEntryLocalService(
		OSPIcecap.service.DataEntryLocalService dataEntryLocalService) {
		this.dataEntryLocalService = dataEntryLocalService;
	}

	/**
	 * Returns the data entry persistence.
	 *
	 * @return the data entry persistence
	 */
	public DataEntryPersistence getDataEntryPersistence() {
		return dataEntryPersistence;
	}

	/**
	 * Sets the data entry persistence.
	 *
	 * @param dataEntryPersistence the data entry persistence
	 */
	public void setDataEntryPersistence(
		DataEntryPersistence dataEntryPersistence) {
		this.dataEntryPersistence = dataEntryPersistence;
	}

	/**
	 * Returns the data type local service.
	 *
	 * @return the data type local service
	 */
	public DataTypeLocalService getDataTypeLocalService() {
		return dataTypeLocalService;
	}

	/**
	 * Sets the data type local service.
	 *
	 * @param dataTypeLocalService the data type local service
	 */
	public void setDataTypeLocalService(
		DataTypeLocalService dataTypeLocalService) {
		this.dataTypeLocalService = dataTypeLocalService;
	}

	/**
	 * Returns the data type persistence.
	 *
	 * @return the data type persistence
	 */
	public DataTypePersistence getDataTypePersistence() {
		return dataTypePersistence;
	}

	/**
	 * Sets the data type persistence.
	 *
	 * @param dataTypePersistence the data type persistence
	 */
	public void setDataTypePersistence(DataTypePersistence dataTypePersistence) {
		this.dataTypePersistence = dataTypePersistence;
	}

	/**
	 * Returns the data type analyzer link local service.
	 *
	 * @return the data type analyzer link local service
	 */
	public OSPIcecap.service.DataTypeAnalyzerLinkLocalService getDataTypeAnalyzerLinkLocalService() {
		return dataTypeAnalyzerLinkLocalService;
	}

	/**
	 * Sets the data type analyzer link local service.
	 *
	 * @param dataTypeAnalyzerLinkLocalService the data type analyzer link local service
	 */
	public void setDataTypeAnalyzerLinkLocalService(
		OSPIcecap.service.DataTypeAnalyzerLinkLocalService dataTypeAnalyzerLinkLocalService) {
		this.dataTypeAnalyzerLinkLocalService = dataTypeAnalyzerLinkLocalService;
	}

	/**
	 * Returns the data type analyzer link persistence.
	 *
	 * @return the data type analyzer link persistence
	 */
	public DataTypeAnalyzerLinkPersistence getDataTypeAnalyzerLinkPersistence() {
		return dataTypeAnalyzerLinkPersistence;
	}

	/**
	 * Sets the data type analyzer link persistence.
	 *
	 * @param dataTypeAnalyzerLinkPersistence the data type analyzer link persistence
	 */
	public void setDataTypeAnalyzerLinkPersistence(
		DataTypeAnalyzerLinkPersistence dataTypeAnalyzerLinkPersistence) {
		this.dataTypeAnalyzerLinkPersistence = dataTypeAnalyzerLinkPersistence;
	}

	/**
	 * Returns the data type structure local service.
	 *
	 * @return the data type structure local service
	 */
	public OSPIcecap.service.DataTypeStructureLocalService getDataTypeStructureLocalService() {
		return dataTypeStructureLocalService;
	}

	/**
	 * Sets the data type structure local service.
	 *
	 * @param dataTypeStructureLocalService the data type structure local service
	 */
	public void setDataTypeStructureLocalService(
		OSPIcecap.service.DataTypeStructureLocalService dataTypeStructureLocalService) {
		this.dataTypeStructureLocalService = dataTypeStructureLocalService;
	}

	/**
	 * Returns the data type structure persistence.
	 *
	 * @return the data type structure persistence
	 */
	public DataTypeStructurePersistence getDataTypeStructurePersistence() {
		return dataTypeStructurePersistence;
	}

	/**
	 * Sets the data type structure persistence.
	 *
	 * @param dataTypeStructurePersistence the data type structure persistence
	 */
	public void setDataTypeStructurePersistence(
		DataTypeStructurePersistence dataTypeStructurePersistence) {
		this.dataTypeStructurePersistence = dataTypeStructurePersistence;
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

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("OSPIcecap.model.DataType",
			dataTypeLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"OSPIcecap.model.DataType");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DataTypeLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DataType.class;
	}

	protected String getModelClassName() {
		return DataType.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = dataTypePersistence.getDataSource();

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

	@BeanReference(type = OSPIcecap.service.DataCollectionLocalService.class)
	protected OSPIcecap.service.DataCollectionLocalService dataCollectionLocalService;
	@BeanReference(type = DataCollectionPersistence.class)
	protected DataCollectionPersistence dataCollectionPersistence;
	@BeanReference(type = OSPIcecap.service.DataCollectionLayoutLocalService.class)
	protected OSPIcecap.service.DataCollectionLayoutLocalService dataCollectionLayoutLocalService;
	@BeanReference(type = DataCollectionLayoutPersistence.class)
	protected DataCollectionLayoutPersistence dataCollectionLayoutPersistence;
	@BeanReference(type = OSPIcecap.service.DataEntryLocalService.class)
	protected OSPIcecap.service.DataEntryLocalService dataEntryLocalService;
	@BeanReference(type = DataEntryPersistence.class)
	protected DataEntryPersistence dataEntryPersistence;
	@BeanReference(type = DataTypeLocalService.class)
	protected DataTypeLocalService dataTypeLocalService;
	@BeanReference(type = DataTypePersistence.class)
	protected DataTypePersistence dataTypePersistence;
	@BeanReference(type = OSPIcecap.service.DataTypeAnalyzerLinkLocalService.class)
	protected OSPIcecap.service.DataTypeAnalyzerLinkLocalService dataTypeAnalyzerLinkLocalService;
	@BeanReference(type = DataTypeAnalyzerLinkPersistence.class)
	protected DataTypeAnalyzerLinkPersistence dataTypeAnalyzerLinkPersistence;
	@BeanReference(type = OSPIcecap.service.DataTypeStructureLocalService.class)
	protected OSPIcecap.service.DataTypeStructureLocalService dataTypeStructureLocalService;
	@BeanReference(type = DataTypeStructurePersistence.class)
	protected DataTypeStructurePersistence dataTypeStructurePersistence;
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
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}