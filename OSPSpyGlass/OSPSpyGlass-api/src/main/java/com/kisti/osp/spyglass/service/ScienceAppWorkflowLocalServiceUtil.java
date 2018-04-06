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
 * Provides the local service utility for ScienceAppWorkflow. This utility wraps
 * {@link com.kisti.osp.spyglass.service.impl.ScienceAppWorkflowLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see ScienceAppWorkflowLocalService
 * @see com.kisti.osp.spyglass.service.base.ScienceAppWorkflowLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.impl.ScienceAppWorkflowLocalServiceImpl
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.spyglass.service.impl.ScienceAppWorkflowLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the science app workflow to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppWorkflow the science app workflow
	* @return the science app workflow that was added
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow addScienceAppWorkflow(
		com.kisti.osp.spyglass.model.ScienceAppWorkflow scienceAppWorkflow) {
		return getService().addScienceAppWorkflow(scienceAppWorkflow);
	}

	/**
	* Creates a new science app workflow with the primary key. Does not add the science app workflow to the database.
	*
	* @param scienceAppId the primary key for the new science app workflow
	* @return the new science app workflow
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow createScienceAppWorkflow(
		long scienceAppId) {
		return getService().createScienceAppWorkflow(scienceAppId);
	}

	/**
	* Deletes the science app workflow from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppWorkflow the science app workflow
	* @return the science app workflow that was removed
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow deleteScienceAppWorkflow(
		com.kisti.osp.spyglass.model.ScienceAppWorkflow scienceAppWorkflow) {
		return getService().deleteScienceAppWorkflow(scienceAppWorkflow);
	}

	/**
	* Deletes the science app workflow with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app workflow
	* @return the science app workflow that was removed
	* @throws PortalException if a science app workflow with the primary key could not be found
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow deleteScienceAppWorkflow(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteScienceAppWorkflow(scienceAppId);
	}

	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow fetchScienceAppWorkflow(
		long scienceAppId) {
		return getService().fetchScienceAppWorkflow(scienceAppId);
	}

	/**
	* Returns the science app workflow with the primary key.
	*
	* @param scienceAppId the primary key of the science app workflow
	* @return the science app workflow
	* @throws PortalException if a science app workflow with the primary key could not be found
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow getScienceAppWorkflow(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getScienceAppWorkflow(scienceAppId);
	}

	/**
	* Updates the science app workflow in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceAppWorkflow the science app workflow
	* @return the science app workflow that was updated
	*/
	public static com.kisti.osp.spyglass.model.ScienceAppWorkflow updateScienceAppWorkflow(
		com.kisti.osp.spyglass.model.ScienceAppWorkflow scienceAppWorkflow) {
		return getService().updateScienceAppWorkflow(scienceAppWorkflow);
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
	* Returns the number of science app workflows.
	*
	* @return the number of science app workflows
	*/
	public static int getScienceAppWorkflowsCount() {
		return getService().getScienceAppWorkflowsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the science app workflows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app workflows
	* @param end the upper bound of the range of science app workflows (not inclusive)
	* @return the range of science app workflows
	*/
	public static java.util.List<com.kisti.osp.spyglass.model.ScienceAppWorkflow> getScienceAppWorkflows(
		int start, int end) {
		return getService().getScienceAppWorkflows(start, end);
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

	public static ScienceAppWorkflowLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppWorkflowLocalService, ScienceAppWorkflowLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppWorkflowLocalService.class);
}