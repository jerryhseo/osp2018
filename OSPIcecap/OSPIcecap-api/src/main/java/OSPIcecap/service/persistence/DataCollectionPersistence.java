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

package OSPIcecap.service.persistence;

import OSPIcecap.exception.NoSuchDataCollectionException;

import OSPIcecap.model.DataCollection;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the data collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.persistence.impl.DataCollectionPersistenceImpl
 * @see DataCollectionUtil
 * @generated
 */
@ProviderType
public interface DataCollectionPersistence extends BasePersistence<DataCollection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DataCollectionUtil} to access the data collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the data collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the data collections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the data collections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where uuid = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByUuid_PrevAndNext(long collectionId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of data collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching data collections
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDataCollectionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDataCollectionException;

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the data collection where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the data collection that was removed
	*/
	public DataCollection removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDataCollectionException;

	/**
	* Returns the number of data collections where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching data collections
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the data collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the data collections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the data collections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByUuid_C_PrevAndNext(long collectionId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of data collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching data collections
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the data collections where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByUserId(long userId);

	/**
	* Returns a range of all the data collections where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByUserId(long userId, int start,
		int end);

	/**
	* Returns an ordered range of all the data collections where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where userId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByUserId_PrevAndNext(long collectionId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of data collections where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching data collections
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the data collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByGroupId(long groupId);

	/**
	* Returns a range of all the data collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByGroupId(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByGroupId_PrevAndNext(long collectionId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of data collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching data collections
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the data collections where name = &#63;.
	*
	* @param name the name
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByName(java.lang.String name);

	/**
	* Returns a range of all the data collections where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByName(java.lang.String name,
		int start, int end);

	/**
	* Returns an ordered range of all the data collections where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where name = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByName_PrevAndNext(long collectionId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of data collections where name = &#63;.
	*
	* @param name the name
	* @return the number of matching data collections
	*/
	public int countByName(java.lang.String name);

	/**
	* Returns all the data collections where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByName_U(long userId,
		java.lang.String name);

	/**
	* Returns a range of all the data collections where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data collections where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_U_First(long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_U_First(long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_U_Last(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_U_Last(long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByName_U_PrevAndNext(long collectionId,
		long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where userId = &#63; and name = &#63; from the database.
	*
	* @param userId the user ID
	* @param name the name
	*/
	public void removeByName_U(long userId, java.lang.String name);

	/**
	* Returns the number of data collections where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public int countByName_U(long userId, java.lang.String name);

	/**
	* Returns all the data collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByName_G(long groupId,
		java.lang.String name);

	/**
	* Returns a range of all the data collections where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_G_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_G_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_G_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_G_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByName_G_PrevAndNext(long collectionId,
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public void removeByName_G(long groupId, java.lang.String name);

	/**
	* Returns the number of data collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public int countByName_G(long groupId, java.lang.String name);

	/**
	* Returns all the data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name);

	/**
	* Returns a range of all the data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_G_U_First(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_G_U_First(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByName_G_U_Last(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByName_G_U_Last(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByName_G_U_PrevAndNext(long collectionId,
		long groupId, long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where groupId = &#63; and userId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	*/
	public void removeByName_G_U(long groupId, long userId,
		java.lang.String name);

	/**
	* Returns the number of data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public int countByName_G_U(long groupId, long userId, java.lang.String name);

	/**
	* Returns all the data collections where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version);

	/**
	* Returns a range of all the data collections where name = &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end);

	/**
	* Returns an ordered range of all the data collections where name = &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where name = &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByNameVersion_First(java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByNameVersion_First(java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByNameVersion_Last(java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByNameVersion_Last(java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByNameVersion_PrevAndNext(long collectionId,
		java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	*/
	public void removeByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Returns the number of data collections where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching data collections
	*/
	public int countByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Returns all the data collections where status = &#63;.
	*
	* @param status the status
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByStatus(int status);

	/**
	* Returns a range of all the data collections where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus(int status, int start,
		int end);

	/**
	* Returns an ordered range of all the data collections where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where status = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByStatus_PrevAndNext(long collectionId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of data collections where status = &#63;.
	*
	* @param status the status
	* @return the number of matching data collections
	*/
	public int countByStatus(int status);

	/**
	* Returns all the data collections where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_U(long userId, int status);

	/**
	* Returns a range of all the data collections where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_U(long userId,
		int status, int start, int end);

	/**
	* Returns an ordered range of all the data collections where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_U(long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_U(long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByStatus_U_PrevAndNext(long collectionId,
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_U(long userId, int status);

	/**
	* Returns the number of data collections where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public int countByStatus_U(long userId, int status);

	/**
	* Returns all the data collections where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G(long groupId,
		int status);

	/**
	* Returns a range of all the data collections where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G(long groupId,
		int status, int start, int end);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G(long groupId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G(long groupId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByStatus_G_PrevAndNext(long collectionId,
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByStatus_G(long groupId, int status);

	/**
	* Returns the number of data collections where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public int countByStatus_G(long groupId, int status);

	/**
	* Returns all the data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status);

	/**
	* Returns a range of all the data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByStatus_G_U_PrevAndNext(long collectionId,
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_G_U(long groupId, long userId, int status);

	/**
	* Returns the number of data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public int countByStatus_G_U(long groupId, long userId, int status);

	/**
	* Returns all the data collections where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching data collections
	*/
	public java.util.List<DataCollection> findByTypeID(long typeId);

	/**
	* Returns a range of all the data collections where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of matching data collections
	*/
	public java.util.List<DataCollection> findByTypeID(long typeId, int start,
		int end);

	/**
	* Returns an ordered range of all the data collections where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByTypeID(long typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data collections
	*/
	public java.util.List<DataCollection> findByTypeID(long typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByTypeID_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the first data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByTypeID_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the last data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public DataCollection findByTypeID_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Returns the last data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public DataCollection fetchByTypeID_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns the data collections before and after the current data collection in the ordered set where typeId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection[] findByTypeID_PrevAndNext(long collectionId,
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator)
		throws NoSuchDataCollectionException;

	/**
	* Removes all the data collections where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public void removeByTypeID(long typeId);

	/**
	* Returns the number of data collections where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching data collections
	*/
	public int countByTypeID(long typeId);

	/**
	* Caches the data collection in the entity cache if it is enabled.
	*
	* @param dataCollection the data collection
	*/
	public void cacheResult(DataCollection dataCollection);

	/**
	* Caches the data collections in the entity cache if it is enabled.
	*
	* @param dataCollections the data collections
	*/
	public void cacheResult(java.util.List<DataCollection> dataCollections);

	/**
	* Creates a new data collection with the primary key. Does not add the data collection to the database.
	*
	* @param collectionId the primary key for the new data collection
	* @return the new data collection
	*/
	public DataCollection create(long collectionId);

	/**
	* Removes the data collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection that was removed
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection remove(long collectionId)
		throws NoSuchDataCollectionException;

	public DataCollection updateImpl(DataCollection dataCollection);

	/**
	* Returns the data collection with the primary key or throws a {@link NoSuchDataCollectionException} if it could not be found.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public DataCollection findByPrimaryKey(long collectionId)
		throws NoSuchDataCollectionException;

	/**
	* Returns the data collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection, or <code>null</code> if a data collection with the primary key could not be found
	*/
	public DataCollection fetchByPrimaryKey(long collectionId);

	@Override
	public java.util.Map<java.io.Serializable, DataCollection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the data collections.
	*
	* @return the data collections
	*/
	public java.util.List<DataCollection> findAll();

	/**
	* Returns a range of all the data collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @return the range of data collections
	*/
	public java.util.List<DataCollection> findAll(int start, int end);

	/**
	* Returns an ordered range of all the data collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data collections
	*/
	public java.util.List<DataCollection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator);

	/**
	* Returns an ordered range of all the data collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collections
	* @param end the upper bound of the range of data collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data collections
	*/
	public java.util.List<DataCollection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the data collections from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of data collections.
	*
	* @return the number of data collections
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}