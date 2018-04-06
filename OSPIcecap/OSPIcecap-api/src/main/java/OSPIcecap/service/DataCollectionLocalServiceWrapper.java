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

package OSPIcecap.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DataCollectionLocalService}.
 *
 * @author Jerry H. Seo
 * @see DataCollectionLocalService
 * @generated
 */
@ProviderType
public class DataCollectionLocalServiceWrapper
	implements DataCollectionLocalService,
		ServiceWrapper<DataCollectionLocalService> {
	public DataCollectionLocalServiceWrapper(
		DataCollectionLocalService dataCollectionLocalService) {
		_dataCollectionLocalService = dataCollectionLocalService;
	}

	/**
	* Adds the data collection to the database. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was added
	*/
	@Override
	public OSPIcecap.model.DataCollection addDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return _dataCollectionLocalService.addDataCollection(dataCollection);
	}

	/**
	* Creates a new data collection with the primary key. Does not add the data collection to the database.
	*
	* @param collectionId the primary key for the new data collection
	* @return the new data collection
	*/
	@Override
	public OSPIcecap.model.DataCollection createDataCollection(
		long collectionId) {
		return _dataCollectionLocalService.createDataCollection(collectionId);
	}

	/**
	* Deletes the data collection from the database. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was removed
	*/
	@Override
	public OSPIcecap.model.DataCollection deleteDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return _dataCollectionLocalService.deleteDataCollection(dataCollection);
	}

	/**
	* Deletes the data collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection that was removed
	* @throws PortalException if a data collection with the primary key could not be found
	*/
	@Override
	public OSPIcecap.model.DataCollection deleteDataCollection(
		long collectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dataCollectionLocalService.deleteDataCollection(collectionId);
	}

	@Override
	public OSPIcecap.model.DataCollection fetchDataCollection(long collectionId) {
		return _dataCollectionLocalService.fetchDataCollection(collectionId);
	}

	/**
	* Returns the data collection matching the UUID and group.
	*
	* @param uuid the data collection's UUID
	* @param groupId the primary key of the group
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	@Override
	public OSPIcecap.model.DataCollection fetchDataCollectionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _dataCollectionLocalService.fetchDataCollectionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the data collection with the primary key.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection
	* @throws PortalException if a data collection with the primary key could not be found
	*/
	@Override
	public OSPIcecap.model.DataCollection getDataCollection(long collectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dataCollectionLocalService.getDataCollection(collectionId);
	}

	/**
	* Returns the data collection matching the UUID and group.
	*
	* @param uuid the data collection's UUID
	* @param groupId the primary key of the group
	* @return the matching data collection
	* @throws PortalException if a matching data collection could not be found
	*/
	@Override
	public OSPIcecap.model.DataCollection getDataCollectionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dataCollectionLocalService.getDataCollectionByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the data collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was updated
	*/
	@Override
	public OSPIcecap.model.DataCollection updateDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return _dataCollectionLocalService.updateDataCollection(dataCollection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _dataCollectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dataCollectionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _dataCollectionLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _dataCollectionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dataCollectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dataCollectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of data collections.
	*
	* @return the number of data collections
	*/
	@Override
	public int getDataCollectionsCount() {
		return _dataCollectionLocalService.getDataCollectionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dataCollectionLocalService.getOSGiServiceIdentifier();
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
		return _dataCollectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dataCollectionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dataCollectionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the data collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of data collections
	*/
	@Override
	public java.util.List<OSPIcecap.model.DataCollection> getDataCollections(
		int start, int end) {
		return _dataCollectionLocalService.getDataCollections(start, end);
	}

	/**
	* Returns all the data collections matching the UUID and company.
	*
	* @param uuid the UUID of the data collections
	* @param companyId the primary key of the company
	* @return the matching data collections, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<OSPIcecap.model.DataCollection> getDataCollectionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _dataCollectionLocalService.getDataCollectionsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of data collections matching the UUID and company.
	*
	* @param uuid the UUID of the data collections
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching data collections, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<OSPIcecap.model.DataCollection> getDataCollectionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSPIcecap.model.DataCollection> orderByComparator) {
		return _dataCollectionLocalService.getDataCollectionsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _dataCollectionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dataCollectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public DataCollectionLocalService getWrappedService() {
		return _dataCollectionLocalService;
	}

	@Override
	public void setWrappedService(
		DataCollectionLocalService dataCollectionLocalService) {
		_dataCollectionLocalService = dataCollectionLocalService;
	}

	private DataCollectionLocalService _dataCollectionLocalService;
}