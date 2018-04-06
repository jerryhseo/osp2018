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

import OSPIcecap.model.DataCollectionLayout;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data collection layout service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataCollectionLayoutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataCollectionLayoutPersistence
 * @see OSPIcecap.service.persistence.impl.DataCollectionLayoutPersistenceImpl
 * @generated
 */
@ProviderType
public class DataCollectionLayoutUtil {
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
	public static void clearCache(DataCollectionLayout dataCollectionLayout) {
		getPersistence().clearCache(dataCollectionLayout);
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
	public static List<DataCollectionLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataCollectionLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataCollectionLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataCollectionLayout> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataCollectionLayout update(
		DataCollectionLayout dataCollectionLayout) {
		return getPersistence().update(dataCollectionLayout);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataCollectionLayout update(
		DataCollectionLayout dataCollectionLayout, ServiceContext serviceContext) {
		return getPersistence().update(dataCollectionLayout, serviceContext);
	}

	/**
	* Caches the data collection layout in the entity cache if it is enabled.
	*
	* @param dataCollectionLayout the data collection layout
	*/
	public static void cacheResult(DataCollectionLayout dataCollectionLayout) {
		getPersistence().cacheResult(dataCollectionLayout);
	}

	/**
	* Caches the data collection layouts in the entity cache if it is enabled.
	*
	* @param dataCollectionLayouts the data collection layouts
	*/
	public static void cacheResult(
		List<DataCollectionLayout> dataCollectionLayouts) {
		getPersistence().cacheResult(dataCollectionLayouts);
	}

	/**
	* Creates a new data collection layout with the primary key. Does not add the data collection layout to the database.
	*
	* @param collectionId the primary key for the new data collection layout
	* @return the new data collection layout
	*/
	public static DataCollectionLayout create(long collectionId) {
		return getPersistence().create(collectionId);
	}

	/**
	* Removes the data collection layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout that was removed
	* @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	*/
	public static DataCollectionLayout remove(long collectionId)
		throws OSPIcecap.exception.NoSuchDataCollectionLayoutException {
		return getPersistence().remove(collectionId);
	}

	public static DataCollectionLayout updateImpl(
		DataCollectionLayout dataCollectionLayout) {
		return getPersistence().updateImpl(dataCollectionLayout);
	}

	/**
	* Returns the data collection layout with the primary key or throws a {@link NoSuchDataCollectionLayoutException} if it could not be found.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout
	* @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	*/
	public static DataCollectionLayout findByPrimaryKey(long collectionId)
		throws OSPIcecap.exception.NoSuchDataCollectionLayoutException {
		return getPersistence().findByPrimaryKey(collectionId);
	}

	/**
	* Returns the data collection layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout, or <code>null</code> if a data collection layout with the primary key could not be found
	*/
	public static DataCollectionLayout fetchByPrimaryKey(long collectionId) {
		return getPersistence().fetchByPrimaryKey(collectionId);
	}

	public static java.util.Map<java.io.Serializable, DataCollectionLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data collection layouts.
	*
	* @return the data collection layouts
	*/
	public static List<DataCollectionLayout> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the data collection layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collection layouts
	* @param end the upper bound of the range of data collection layouts (not inclusive)
	* @return the range of data collection layouts
	*/
	public static List<DataCollectionLayout> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the data collection layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collection layouts
	* @param end the upper bound of the range of data collection layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data collection layouts
	*/
	public static List<DataCollectionLayout> findAll(int start, int end,
		OrderByComparator<DataCollectionLayout> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data collection layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data collection layouts
	* @param end the upper bound of the range of data collection layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data collection layouts
	*/
	public static List<DataCollectionLayout> findAll(int start, int end,
		OrderByComparator<DataCollectionLayout> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data collection layouts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data collection layouts.
	*
	* @return the number of data collection layouts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DataCollectionLayoutPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataCollectionLayoutPersistence, DataCollectionLayoutPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataCollectionLayoutPersistence.class);
}