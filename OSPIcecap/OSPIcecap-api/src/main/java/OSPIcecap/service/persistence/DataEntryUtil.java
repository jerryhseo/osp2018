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

import OSPIcecap.model.DataEntry;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data entry service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataEntryPersistence
 * @see OSPIcecap.service.persistence.impl.DataEntryPersistenceImpl
 * @generated
 */
@ProviderType
public class DataEntryUtil {
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
	public static void clearCache(DataEntry dataEntry) {
		getPersistence().clearCache(dataEntry);
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
	public static List<DataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataEntry> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataEntry update(DataEntry dataEntry) {
		return getPersistence().update(dataEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataEntry update(DataEntry dataEntry,
		ServiceContext serviceContext) {
		return getPersistence().update(dataEntry, serviceContext);
	}

	/**
	* Returns all the data entries where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @return the matching data entries
	*/
	public static List<DataEntry> findByCollectionID(long collectionId) {
		return getPersistence().findByCollectionID(collectionId);
	}

	/**
	* Returns a range of all the data entries where collectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collectionId the collection ID
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @return the range of matching data entries
	*/
	public static List<DataEntry> findByCollectionID(long collectionId,
		int start, int end) {
		return getPersistence().findByCollectionID(collectionId, start, end);
	}

	/**
	* Returns an ordered range of all the data entries where collectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collectionId the collection ID
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data entries
	*/
	public static List<DataEntry> findByCollectionID(long collectionId,
		int start, int end, OrderByComparator<DataEntry> orderByComparator) {
		return getPersistence()
				   .findByCollectionID(collectionId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the data entries where collectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param collectionId the collection ID
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data entries
	*/
	public static List<DataEntry> findByCollectionID(long collectionId,
		int start, int end, OrderByComparator<DataEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCollectionID(collectionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first data entry in the ordered set where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data entry
	* @throws NoSuchDataEntryException if a matching data entry could not be found
	*/
	public static DataEntry findByCollectionID_First(long collectionId,
		OrderByComparator<DataEntry> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataEntryException {
		return getPersistence()
				   .findByCollectionID_First(collectionId, orderByComparator);
	}

	/**
	* Returns the first data entry in the ordered set where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data entry, or <code>null</code> if a matching data entry could not be found
	*/
	public static DataEntry fetchByCollectionID_First(long collectionId,
		OrderByComparator<DataEntry> orderByComparator) {
		return getPersistence()
				   .fetchByCollectionID_First(collectionId, orderByComparator);
	}

	/**
	* Returns the last data entry in the ordered set where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data entry
	* @throws NoSuchDataEntryException if a matching data entry could not be found
	*/
	public static DataEntry findByCollectionID_Last(long collectionId,
		OrderByComparator<DataEntry> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataEntryException {
		return getPersistence()
				   .findByCollectionID_Last(collectionId, orderByComparator);
	}

	/**
	* Returns the last data entry in the ordered set where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data entry, or <code>null</code> if a matching data entry could not be found
	*/
	public static DataEntry fetchByCollectionID_Last(long collectionId,
		OrderByComparator<DataEntry> orderByComparator) {
		return getPersistence()
				   .fetchByCollectionID_Last(collectionId, orderByComparator);
	}

	/**
	* Returns the data entries before and after the current data entry in the ordered set where collectionId = &#63;.
	*
	* @param entryId the primary key of the current data entry
	* @param collectionId the collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data entry
	* @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	*/
	public static DataEntry[] findByCollectionID_PrevAndNext(long entryId,
		long collectionId, OrderByComparator<DataEntry> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataEntryException {
		return getPersistence()
				   .findByCollectionID_PrevAndNext(entryId, collectionId,
			orderByComparator);
	}

	/**
	* Removes all the data entries where collectionId = &#63; from the database.
	*
	* @param collectionId the collection ID
	*/
	public static void removeByCollectionID(long collectionId) {
		getPersistence().removeByCollectionID(collectionId);
	}

	/**
	* Returns the number of data entries where collectionId = &#63;.
	*
	* @param collectionId the collection ID
	* @return the number of matching data entries
	*/
	public static int countByCollectionID(long collectionId) {
		return getPersistence().countByCollectionID(collectionId);
	}

	/**
	* Caches the data entry in the entity cache if it is enabled.
	*
	* @param dataEntry the data entry
	*/
	public static void cacheResult(DataEntry dataEntry) {
		getPersistence().cacheResult(dataEntry);
	}

	/**
	* Caches the data entries in the entity cache if it is enabled.
	*
	* @param dataEntries the data entries
	*/
	public static void cacheResult(List<DataEntry> dataEntries) {
		getPersistence().cacheResult(dataEntries);
	}

	/**
	* Creates a new data entry with the primary key. Does not add the data entry to the database.
	*
	* @param entryId the primary key for the new data entry
	* @return the new data entry
	*/
	public static DataEntry create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the data entry
	* @return the data entry that was removed
	* @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	*/
	public static DataEntry remove(long entryId)
		throws OSPIcecap.exception.NoSuchDataEntryException {
		return getPersistence().remove(entryId);
	}

	public static DataEntry updateImpl(DataEntry dataEntry) {
		return getPersistence().updateImpl(dataEntry);
	}

	/**
	* Returns the data entry with the primary key or throws a {@link NoSuchDataEntryException} if it could not be found.
	*
	* @param entryId the primary key of the data entry
	* @return the data entry
	* @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	*/
	public static DataEntry findByPrimaryKey(long entryId)
		throws OSPIcecap.exception.NoSuchDataEntryException {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Returns the data entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the data entry
	* @return the data entry, or <code>null</code> if a data entry with the primary key could not be found
	*/
	public static DataEntry fetchByPrimaryKey(long entryId) {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	public static java.util.Map<java.io.Serializable, DataEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data entries.
	*
	* @return the data entries
	*/
	public static List<DataEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @return the range of data entries
	*/
	public static List<DataEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data entries
	*/
	public static List<DataEntry> findAll(int start, int end,
		OrderByComparator<DataEntry> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data entries
	* @param end the upper bound of the range of data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data entries
	*/
	public static List<DataEntry> findAll(int start, int end,
		OrderByComparator<DataEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data entries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data entries.
	*
	* @return the number of data entries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DataEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataEntryPersistence, DataEntryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataEntryPersistence.class);
}