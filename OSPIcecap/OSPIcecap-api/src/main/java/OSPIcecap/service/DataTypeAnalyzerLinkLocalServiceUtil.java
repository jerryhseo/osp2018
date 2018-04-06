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
 * Provides the local service utility for DataTypeAnalyzerLink. This utility wraps
 * {@link OSPIcecap.service.impl.DataTypeAnalyzerLinkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLinkLocalService
 * @see OSPIcecap.service.base.DataTypeAnalyzerLinkLocalServiceBaseImpl
 * @see OSPIcecap.service.impl.DataTypeAnalyzerLinkLocalServiceImpl
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link OSPIcecap.service.impl.DataTypeAnalyzerLinkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the data type analyzer link to the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLink the data type analyzer link
	* @return the data type analyzer link that was added
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink addDataTypeAnalyzerLink(
		OSPIcecap.model.DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return getService().addDataTypeAnalyzerLink(dataTypeAnalyzerLink);
	}

	/**
	* Creates a new data type analyzer link with the primary key. Does not add the data type analyzer link to the database.
	*
	* @param dataTypeAnalyzerLinkPK the primary key for the new data type analyzer link
	* @return the new data type analyzer link
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink createDataTypeAnalyzerLink(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		return getService().createDataTypeAnalyzerLink(dataTypeAnalyzerLinkPK);
	}

	/**
	* Deletes the data type analyzer link from the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLink the data type analyzer link
	* @return the data type analyzer link that was removed
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink deleteDataTypeAnalyzerLink(
		OSPIcecap.model.DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return getService().deleteDataTypeAnalyzerLink(dataTypeAnalyzerLink);
	}

	/**
	* Deletes the data type analyzer link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link that was removed
	* @throws PortalException if a data type analyzer link with the primary key could not be found
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink deleteDataTypeAnalyzerLink(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataTypeAnalyzerLink(dataTypeAnalyzerLinkPK);
	}

	public static OSPIcecap.model.DataTypeAnalyzerLink fetchDataTypeAnalyzerLink(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		return getService().fetchDataTypeAnalyzerLink(dataTypeAnalyzerLinkPK);
	}

	/**
	* Returns the data type analyzer link with the primary key.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link
	* @throws PortalException if a data type analyzer link with the primary key could not be found
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink getDataTypeAnalyzerLink(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataTypeAnalyzerLink(dataTypeAnalyzerLinkPK);
	}

	/**
	* Updates the data type analyzer link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLink the data type analyzer link
	* @return the data type analyzer link that was updated
	*/
	public static OSPIcecap.model.DataTypeAnalyzerLink updateDataTypeAnalyzerLink(
		OSPIcecap.model.DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return getService().updateDataTypeAnalyzerLink(dataTypeAnalyzerLink);
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
	* Returns the number of data type analyzer links.
	*
	* @return the number of data type analyzer links
	*/
	public static int getDataTypeAnalyzerLinksCount() {
		return getService().getDataTypeAnalyzerLinksCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the data type analyzer links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OSPIcecap.model.impl.DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @return the range of data type analyzer links
	*/
	public static java.util.List<OSPIcecap.model.DataTypeAnalyzerLink> getDataTypeAnalyzerLinks(
		int start, int end) {
		return getService().getDataTypeAnalyzerLinks(start, end);
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

	public static DataTypeAnalyzerLinkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypeAnalyzerLinkLocalService, DataTypeAnalyzerLinkLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DataTypeAnalyzerLinkLocalService.class);
}