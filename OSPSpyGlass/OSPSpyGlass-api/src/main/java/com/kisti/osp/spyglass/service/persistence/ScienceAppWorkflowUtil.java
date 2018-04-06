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

package com.kisti.osp.spyglass.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.spyglass.model.ScienceAppWorkflow;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the science app workflow service. This utility wraps {@link com.kisti.osp.spyglass.service.persistence.impl.ScienceAppWorkflowPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppWorkflowPersistence
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppWorkflowPersistenceImpl
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ScienceAppWorkflow scienceAppWorkflow) {
		getPersistence().clearCache(scienceAppWorkflow);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ScienceAppWorkflow> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceAppWorkflow> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceAppWorkflow> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceAppWorkflow> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceAppWorkflow update(
		ScienceAppWorkflow scienceAppWorkflow) {
		return getPersistence().update(scienceAppWorkflow);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceAppWorkflow update(
		ScienceAppWorkflow scienceAppWorkflow, ServiceContext serviceContext) {
		return getPersistence().update(scienceAppWorkflow, serviceContext);
	}

	/**
	* Caches the science app workflow in the entity cache if it is enabled.
	*
	* @param scienceAppWorkflow the science app workflow
	*/
	public static void cacheResult(ScienceAppWorkflow scienceAppWorkflow) {
		getPersistence().cacheResult(scienceAppWorkflow);
	}

	/**
	* Caches the science app workflows in the entity cache if it is enabled.
	*
	* @param scienceAppWorkflows the science app workflows
	*/
	public static void cacheResult(List<ScienceAppWorkflow> scienceAppWorkflows) {
		getPersistence().cacheResult(scienceAppWorkflows);
	}

	/**
	* Creates a new science app workflow with the primary key. Does not add the science app workflow to the database.
	*
	* @param scienceAppId the primary key for the new science app workflow
	* @return the new science app workflow
	*/
	public static ScienceAppWorkflow create(long scienceAppId) {
		return getPersistence().create(scienceAppId);
	}

	/**
	* Removes the science app workflow with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app workflow
	* @return the science app workflow that was removed
	* @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	*/
	public static ScienceAppWorkflow remove(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppWorkflowException {
		return getPersistence().remove(scienceAppId);
	}

	public static ScienceAppWorkflow updateImpl(
		ScienceAppWorkflow scienceAppWorkflow) {
		return getPersistence().updateImpl(scienceAppWorkflow);
	}

	/**
	* Returns the science app workflow with the primary key or throws a {@link NoSuchScienceAppWorkflowException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app workflow
	* @return the science app workflow
	* @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	*/
	public static ScienceAppWorkflow findByPrimaryKey(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppWorkflowException {
		return getPersistence().findByPrimaryKey(scienceAppId);
	}

	/**
	* Returns the science app workflow with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app workflow
	* @return the science app workflow, or <code>null</code> if a science app workflow with the primary key could not be found
	*/
	public static ScienceAppWorkflow fetchByPrimaryKey(long scienceAppId) {
		return getPersistence().fetchByPrimaryKey(scienceAppId);
	}

	public static java.util.Map<java.io.Serializable, ScienceAppWorkflow> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the science app workflows.
	*
	* @return the science app workflows
	*/
	public static List<ScienceAppWorkflow> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the science app workflows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app workflows
	* @param end the upper bound of the range of science app workflows (not inclusive)
	* @return the range of science app workflows
	*/
	public static List<ScienceAppWorkflow> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the science app workflows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app workflows
	* @param end the upper bound of the range of science app workflows (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app workflows
	*/
	public static List<ScienceAppWorkflow> findAll(int start, int end,
		OrderByComparator<ScienceAppWorkflow> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app workflows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app workflows
	* @param end the upper bound of the range of science app workflows (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app workflows
	*/
	public static List<ScienceAppWorkflow> findAll(int start, int end,
		OrderByComparator<ScienceAppWorkflow> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the science app workflows from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of science app workflows.
	*
	* @return the number of science app workflows
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ScienceAppWorkflowPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppWorkflowPersistence, ScienceAppWorkflowPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppWorkflowPersistence.class);
}