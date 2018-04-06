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

import OSPIcecap.exception.NoSuchDataTypeException;

import OSPIcecap.model.DataType;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the data type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.persistence.impl.DataTypePersistenceImpl
 * @see DataTypeUtil
 * @generated
 */
@ProviderType
public interface DataTypePersistence extends BasePersistence<DataType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DataTypeUtil} to access the data type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the data types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching data types
	*/
	public java.util.List<DataType> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the data types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the data types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where uuid = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByUuid_PrevAndNext(long typeId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of data types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching data types
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDataTypeException;

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the data type where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the data type that was removed
	*/
	public DataType removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDataTypeException;

	/**
	* Returns the number of data types where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching data types
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the data types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching data types
	*/
	public java.util.List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the data types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the data types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByUuid_C_PrevAndNext(long typeId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of data types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching data types
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the data types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching data types
	*/
	public java.util.List<DataType> findByGroupId(long groupId);

	/**
	* Returns a range of all the data types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the data types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByGroupId_PrevAndNext(long typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of data types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching data types
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the data types where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching data types
	*/
	public java.util.List<DataType> findByUserId(long userId);

	/**
	* Returns a range of all the data types where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByUserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the data types where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where userId = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByUserId_PrevAndNext(long typeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of data types where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching data types
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the data types where name = &#63;.
	*
	* @param name the name
	* @return the matching data types
	*/
	public java.util.List<DataType> findByName(java.lang.String name);

	/**
	* Returns a range of all the data types where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByName(java.lang.String name,
		int start, int end);

	/**
	* Returns an ordered range of all the data types where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where name = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByName_PrevAndNext(long typeId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of data types where name = &#63;.
	*
	* @param name the name
	* @return the number of matching data types
	*/
	public int countByName(java.lang.String name);

	/**
	* Returns all the data types where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the matching data types
	*/
	public java.util.List<DataType> findByName_U(long userId,
		java.lang.String name);

	/**
	* Returns a range of all the data types where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data types where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_U_First(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_U_First(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_U_Last(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_U_Last(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByName_U_PrevAndNext(long typeId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where userId = &#63; and name = &#63; from the database.
	*
	* @param userId the user ID
	* @param name the name
	*/
	public void removeByName_U(long userId, java.lang.String name);

	/**
	* Returns the number of data types where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data types
	*/
	public int countByName_U(long userId, java.lang.String name);

	/**
	* Returns all the data types where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching data types
	*/
	public java.util.List<DataType> findByName_G(long groupId,
		java.lang.String name);

	/**
	* Returns a range of all the data types where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_G_First(long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_G_First(long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_G_Last(long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_G_Last(long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByName_G_PrevAndNext(long typeId, long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public void removeByName_G(long groupId, java.lang.String name);

	/**
	* Returns the number of data types where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching data types
	*/
	public int countByName_G(long groupId, java.lang.String name);

	/**
	* Returns all the data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the matching data types
	*/
	public java.util.List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name);

	/**
	* Returns a range of all the data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_G_U_First(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_G_U_First(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByName_G_U_Last(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByName_G_U_Last(long groupId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByName_G_U_PrevAndNext(long typeId, long groupId,
		long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where groupId = &#63; and userId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	*/
	public void removeByName_G_U(long groupId, long userId,
		java.lang.String name);

	/**
	* Returns the number of data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data types
	*/
	public int countByName_G_U(long groupId, long userId, java.lang.String name);

	/**
	* Returns all the data types where status = &#63;.
	*
	* @param status the status
	* @return the matching data types
	*/
	public java.util.List<DataType> findByStatus(int status);

	/**
	* Returns a range of all the data types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByStatus(int status, int start, int end);

	/**
	* Returns an ordered range of all the data types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where status = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByStatus_PrevAndNext(long typeId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of data types where status = &#63;.
	*
	* @param status the status
	* @return the number of matching data types
	*/
	public int countByStatus(int status);

	/**
	* Returns all the data types where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching data types
	*/
	public java.util.List<DataType> findByStatus_U(long userId, int status);

	/**
	* Returns a range of all the data types where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByStatus_U(long userId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the data types where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_U(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_U(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_U_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_U_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByStatus_U_PrevAndNext(long typeId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_U(long userId, int status);

	/**
	* Returns the number of data types where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data types
	*/
	public int countByStatus_U(long userId, int status);

	/**
	* Returns all the data types where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching data types
	*/
	public java.util.List<DataType> findByStatus_G(long groupId, int status);

	/**
	* Returns a range of all the data types where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G(long groupId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_G_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_G_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByStatus_G_PrevAndNext(long typeId, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByStatus_G(long groupId, int status);

	/**
	* Returns the number of data types where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching data types
	*/
	public int countByStatus_G(long groupId, int status);

	/**
	* Returns all the data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching data types
	*/
	public java.util.List<DataType> findByStatus_G_U(long groupId, long userId,
		int status);

	/**
	* Returns a range of all the data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data types
	*/
	public java.util.List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_G_U_First(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByStatus_G_U_Last(long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType[] findByStatus_G_U_PrevAndNext(long typeId, long groupId,
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator)
		throws NoSuchDataTypeException;

	/**
	* Removes all the data types where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByStatus_G_U(long groupId, long userId, int status);

	/**
	* Returns the number of data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data types
	*/
	public int countByStatus_G_U(long groupId, long userId, int status);

	/**
	* Returns the data type where name = &#63; and version = &#63; or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param name the name
	* @param version the version
	* @return the matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public DataType findByNameVersion(java.lang.String name,
		java.lang.String version) throws NoSuchDataTypeException;

	/**
	* Returns the data type where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @param version the version
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Returns the data type where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public DataType fetchByNameVersion(java.lang.String name,
		java.lang.String version, boolean retrieveFromCache);

	/**
	* Removes the data type where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	* @return the data type that was removed
	*/
	public DataType removeByNameVersion(java.lang.String name,
		java.lang.String version) throws NoSuchDataTypeException;

	/**
	* Returns the number of data types where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching data types
	*/
	public int countByNameVersion(java.lang.String name,
		java.lang.String version);

	/**
	* Caches the data type in the entity cache if it is enabled.
	*
	* @param dataType the data type
	*/
	public void cacheResult(DataType dataType);

	/**
	* Caches the data types in the entity cache if it is enabled.
	*
	* @param dataTypes the data types
	*/
	public void cacheResult(java.util.List<DataType> dataTypes);

	/**
	* Creates a new data type with the primary key. Does not add the data type to the database.
	*
	* @param typeId the primary key for the new data type
	* @return the new data type
	*/
	public DataType create(long typeId);

	/**
	* Removes the data type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the data type
	* @return the data type that was removed
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType remove(long typeId) throws NoSuchDataTypeException;

	public DataType updateImpl(DataType dataType);

	/**
	* Returns the data type with the primary key or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param typeId the primary key of the data type
	* @return the data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public DataType findByPrimaryKey(long typeId)
		throws NoSuchDataTypeException;

	/**
	* Returns the data type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the data type
	* @return the data type, or <code>null</code> if a data type with the primary key could not be found
	*/
	public DataType fetchByPrimaryKey(long typeId);

	@Override
	public java.util.Map<java.io.Serializable, DataType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the data types.
	*
	* @return the data types
	*/
	public java.util.List<DataType> findAll();

	/**
	* Returns a range of all the data types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @return the range of data types
	*/
	public java.util.List<DataType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the data types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data types
	*/
	public java.util.List<DataType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator);

	/**
	* Returns an ordered range of all the data types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data types
	* @param end the upper bound of the range of data types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data types
	*/
	public java.util.List<DataType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the data types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of data types.
	*
	* @return the number of data types
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}