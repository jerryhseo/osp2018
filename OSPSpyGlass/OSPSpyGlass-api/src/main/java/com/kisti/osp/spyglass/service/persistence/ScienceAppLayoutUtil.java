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

import com.kisti.osp.spyglass.model.ScienceAppLayout;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the science app layout service. This utility wraps {@link com.kisti.osp.spyglass.service.persistence.impl.ScienceAppLayoutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayoutPersistence
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppLayoutPersistenceImpl
 * @generated
 */
@ProviderType
public class ScienceAppLayoutUtil {
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
	public static void clearCache(ScienceAppLayout scienceAppLayout) {
		getPersistence().clearCache(scienceAppLayout);
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
	public static List<ScienceAppLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceAppLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceAppLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceAppLayout> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceAppLayout update(ScienceAppLayout scienceAppLayout) {
		return getPersistence().update(scienceAppLayout);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceAppLayout update(ScienceAppLayout scienceAppLayout,
		ServiceContext serviceContext) {
		return getPersistence().update(scienceAppLayout, serviceContext);
	}

	/**
	* Caches the science app layout in the entity cache if it is enabled.
	*
	* @param scienceAppLayout the science app layout
	*/
	public static void cacheResult(ScienceAppLayout scienceAppLayout) {
		getPersistence().cacheResult(scienceAppLayout);
	}

	/**
	* Caches the science app layouts in the entity cache if it is enabled.
	*
	* @param scienceAppLayouts the science app layouts
	*/
	public static void cacheResult(List<ScienceAppLayout> scienceAppLayouts) {
		getPersistence().cacheResult(scienceAppLayouts);
	}

	/**
	* Creates a new science app layout with the primary key. Does not add the science app layout to the database.
	*
	* @param scienceAppId the primary key for the new science app layout
	* @return the new science app layout
	*/
	public static ScienceAppLayout create(long scienceAppId) {
		return getPersistence().create(scienceAppId);
	}

	/**
	* Removes the science app layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout that was removed
	* @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	*/
	public static ScienceAppLayout remove(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppLayoutException {
		return getPersistence().remove(scienceAppId);
	}

	public static ScienceAppLayout updateImpl(ScienceAppLayout scienceAppLayout) {
		return getPersistence().updateImpl(scienceAppLayout);
	}

	/**
	* Returns the science app layout with the primary key or throws a {@link NoSuchScienceAppLayoutException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout
	* @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	*/
	public static ScienceAppLayout findByPrimaryKey(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppLayoutException {
		return getPersistence().findByPrimaryKey(scienceAppId);
	}

	/**
	* Returns the science app layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout, or <code>null</code> if a science app layout with the primary key could not be found
	*/
	public static ScienceAppLayout fetchByPrimaryKey(long scienceAppId) {
		return getPersistence().fetchByPrimaryKey(scienceAppId);
	}

	public static java.util.Map<java.io.Serializable, ScienceAppLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the science app layouts.
	*
	* @return the science app layouts
	*/
	public static List<ScienceAppLayout> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @return the range of science app layouts
	*/
	public static List<ScienceAppLayout> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app layouts
	*/
	public static List<ScienceAppLayout> findAll(int start, int end,
		OrderByComparator<ScienceAppLayout> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app layouts
	*/
	public static List<ScienceAppLayout> findAll(int start, int end,
		OrderByComparator<ScienceAppLayout> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the science app layouts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of science app layouts.
	*
	* @return the number of science app layouts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ScienceAppLayoutPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppLayoutPersistence, ScienceAppLayoutPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppLayoutPersistence.class);
}