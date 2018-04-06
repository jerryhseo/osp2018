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

import com.kisti.osp.spyglass.model.ScienceApp;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the science app service. This utility wraps {@link com.kisti.osp.spyglass.service.persistence.impl.ScienceAppPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppPersistence
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppPersistenceImpl
 * @generated
 */
@ProviderType
public class ScienceAppUtil {
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
	public static void clearCache(ScienceApp scienceApp) {
		getPersistence().clearCache(scienceApp);
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
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceApp update(ScienceApp scienceApp) {
		return getPersistence().update(scienceApp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceApp update(ScienceApp scienceApp,
		ServiceContext serviceContext) {
		return getPersistence().update(scienceApp, serviceContext);
	}

	/**
	* Returns all the science apps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the science apps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByUuid_First(java.lang.String uuid,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where uuid = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByUuid_PrevAndNext(long scienceAppId,
		java.lang.String uuid, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByUuid_PrevAndNext(scienceAppId, uuid, orderByComparator);
	}

	/**
	* Removes all the science apps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of science apps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching science apps
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByUUID_G(java.lang.String uuid, long groupId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the science app where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the science app that was removed
	*/
	public static ScienceApp removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of science apps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching science apps
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the science apps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the science apps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByUuid_C_PrevAndNext(long scienceAppId,
		java.lang.String uuid, long companyId,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(scienceAppId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the science apps where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of science apps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching science apps
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the science apps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByU(long userId) {
		return getPersistence().findByU(userId);
	}

	/**
	* Returns a range of all the science apps where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByU(long userId, int start, int end) {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByU(long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByU(long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByU_First(long userId,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByU_First(long userId,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByU_First(userId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByU_Last(long userId,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByU_Last(long userId,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByU_PrevAndNext(long scienceAppId,
		long userId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByU_PrevAndNext(scienceAppId, userId, orderByComparator);
	}

	/**
	* Removes all the science apps where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByU(long userId) {
		getPersistence().removeByU(userId);
	}

	/**
	* Returns the number of science apps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching science apps
	*/
	public static int countByU(long userId) {
		return getPersistence().countByU(userId);
	}

	/**
	* Returns all the science apps where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByG(long groupId) {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByG(long groupId, int start, int end) {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG(long groupId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG(long groupId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_First(long groupId,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_First(long groupId,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_Last(long groupId,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_Last(long groupId,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByG_PrevAndNext(long scienceAppId,
		long groupId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_PrevAndNext(scienceAppId, groupId, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG(long groupId) {
		return getPersistence().filterFindByG(groupId);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG(long groupId, int start,
		int end) {
		return getPersistence().filterFindByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG(long groupId, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByG_PrevAndNext(long scienceAppId,
		long groupId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByG_PrevAndNext(scienceAppId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByG(long groupId) {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of science apps where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching science apps
	*/
	public static int countByG(long groupId) {
		return getPersistence().countByG(groupId);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByG(long groupId) {
		return getPersistence().filterCountByG(groupId);
	}

	/**
	* Returns all the science apps where name = &#63;.
	*
	* @param name the name
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the science apps where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByName(java.lang.String name, int start,
		int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByName(java.lang.String name, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByName(java.lang.String name, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByName_First(java.lang.String name,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByName_First(java.lang.String name,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByName_Last(java.lang.String name,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByName_Last(java.lang.String name,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where name = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByName_PrevAndNext(long scienceAppId,
		java.lang.String name, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByName_PrevAndNext(scienceAppId, name, orderByComparator);
	}

	/**
	* Removes all the science apps where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of science apps where name = &#63;.
	*
	* @param name the name
	* @return the number of matching science apps
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Returns all the science apps where appType = &#63;.
	*
	* @param appType the app type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppType(java.lang.String appType) {
		return getPersistence().findByAppType(appType);
	}

	/**
	* Returns a range of all the science apps where appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end) {
		return getPersistence().findByAppType(appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppType(appType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppType(appType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_First(java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByAppType_First(appType, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_First(java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByAppType_First(appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_Last(java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByAppType_Last(appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_Last(java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByAppType_Last(appType, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppType_PrevAndNext(long scienceAppId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_PrevAndNext(scienceAppId, appType,
			orderByComparator);
	}

	/**
	* Removes all the science apps where appType = &#63; from the database.
	*
	* @param appType the app type
	*/
	public static void removeByAppType(java.lang.String appType) {
		getPersistence().removeByAppType(appType);
	}

	/**
	* Returns the number of science apps where appType = &#63;.
	*
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public static int countByAppType(java.lang.String appType) {
		return getPersistence().countByAppType(appType);
	}

	/**
	* Returns all the science apps where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType) {
		return getPersistence().findByAppType_U(userId, appType);
	}

	/**
	* Returns a range of all the science apps where userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end) {
		return getPersistence().findByAppType_U(userId, appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppType_U(userId, appType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppType_U(userId, appType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_U_First(long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_U_First(userId, appType, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_U_First(long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_U_First(userId, appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_U_Last(long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_U_Last(userId, appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_U_Last(long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_U_Last(userId, appType, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppType_U_PrevAndNext(long scienceAppId,
		long userId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_U_PrevAndNext(scienceAppId, userId, appType,
			orderByComparator);
	}

	/**
	* Removes all the science apps where userId = &#63; and appType = &#63; from the database.
	*
	* @param userId the user ID
	* @param appType the app type
	*/
	public static void removeByAppType_U(long userId, java.lang.String appType) {
		getPersistence().removeByAppType_U(userId, appType);
	}

	/**
	* Returns the number of science apps where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public static int countByAppType_U(long userId, java.lang.String appType) {
		return getPersistence().countByAppType_U(userId, appType);
	}

	/**
	* Returns all the science apps where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType) {
		return getPersistence().findByAppType_G(groupId, appType);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end) {
		return getPersistence().findByAppType_G(groupId, appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppType_G(groupId, appType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppType_G(groupId, appType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_G_First(long groupId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_First(groupId, appType, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_G_First(long groupId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_G_First(groupId, appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_G_Last(long groupId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_Last(groupId, appType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_G_Last(long groupId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_G_Last(groupId, appType, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppType_G_PrevAndNext(long scienceAppId,
		long groupId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_PrevAndNext(scienceAppId, groupId, appType,
			orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType) {
		return getPersistence().filterFindByAppType_G(groupId, appType);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType, int start, int end) {
		return getPersistence()
				   .filterFindByAppType_G(groupId, appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByAppType_G(groupId, appType, start, end,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByAppType_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByAppType_G_PrevAndNext(scienceAppId, groupId,
			appType, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and appType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param appType the app type
	*/
	public static void removeByAppType_G(long groupId, java.lang.String appType) {
		getPersistence().removeByAppType_G(groupId, appType);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public static int countByAppType_G(long groupId, java.lang.String appType) {
		return getPersistence().countByAppType_G(groupId, appType);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByAppType_G(long groupId,
		java.lang.String appType) {
		return getPersistence().filterCountByAppType_G(groupId, appType);
	}

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppType_G_U(long groupId, long userId,
		java.lang.String appType) {
		return getPersistence().findByAppType_G_U(groupId, userId, appType);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G_U(long groupId, long userId,
		java.lang.String appType, int start, int end) {
		return getPersistence()
				   .findByAppType_G_U(groupId, userId, appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G_U(long groupId, long userId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppType_G_U(groupId, userId, appType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppType_G_U(long groupId, long userId,
		java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppType_G_U(groupId, userId, appType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_G_U_First(long groupId, long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_U_First(groupId, userId, appType,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_G_U_First(long groupId,
		long userId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_G_U_First(groupId, userId, appType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppType_G_U_Last(long groupId, long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_U_Last(groupId, userId, appType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppType_G_U_Last(long groupId, long userId,
		java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppType_G_U_Last(groupId, userId, appType,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppType_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppType_G_U_PrevAndNext(scienceAppId, groupId,
			userId, appType, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType) {
		return getPersistence().filterFindByAppType_G_U(groupId, userId, appType);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end) {
		return getPersistence()
				   .filterFindByAppType_G_U(groupId, userId, appType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByAppType_G_U(groupId, userId, appType, start,
			end, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByAppType_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId, java.lang.String appType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByAppType_G_U_PrevAndNext(scienceAppId, groupId,
			userId, appType, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	*/
	public static void removeByAppType_G_U(long groupId, long userId,
		java.lang.String appType) {
		getPersistence().removeByAppType_G_U(groupId, userId, appType);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public static int countByAppType_G_U(long groupId, long userId,
		java.lang.String appType) {
		return getPersistence().countByAppType_G_U(groupId, userId, appType);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByAppType_G_U(long groupId, long userId,
		java.lang.String appType) {
		return getPersistence()
				   .filterCountByAppType_G_U(groupId, userId, appType);
	}

	/**
	* Returns all the science apps where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppRunType(java.lang.String appType,
		java.lang.String runType) {
		return getPersistence().findByAppRunType(appType, runType);
	}

	/**
	* Returns a range of all the science apps where appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType(java.lang.String appType,
		java.lang.String runType, int start, int end) {
		return getPersistence().findByAppRunType(appType, runType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType(java.lang.String appType,
		java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppRunType(appType, runType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType(java.lang.String appType,
		java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppRunType(appType, runType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_First(java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_First(appType, runType, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_First(java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_First(appType, runType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_Last(java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_Last(appType, runType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_Last(java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_Last(appType, runType, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppRunType_PrevAndNext(long scienceAppId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_PrevAndNext(scienceAppId, appType,
			runType, orderByComparator);
	}

	/**
	* Removes all the science apps where appType = &#63; and runType = &#63; from the database.
	*
	* @param appType the app type
	* @param runType the run type
	*/
	public static void removeByAppRunType(java.lang.String appType,
		java.lang.String runType) {
		getPersistence().removeByAppRunType(appType, runType);
	}

	/**
	* Returns the number of science apps where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public static int countByAppRunType(java.lang.String appType,
		java.lang.String runType) {
		return getPersistence().countByAppRunType(appType, runType);
	}

	/**
	* Returns all the science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence().findByAppRunType_U(userId, appType, runType);
	}

	/**
	* Returns a range of all the science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end) {
		return getPersistence()
				   .findByAppRunType_U(userId, appType, runType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppRunType_U(userId, appType, runType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppRunType_U(userId, appType, runType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_U_First(long userId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_U_First(userId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_U_First(long userId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_U_First(userId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_U_Last(long userId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_U_Last(userId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_U_Last(long userId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_U_Last(userId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppRunType_U_PrevAndNext(
		long scienceAppId, long userId, java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_U_PrevAndNext(scienceAppId, userId,
			appType, runType, orderByComparator);
	}

	/**
	* Removes all the science apps where userId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	*/
	public static void removeByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType) {
		getPersistence().removeByAppRunType_U(userId, appType, runType);
	}

	/**
	* Returns the number of science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public static int countByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence().countByAppRunType_U(userId, appType, runType);
	}

	/**
	* Returns all the science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence().findByAppRunType_G(groupId, appType, runType);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end) {
		return getPersistence()
				   .findByAppRunType_G(groupId, appType, runType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppRunType_G(groupId, appType, runType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppRunType_G(groupId, appType, runType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_G_First(long groupId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_First(groupId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_G_First(long groupId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_G_First(groupId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_G_Last(long groupId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_Last(groupId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_G_Last(long groupId,
		java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_G_Last(groupId, appType, runType,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppRunType_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_PrevAndNext(scienceAppId, groupId,
			appType, runType, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .filterFindByAppRunType_G(groupId, appType, runType);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end) {
		return getPersistence()
				   .filterFindByAppRunType_G(groupId, appType, runType, start,
			end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByAppRunType_G(groupId, appType, runType, start,
			end, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByAppRunType_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByAppRunType_G_PrevAndNext(scienceAppId, groupId,
			appType, runType, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	*/
	public static void removeByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType) {
		getPersistence().removeByAppRunType_G(groupId, appType, runType);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public static int countByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence().countByAppRunType_G(groupId, appType, runType);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .filterCountByAppRunType_G(groupId, appType, runType);
	}

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .findByAppRunType_G_U(groupId, userId, appType, runType);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end) {
		return getPersistence()
				   .findByAppRunType_G_U(groupId, userId, appType, runType,
			start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByAppRunType_G_U(groupId, userId, appType, runType,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAppRunType_G_U(groupId, userId, appType, runType,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_G_U_First(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_U_First(groupId, userId, appType,
			runType, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_G_U_First(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_G_U_First(groupId, userId, appType,
			runType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByAppRunType_G_U_Last(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_U_Last(groupId, userId, appType,
			runType, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByAppRunType_G_U_Last(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByAppRunType_G_U_Last(groupId, userId, appType,
			runType, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByAppRunType_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId, java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByAppRunType_G_U_PrevAndNext(scienceAppId, groupId,
			userId, appType, runType, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .filterFindByAppRunType_G_U(groupId, userId, appType, runType);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end) {
		return getPersistence()
				   .filterFindByAppRunType_G_U(groupId, userId, appType,
			runType, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByAppRunType_G_U(groupId, userId, appType,
			runType, start, end, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByAppRunType_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId, java.lang.String appType,
		java.lang.String runType,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByAppRunType_G_U_PrevAndNext(scienceAppId,
			groupId, userId, appType, runType, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	*/
	public static void removeByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType) {
		getPersistence()
			.removeByAppRunType_G_U(groupId, userId, appType, runType);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public static int countByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .countByAppRunType_G_U(groupId, userId, appType, runType);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType) {
		return getPersistence()
				   .filterCountByAppRunType_G_U(groupId, userId, appType,
			runType);
	}

	/**
	* Returns all the science apps where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus(java.lang.String openStatus) {
		return getPersistence().findByOpenStatus(openStatus);
	}

	/**
	* Returns a range of all the science apps where openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end) {
		return getPersistence().findByOpenStatus(openStatus, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByOpenStatus(openStatus, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOpenStatus(openStatus, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_First(
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_First(openStatus, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_First(
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_First(openStatus, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_Last(
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_Last(openStatus, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_Last(
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_Last(openStatus, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByOpenStatus_PrevAndNext(long scienceAppId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_PrevAndNext(scienceAppId, openStatus,
			orderByComparator);
	}

	/**
	* Removes all the science apps where openStatus = &#63; from the database.
	*
	* @param openStatus the open status
	*/
	public static void removeByOpenStatus(java.lang.String openStatus) {
		getPersistence().removeByOpenStatus(openStatus);
	}

	/**
	* Returns the number of science apps where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public static int countByOpenStatus(java.lang.String openStatus) {
		return getPersistence().countByOpenStatus(openStatus);
	}

	/**
	* Returns all the science apps where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus) {
		return getPersistence().findByOpenStatus_U(userId, openStatus);
	}

	/**
	* Returns a range of all the science apps where userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end) {
		return getPersistence()
				   .findByOpenStatus_U(userId, openStatus, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByOpenStatus_U(userId, openStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOpenStatus_U(userId, openStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_U_First(long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_U_First(userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_U_First(long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_U_First(userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_U_Last(long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_U_Last(userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_U_Last(long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_U_Last(userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByOpenStatus_U_PrevAndNext(
		long scienceAppId, long userId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_U_PrevAndNext(scienceAppId, userId,
			openStatus, orderByComparator);
	}

	/**
	* Removes all the science apps where userId = &#63; and openStatus = &#63; from the database.
	*
	* @param userId the user ID
	* @param openStatus the open status
	*/
	public static void removeByOpenStatus_U(long userId,
		java.lang.String openStatus) {
		getPersistence().removeByOpenStatus_U(userId, openStatus);
	}

	/**
	* Returns the number of science apps where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public static int countByOpenStatus_U(long userId,
		java.lang.String openStatus) {
		return getPersistence().countByOpenStatus_U(userId, openStatus);
	}

	/**
	* Returns all the science apps where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus) {
		return getPersistence().findByOpenStatus_G(groupId, openStatus);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end) {
		return getPersistence()
				   .findByOpenStatus_G(groupId, openStatus, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByOpenStatus_G(groupId, openStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOpenStatus_G(groupId, openStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_G_First(long groupId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_First(groupId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_G_First(long groupId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_G_First(groupId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_G_Last(long groupId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_Last(groupId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_G_Last(long groupId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_G_Last(groupId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByOpenStatus_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_PrevAndNext(scienceAppId, groupId,
			openStatus, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus) {
		return getPersistence().filterFindByOpenStatus_G(groupId, openStatus);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end) {
		return getPersistence()
				   .filterFindByOpenStatus_G(groupId, openStatus, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByOpenStatus_G(groupId, openStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByOpenStatus_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByOpenStatus_G_PrevAndNext(scienceAppId, groupId,
			openStatus, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and openStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	*/
	public static void removeByOpenStatus_G(long groupId,
		java.lang.String openStatus) {
		getPersistence().removeByOpenStatus_G(groupId, openStatus);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public static int countByOpenStatus_G(long groupId,
		java.lang.String openStatus) {
		return getPersistence().countByOpenStatus_G(groupId, openStatus);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByOpenStatus_G(long groupId,
		java.lang.String openStatus) {
		return getPersistence().filterCountByOpenStatus_G(groupId, openStatus);
	}

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus) {
		return getPersistence().findByOpenStatus_G_U(groupId, userId, openStatus);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end) {
		return getPersistence()
				   .findByOpenStatus_G_U(groupId, userId, openStatus, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByOpenStatus_G_U(groupId, userId, openStatus, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOpenStatus_G_U(groupId, userId, openStatus, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_G_U_First(long groupId,
		long userId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_U_First(groupId, userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_G_U_First(long groupId,
		long userId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_G_U_First(groupId, userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenStatus_G_U_Last(long groupId,
		long userId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_U_Last(groupId, userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenStatus_G_U_Last(long groupId,
		long userId, java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenStatus_G_U_Last(groupId, userId, openStatus,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByOpenStatus_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenStatus_G_U_PrevAndNext(scienceAppId, groupId,
			userId, openStatus, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus) {
		return getPersistence()
				   .filterFindByOpenStatus_G_U(groupId, userId, openStatus);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end) {
		return getPersistence()
				   .filterFindByOpenStatus_G_U(groupId, userId, openStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByOpenStatus_G_U(groupId, userId, openStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByOpenStatus_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId,
		java.lang.String openStatus,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByOpenStatus_G_U_PrevAndNext(scienceAppId,
			groupId, userId, openStatus, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	*/
	public static void removeByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus) {
		getPersistence().removeByOpenStatus_G_U(groupId, userId, openStatus);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public static int countByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus) {
		return getPersistence()
				   .countByOpenStatus_G_U(groupId, userId, openStatus);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus) {
		return getPersistence()
				   .filterCountByOpenStatus_G_U(groupId, userId, openStatus);
	}

	/**
	* Returns all the science apps where status = &#63;.
	*
	* @param status the status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByS(int status) {
		return getPersistence().findByS(status);
	}

	/**
	* Returns a range of all the science apps where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByS(int status, int start, int end) {
		return getPersistence().findByS(status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByS(int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findByS(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByS(int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByS_First(int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByS_First(status, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByS_First(int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByS_First(status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByS_Last(int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByS_Last(status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByS_Last(int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().fetchByS_Last(status, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByS_PrevAndNext(long scienceAppId,
		int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByS_PrevAndNext(scienceAppId, status, orderByComparator);
	}

	/**
	* Removes all the science apps where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByS(int status) {
		getPersistence().removeByS(status);
	}

	/**
	* Returns the number of science apps where status = &#63;.
	*
	* @param status the status
	* @return the number of matching science apps
	*/
	public static int countByS(int status) {
		return getPersistence().countByS(status);
	}

	/**
	* Returns all the science apps where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByU_S(long userId, int status) {
		return getPersistence().findByU_S(userId, status);
	}

	/**
	* Returns a range of all the science apps where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByU_S(long userId, int status,
		int start, int end) {
		return getPersistence().findByU_S(userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByU_S(long userId, int status,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByU_S(userId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByU_S(long userId, int status,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_S(userId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByU_S_First(long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByU_S_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByU_S_First(long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByU_S_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByU_S_Last(long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByU_S_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByU_S_Last(long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByU_S_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByU_S_PrevAndNext(long scienceAppId,
		long userId, int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByU_S_PrevAndNext(scienceAppId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the science apps where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByU_S(long userId, int status) {
		getPersistence().removeByU_S(userId, status);
	}

	/**
	* Returns the number of science apps where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public static int countByU_S(long userId, int status) {
		return getPersistence().countByU_S(userId, status);
	}

	/**
	* Returns all the science apps where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end) {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_S_First(long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_S_First(long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_S_Last(long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_S_Last(long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByG_S_PrevAndNext(long scienceAppId,
		long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_S_PrevAndNext(scienceAppId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_S(long groupId, int status) {
		return getPersistence().filterFindByG_S(groupId, status);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_S(long groupId, int status,
		int start, int end) {
		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_S(long groupId, int status,
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByG_S(groupId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByG_S_PrevAndNext(long scienceAppId,
		long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByG_S_PrevAndNext(scienceAppId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status) {
		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	* Returns a range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end) {
		return getPersistence().findByG_U_S(groupId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByG_U_S(groupId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_U_S(groupId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_U_S_First(long groupId, long userId,
		int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_U_S_First(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_U_S_First(long groupId, long userId,
		int status, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_S_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByG_U_S_Last(long groupId, long userId,
		int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_U_S_Last(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByG_U_S_Last(long groupId, long userId,
		int status, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_S_Last(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByG_U_S_PrevAndNext(long scienceAppId,
		long groupId, long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByG_U_S_PrevAndNext(scienceAppId, groupId, userId,
			status, orderByComparator);
	}

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_U_S(long groupId, long userId,
		int status) {
		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

	/**
	* Returns a range of all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end) {
		return getPersistence()
				   .filterFindByG_U_S(groupId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the science apps that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps that the user has permission to view
	*/
	public static List<ScienceApp> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .filterFindByG_U_S(groupId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] filterFindByG_U_S_PrevAndNext(
		long scienceAppId, long groupId, long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .filterFindByG_U_S_PrevAndNext(scienceAppId, groupId,
			userId, status, orderByComparator);
	}

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps that the user has permission to view
	*/
	public static int filterCountByG_U_S(long groupId, long userId, int status) {
		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	* Returns the science app where name = &#63; and version = &#63; or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param name the name
	* @param version the version
	* @return the matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByNameVersion(java.lang.String name,
		java.lang.String version)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByNameVersion(name, version);
	}

	/**
	* Returns the science app where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @param version the version
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByNameVersion(java.lang.String name,
		java.lang.String version) {
		return getPersistence().fetchByNameVersion(name, version);
	}

	/**
	* Returns the science app where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByNameVersion(java.lang.String name,
		java.lang.String version, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByNameVersion(name, version, retrieveFromCache);
	}

	/**
	* Removes the science app where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	* @return the science app that was removed
	*/
	public static ScienceApp removeByNameVersion(java.lang.String name,
		java.lang.String version)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().removeByNameVersion(name, version);
	}

	/**
	* Returns the number of science apps where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching science apps
	*/
	public static int countByNameVersion(java.lang.String name,
		java.lang.String version) {
		return getPersistence().countByNameVersion(name, version);
	}

	/**
	* Returns all the science apps where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @return the matching science apps
	*/
	public static List<ScienceApp> findByOpenLevel(int openLevel) {
		return getPersistence().findByOpenLevel(openLevel);
	}

	/**
	* Returns a range of all the science apps where openLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openLevel the open level
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of matching science apps
	*/
	public static List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end) {
		return getPersistence().findByOpenLevel(openLevel, start, end);
	}

	/**
	* Returns an ordered range of all the science apps where openLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openLevel the open level
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .findByOpenLevel(openLevel, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps where openLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param openLevel the open level
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching science apps
	*/
	public static List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOpenLevel(openLevel, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenLevel_First(int openLevel,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenLevel_First(openLevel, orderByComparator);
	}

	/**
	* Returns the first science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenLevel_First(int openLevel,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenLevel_First(openLevel, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public static ScienceApp findByOpenLevel_Last(int openLevel,
		OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenLevel_Last(openLevel, orderByComparator);
	}

	/**
	* Returns the last science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public static ScienceApp fetchByOpenLevel_Last(int openLevel,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence()
				   .fetchByOpenLevel_Last(openLevel, orderByComparator);
	}

	/**
	* Returns the science apps before and after the current science app in the ordered set where openLevel = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp[] findByOpenLevel_PrevAndNext(long scienceAppId,
		int openLevel, OrderByComparator<ScienceApp> orderByComparator)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence()
				   .findByOpenLevel_PrevAndNext(scienceAppId, openLevel,
			orderByComparator);
	}

	/**
	* Removes all the science apps where openLevel = &#63; from the database.
	*
	* @param openLevel the open level
	*/
	public static void removeByOpenLevel(int openLevel) {
		getPersistence().removeByOpenLevel(openLevel);
	}

	/**
	* Returns the number of science apps where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @return the number of matching science apps
	*/
	public static int countByOpenLevel(int openLevel) {
		return getPersistence().countByOpenLevel(openLevel);
	}

	/**
	* Caches the science app in the entity cache if it is enabled.
	*
	* @param scienceApp the science app
	*/
	public static void cacheResult(ScienceApp scienceApp) {
		getPersistence().cacheResult(scienceApp);
	}

	/**
	* Caches the science apps in the entity cache if it is enabled.
	*
	* @param scienceApps the science apps
	*/
	public static void cacheResult(List<ScienceApp> scienceApps) {
		getPersistence().cacheResult(scienceApps);
	}

	/**
	* Creates a new science app with the primary key. Does not add the science app to the database.
	*
	* @param scienceAppId the primary key for the new science app
	* @return the new science app
	*/
	public static ScienceApp create(long scienceAppId) {
		return getPersistence().create(scienceAppId);
	}

	/**
	* Removes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app that was removed
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp remove(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().remove(scienceAppId);
	}

	public static ScienceApp updateImpl(ScienceApp scienceApp) {
		return getPersistence().updateImpl(scienceApp);
	}

	/**
	* Returns the science app with the primary key or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public static ScienceApp findByPrimaryKey(long scienceAppId)
		throws com.kisti.osp.spyglass.exception.NoSuchScienceAppException {
		return getPersistence().findByPrimaryKey(scienceAppId);
	}

	/**
	* Returns the science app with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app, or <code>null</code> if a science app with the primary key could not be found
	*/
	public static ScienceApp fetchByPrimaryKey(long scienceAppId) {
		return getPersistence().fetchByPrimaryKey(scienceAppId);
	}

	public static java.util.Map<java.io.Serializable, ScienceApp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the science apps.
	*
	* @return the science apps
	*/
	public static List<ScienceApp> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the science apps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @return the range of science apps
	*/
	public static List<ScienceApp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the science apps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science apps
	*/
	public static List<ScienceApp> findAll(int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the science apps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science apps
	* @param end the upper bound of the range of science apps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science apps
	*/
	public static List<ScienceApp> findAll(int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the science apps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of science apps.
	*
	* @return the number of science apps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ScienceAppPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ScienceAppPersistence, ScienceAppPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ScienceAppPersistence.class);
}