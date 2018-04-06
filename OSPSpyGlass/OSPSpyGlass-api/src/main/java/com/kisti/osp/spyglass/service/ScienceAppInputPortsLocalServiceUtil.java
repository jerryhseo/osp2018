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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ScienceAppInputPorts. This utility wraps
 * {@link com.kisti.osp.spyglass.service.impl.ScienceAppInputPortsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see ScienceAppInputPortsLocalService
 * @see com.kisti.osp.spyglass.service.base.ScienceAppInputPortsLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.impl.ScienceAppInputPortsLocalServiceImpl
 * @generated
 */
@ProviderType
public class ScienceAppInputPortsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.spyglass.service.impl.ScienceAppInputPortsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts addInputPorts(
		long scienceAppId, java.lang.String strPorts) {
		return getService().addInputPorts(scienceAppId, strPorts);
	}

	/**
	* Adds the science app input ports to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppInputPorts the science app input ports
	* @return the science app input ports that was added
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts addScienceAppInputPorts(
		com.kisti.osp.spyglass.model.ScienceAppInputPorts scienceAppInputPorts) {
		return getService().addScienceAppInputPorts(scienceAppInputPorts);
	}

	/**
	* Creates a new science app input ports with the primary key. Does not add the science app input ports to the database.
	*
	* @param scienceAppId the primary key for the new science app input ports
	* @return the new science app input ports
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts createScienceAppInputPorts(
		long scienceAppId) {
		return getService().createScienceAppInputPorts(scienceAppId);
	}

	/**
	* Deletes the science app input ports from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppInputPorts the science app input ports
	* @return the science app input ports that was removed
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts deleteScienceAppInputPorts(
		com.kisti.osp.spyglass.model.ScienceAppInputPorts scienceAppInputPorts) {
		return getService().deleteScienceAppInputPorts(scienceAppInputPorts);
	}

	/**
	* Deletes the science app input ports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app input ports
	* @return the science app input ports that was removed
	* @throws PortalException if a science app input ports with the primary key could not be found
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts deleteScienceAppInputPorts(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteScienceAppInputPorts(scienceAppId);
	}

	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts fetchScienceAppInputPorts(
		long scienceAppId) {
		return getService().fetchScienceAppInputPorts(scienceAppId);
	}

	/**
	* Returns the science app input ports with the primary key.
	*
	* @param scienceAppId the primary key of the science app input ports
	* @return the science app input ports
	* @throws PortalException if a science app input ports with the primary key could not be found
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts getScienceAppInputPorts(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getScienceAppInputPorts(scienceAppId);
	}

	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts updateInputPorts(
		long scienceAppId, java.lang.String strPorts)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateInputPorts(scienceAppId, strPorts);
	}

	/**
	* Updates the science app input ports in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceAppInputPorts the science app input ports
	* @return the science app input ports that was updated
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppInputPorts updateScienceAppInputPorts(
		com.kisti.osp.spyglass.model.ScienceAppInputPorts scienceAppInputPorts) {
		return getService().updateScienceAppInputPorts(scienceAppInputPorts);
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
	* Returns the number of science app input portses.
	*
	* @return the number of science app input portses
	*/
	public static int getScienceAppInputPortsesCount() {
		return getService().getScienceAppInputPortsesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the science app input portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app input portses
	* @param end the upper bound of the range of science app input portses (not inclusive)
	* @return the range of science app input portses
	*/
	public static java.util.List<com.kisti.osp.spyglass.model.ScienceAppInputPorts> getScienceAppInputPortses(
		int start, int end) {
		return getService().getScienceAppInputPortses(start, end);
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

	public static ScienceAppInputPortsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppInputPortsLocalService, ScienceAppInputPortsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppInputPortsLocalService.class);
}