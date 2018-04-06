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
 * Provides the local service utility for DataTypeStructure. This utility wraps
 * {@link OSPIcecap.service.impl.DataTypeStructureLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see DataTypeStructureLocalService
 * @see OSPIcecap.service.base.DataTypeStructureLocalServiceBaseImpl
 * @see OSPIcecap.service.impl.DataTypeStructureLocalServiceImpl
 * @generated
 */
@ProviderType
public class DataTypeStructureLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link OSPIcecap.service.impl.DataTypeStructureLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the data type structure to the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeStructure the data type structure
	* @return the data type structure that was added
	*/
	public static OSPIcecap.model.DataTypeStructure addDataTypeStructure(
		OSPIcecap.model.DataTypeStructure dataTypeStructure) {
		return getService().addDataTypeStructure(dataTypeStructure);
	}

	/**
	* Creates a new data type structure with the primary key. Does not add the data type structure to the database.
	*
	* @param typeId the primary key for the new data type structure
	* @return the new data type structure
	*/
	public static OSPIcecap.model.DataTypeStructure createDataTypeStructure(
		long typeId) {
		return getService().createDataTypeStructure(typeId);
	}

	/**
	* Deletes the data type structure from the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeStructure the data type structure
	* @return the data type structure that was removed
	*/
	public static OSPIcecap.model.DataTypeStructure deleteDataTypeStructure(
		OSPIcecap.model.DataTypeStructure dataTypeStructure) {
		return getService().deleteDataTypeStructure(dataTypeStructure);
	}

	/**
	* Deletes the data type structure with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the data type structure
	* @return the data type structure that was removed
	* @throws PortalException if a data type structure with the primary key could not be found
	*/
	public static OSPIcecap.model.DataTypeStructure deleteDataTypeStructure(
		long typeId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataTypeStructure(typeId);
	}

	public static OSPIcecap.model.DataTypeStructure fetchDataTypeStructure(
		long typeId) {
		return getService().fetchDataTypeStructure(typeId);
	}

	/**
	* Returns the data type structure with the primary key.
	*
	* @param typeId the primary key of the data type structure
	* @return the data type structure
	* @throws PortalException if a data type structure with the primary key could not be found
	*/
	public static OSPIcecap.model.DataTypeStructure getDataTypeStructure(
		long typeId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataTypeStructure(typeId);
	}

	/**
	* Updates the data type structure in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataTypeStructure the data type structure
	* @return the data type structure that was updated
	*/
	public static OSPIcecap.model.DataTypeStructure updateDataTypeStructure(
		OSPIcecap.model.DataTypeStructure dataTypeStructure) {
		return getService().updateDataTypeStructure(dataTypeStructure);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Returns the number of data type structures.
	*
	* @return the number of data type structures
	*/
	public static int getDataTypeStructuresCount() {
		return getService().getDataTypeStructuresCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the data type structures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type structures
	* @param end the upper bound of the range of data type structures (not inclusive)
	* @return the range of data type structures
	*/
	public static java.util.List<OSPIcecap.model.DataTypeStructure> getDataTypeStructures(
		int start, int end) {
		return getService().getDataTypeStructures(start, end);
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

	public static DataTypeStructureLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypeStructureLocalService, DataTypeStructureLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DataTypeStructureLocalService.class);
}