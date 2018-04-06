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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DataCollection. This utility wraps
 * {@link OSPIcecap.service.impl.DataCollectionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see DataCollectionLocalService
 * @see OSPIcecap.service.base.DataCollectionLocalServiceBaseImpl
 * @see OSPIcecap.service.impl.DataCollectionLocalServiceImpl
 * @generated
 */
@ProviderType
public class DataCollectionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link OSPIcecap.service.impl.DataCollectionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the data collection to the database. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was added
	*/
	public static OSPIcecap.model.DataCollection addDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return getService().addDataCollection(dataCollection);
	}

	/**
	* Creates a new data collection with the primary key. Does not add the data collection to the database.
	*
	* @param collectionId the primary key for the new data collection
	* @return the new data collection
	*/
	public static OSPIcecap.model.DataCollection createDataCollection(
		long collectionId) {
		return getService().createDataCollection(collectionId);
	}

	/**
	* Deletes the data collection from the database. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was removed
	*/
	public static OSPIcecap.model.DataCollection deleteDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return getService().deleteDataCollection(dataCollection);
	}

	/**
	* Deletes the data collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection that was removed
	* @throws PortalException if a data collection with the primary key could not be found
	*/
	public static OSPIcecap.model.DataCollection deleteDataCollection(
		long collectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataCollection(collectionId);
	}

	public static OSPIcecap.model.DataCollection fetchDataCollection(
		long collectionId) {
		return getService().fetchDataCollection(collectionId);
	}

	/**
	* Returns the data collection matching the UUID and group.
	*
	* @param uuid the data collection's UUID
	* @param groupId the primary key of the group
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static OSPIcecap.model.DataCollection fetchDataCollectionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDataCollectionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the data collection with the primary key.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection
	* @throws PortalException if a data collection with the primary key could not be found
	*/
	public static OSPIcecap.model.DataCollection getDataCollection(
		long collectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataCollection(collectionId);
	}

	/**
	* Returns the data collection matching the UUID and group.
	*
	* @param uuid the data collection's UUID
	* @param groupId the primary key of the group
	* @return the matching data collection
	* @throws PortalException if a matching data collection could not be found
	*/
	public static OSPIcecap.model.DataCollection getDataCollectionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataCollectionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the data collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataCollection the data collection
	* @return the data collection that was updated
	*/
	public static OSPIcecap.model.DataCollection updateDataCollection(
		OSPIcecap.model.DataCollection dataCollection) {
		return getService().updateDataCollection(dataCollection);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of data collections.
	*
	* @return the number of data collections
	*/
	public static int getDataCollectionsCount() {
		return getService().getDataCollectionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<OSPIcecap.model.DataCollection> getDataCollections(
		int start, int end) {
		return getService().getDataCollections(start, end);
	}

	/**
	* Returns all the data collections matching the UUID and company.
	*
	* @param uuid the UUID of the data collections
	* @param companyId the primary key of the company
	* @return the matching data collections, or an empty list if no matches were found
	*/
	public static java.util.List<OSPIcecap.model.DataCollection> getDataCollectionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDataCollectionsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<OSPIcecap.model.DataCollection> getDataCollectionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSPIcecap.model.DataCollection> orderByComparator) {
		return getService()
				   .getDataCollectionsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static DataCollectionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataCollectionLocalService, DataCollectionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DataCollectionLocalService.class);
}