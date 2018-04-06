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

package com.kisti.osp.zodiac.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.zodiac.model.Simulation;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the simulation service. This utility wraps {@link com.kisti.osp.zodiac.service.persistence.impl.SimulationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see SimulationPersistence
 * @see com.kisti.osp.zodiac.service.persistence.impl.SimulationPersistenceImpl
 * @generated
 */
@ProviderType
public class SimulationUtil {
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
	public static void clearCache(Simulation simulation) {
		getPersistence().clearCache(simulation);
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
	public static List<Simulation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Simulation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Simulation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Simulation update(Simulation simulation) {
		return getPersistence().update(simulation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Simulation update(Simulation simulation,
		ServiceContext serviceContext) {
		return getPersistence().update(simulation, serviceContext);
	}

	/**
	* Returns all the simulations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching simulations
	*/
	public static List<Simulation> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the simulations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUuid_First(java.lang.String uuid,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where uuid = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByUuid_PrevAndNext(long simulationId,
		java.lang.String uuid, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByUuid_PrevAndNext(simulationId, uuid, orderByComparator);
	}

	/**
	* Removes all the simulations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of simulations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching simulations
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSimulationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUUID_G(java.lang.String uuid, long groupId)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the simulation where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the simulation that was removed
	*/
	public static Simulation removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of simulations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching simulations
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the simulations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching simulations
	*/
	public static List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the simulations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByUuid_C_PrevAndNext(long simulationId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(simulationId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the simulations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of simulations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching simulations
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the simulations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching simulations
	*/
	public static List<Simulation> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the simulations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUserId(long userId, int start,
		int end, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByUserId(long userId, int start,
		int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUserId_First(long userId,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUserId_First(long userId,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByUserId_Last(long userId,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByUserId_Last(long userId,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where userId = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByUserId_PrevAndNext(long simulationId,
		long userId, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(simulationId, userId,
			orderByComparator);
	}

	/**
	* Removes all the simulations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of simulations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching simulations
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the simulations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching simulations
	*/
	public static List<Simulation> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the simulations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByGroupId_First(long groupId,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByGroupId_First(long groupId,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByGroupId_Last(long groupId,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByGroupId_Last(long groupId,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByGroupId_PrevAndNext(long simulationId,
		long groupId, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(simulationId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the simulations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of simulations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching simulations
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the simulations where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public static List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus) {
		return getPersistence().findBySimulationStatus(simulationStatus);
	}

	/**
	* Returns a range of all the simulations where simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end) {
		return getPersistence()
				   .findBySimulationStatus(simulationStatus, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findBySimulationStatus(simulationStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySimulationStatus(simulationStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_First(
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_First(simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_First(
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_First(simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_Last(
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_Last(simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_Last(
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_Last(simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findBySimulationStatus_PrevAndNext(
		long simulationId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_PrevAndNext(simulationId,
			simulationStatus, orderByComparator);
	}

	/**
	* Removes all the simulations where simulationStatus = &#63; from the database.
	*
	* @param simulationStatus the simulation status
	*/
	public static void removeBySimulationStatus(
		java.lang.String simulationStatus) {
		getPersistence().removeBySimulationStatus(simulationStatus);
	}

	/**
	* Returns the number of simulations where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public static int countBySimulationStatus(java.lang.String simulationStatus) {
		return getPersistence().countBySimulationStatus(simulationStatus);
	}

	/**
	* Returns all the simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus) {
		return getPersistence()
				   .findBySimulationStatus_U(userId, simulationStatus);
	}

	/**
	* Returns a range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end) {
		return getPersistence()
				   .findBySimulationStatus_U(userId, simulationStatus, start,
			end);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findBySimulationStatus_U(userId, simulationStatus, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySimulationStatus_U(userId, simulationStatus, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_U_First(long userId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_U_First(userId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_U_First(long userId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_U_First(userId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_U_Last(long userId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_U_Last(userId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_U_Last(long userId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_U_Last(userId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findBySimulationStatus_U_PrevAndNext(
		long simulationId, long userId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_U_PrevAndNext(simulationId, userId,
			simulationStatus, orderByComparator);
	}

	/**
	* Removes all the simulations where userId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	*/
	public static void removeBySimulationStatus_U(long userId,
		java.lang.String simulationStatus) {
		getPersistence().removeBySimulationStatus_U(userId, simulationStatus);
	}

	/**
	* Returns the number of simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public static int countBySimulationStatus_U(long userId,
		java.lang.String simulationStatus) {
		return getPersistence()
				   .countBySimulationStatus_U(userId, simulationStatus);
	}

	/**
	* Returns all the simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus) {
		return getPersistence()
				   .findBySimulationStatus_G(groupId, simulationStatus);
	}

	/**
	* Returns a range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end) {
		return getPersistence()
				   .findBySimulationStatus_G(groupId, simulationStatus, start,
			end);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findBySimulationStatus_G(groupId, simulationStatus, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySimulationStatus_G(groupId, simulationStatus, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_G_First(long groupId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_First(groupId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_G_First(long groupId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_G_First(groupId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_G_Last(long groupId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_Last(groupId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_G_Last(long groupId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_G_Last(groupId, simulationStatus,
			orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findBySimulationStatus_G_PrevAndNext(
		long simulationId, long groupId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_PrevAndNext(simulationId, groupId,
			simulationStatus, orderByComparator);
	}

	/**
	* Removes all the simulations where groupId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	*/
	public static void removeBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus) {
		getPersistence().removeBySimulationStatus_G(groupId, simulationStatus);
	}

	/**
	* Returns the number of simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public static int countBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus) {
		return getPersistence()
				   .countBySimulationStatus_G(groupId, simulationStatus);
	}

	/**
	* Returns all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus) {
		return getPersistence()
				   .findBySimulationStatus_G_U(groupId, userId, simulationStatus);
	}

	/**
	* Returns a range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end) {
		return getPersistence()
				   .findBySimulationStatus_G_U(groupId, userId,
			simulationStatus, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findBySimulationStatus_G_U(groupId, userId,
			simulationStatus, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySimulationStatus_G_U(groupId, userId,
			simulationStatus, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_G_U_First(long groupId,
		long userId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_U_First(groupId, userId,
			simulationStatus, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_G_U_First(long groupId,
		long userId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_G_U_First(groupId, userId,
			simulationStatus, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findBySimulationStatus_G_U_Last(long groupId,
		long userId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_U_Last(groupId, userId,
			simulationStatus, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchBySimulationStatus_G_U_Last(long groupId,
		long userId, java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchBySimulationStatus_G_U_Last(groupId, userId,
			simulationStatus, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findBySimulationStatus_G_U_PrevAndNext(
		long simulationId, long groupId, long userId,
		java.lang.String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findBySimulationStatus_G_U_PrevAndNext(simulationId,
			groupId, userId, simulationStatus, orderByComparator);
	}

	/**
	* Removes all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	*/
	public static void removeBySimulationStatus_G_U(long groupId, long userId,
		java.lang.String simulationStatus) {
		getPersistence()
			.removeBySimulationStatus_G_U(groupId, userId, simulationStatus);
	}

	/**
	* Returns the number of simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public static int countBySimulationStatus_G_U(long groupId, long userId,
		java.lang.String simulationStatus) {
		return getPersistence()
				   .countBySimulationStatus_G_U(groupId, userId,
			simulationStatus);
	}

	/**
	* Returns all the simulations where status = &#63;.
	*
	* @param status the status
	* @return the matching simulations
	*/
	public static List<Simulation> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the simulations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus(int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus(int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_First(int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_First(int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_Last(int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_Last(int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where status = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByStatus_PrevAndNext(long simulationId,
		int status, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_PrevAndNext(simulationId, status,
			orderByComparator);
	}

	/**
	* Removes all the simulations where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of simulations where status = &#63;.
	*
	* @param status the status
	* @return the number of matching simulations
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the simulations where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching simulations
	*/
	public static List<Simulation> findByStatus_U(long userId, int status) {
		return getPersistence().findByStatus_U(userId, status);
	}

	/**
	* Returns a range of all the simulations where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByStatus_U(long userId, int status,
		int start, int end) {
		return getPersistence().findByStatus_U(userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_U(long userId, int status,
		int start, int end, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_U(long userId, int status,
		int start, int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_U_First(long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_U_First(long userId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_U_Last(long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_U_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_U_Last(long userId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByStatus_U_PrevAndNext(long simulationId,
		long userId, int status, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_U_PrevAndNext(simulationId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the simulations where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_U(long userId, int status) {
		getPersistence().removeByStatus_U(userId, status);
	}

	/**
	* Returns the number of simulations where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public static int countByStatus_U(long userId, int status) {
		return getPersistence().countByStatus_U(userId, status);
	}

	/**
	* Returns all the simulations where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching simulations
	*/
	public static List<Simulation> findByStatus_G(long groupId, int status) {
		return getPersistence().findByStatus_G(groupId, status);
	}

	/**
	* Returns a range of all the simulations where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end) {
		return getPersistence().findByStatus_G(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_G_First(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_G_First(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_G_Last(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_G_Last(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByStatus_G_PrevAndNext(long simulationId,
		long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_PrevAndNext(simulationId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the simulations where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByStatus_G(long groupId, int status) {
		getPersistence().removeByStatus_G(groupId, status);
	}

	/**
	* Returns the number of simulations where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public static int countByStatus_G(long groupId, int status) {
		return getPersistence().countByStatus_G(groupId, status);
	}

	/**
	* Returns all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching simulations
	*/
	public static List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status) {
		return getPersistence().findByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns a range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of matching simulations
	*/
	public static List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching simulations
	*/
	public static List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public static Simulation findByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static Simulation fetchByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation[] findByStatus_G_U_PrevAndNext(long simulationId,
		long groupId, long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence()
				   .findByStatus_G_U_PrevAndNext(simulationId, groupId, userId,
			status, orderByComparator);
	}

	/**
	* Removes all the simulations where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_G_U(long groupId, long userId, int status) {
		getPersistence().removeByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns the number of simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public static int countByStatus_G_U(long groupId, long userId, int status) {
		return getPersistence().countByStatus_G_U(groupId, userId, status);
	}

	/**
	* Caches the simulation in the entity cache if it is enabled.
	*
	* @param simulation the simulation
	*/
	public static void cacheResult(Simulation simulation) {
		getPersistence().cacheResult(simulation);
	}

	/**
	* Caches the simulations in the entity cache if it is enabled.
	*
	* @param simulations the simulations
	*/
	public static void cacheResult(List<Simulation> simulations) {
		getPersistence().cacheResult(simulations);
	}

	/**
	* Creates a new simulation with the primary key. Does not add the simulation to the database.
	*
	* @param simulationId the primary key for the new simulation
	* @return the new simulation
	*/
	public static Simulation create(long simulationId) {
		return getPersistence().create(simulationId);
	}

	/**
	* Removes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation that was removed
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation remove(long simulationId)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().remove(simulationId);
	}

	public static Simulation updateImpl(Simulation simulation) {
		return getPersistence().updateImpl(simulation);
	}

	/**
	* Returns the simulation with the primary key or throws a {@link NoSuchSimulationException} if it could not be found.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public static Simulation findByPrimaryKey(long simulationId)
		throws com.kisti.osp.zodiac.exception.NoSuchSimulationException {
		return getPersistence().findByPrimaryKey(simulationId);
	}

	/**
	* Returns the simulation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation, or <code>null</code> if a simulation with the primary key could not be found
	*/
	public static Simulation fetchByPrimaryKey(long simulationId) {
		return getPersistence().fetchByPrimaryKey(simulationId);
	}

	public static java.util.Map<java.io.Serializable, Simulation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the simulations.
	*
	* @return the simulations
	*/
	public static List<Simulation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the simulations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of simulations
	*/
	public static List<Simulation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the simulations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of simulations
	*/
	public static List<Simulation> findAll(int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the simulations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of simulations
	*/
	public static List<Simulation> findAll(int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the simulations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of simulations.
	*
	* @return the number of simulations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static SimulationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SimulationPersistence, SimulationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SimulationPersistence.class);
}