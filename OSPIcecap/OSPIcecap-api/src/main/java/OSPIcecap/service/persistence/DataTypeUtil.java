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

import OSPIcecap.model.DataType;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data type service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypePersistence
 * @see OSPIcecap.service.persistence.impl.DataTypePersistenceImpl
 * @generated
 */
@ProviderType
public class DataTypeUtil {
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
	public static void clearCache(DataType dataType) {
		getPersistence().clearCache(dataType);
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
	public static List<DataType> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataType update(DataType dataType) {
		return getPersistence().update(dataType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataType update(DataType dataType,
		ServiceContext serviceContext) {
		return getPersistence().update(dataType, serviceContext);
	}

	/**
	* Returns all the data types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching data types
	*/
	public static List<DataType> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<DataType> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<DataType> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<DataType> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<DataType> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUuid_First(java.lang.String uuid,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUuid_Last(java.lang.String uuid,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the data types before and after the current data type in the ordered set where uuid = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType[] findByUuid_PrevAndNext(long typeId,
		java.lang.String uuid, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByUuid_PrevAndNext(typeId, uuid, orderByComparator);
	}

	/**
	* Removes all the data types where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of data types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching data types
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUUID_G(java.lang.String uuid, long groupId)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the data type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the data type where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the data type that was removed
	*/
	public static DataType removeByUUID_G(java.lang.String uuid, long groupId)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of data types where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching data types
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the data types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching data types
	*/
	public static List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<DataType> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static DataType[] findByUuid_C_PrevAndNext(long typeId,
		java.lang.String uuid, long companyId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(typeId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the data types where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of data types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching data types
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the data types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching data types
	*/
	public static List<DataType> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<DataType> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<DataType> findByGroupId(long groupId, int start,
		int end, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<DataType> findByGroupId(long groupId, int start,
		int end, OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByGroupId_First(long groupId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByGroupId_First(long groupId,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByGroupId_Last(long groupId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByGroupId_Last(long groupId,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the data types before and after the current data type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType[] findByGroupId_PrevAndNext(long typeId,
		long groupId, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(typeId, groupId, orderByComparator);
	}

	/**
	* Removes all the data types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of data types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching data types
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the data types where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching data types
	*/
	public static List<DataType> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<DataType> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<DataType> findByUserId(long userId, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<DataType> findByUserId(long userId, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUserId_First(long userId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUserId_First(long userId,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByUserId_Last(long userId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByUserId_Last(long userId,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the data types before and after the current data type in the ordered set where userId = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType[] findByUserId_PrevAndNext(long typeId, long userId,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByUserId_PrevAndNext(typeId, userId, orderByComparator);
	}

	/**
	* Removes all the data types where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of data types where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching data types
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the data types where name = &#63;.
	*
	* @param name the name
	* @return the matching data types
	*/
	public static List<DataType> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

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
	public static List<DataType> findByName(java.lang.String name, int start,
		int end) {
		return getPersistence().findByName(name, start, end);
	}

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
	public static List<DataType> findByName(java.lang.String name, int start,
		int end, OrderByComparator<DataType> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

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
	public static List<DataType> findByName(java.lang.String name, int start,
		int end, OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_First(java.lang.String name,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_First(java.lang.String name,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_Last(java.lang.String name,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_Last(java.lang.String name,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the data types before and after the current data type in the ordered set where name = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType[] findByName_PrevAndNext(long typeId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_PrevAndNext(typeId, name, orderByComparator);
	}

	/**
	* Removes all the data types where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of data types where name = &#63;.
	*
	* @param name the name
	* @return the number of matching data types
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Returns all the data types where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the matching data types
	*/
	public static List<DataType> findByName_U(long userId, java.lang.String name) {
		return getPersistence().findByName_U(userId, name);
	}

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
	public static List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByName_U(userId, name, start, end);
	}

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
	public static List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByName_U(userId, name, start, end, orderByComparator);
	}

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
	public static List<DataType> findByName_U(long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_U(userId, name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_U_First(long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_U_First(userId, name, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_U_First(long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_U_First(userId, name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_U_Last(long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_U_Last(userId, name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_U_Last(long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_U_Last(userId, name, orderByComparator);
	}

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
	public static DataType[] findByName_U_PrevAndNext(long typeId, long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_U_PrevAndNext(typeId, userId, name,
			orderByComparator);
	}

	/**
	* Removes all the data types where userId = &#63; and name = &#63; from the database.
	*
	* @param userId the user ID
	* @param name the name
	*/
	public static void removeByName_U(long userId, java.lang.String name) {
		getPersistence().removeByName_U(userId, name);
	}

	/**
	* Returns the number of data types where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data types
	*/
	public static int countByName_U(long userId, java.lang.String name) {
		return getPersistence().countByName_U(userId, name);
	}

	/**
	* Returns all the data types where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching data types
	*/
	public static List<DataType> findByName_G(long groupId,
		java.lang.String name) {
		return getPersistence().findByName_G(groupId, name);
	}

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
	public static List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByName_G(groupId, name, start, end);
	}

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
	public static List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByName_G(groupId, name, start, end, orderByComparator);
	}

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
	public static List<DataType> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_G(groupId, name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_G_First(long groupId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_G_First(long groupId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByName_G_Last(long groupId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_G_Last(long groupId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_Last(groupId, name, orderByComparator);
	}

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
	public static DataType[] findByName_G_PrevAndNext(long typeId,
		long groupId, java.lang.String name,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_PrevAndNext(typeId, groupId, name,
			orderByComparator);
	}

	/**
	* Removes all the data types where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public static void removeByName_G(long groupId, java.lang.String name) {
		getPersistence().removeByName_G(groupId, name);
	}

	/**
	* Returns the number of data types where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching data types
	*/
	public static int countByName_G(long groupId, java.lang.String name) {
		return getPersistence().countByName_G(groupId, name);
	}

	/**
	* Returns all the data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the matching data types
	*/
	public static List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name) {
		return getPersistence().findByName_G_U(groupId, userId, name);
	}

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
	public static List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByName_G_U(groupId, userId, name, start, end);
	}

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
	public static List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByName_G_U(groupId, userId, name, start, end,
			orderByComparator);
	}

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
	public static List<DataType> findByName_G_U(long groupId, long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_G_U(groupId, userId, name, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static DataType findByName_G_U_First(long groupId, long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_U_First(groupId, userId, name,
			orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_G_U_First(long groupId, long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_U_First(groupId, userId, name,
			orderByComparator);
	}

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
	public static DataType findByName_G_U_Last(long groupId, long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_U_Last(groupId, userId, name, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByName_G_U_Last(long groupId, long userId,
		java.lang.String name, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_U_Last(groupId, userId, name,
			orderByComparator);
	}

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
	public static DataType[] findByName_G_U_PrevAndNext(long typeId,
		long groupId, long userId, java.lang.String name,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByName_G_U_PrevAndNext(typeId, groupId, userId, name,
			orderByComparator);
	}

	/**
	* Removes all the data types where groupId = &#63; and userId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	*/
	public static void removeByName_G_U(long groupId, long userId,
		java.lang.String name) {
		getPersistence().removeByName_G_U(groupId, userId, name);
	}

	/**
	* Returns the number of data types where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data types
	*/
	public static int countByName_G_U(long groupId, long userId,
		java.lang.String name) {
		return getPersistence().countByName_G_U(groupId, userId, name);
	}

	/**
	* Returns all the data types where status = &#63;.
	*
	* @param status the status
	* @return the matching data types
	*/
	public static List<DataType> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

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
	public static List<DataType> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

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
	public static List<DataType> findByStatus(int status, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

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
	public static List<DataType> findByStatus(int status, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_First(int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_First(int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_Last(int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_Last(int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the data types before and after the current data type in the ordered set where status = &#63;.
	*
	* @param typeId the primary key of the current data type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType[] findByStatus_PrevAndNext(long typeId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_PrevAndNext(typeId, status, orderByComparator);
	}

	/**
	* Removes all the data types where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of data types where status = &#63;.
	*
	* @param status the status
	* @return the number of matching data types
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the data types where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching data types
	*/
	public static List<DataType> findByStatus_U(long userId, int status) {
		return getPersistence().findByStatus_U(userId, status);
	}

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
	public static List<DataType> findByStatus_U(long userId, int status,
		int start, int end) {
		return getPersistence().findByStatus_U(userId, status, start, end);
	}

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
	public static List<DataType> findByStatus_U(long userId, int status,
		int start, int end, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end, orderByComparator);
	}

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
	public static List<DataType> findByStatus_U(long userId, int status,
		int start, int end, OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_U_First(long userId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_U_First(long userId, int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_U_Last(long userId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_U_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_U_Last(long userId, int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_Last(userId, status, orderByComparator);
	}

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
	public static DataType[] findByStatus_U_PrevAndNext(long typeId,
		long userId, int status, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_U_PrevAndNext(typeId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the data types where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_U(long userId, int status) {
		getPersistence().removeByStatus_U(userId, status);
	}

	/**
	* Returns the number of data types where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data types
	*/
	public static int countByStatus_U(long userId, int status) {
		return getPersistence().countByStatus_U(userId, status);
	}

	/**
	* Returns all the data types where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching data types
	*/
	public static List<DataType> findByStatus_G(long groupId, int status) {
		return getPersistence().findByStatus_G(groupId, status);
	}

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
	public static List<DataType> findByStatus_G(long groupId, int status,
		int start, int end) {
		return getPersistence().findByStatus_G(groupId, status, start, end);
	}

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
	public static List<DataType> findByStatus_G(long groupId, int status,
		int start, int end, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator);
	}

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
	public static List<DataType> findByStatus_G(long groupId, int status,
		int start, int end, OrderByComparator<DataType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_G_First(long groupId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_G_First(long groupId, int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByStatus_G_Last(long groupId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_G_Last(long groupId, int status,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_Last(groupId, status, orderByComparator);
	}

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
	public static DataType[] findByStatus_G_PrevAndNext(long typeId,
		long groupId, int status, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_PrevAndNext(typeId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the data types where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByStatus_G(long groupId, int status) {
		getPersistence().removeByStatus_G(groupId, status);
	}

	/**
	* Returns the number of data types where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching data types
	*/
	public static int countByStatus_G(long groupId, int status) {
		return getPersistence().countByStatus_G(groupId, status);
	}

	/**
	* Returns all the data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching data types
	*/
	public static List<DataType> findByStatus_G_U(long groupId, long userId,
		int status) {
		return getPersistence().findByStatus_G_U(groupId, userId, status);
	}

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
	public static List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end);
	}

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
	public static List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator);
	}

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
	public static List<DataType> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static DataType findByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the first data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

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
	public static DataType findByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last data type in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<DataType> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

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
	public static DataType[] findByStatus_G_U_PrevAndNext(long typeId,
		long groupId, long userId, int status,
		OrderByComparator<DataType> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence()
				   .findByStatus_G_U_PrevAndNext(typeId, groupId, userId,
			status, orderByComparator);
	}

	/**
	* Removes all the data types where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_G_U(long groupId, long userId, int status) {
		getPersistence().removeByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns the number of data types where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data types
	*/
	public static int countByStatus_G_U(long groupId, long userId, int status) {
		return getPersistence().countByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns the data type where name = &#63; and version = &#63; or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param name the name
	* @param version the version
	* @return the matching data type
	* @throws NoSuchDataTypeException if a matching data type could not be found
	*/
	public static DataType findByNameVersion(java.lang.String name,
		java.lang.String version)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByNameVersion(name, version);
	}

	/**
	* Returns the data type where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @param version the version
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByNameVersion(java.lang.String name,
		java.lang.String version) {
		return getPersistence().fetchByNameVersion(name, version);
	}

	/**
	* Returns the data type where name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data type, or <code>null</code> if a matching data type could not be found
	*/
	public static DataType fetchByNameVersion(java.lang.String name,
		java.lang.String version, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByNameVersion(name, version, retrieveFromCache);
	}

	/**
	* Removes the data type where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	* @return the data type that was removed
	*/
	public static DataType removeByNameVersion(java.lang.String name,
		java.lang.String version)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().removeByNameVersion(name, version);
	}

	/**
	* Returns the number of data types where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching data types
	*/
	public static int countByNameVersion(java.lang.String name,
		java.lang.String version) {
		return getPersistence().countByNameVersion(name, version);
	}

	/**
	* Caches the data type in the entity cache if it is enabled.
	*
	* @param dataType the data type
	*/
	public static void cacheResult(DataType dataType) {
		getPersistence().cacheResult(dataType);
	}

	/**
	* Caches the data types in the entity cache if it is enabled.
	*
	* @param dataTypes the data types
	*/
	public static void cacheResult(List<DataType> dataTypes) {
		getPersistence().cacheResult(dataTypes);
	}

	/**
	* Creates a new data type with the primary key. Does not add the data type to the database.
	*
	* @param typeId the primary key for the new data type
	* @return the new data type
	*/
	public static DataType create(long typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the data type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the data type
	* @return the data type that was removed
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType remove(long typeId)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().remove(typeId);
	}

	public static DataType updateImpl(DataType dataType) {
		return getPersistence().updateImpl(dataType);
	}

	/**
	* Returns the data type with the primary key or throws a {@link NoSuchDataTypeException} if it could not be found.
	*
	* @param typeId the primary key of the data type
	* @return the data type
	* @throws NoSuchDataTypeException if a data type with the primary key could not be found
	*/
	public static DataType findByPrimaryKey(long typeId)
		throws OSPIcecap.exception.NoSuchDataTypeException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Returns the data type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the data type
	* @return the data type, or <code>null</code> if a data type with the primary key could not be found
	*/
	public static DataType fetchByPrimaryKey(long typeId) {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	public static java.util.Map<java.io.Serializable, DataType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data types.
	*
	* @return the data types
	*/
	public static List<DataType> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<DataType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<DataType> findAll(int start, int end,
		OrderByComparator<DataType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<DataType> findAll(int start, int end,
		OrderByComparator<DataType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data types.
	*
	* @return the number of data types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DataTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypePersistence, DataTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataTypePersistence.class);
}