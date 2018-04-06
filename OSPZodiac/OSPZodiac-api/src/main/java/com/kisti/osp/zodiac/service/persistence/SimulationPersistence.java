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

import com.kisti.osp.zodiac.exception.NoSuchSimulationException;
import com.kisti.osp.zodiac.model.Simulation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the simulation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.zodiac.service.persistence.impl.SimulationPersistenceImpl
 * @see SimulationUtil
 * @generated
 */
@ProviderType
public interface SimulationPersistence extends BasePersistence<Simulation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SimulationUtil} to access the simulation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the simulations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByUuid(java.lang.String uuid);

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
	public java.util.List<Simulation> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Simulation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the simulations before and after the current simulation in the ordered set where uuid = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation[] findByUuid_PrevAndNext(long simulationId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of simulations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching simulations
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSimulationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSimulationException;

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the simulation where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the simulation that was removed
	*/
	public Simulation removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchSimulationException;

	/**
	* Returns the number of simulations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching simulations
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the simulations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findByUuid_C_PrevAndNext(long simulationId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of simulations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching simulations
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the simulations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByUserId(long userId);

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
	public java.util.List<Simulation> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<Simulation> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the simulations before and after the current simulation in the ordered set where userId = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation[] findByUserId_PrevAndNext(long simulationId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of simulations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching simulations
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the simulations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByGroupId(long groupId);

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
	public java.util.List<Simulation> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<Simulation> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the simulations before and after the current simulation in the ordered set where groupId = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation[] findByGroupId_PrevAndNext(long simulationId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of simulations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching simulations
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the simulations where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus);

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
	public java.util.List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end);

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
	public java.util.List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findBySimulationStatus(
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_First(
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_First(
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_Last(
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_Last(
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the simulations before and after the current simulation in the ordered set where simulationStatus = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation[] findBySimulationStatus_PrevAndNext(long simulationId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where simulationStatus = &#63; from the database.
	*
	* @param simulationStatus the simulation status
	*/
	public void removeBySimulationStatus(java.lang.String simulationStatus);

	/**
	* Returns the number of simulations where simulationStatus = &#63;.
	*
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public int countBySimulationStatus(java.lang.String simulationStatus);

	/**
	* Returns all the simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus);

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
	public java.util.List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end);

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
	public java.util.List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findBySimulationStatus_U(long userId,
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_U_First(long userId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_U_First(long userId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_U_Last(long userId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_U_Last(long userId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findBySimulationStatus_U_PrevAndNext(
		long simulationId, long userId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where userId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	*/
	public void removeBySimulationStatus_U(long userId,
		java.lang.String simulationStatus);

	/**
	* Returns the number of simulations where userId = &#63; and simulationStatus = &#63;.
	*
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public int countBySimulationStatus_U(long userId,
		java.lang.String simulationStatus);

	/**
	* Returns all the simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus);

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
	public java.util.List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end);

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
	public java.util.List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_G_First(long groupId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_G_First(long groupId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findBySimulationStatus_G_Last(long groupId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_G_Last(long groupId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findBySimulationStatus_G_PrevAndNext(
		long simulationId, long groupId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where groupId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	*/
	public void removeBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus);

	/**
	* Returns the number of simulations where groupId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public int countBySimulationStatus_G(long groupId,
		java.lang.String simulationStatus);

	/**
	* Returns all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus);

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
	public java.util.List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end);

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
	public java.util.List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, java.lang.String simulationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

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
	public Simulation findBySimulationStatus_G_U_First(long groupId,
		long userId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_G_U_First(long groupId,
		long userId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation findBySimulationStatus_G_U_Last(long groupId,
		long userId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchBySimulationStatus_G_U_Last(long groupId,
		long userId, java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findBySimulationStatus_G_U_PrevAndNext(
		long simulationId, long groupId, long userId,
		java.lang.String simulationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	*/
	public void removeBySimulationStatus_G_U(long groupId, long userId,
		java.lang.String simulationStatus);

	/**
	* Returns the number of simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param simulationStatus the simulation status
	* @return the number of matching simulations
	*/
	public int countBySimulationStatus_G_U(long groupId, long userId,
		java.lang.String simulationStatus);

	/**
	* Returns all the simulations where status = &#63;.
	*
	* @param status the status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByStatus(int status);

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
	public java.util.List<Simulation> findByStatus(int status, int start,
		int end);

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
	public java.util.List<Simulation> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the simulations before and after the current simulation in the ordered set where status = &#63;.
	*
	* @param simulationId the primary key of the current simulation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation[] findByStatus_PrevAndNext(long simulationId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of simulations where status = &#63;.
	*
	* @param status the status
	* @return the number of matching simulations
	*/
	public int countByStatus(int status);

	/**
	* Returns all the simulations where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByStatus_U(long userId, int status);

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
	public java.util.List<Simulation> findByStatus_U(long userId, int status,
		int start, int end);

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
	public java.util.List<Simulation> findByStatus_U(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByStatus_U(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findByStatus_U_PrevAndNext(long simulationId,
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_U(long userId, int status);

	/**
	* Returns the number of simulations where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public int countByStatus_U(long userId, int status);

	/**
	* Returns all the simulations where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByStatus_G(long groupId, int status);

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
	public java.util.List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end);

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
	public java.util.List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByStatus_G(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation
	* @throws NoSuchSimulationException if a matching simulation could not be found
	*/
	public Simulation findByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findByStatus_G_PrevAndNext(long simulationId,
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByStatus_G(long groupId, int status);

	/**
	* Returns the number of simulations where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public int countByStatus_G(long groupId, int status);

	/**
	* Returns all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching simulations
	*/
	public java.util.List<Simulation> findByStatus_G_U(long groupId,
		long userId, int status);

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
	public java.util.List<Simulation> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end);

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
	public java.util.List<Simulation> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

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
	public Simulation findByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation findByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public Simulation fetchByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public Simulation[] findByStatus_G_U_PrevAndNext(long simulationId,
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException;

	/**
	* Removes all the simulations where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_G_U(long groupId, long userId, int status);

	/**
	* Returns the number of simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching simulations
	*/
	public int countByStatus_G_U(long groupId, long userId, int status);

	/**
	* Caches the simulation in the entity cache if it is enabled.
	*
	* @param simulation the simulation
	*/
	public void cacheResult(Simulation simulation);

	/**
	* Caches the simulations in the entity cache if it is enabled.
	*
	* @param simulations the simulations
	*/
	public void cacheResult(java.util.List<Simulation> simulations);

	/**
	* Creates a new simulation with the primary key. Does not add the simulation to the database.
	*
	* @param simulationId the primary key for the new simulation
	* @return the new simulation
	*/
	public Simulation create(long simulationId);

	/**
	* Removes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation that was removed
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation remove(long simulationId)
		throws NoSuchSimulationException;

	public Simulation updateImpl(Simulation simulation);

	/**
	* Returns the simulation with the primary key or throws a {@link NoSuchSimulationException} if it could not be found.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation
	* @throws NoSuchSimulationException if a simulation with the primary key could not be found
	*/
	public Simulation findByPrimaryKey(long simulationId)
		throws NoSuchSimulationException;

	/**
	* Returns the simulation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation, or <code>null</code> if a simulation with the primary key could not be found
	*/
	public Simulation fetchByPrimaryKey(long simulationId);

	@Override
	public java.util.Map<java.io.Serializable, Simulation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the simulations.
	*
	* @return the simulations
	*/
	public java.util.List<Simulation> findAll();

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
	public java.util.List<Simulation> findAll(int start, int end);

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
	public java.util.List<Simulation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator);

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
	public java.util.List<Simulation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the simulations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of simulations.
	*
	* @return the number of simulations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}