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

import com.kisti.osp.spyglass.model.ScienceAppOutputPorts;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the science app output ports service. This utility wraps {@link com.kisti.osp.spyglass.service.persistence.impl.ScienceAppOutputPortsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPortsPersistence
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppOutputPortsPersistenceImpl
 * @generated
 */
@ProviderType
public class ScienceAppOutputPortsUtil {
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
	public static void clearCache(ScienceAppOutputPorts scienceAppOutputPorts) {
		getPersistence().clearCache(scienceAppOutputPorts);
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
	public static List<ScienceAppOutputPorts> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceAppOutputPorts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceAppOutputPorts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceAppOutputPorts> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceAppOutputPorts update(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		return getPersistence().update(scienceAppOutputPorts);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceAppOutputPorts update(
		ScienceAppOutputPorts scienceAppOutputPorts,
		ServiceContext serviceContext) {
		return getPersistence().update(scienceAppOutputPorts, serviceContext);
	}

	/**
	* Caches the science app output ports in the entity cache if it is enabled.
	*
	* @param scienceAppOutputPorts the science app output ports
	*/
	public static void cacheResult(ScienceAppOutputPorts scienceAppOutputPorts) {
		getPersistence().cacheResult(scienceAppOutputPorts);
	}

	/**
	* Caches the science app output portses in the entity cache if it is enabled.
	*
	* @param scienceAppOutputPortses the science app output portses
	*/
	public static void cacheResult(
		List<ScienceAppOutputPorts> scienceAppOutputPortses) {
		getPersistence().cacheResult(scienceAppOutputPortses);
	}

	/**
	* Creates a new science app output ports with the primary key. Does not add the science app output ports to the database.
	*
	* @param scienceAppId the primary key for the new science app output ports
	* @return the new science app output ports
	*/
	public static ScienceAppOutputPorts create(long scienceAppId) {
		return getPersistence().create(scienceAppId);
	}

	/**
	* Removes the science app output ports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app output ports
	* @return the science app output ports that was removed
	* @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	*/
	public static ScienceAppOutputPorts remove(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppOutputPortsException {
		return getPersistence().remove(scienceAppId);
	}

	public static ScienceAppOutputPorts updateImpl(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		return getPersistence().updateImpl(scienceAppOutputPorts);
	}

	/**
	* Returns the science app output ports with the primary key or throws a {@link NoSuchScienceAppOutputPortsException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app output ports
	* @return the science app output ports
	* @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	*/
	public static ScienceAppOutputPorts findByPrimaryKey(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppOutputPortsException {
		return getPersistence().findByPrimaryKey(scienceAppId);
	}

	/**
	* Returns the science app output ports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app output ports
	* @return the science app output ports, or <code>null</code> if a science app output ports with the primary key could not be found
	*/
	public static ScienceAppOutputPorts fetchByPrimaryKey(long scienceAppId) {
		return getPersistence().fetchByPrimaryKey(scienceAppId);
	}

	public static java.util.Map<java.io.Serializable, ScienceAppOutputPorts> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the science app output portses.
	*
	* @return the science app output portses
	*/
	public static List<ScienceAppOutputPorts> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the science app output portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app output portses
	* @param end the upper bound of the range of science app output portses (not inclusive)
	* @return the range of science app output portses
	*/
	public static List<ScienceAppOutputPorts> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the science app output portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app output portses
	* @param end the upper bound of the range of science app output portses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app output portses
	*/
	public static List<ScienceAppOutputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppOutputPorts> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app output portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app output portses
	* @param end the upper bound of the range of science app output portses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app output portses
	*/
	public static List<ScienceAppOutputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppOutputPorts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the science app output portses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of science app output portses.
	*
	* @return the number of science app output portses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ScienceAppOutputPortsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppOutputPortsPersistence, ScienceAppOutputPortsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppOutputPortsPersistence.class);
}