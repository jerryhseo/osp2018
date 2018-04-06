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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppException;
import com.kisti.osp.spyglass.model.ScienceApp;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the science app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppPersistenceImpl
 * @see ScienceAppUtil
 * @generated
 */
@ProviderType
public interface ScienceAppPersistence extends BasePersistence<ScienceApp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppUtil} to access the science app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the science apps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByUuid(java.lang.String uuid);

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
	public java.util.List<ScienceApp> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<ScienceApp> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where uuid = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByUuid_PrevAndNext(long scienceAppId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of science apps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching science apps
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchScienceAppException;

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the science app where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the science app that was removed
	*/
	public ScienceApp removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchScienceAppException;

	/**
	* Returns the number of science apps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching science apps
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the science apps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByUuid_C_PrevAndNext(long scienceAppId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of science apps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching science apps
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the science apps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByU(long userId);

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
	public java.util.List<ScienceApp> findByU(long userId, int start, int end);

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
	public java.util.List<ScienceApp> findByU(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByU(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where userId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByU_PrevAndNext(long scienceAppId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByU(long userId);

	/**
	* Returns the number of science apps where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching science apps
	*/
	public int countByU(long userId);

	/**
	* Returns all the science apps where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByG(long groupId);

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
	public java.util.List<ScienceApp> findByG(long groupId, int start, int end);

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
	public java.util.List<ScienceApp> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where groupId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByG_PrevAndNext(long scienceAppId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByG(long groupId);

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
	public java.util.List<ScienceApp> filterFindByG(long groupId, int start,
		int end);

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
	public java.util.List<ScienceApp> filterFindByG(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set of science apps that the user has permission to view where groupId = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] filterFindByG_PrevAndNext(long scienceAppId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG(long groupId);

	/**
	* Returns the number of science apps where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching science apps
	*/
	public int countByG(long groupId);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByG(long groupId);

	/**
	* Returns all the science apps where name = &#63;.
	*
	* @param name the name
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByName(java.lang.String name);

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
	public java.util.List<ScienceApp> findByName(java.lang.String name,
		int start, int end);

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
	public java.util.List<ScienceApp> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where name = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByName_PrevAndNext(long scienceAppId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of science apps where name = &#63;.
	*
	* @param name the name
	* @return the number of matching science apps
	*/
	public int countByName(java.lang.String name);

	/**
	* Returns all the science apps where appType = &#63;.
	*
	* @param appType the app type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppType(java.lang.String appType);

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
	public java.util.List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end);

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
	public java.util.List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppType(java.lang.String appType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_First(java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_First(java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_Last(java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where appType = &#63;.
	*
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_Last(java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where appType = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByAppType_PrevAndNext(long scienceAppId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where appType = &#63; from the database.
	*
	* @param appType the app type
	*/
	public void removeByAppType(java.lang.String appType);

	/**
	* Returns the number of science apps where appType = &#63;.
	*
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public int countByAppType(java.lang.String appType);

	/**
	* Returns all the science apps where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType);

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
	public java.util.List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppType_U(long userId,
		java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_U_First(long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_U_First(long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_U_Last(long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_U_Last(long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppType_U_PrevAndNext(long scienceAppId,
		long userId, java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where userId = &#63; and appType = &#63; from the database.
	*
	* @param userId the user ID
	* @param appType the app type
	*/
	public void removeByAppType_U(long userId, java.lang.String appType);

	/**
	* Returns the number of science apps where userId = &#63; and appType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public int countByAppType_U(long userId, java.lang.String appType);

	/**
	* Returns all the science apps where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType);

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
	public java.util.List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_G_First(long groupId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_G_First(long groupId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppType_G_Last(long groupId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_G_Last(long groupId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppType_G_PrevAndNext(long scienceAppId,
		long groupId, java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType);

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
	public java.util.List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByAppType_G(long groupId,
		java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByAppType_G_PrevAndNext(long scienceAppId,
		long groupId, java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and appType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param appType the app type
	*/
	public void removeByAppType_G(long groupId, java.lang.String appType);

	/**
	* Returns the number of science apps where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public int countByAppType_G(long groupId, java.lang.String appType);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByAppType_G(long groupId, java.lang.String appType);

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppType_G_U(long groupId,
		long userId, java.lang.String appType);

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
	public java.util.List<ScienceApp> findByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByAppType_G_U_First(long groupId, long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_G_U_First(long groupId, long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByAppType_G_U_Last(long groupId, long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppType_G_U_Last(long groupId, long userId,
		java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppType_G_U_PrevAndNext(long scienceAppId,
		long groupId, long userId, java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType);

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
	public java.util.List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByAppType_G_U(long groupId,
		long userId, java.lang.String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByAppType_G_U_PrevAndNext(long scienceAppId,
		long groupId, long userId, java.lang.String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	*/
	public void removeByAppType_G_U(long groupId, long userId,
		java.lang.String appType);

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps
	*/
	public int countByAppType_G_U(long groupId, long userId,
		java.lang.String appType);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByAppType_G_U(long groupId, long userId,
		java.lang.String appType);

	/**
	* Returns all the science apps where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppRunType(
		java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> findByAppRunType(
		java.lang.String appType, java.lang.String runType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppRunType(
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppRunType(
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppRunType_First(java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_First(java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByAppRunType_Last(java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_Last(java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppRunType_PrevAndNext(long scienceAppId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where appType = &#63; and runType = &#63; from the database.
	*
	* @param appType the app type
	* @param runType the run type
	*/
	public void removeByAppRunType(java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns the number of science apps where appType = &#63; and runType = &#63;.
	*
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public int countByAppRunType(java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns all the science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppRunType_U(long userId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByAppRunType_U_First(long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_U_First(long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByAppRunType_U_Last(long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_U_Last(long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppRunType_U_PrevAndNext(long scienceAppId,
		long userId, java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where userId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	*/
	public void removeByAppRunType_U(long userId, java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns the number of science apps where userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public int countByAppRunType_U(long userId, java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns all the science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByAppRunType_G_First(long groupId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_G_First(long groupId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByAppRunType_G_Last(long groupId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByAppRunType_G_Last(long groupId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppRunType_G_PrevAndNext(long scienceAppId,
		long groupId, java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByAppRunType_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	*/
	public void removeByAppRunType_G(long groupId, java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns the number of science apps where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public int countByAppRunType_G(long groupId, java.lang.String appType,
		java.lang.String runType);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByAppRunType_G(long groupId,
		java.lang.String appType, java.lang.String runType);

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end);

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
	public java.util.List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByAppRunType_G_U_First(long groupId, long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

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
	public ScienceApp fetchByAppRunType_G_U_First(long groupId, long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByAppRunType_G_U_Last(long groupId, long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

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
	public ScienceApp fetchByAppRunType_G_U_Last(long groupId, long userId,
		java.lang.String appType, java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByAppRunType_G_U_PrevAndNext(long scienceAppId,
		long groupId, long userId, java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType);

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
	public java.util.List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end);

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
	public java.util.List<ScienceApp> filterFindByAppRunType_G_U(long groupId,
		long userId, java.lang.String appType, java.lang.String runType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByAppRunType_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId, java.lang.String appType,
		java.lang.String runType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	*/
	public void removeByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType);

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps
	*/
	public int countByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and appType = &#63; and runType = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param appType the app type
	* @param runType the run type
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByAppRunType_G_U(long groupId, long userId,
		java.lang.String appType, java.lang.String runType);

	/**
	* Returns all the science apps where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus);

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
	public java.util.List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByOpenStatus(
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_First(java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_First(java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_Last(java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_Last(java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where openStatus = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByOpenStatus_PrevAndNext(long scienceAppId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where openStatus = &#63; from the database.
	*
	* @param openStatus the open status
	*/
	public void removeByOpenStatus(java.lang.String openStatus);

	/**
	* Returns the number of science apps where openStatus = &#63;.
	*
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public int countByOpenStatus(java.lang.String openStatus);

	/**
	* Returns all the science apps where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus);

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
	public java.util.List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByOpenStatus_U(long userId,
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_U_First(long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_U_First(long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_U_Last(long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_U_Last(long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByOpenStatus_U_PrevAndNext(long scienceAppId,
		long userId, java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where userId = &#63; and openStatus = &#63; from the database.
	*
	* @param userId the user ID
	* @param openStatus the open status
	*/
	public void removeByOpenStatus_U(long userId, java.lang.String openStatus);

	/**
	* Returns the number of science apps where userId = &#63; and openStatus = &#63;.
	*
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public int countByOpenStatus_U(long userId, java.lang.String openStatus);

	/**
	* Returns all the science apps where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus);

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
	public java.util.List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_G_First(long groupId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_G_First(long groupId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenStatus_G_Last(long groupId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_G_Last(long groupId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByOpenStatus_G_PrevAndNext(long scienceAppId,
		long groupId, java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus);

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
	public java.util.List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByOpenStatus_G(long groupId,
		java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByOpenStatus_G_PrevAndNext(
		long scienceAppId, long groupId, java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and openStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	*/
	public void removeByOpenStatus_G(long groupId, java.lang.String openStatus);

	/**
	* Returns the number of science apps where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public int countByOpenStatus_G(long groupId, java.lang.String openStatus);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param openStatus the open status
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByOpenStatus_G(long groupId,
		java.lang.String openStatus);

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus);

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
	public java.util.List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByOpenStatus_G_U_First(long groupId, long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_G_U_First(long groupId, long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByOpenStatus_G_U_Last(long groupId, long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenStatus_G_U_Last(long groupId, long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByOpenStatus_G_U_PrevAndNext(long scienceAppId,
		long groupId, long userId, java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus);

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
	public java.util.List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByOpenStatus_G_U(long groupId,
		long userId, java.lang.String openStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByOpenStatus_G_U_PrevAndNext(
		long scienceAppId, long groupId, long userId,
		java.lang.String openStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and openStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	*/
	public void removeByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus);

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps
	*/
	public int countByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and openStatus = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param openStatus the open status
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByOpenStatus_G_U(long groupId, long userId,
		java.lang.String openStatus);

	/**
	* Returns all the science apps where status = &#63;.
	*
	* @param status the status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByS(int status);

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
	public java.util.List<ScienceApp> findByS(int status, int start, int end);

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
	public java.util.List<ScienceApp> findByS(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByS(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByS_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByS_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByS_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByS_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where status = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByS_PrevAndNext(long scienceAppId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByS(int status);

	/**
	* Returns the number of science apps where status = &#63;.
	*
	* @param status the status
	* @return the number of matching science apps
	*/
	public int countByS(int status);

	/**
	* Returns all the science apps where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByU_S(long userId, int status);

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
	public java.util.List<ScienceApp> findByU_S(long userId, int status,
		int start, int end);

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
	public java.util.List<ScienceApp> findByU_S(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByU_S(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByU_S_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByU_S_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByU_S_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByU_S_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByU_S_PrevAndNext(long scienceAppId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByU_S(long userId, int status);

	/**
	* Returns the number of science apps where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public int countByU_S(long userId, int status);

	/**
	* Returns all the science apps where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByG_S(long groupId, int status);

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
	public java.util.List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end);

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
	public java.util.List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByG_S_PrevAndNext(long scienceAppId, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByG_S(long groupId, int status);

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
	public java.util.List<ScienceApp> filterFindByG_S(long groupId, int status,
		int start, int end);

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
	public java.util.List<ScienceApp> filterFindByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByG_S_PrevAndNext(long scienceAppId,
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, int status);

	/**
	* Returns the number of science apps where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public int countByG_S(long groupId, int status);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByG_S(long groupId, int status);

	/**
	* Returns all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status);

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
	public java.util.List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end);

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
	public java.util.List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

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
	public ScienceApp findByG_U_S_First(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_U_S_First(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp findByG_U_S_Last(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByG_U_S_Last(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] findByG_U_S_PrevAndNext(long scienceAppId,
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns all the science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching science apps that the user has permission to view
	*/
	public java.util.List<ScienceApp> filterFindByG_U_S(long groupId,
		long userId, int status);

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
	public java.util.List<ScienceApp> filterFindByG_U_S(long groupId,
		long userId, int status, int start, int end);

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
	public java.util.List<ScienceApp> filterFindByG_U_S(long groupId,
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public ScienceApp[] filterFindByG_U_S_PrevAndNext(long scienceAppId,
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	* Returns the number of science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps
	*/
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	* Returns the number of science apps that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching science apps that the user has permission to view
	*/
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	* Returns the science app where name = &#63; and version = &#63; or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param name the name
	* @param version the version
	* @return the matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByNameVersion(java.lang.String name,
		java.lang.String version) throws NoSuchScienceAppException;

	/**
	* Returns the science app where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @param version the version
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Returns the science app where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByNameVersion(java.lang.String name,
		java.lang.String version, boolean retrieveFromCache);

	/**
	* Removes the science app where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	* @return the science app that was removed
	*/
	public ScienceApp removeByNameVersion(java.lang.String name,
		java.lang.String version) throws NoSuchScienceAppException;

	/**
	* Returns the number of science apps where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching science apps
	*/
	public int countByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Returns all the science apps where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @return the matching science apps
	*/
	public java.util.List<ScienceApp> findByOpenLevel(int openLevel);

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
	public java.util.List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end);

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
	public java.util.List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findByOpenLevel(int openLevel, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenLevel_First(int openLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the first science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenLevel_First(int openLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the last science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app
	* @throws NoSuchScienceAppException if a matching science app could not be found
	*/
	public ScienceApp findByOpenLevel_Last(int openLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Returns the last science app in the ordered set where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching science app, or <code>null</code> if a matching science app could not be found
	*/
	public ScienceApp fetchByOpenLevel_Last(int openLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

	/**
	* Returns the science apps before and after the current science app in the ordered set where openLevel = &#63;.
	*
	* @param scienceAppId the primary key of the current science app
	* @param openLevel the open level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp[] findByOpenLevel_PrevAndNext(long scienceAppId,
		int openLevel,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator)
		throws NoSuchScienceAppException;

	/**
	* Removes all the science apps where openLevel = &#63; from the database.
	*
	* @param openLevel the open level
	*/
	public void removeByOpenLevel(int openLevel);

	/**
	* Returns the number of science apps where openLevel = &#63;.
	*
	* @param openLevel the open level
	* @return the number of matching science apps
	*/
	public int countByOpenLevel(int openLevel);

	/**
	* Caches the science app in the entity cache if it is enabled.
	*
	* @param scienceApp the science app
	*/
	public void cacheResult(ScienceApp scienceApp);

	/**
	* Caches the science apps in the entity cache if it is enabled.
	*
	* @param scienceApps the science apps
	*/
	public void cacheResult(java.util.List<ScienceApp> scienceApps);

	/**
	* Creates a new science app with the primary key. Does not add the science app to the database.
	*
	* @param scienceAppId the primary key for the new science app
	* @return the new science app
	*/
	public ScienceApp create(long scienceAppId);

	/**
	* Removes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app that was removed
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp remove(long scienceAppId)
		throws NoSuchScienceAppException;

	public ScienceApp updateImpl(ScienceApp scienceApp);

	/**
	* Returns the science app with the primary key or throws a {@link NoSuchScienceAppException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app
	* @throws NoSuchScienceAppException if a science app with the primary key could not be found
	*/
	public ScienceApp findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppException;

	/**
	* Returns the science app with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app
	* @return the science app, or <code>null</code> if a science app with the primary key could not be found
	*/
	public ScienceApp fetchByPrimaryKey(long scienceAppId);

	@Override
	public java.util.Map<java.io.Serializable, ScienceApp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the science apps.
	*
	* @return the science apps
	*/
	public java.util.List<ScienceApp> findAll();

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
	public java.util.List<ScienceApp> findAll(int start, int end);

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
	public java.util.List<ScienceApp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator);

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
	public java.util.List<ScienceApp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the science apps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of science apps.
	*
	* @return the number of science apps
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}