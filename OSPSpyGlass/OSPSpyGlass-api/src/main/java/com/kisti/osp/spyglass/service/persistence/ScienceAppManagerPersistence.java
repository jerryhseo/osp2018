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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException;
import com.kisti.osp.spyglass.model.ScienceAppManager;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the science app manager service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppManagerPersistenceImpl
 * @see ScienceAppManagerUtil
 * @generated
 */
@ProviderType
public interface ScienceAppManagerPersistence extends BasePersistence<ScienceAppManager> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppManagerUtil} to access the science app manager persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the science app managers where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @return the matching science app managers
	*/
	public java.util.List<ScienceAppManager> findByAppId(long scienceAppId);

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
	public java.util.List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end);

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
	public java.util.List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

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
	public java.util.List<ScienceAppManager> findByAppId(long scienceAppId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByAppId_First(long scienceAppId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByAppId_First(long scienceAppId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByAppId_Last(long scienceAppId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByAppId_Last(long scienceAppId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where scienceAppId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param scienceAppId the science app ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager[] findByAppId_PrevAndNext(
		long scienceAppManagerId, long scienceAppId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Removes all the science app managers where scienceAppId = &#63; from the database.
	*
	* @param scienceAppId the science app ID
	*/
	public void removeByAppId(long scienceAppId);

	/**
	* Returns the number of science app managers where scienceAppId = &#63;.
	*
	* @param scienceAppId the science app ID
	* @return the number of matching science app managers
	*/
	public int countByAppId(long scienceAppId);

	/**
	* Returns all the science app managers where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the matching science app managers
	*/
	public java.util.List<ScienceAppManager> findByManagerId(long managerId);

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
	public java.util.List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end);

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
	public java.util.List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

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
	public java.util.List<ScienceAppManager> findByManagerId(long managerId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByManagerId_First(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the first science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByManagerId_First(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the last science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByManagerId_Last(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the last science app manager in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByManagerId_Last(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where managerId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager[] findByManagerId_PrevAndNext(
		long scienceAppManagerId, long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Removes all the science app managers where managerId = &#63; from the database.
	*
	* @param managerId the manager ID
	*/
	public void removeByManagerId(long managerId);

	/**
	* Returns the number of science app managers where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the number of matching science app managers
	*/
	public int countByManagerId(long managerId);

	/**
	* Returns all the science app managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching science app managers
	*/
	public java.util.List<ScienceAppManager> findByUserId(long userId);

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
	public java.util.List<ScienceAppManager> findByUserId(long userId,
		int start, int end);

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
	public java.util.List<ScienceAppManager> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

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
	public java.util.List<ScienceAppManager> findByUserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the first science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the last science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager
	* @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	*/
	public ScienceAppManager findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the last science app manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	*/
	public ScienceAppManager fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

	/**
	* Returns the science app managers before and after the current science app manager in the ordered set where userId = &#63;.
	*
	* @param scienceAppManagerId the primary key of the current science app manager
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager[] findByUserId_PrevAndNext(
		long scienceAppManagerId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException;

	/**
	* Removes all the science app managers where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of science app managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching science app managers
	*/
	public int countByUserId(long userId);

	/**
	* Caches the science app manager in the entity cache if it is enabled.
	*
	* @param scienceAppManager the science app manager
	*/
	public void cacheResult(ScienceAppManager scienceAppManager);

	/**
	* Caches the science app managers in the entity cache if it is enabled.
	*
	* @param scienceAppManagers the science app managers
	*/
	public void cacheResult(
		java.util.List<ScienceAppManager> scienceAppManagers);

	/**
	* Creates a new science app manager with the primary key. Does not add the science app manager to the database.
	*
	* @param scienceAppManagerId the primary key for the new science app manager
	* @return the new science app manager
	*/
	public ScienceAppManager create(long scienceAppManagerId);

	/**
	* Removes the science app manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager that was removed
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager remove(long scienceAppManagerId)
		throws NoSuchScienceAppManagerException;

	public ScienceAppManager updateImpl(ScienceAppManager scienceAppManager);

	/**
	* Returns the science app manager with the primary key or throws a {@link NoSuchScienceAppManagerException} if it could not be found.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager
	* @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager findByPrimaryKey(long scienceAppManagerId)
		throws NoSuchScienceAppManagerException;

	/**
	* Returns the science app manager with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager, or <code>null</code> if a science app manager with the primary key could not be found
	*/
	public ScienceAppManager fetchByPrimaryKey(long scienceAppManagerId);

	@Override
	public java.util.Map<java.io.Serializable, ScienceAppManager> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the science app managers.
	*
	* @return the science app managers
	*/
	public java.util.List<ScienceAppManager> findAll();

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
	public java.util.List<ScienceAppManager> findAll(int start, int end);

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
	public java.util.List<ScienceAppManager> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator);

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
	public java.util.List<ScienceAppManager> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the science app managers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of science app managers.
	*
	* @return the number of science app managers
	*/
	public int countAll();
}