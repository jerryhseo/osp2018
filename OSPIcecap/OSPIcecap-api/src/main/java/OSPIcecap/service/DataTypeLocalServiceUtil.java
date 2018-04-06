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
 * Provides the local service utility for DataType. This utility wraps
 * {@link OSPIcecap.service.impl.DataTypeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see DataTypeLocalService
 * @see OSPIcecap.service.base.DataTypeLocalServiceBaseImpl
 * @see OSPIcecap.service.impl.DataTypeLocalServiceImpl
 * @generated
 */
@ProviderType
public class DataTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link OSPIcecap.service.impl.DataTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the data type to the database. Also notifies the appropriate model listeners.
	*
	* @param dataType the data type
	* @return the data type that was added
	*/
	public static OSPIcecap.model.DataType addDataType(
		OSPIcecap.model.DataType dataType) {
		return getService().addDataType(dataType);
	}

	/**
	* Creates a new data type with the primary key. Does not add the data type to the database.
	*
	* @param typeId the primary key for the new data type
	* @return the new data type
	*/
	public static OSPIcecap.model.DataType createDataType(long typeId) {
		return getService().createDataType(typeId);
	}

	/**
	* Deletes the data type from the database. Also notifies the appropriate model listeners.
	*
	* @param dataType the data type
	* @return the data type that was removed
	*/
	public static OSPIcecap.model.DataType deleteDataType(
		OSPIcecap.model.DataType dataType) {
		return getService().deleteDataType(dataType);
	}

	/**
	* Deletes the data type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the data type
	* @return the data type that was removed
	* @throws PortalException if a data type with the primary key could not be found
	*/
	public static OSPIcecap.model.DataType deleteDataType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataType(typeId);
	}

	public static OSPIcecap.model.DataType fetchDataType(long typeId) {
		return getService().fetchDataType(typeId);
	}

	/**
	* Returns the data type matching the UUID and group.
	*
	* @param uuid the data type's UUID
	* @param groupId the primary key of the group
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static OSPIcecap.model.DataType fetchDataTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDataTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the data type with the primary key.
	*
	* @param typeId the primary key of the data type
	* @return the data type
	* @throws PortalException if a data type with the primary key could not be found
	*/
	public static OSPIcecap.model.DataType getDataType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataType(typeId);
	}

	/**
	* Returns the data type matching the UUID and group.
	*
	* @param uuid the data type's UUID
	* @param groupId the primary key of the group
	* @return the matching data type
	* @throws PortalException if a matching data type could not be found
	*/
	public static OSPIcecap.model.DataType getDataTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the data type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataType the data type
	* @return the data type that was updated
	*/
	public static OSPIcecap.model.DataType updateDataType(
		OSPIcecap.model.DataType dataType) {
		return getService().updateDataType(dataType);
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
	* Returns the number of data types.
	*
	* @return the number of data types
	*/
	public static int getDataTypesCount() {
		return getService().getDataTypesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<OSPIcecap.model.DataType> getDataTypes(
		int start, int end) {
		return getService().getDataTypes(start, end);
	}

	/**
	* Returns all the data types matching the UUID and company.
	*
	* @param uuid the UUID of the data types
	* @param companyId the primary key of the company
	* @return the matching data types, or an empty list if no matches were found
	*/
	public static java.util.List<OSPIcecap.model.DataType> getDataTypesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDataTypesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<OSPIcecap.model.DataType> getDataTypesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSPIcecap.model.DataType> orderByComparator) {
		return getService()
				   .getDataTypesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
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

	public static DataTypeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypeLocalService, DataTypeLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DataTypeLocalService.class);
}