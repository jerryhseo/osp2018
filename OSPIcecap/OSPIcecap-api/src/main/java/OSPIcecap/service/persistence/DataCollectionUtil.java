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

import OSPIcecap.model.DataCollection;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data collection service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataCollectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataCollectionPersistence
 * @see OSPIcecap.service.persistence.impl.DataCollectionPersistenceImpl
 * @generated
 */
@ProviderType
public class DataCollectionUtil {
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
	public static void clearCache(DataCollection dataCollection) {
		getPersistence().clearCache(dataCollection);
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
	public static List<DataCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataCollection update(DataCollection dataCollection) {
		return getPersistence().update(dataCollection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataCollection update(DataCollection dataCollection,
		ServiceContext serviceContext) {
		return getPersistence().update(dataCollection, serviceContext);
	}

	/**
	* Returns all the data collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching data collections
	*/
	public static List<DataCollection> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUuid_First(java.lang.String uuid,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUuid_Last(java.lang.String uuid,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where uuid = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByUuid_PrevAndNext(long collectionId,
		java.lang.String uuid,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(collectionId, uuid, orderByComparator);
	}

	/**
	* Removes all the data collections where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of data collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching data collections
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDataCollectionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUUID_G(java.lang.String uuid,
		long groupId) throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the data collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the data collection where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the data collection that was removed
	*/
	public static DataCollection removeByUUID_G(java.lang.String uuid,
		long groupId) throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of data collections where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching data collections
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the data collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching data collections
	*/
	public static List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static DataCollection[] findByUuid_C_PrevAndNext(long collectionId,
		java.lang.String uuid, long companyId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(collectionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the data collections where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of data collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching data collections
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the data collections where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching data collections
	*/
	public static List<DataCollection> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

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
	public static List<DataCollection> findByUserId(long userId, int start,
		int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static List<DataCollection> findByUserId(long userId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByUserId(long userId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUserId_First(long userId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUserId_First(long userId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByUserId_Last(long userId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByUserId_Last(long userId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where userId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByUserId_PrevAndNext(long collectionId,
		long userId, OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByUserId_PrevAndNext(collectionId, userId,
			orderByComparator);
	}

	/**
	* Removes all the data collections where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of data collections where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching data collections
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the data collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching data collections
	*/
	public static List<DataCollection> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<DataCollection> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<DataCollection> findByGroupId(long groupId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByGroupId(long groupId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByGroupId_First(long groupId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByGroupId_First(long groupId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByGroupId_Last(long groupId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByGroupId_Last(long groupId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where groupId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByGroupId_PrevAndNext(
		long collectionId, long groupId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(collectionId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the data collections where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of data collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching data collections
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the data collections where name = &#63;.
	*
	* @param name the name
	* @return the matching data collections
	*/
	public static List<DataCollection> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

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
	public static List<DataCollection> findByName(java.lang.String name,
		int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

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
	public static List<DataCollection> findByName(java.lang.String name,
		int start, int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByName(java.lang.String name,
		int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_First(java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_First(java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_Last(java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_Last(java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where name = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByName_PrevAndNext(long collectionId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_PrevAndNext(collectionId, name, orderByComparator);
	}

	/**
	* Removes all the data collections where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of data collections where name = &#63;.
	*
	* @param name the name
	* @return the number of matching data collections
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Returns all the data collections where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the matching data collections
	*/
	public static List<DataCollection> findByName_U(long userId,
		java.lang.String name) {
		return getPersistence().findByName_U(userId, name);
	}

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
	public static List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByName_U(userId, name, start, end);
	}

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
	public static List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByName_U(userId, name, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByName_U(long userId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_U(userId, name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_U_First(long userId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_U_First(userId, name, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_U_First(long userId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_U_First(userId, name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_U_Last(long userId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_U_Last(userId, name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_U_Last(long userId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_U_Last(userId, name, orderByComparator);
	}

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
	public static DataCollection[] findByName_U_PrevAndNext(long collectionId,
		long userId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_U_PrevAndNext(collectionId, userId, name,
			orderByComparator);
	}

	/**
	* Removes all the data collections where userId = &#63; and name = &#63; from the database.
	*
	* @param userId the user ID
	* @param name the name
	*/
	public static void removeByName_U(long userId, java.lang.String name) {
		getPersistence().removeByName_U(userId, name);
	}

	/**
	* Returns the number of data collections where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public static int countByName_U(long userId, java.lang.String name) {
		return getPersistence().countByName_U(userId, name);
	}

	/**
	* Returns all the data collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching data collections
	*/
	public static List<DataCollection> findByName_G(long groupId,
		java.lang.String name) {
		return getPersistence().findByName_G(groupId, name);
	}

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
	public static List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByName_G(groupId, name, start, end);
	}

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
	public static List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByName_G(groupId, name, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByName_G(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_G(groupId, name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_G_First(long groupId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_G_First(long groupId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByName_G_Last(long groupId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_G_Last(long groupId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_Last(groupId, name, orderByComparator);
	}

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
	public static DataCollection[] findByName_G_PrevAndNext(long collectionId,
		long groupId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_PrevAndNext(collectionId, groupId, name,
			orderByComparator);
	}

	/**
	* Removes all the data collections where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public static void removeByName_G(long groupId, java.lang.String name) {
		getPersistence().removeByName_G(groupId, name);
	}

	/**
	* Returns the number of data collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public static int countByName_G(long groupId, java.lang.String name) {
		return getPersistence().countByName_G(groupId, name);
	}

	/**
	* Returns all the data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the matching data collections
	*/
	public static List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name) {
		return getPersistence().findByName_G_U(groupId, userId, name);
	}

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
	public static List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end) {
		return getPersistence().findByName_G_U(groupId, userId, name, start, end);
	}

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
	public static List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByName_G_U(groupId, userId, name, start, end,
			orderByComparator);
	}

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
	public static List<DataCollection> findByName_G_U(long groupId,
		long userId, java.lang.String name, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName_G_U(groupId, userId, name, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static DataCollection findByName_G_U_First(long groupId,
		long userId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_U_First(groupId, userId, name,
			orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_G_U_First(long groupId,
		long userId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_U_First(groupId, userId, name,
			orderByComparator);
	}

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
	public static DataCollection findByName_G_U_Last(long groupId, long userId,
		java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_U_Last(groupId, userId, name, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByName_G_U_Last(long groupId,
		long userId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByName_G_U_Last(groupId, userId, name,
			orderByComparator);
	}

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
	public static DataCollection[] findByName_G_U_PrevAndNext(
		long collectionId, long groupId, long userId, java.lang.String name,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByName_G_U_PrevAndNext(collectionId, groupId, userId,
			name, orderByComparator);
	}

	/**
	* Removes all the data collections where groupId = &#63; and userId = &#63; and name = &#63; from the database.
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
	* Returns the number of data collections where groupId = &#63; and userId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param name the name
	* @return the number of matching data collections
	*/
	public static int countByName_G_U(long groupId, long userId,
		java.lang.String name) {
		return getPersistence().countByName_G_U(groupId, userId, name);
	}

	/**
	* Returns all the data collections where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the matching data collections
	*/
	public static List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version) {
		return getPersistence().findByNameVersion(name, version);
	}

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
	public static List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end) {
		return getPersistence().findByNameVersion(name, version, start, end);
	}

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
	public static List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByNameVersion(name, version, start, end,
			orderByComparator);
	}

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
	public static List<DataCollection> findByNameVersion(
		java.lang.String name, java.lang.String version, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByNameVersion(name, version, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByNameVersion_First(
		java.lang.String name, java.lang.String version,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByNameVersion_First(name, version, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByNameVersion_First(
		java.lang.String name, java.lang.String version,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByNameVersion_First(name, version, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByNameVersion_Last(java.lang.String name,
		java.lang.String version,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByNameVersion_Last(name, version, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByNameVersion_Last(
		java.lang.String name, java.lang.String version,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByNameVersion_Last(name, version, orderByComparator);
	}

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
	public static DataCollection[] findByNameVersion_PrevAndNext(
		long collectionId, java.lang.String name, java.lang.String version,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByNameVersion_PrevAndNext(collectionId, name, version,
			orderByComparator);
	}

	/**
	* Removes all the data collections where name = &#63; and version = &#63; from the database.
	*
	* @param name the name
	* @param version the version
	*/
	public static void removeByNameVersion(java.lang.String name,
		java.lang.String version) {
		getPersistence().removeByNameVersion(name, version);
	}

	/**
	* Returns the number of data collections where name = &#63; and version = &#63;.
	*
	* @param name the name
	* @param version the version
	* @return the number of matching data collections
	*/
	public static int countByNameVersion(java.lang.String name,
		java.lang.String version) {
		return getPersistence().countByNameVersion(name, version);
	}

	/**
	* Returns all the data collections where status = &#63;.
	*
	* @param status the status
	* @return the matching data collections
	*/
	public static List<DataCollection> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

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
	public static List<DataCollection> findByStatus(int status, int start,
		int end) {
		return getPersistence().findByStatus(status, start, end);
	}

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
	public static List<DataCollection> findByStatus(int status, int start,
		int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByStatus(int status, int start,
		int end, OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_First(int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_First(int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_Last(int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_Last(int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where status = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByStatus_PrevAndNext(long collectionId,
		int status, OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_PrevAndNext(collectionId, status,
			orderByComparator);
	}

	/**
	* Removes all the data collections where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of data collections where status = &#63;.
	*
	* @param status the status
	* @return the number of matching data collections
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the data collections where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching data collections
	*/
	public static List<DataCollection> findByStatus_U(long userId, int status) {
		return getPersistence().findByStatus_U(userId, status);
	}

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
	public static List<DataCollection> findByStatus_U(long userId, int status,
		int start, int end) {
		return getPersistence().findByStatus_U(userId, status, start, end);
	}

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
	public static List<DataCollection> findByStatus_U(long userId, int status,
		int start, int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByStatus_U(long userId, int status,
		int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_U(userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_U_First(long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_U_First(long userId, int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_U_Last(long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_U_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_U_Last(long userId, int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_U_Last(userId, status, orderByComparator);
	}

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
	public static DataCollection[] findByStatus_U_PrevAndNext(
		long collectionId, long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_U_PrevAndNext(collectionId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the data collections where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_U(long userId, int status) {
		getPersistence().removeByStatus_U(userId, status);
	}

	/**
	* Returns the number of data collections where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public static int countByStatus_U(long userId, int status) {
		return getPersistence().countByStatus_U(userId, status);
	}

	/**
	* Returns all the data collections where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching data collections
	*/
	public static List<DataCollection> findByStatus_G(long groupId, int status) {
		return getPersistence().findByStatus_G(groupId, status);
	}

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
	public static List<DataCollection> findByStatus_G(long groupId, int status,
		int start, int end) {
		return getPersistence().findByStatus_G(groupId, status, start, end);
	}

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
	public static List<DataCollection> findByStatus_G(long groupId, int status,
		int start, int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator);
	}

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
	public static List<DataCollection> findByStatus_G(long groupId, int status,
		int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G(groupId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_G_First(long groupId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_G_First(long groupId,
		int status, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByStatus_G_Last(long groupId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_G_Last(long groupId, int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_Last(groupId, status, orderByComparator);
	}

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
	public static DataCollection[] findByStatus_G_PrevAndNext(
		long collectionId, long groupId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_PrevAndNext(collectionId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the data collections where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByStatus_G(long groupId, int status) {
		getPersistence().removeByStatus_G(groupId, status);
	}

	/**
	* Returns the number of data collections where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public static int countByStatus_G(long groupId, int status) {
		return getPersistence().countByStatus_G(groupId, status);
	}

	/**
	* Returns all the data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching data collections
	*/
	public static List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status) {
		return getPersistence().findByStatus_G_U(groupId, userId, status);
	}

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
	public static List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end);
	}

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
	public static List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator);
	}

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
	public static List<DataCollection> findByStatus_G_U(long groupId,
		long userId, int status, int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static DataCollection findByStatus_G_U_First(long groupId,
		long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_G_U_First(long groupId,
		long userId, int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_First(groupId, userId, status,
			orderByComparator);
	}

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
	public static DataCollection findByStatus_G_U_Last(long groupId,
		long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByStatus_G_U_Last(long groupId,
		long userId, int status,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_G_U_Last(groupId, userId, status,
			orderByComparator);
	}

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
	public static DataCollection[] findByStatus_G_U_PrevAndNext(
		long collectionId, long groupId, long userId, int status,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByStatus_G_U_PrevAndNext(collectionId, groupId, userId,
			status, orderByComparator);
	}

	/**
	* Removes all the data collections where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByStatus_G_U(long groupId, long userId, int status) {
		getPersistence().removeByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns the number of data collections where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching data collections
	*/
	public static int countByStatus_G_U(long groupId, long userId, int status) {
		return getPersistence().countByStatus_G_U(groupId, userId, status);
	}

	/**
	* Returns all the data collections where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching data collections
	*/
	public static List<DataCollection> findByTypeID(long typeId) {
		return getPersistence().findByTypeID(typeId);
	}

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
	public static List<DataCollection> findByTypeID(long typeId, int start,
		int end) {
		return getPersistence().findByTypeID(typeId, start, end);
	}

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
	public static List<DataCollection> findByTypeID(long typeId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence()
				   .findByTypeID(typeId, start, end, orderByComparator);
	}

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
	public static List<DataCollection> findByTypeID(long typeId, int start,
		int end, OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTypeID(typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByTypeID_First(long typeId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByTypeID_First(typeId, orderByComparator);
	}

	/**
	* Returns the first data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByTypeID_First(long typeId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByTypeID_First(typeId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection
	* @throws NoSuchDataCollectionException if a matching data collection could not be found
	*/
	public static DataCollection findByTypeID_Last(long typeId,
		OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByTypeID_Last(typeId, orderByComparator);
	}

	/**
	* Returns the last data collection in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data collection, or <code>null</code> if a matching data collection could not be found
	*/
	public static DataCollection fetchByTypeID_Last(long typeId,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().fetchByTypeID_Last(typeId, orderByComparator);
	}

	/**
	* Returns the data collections before and after the current data collection in the ordered set where typeId = &#63;.
	*
	* @param collectionId the primary key of the current data collection
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection[] findByTypeID_PrevAndNext(long collectionId,
		long typeId, OrderByComparator<DataCollection> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence()
				   .findByTypeID_PrevAndNext(collectionId, typeId,
			orderByComparator);
	}

	/**
	* Removes all the data collections where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public static void removeByTypeID(long typeId) {
		getPersistence().removeByTypeID(typeId);
	}

	/**
	* Returns the number of data collections where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching data collections
	*/
	public static int countByTypeID(long typeId) {
		return getPersistence().countByTypeID(typeId);
	}

	/**
	* Caches the data collection in the entity cache if it is enabled.
	*
	* @param dataCollection the data collection
	*/
	public static void cacheResult(DataCollection dataCollection) {
		getPersistence().cacheResult(dataCollection);
	}

	/**
	* Caches the data collections in the entity cache if it is enabled.
	*
	* @param dataCollections the data collections
	*/
	public static void cacheResult(List<DataCollection> dataCollections) {
		getPersistence().cacheResult(dataCollections);
	}

	/**
	* Creates a new data collection with the primary key. Does not add the data collection to the database.
	*
	* @param collectionId the primary key for the new data collection
	* @return the new data collection
	*/
	public static DataCollection create(long collectionId) {
		return getPersistence().create(collectionId);
	}

	/**
	* Removes the data collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection that was removed
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection remove(long collectionId)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().remove(collectionId);
	}

	public static DataCollection updateImpl(DataCollection dataCollection) {
		return getPersistence().updateImpl(dataCollection);
	}

	/**
	* Returns the data collection with the primary key or throws a {@link NoSuchDataCollectionException} if it could not be found.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection
	* @throws NoSuchDataCollectionException if a data collection with the primary key could not be found
	*/
	public static DataCollection findByPrimaryKey(long collectionId)
		throws OSPIcecap.exception.NoSuchDataCollectionException {
		return getPersistence().findByPrimaryKey(collectionId);
	}

	/**
	* Returns the data collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param collectionId the primary key of the data collection
	* @return the data collection, or <code>null</code> if a data collection with the primary key could not be found
	*/
	public static DataCollection fetchByPrimaryKey(long collectionId) {
		return getPersistence().fetchByPrimaryKey(collectionId);
	}

	public static java.util.Map<java.io.Serializable, DataCollection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data collections.
	*
	* @return the data collections
	*/
	public static List<DataCollection> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<DataCollection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<DataCollection> findAll(int start, int end,
		OrderByComparator<DataCollection> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<DataCollection> findAll(int start, int end,
		OrderByComparator<DataCollection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data collections from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data collections.
	*
	* @return the number of data collections
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DataCollectionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataCollectionPersistence, DataCollectionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataCollectionPersistence.class);
}