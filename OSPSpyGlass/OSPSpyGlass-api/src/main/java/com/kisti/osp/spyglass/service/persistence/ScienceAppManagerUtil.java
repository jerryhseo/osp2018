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

import com.kisti.osp.spyglass.model.ScienceAppManager;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the science app manager service. This utility wraps {@link com.kisti.osp.spyglass.service.persistence.impl.ScienceAppManagerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppManagerPersistence
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppManagerPersistenceImpl
 * @generated
 */
@ProviderType
public class ScienceAppManagerUtil {
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
	public static void clearCache(ScienceAppManager scienceAppManager) {
		getPersistence().clearCache(scienceAppManager);
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
	public static List<ScienceAppManager> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceAppManager> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceAppManager> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceAppManager update(ScienceAppManager scienceAppManager) {
		return getPersistence().update(scienceAppManager);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceAppManager update(
		ScienceAppManager scienceAppManager, ServiceContext serviceContext) {
		return getPersistence().update(scienceAppManager, serviceContext);
	}

	/**
	* Returns all the science app managers where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @return the matching science app managers
	*/
	public static List<ScienceAppManager> findByAppId(long scienceAppId) {
		return getPersistence().findByAppId(scienceAppId);
	}

	/**
	* Returns a range of all the science app managers where scienceAppId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param scienceAppId the science app ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @return the range of matching science app managers
	*/
	public static List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end) {
		return getPersistence().findByAppId(scienceAppId, start, end);
	}

	/**
	* Returns an ordered range of all the science app managers where scienceAppId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param scienceAppId the science app ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .findByAppId(scienceAppId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app managers where scienceAppId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param scienceAppId the science app ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppId(scienceAppId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByAppId_First(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByAppId_First(scienceAppId, orderByComparator);
	}

	/**
	* Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByAppId_First(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .fetchByAppId_First(scienceAppId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByAppId_Last(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence().findByAppId_Last(scienceAppId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByAppId_Last(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .fetchByAppId_Last(scienceAppId, orderByComparator);
	}

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager[] findByAppId_PrevAndNext(
		long scienceAppManagerId, long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByAppId_PrevAndNext(scienceAppManagerId, scienceAppId,
			orderByComparator);
	}

	/**
	* Removes all the science app managers where scienceAppId = &#63; from the database.
	*
	* @param scienceAppId the science app ID
	*/
	public static void removeByAppId(long scienceAppId) {
		getPersistence().removeByAppId(scienceAppId);
	}

	/**
	* Returns the number of science app managers where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @return the number of matching science app managers
	*/
	public static int countByAppId(long scienceAppId) {
		return getPersistence().countByAppId(scienceAppId);
	}

	/**
	* Returns all the science app managers where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the matching science app managers
	*/
	public static List<ScienceAppManager> findByManagerId(long managerId) {
		return getPersistence().findByManagerId(managerId);
	}

	/**
	* Returns a range of all the science app managers where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @return the range of matching science app managers
	*/
	public static List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end) {
		return getPersistence().findByManagerId(managerId, start, end);
	}

	/**
	* Returns an ordered range of all the science app managers where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .findByManagerId(managerId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app managers where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByManagerId(managerId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByManagerId_First(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByManagerId_First(managerId, orderByComparator);
	}

	/**
	* Returns the first science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByManagerId_First(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .fetchByManagerId_First(managerId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByManagerId_Last(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByManagerId_Last(managerId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByManagerId_Last(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .fetchByManagerId_Last(managerId, orderByComparator);
	}

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where managerId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager[] findByManagerId_PrevAndNext(
		long scienceAppManagerId, long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByManagerId_PrevAndNext(scienceAppManagerId, managerId,
			orderByComparator);
	}

	/**
	* Removes all the science app managers where managerId = &#63; from the database.
	*
	* @param managerId the manager ID
	*/
	public static void removeByManagerId(long managerId) {
		getPersistence().removeByManagerId(managerId);
	}

	/**
	* Returns the number of science app managers where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the number of matching science app managers
	*/
	public static int countByManagerId(long managerId) {
		return getPersistence().countByManagerId(managerId);
	}

	/**
	* Returns all the science app managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching science app managers
	*/
	public static List<ScienceAppManager> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the science app managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @return the range of matching science app managers
	*/
	public static List<ScienceAppManager> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the science app managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByUserId(long userId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science app managers
	*/
	public static List<ScienceAppManager> findByUserId(long userId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByUserId_First(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByUserId_First(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public static ScienceAppManager findByUserId_Last(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public static ScienceAppManager fetchByUserId_Last(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where userId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager[] findByUserId_PrevAndNext(
		long scienceAppManagerId, long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence()
				   .findByUserId_PrevAndNext(scienceAppManagerId, userId,
			orderByComparator);
	}

	/**
	* Removes all the science app managers where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of science app managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching science app managers
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the science app manager in the entity cache if it is enabled.
	*
	* @param scienceAppManager the science app manager
	*/
	public static void cacheResult(ScienceAppManager scienceAppManager) {
		getPersistence().cacheResult(scienceAppManager);
	}

	/**
	* Caches the science app managers in the entity cache if it is enabled.
	*
	* @param scienceAppManagers the science app managers
	*/
	public static void cacheResult(List<ScienceAppManager> scienceAppManagers) {
		getPersistence().cacheResult(scienceAppManagers);
	}

	/**
	* Creates a new science app manager with the primary key. Does not add the science app manager to the database.
	*
	* @param scienceAppManagerId the primary key for the new science app manager
	* @return the new science app manager
	*/
	public static ScienceAppManager create(long scienceAppManagerId) {
		return getPersistence().create(scienceAppManagerId);
	}

	/**
	* Removes the science app manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager that was removed
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager remove(long scienceAppManagerId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence().remove(scienceAppManagerId);
	}

	public static ScienceAppManager updateImpl(
		ScienceAppManager scienceAppManager) {
		return getPersistence().updateImpl(scienceAppManager);
	}

	/**
	* Returns the science app manager with the primary key or throws a {@link NoSuchScienceAppManagerException} if it could not be found.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager findByPrimaryKey(long scienceAppManagerId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException {
		return getPersistence().findByPrimaryKey(scienceAppManagerId);
	}

	/**
	* Returns the science app manager with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager, or <code>null</code> if a science app manager with the primary key could not be found
	*/
	public static ScienceAppManager fetchByPrimaryKey(long scienceAppManagerId) {
		return getPersistence().fetchByPrimaryKey(scienceAppManagerId);
	}

	public static java.util.Map<java.io.Serializable, ScienceAppManager> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the science app managers.
	*
	* @return the science app managers
	*/
	public static List<ScienceAppManager> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the science app managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @return the range of science app managers
	*/
	public static List<ScienceAppManager> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the science app managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app managers
	*/
	public static List<ScienceAppManager> findAll(int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science app managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app managers
	*/
	public static List<ScienceAppManager> findAll(int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the science app managers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of science app managers.
	*
	* @return the number of science app managers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ScienceAppManagerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppManagerPersistence, ScienceAppManagerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppManagerPersistence.class);
}