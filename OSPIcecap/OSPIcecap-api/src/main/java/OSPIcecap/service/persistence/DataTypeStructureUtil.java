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

import OSPIcecap.model.DataTypeStructure;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data type structure service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataTypeStructurePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeStructurePersistence
 * @see OSPIcecap.service.persistence.impl.DataTypeStructurePersistenceImpl
 * @generated
 */
@ProviderType
public class DataTypeStructureUtil {
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
	public static void clearCache(DataTypeStructure dataTypeStructure) {
		getPersistence().clearCache(dataTypeStructure);
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
	public static List<DataTypeStructure> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataTypeStructure> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataTypeStructure> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataTypeStructure> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataTypeStructure update(DataTypeStructure dataTypeStructure) {
		return getPersistence().update(dataTypeStructure);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataTypeStructure update(
		DataTypeStructure dataTypeStructure, ServiceContext serviceContext) {
		return getPersistence().update(dataTypeStructure, serviceContext);
	}

	/**
	* Caches the data type structure in the entity cache if it is enabled.
	*
	* @param dataTypeStructure the data type structure
	*/
	public static void cacheResult(DataTypeStructure dataTypeStructure) {
		getPersistence().cacheResult(dataTypeStructure);
	}

	/**
	* Caches the data type structures in the entity cache if it is enabled.
	*
	* @param dataTypeStructures the data type structures
	*/
	public static void cacheResult(List<DataTypeStructure> dataTypeStructures) {
		getPersistence().cacheResult(dataTypeStructures);
	}

	/**
	* Creates a new data type structure with the primary key. Does not add the data type structure to the database.
	*
	* @param typeId the primary key for the new data type structure
	* @return the new data type structure
	*/
	public static DataTypeStructure create(long typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the data type structure with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the data type structure
	* @return the data type structure that was removed
	* @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	*/
	public static DataTypeStructure remove(long typeId)
		throws OSPIcecap.exception.NoSuchDataTypeStructureException {
		return getPersistence().remove(typeId);
	}

	public static DataTypeStructure updateImpl(
		DataTypeStructure dataTypeStructure) {
		return getPersistence().updateImpl(dataTypeStructure);
	}

	/**
	* Returns the data type structure with the primary key or throws a {@link NoSuchDataTypeStructureException} if it could not be found.
	*
	* @param typeId the primary key of the data type structure
	* @return the data type structure
	* @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	*/
	public static DataTypeStructure findByPrimaryKey(long typeId)
		throws OSPIcecap.exception.NoSuchDataTypeStructureException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Returns the data type structure with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the data type structure
	* @return the data type structure, or <code>null</code> if a data type structure with the primary key could not be found
	*/
	public static DataTypeStructure fetchByPrimaryKey(long typeId) {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	public static java.util.Map<java.io.Serializable, DataTypeStructure> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data type structures.
	*
	* @return the data type structures
	*/
	public static List<DataTypeStructure> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the data type structures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type structures
	* @param end the upper bound of the range of data type structures (not inclusive)
	* @return the range of data type structures
	*/
	public static List<DataTypeStructure> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the data type structures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type structures
	* @param end the upper bound of the range of data type structures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data type structures
	*/
	public static List<DataTypeStructure> findAll(int start, int end,
		OrderByComparator<DataTypeStructure> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data type structures.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type structures
	* @param end the upper bound of the range of data type structures (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data type structures
	*/
	public static List<DataTypeStructure> findAll(int start, int end,
		OrderByComparator<DataTypeStructure> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data type structures from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data type structures.
	*
	* @return the number of data type structures
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DataTypeStructurePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypeStructurePersistence, DataTypeStructurePersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataTypeStructurePersistence.class);
}