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

import OSPIcecap.model.DataTypeAnalyzerLink;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the data type analyzer link service. This utility wraps {@link OSPIcecap.service.persistence.impl.DataTypeAnalyzerLinkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLinkPersistence
 * @see OSPIcecap.service.persistence.impl.DataTypeAnalyzerLinkPersistenceImpl
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkUtil {
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
	public static void clearCache(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		getPersistence().clearCache(dataTypeAnalyzerLink);
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
	public static List<DataTypeAnalyzerLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DataTypeAnalyzerLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DataTypeAnalyzerLink> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DataTypeAnalyzerLink update(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return getPersistence().update(dataTypeAnalyzerLink);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DataTypeAnalyzerLink update(
		DataTypeAnalyzerLink dataTypeAnalyzerLink, ServiceContext serviceContext) {
		return getPersistence().update(dataTypeAnalyzerLink, serviceContext);
	}

	/**
	* Returns all the data type analyzer links where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @return the matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId) {
		return getPersistence().findByAnalyzer(analyzerId);
	}

	/**
	* Returns a range of all the data type analyzer links where analyzerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param analyzerId the analyzer ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @return the range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end) {
		return getPersistence().findByAnalyzer(analyzerId, start, end);
	}

	/**
	* Returns an ordered range of all the data type analyzer links where analyzerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param analyzerId the analyzer ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence()
				   .findByAnalyzer(analyzerId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data type analyzer links where analyzerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param analyzerId the analyzer ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAnalyzer(analyzerId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink findByAnalyzer_First(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence()
				   .findByAnalyzer_First(analyzerId, orderByComparator);
	}

	/**
	* Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink fetchByAnalyzer_First(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence()
				   .fetchByAnalyzer_First(analyzerId, orderByComparator);
	}

	/**
	* Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink findByAnalyzer_Last(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence()
				   .findByAnalyzer_Last(analyzerId, orderByComparator);
	}

	/**
	* Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink fetchByAnalyzer_Last(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence()
				   .fetchByAnalyzer_Last(analyzerId, orderByComparator);
	}

	/**
	* Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public static DataTypeAnalyzerLink[] findByAnalyzer_PrevAndNext(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK,
		long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence()
				   .findByAnalyzer_PrevAndNext(dataTypeAnalyzerLinkPK,
			analyzerId, orderByComparator);
	}

	/**
	* Removes all the data type analyzer links where analyzerId = &#63; from the database.
	*
	* @param analyzerId the analyzer ID
	*/
	public static void removeByAnalyzer(long analyzerId) {
		getPersistence().removeByAnalyzer(analyzerId);
	}

	/**
	* Returns the number of data type analyzer links where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @return the number of matching data type analyzer links
	*/
	public static int countByAnalyzer(long analyzerId) {
		return getPersistence().countByAnalyzer(analyzerId);
	}

	/**
	* Returns all the data type analyzer links where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByTypeID(long typeId) {
		return getPersistence().findByTypeID(typeId);
	}

	/**
	* Returns a range of all the data type analyzer links where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @return the range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end) {
		return getPersistence().findByTypeID(typeId, start, end);
	}

	/**
	* Returns an ordered range of all the data type analyzer links where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence()
				   .findByTypeID(typeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data type analyzer links where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTypeID(typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink findByTypeID_First(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence().findByTypeID_First(typeId, orderByComparator);
	}

	/**
	* Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink fetchByTypeID_First(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence().fetchByTypeID_First(typeId, orderByComparator);
	}

	/**
	* Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink findByTypeID_Last(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence().findByTypeID_Last(typeId, orderByComparator);
	}

	/**
	* Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public static DataTypeAnalyzerLink fetchByTypeID_Last(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence().fetchByTypeID_Last(typeId, orderByComparator);
	}

	/**
	* Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public static DataTypeAnalyzerLink[] findByTypeID_PrevAndNext(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK,
		long typeId, OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence()
				   .findByTypeID_PrevAndNext(dataTypeAnalyzerLinkPK, typeId,
			orderByComparator);
	}

	/**
	* Removes all the data type analyzer links where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public static void removeByTypeID(long typeId) {
		getPersistence().removeByTypeID(typeId);
	}

	/**
	* Returns the number of data type analyzer links where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching data type analyzer links
	*/
	public static int countByTypeID(long typeId) {
		return getPersistence().countByTypeID(typeId);
	}

	/**
	* Caches the data type analyzer link in the entity cache if it is enabled.
	*
	* @param dataTypeAnalyzerLink the data type analyzer link
	*/
	public static void cacheResult(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		getPersistence().cacheResult(dataTypeAnalyzerLink);
	}

	/**
	* Caches the data type analyzer links in the entity cache if it is enabled.
	*
	* @param dataTypeAnalyzerLinks the data type analyzer links
	*/
	public static void cacheResult(
		List<DataTypeAnalyzerLink> dataTypeAnalyzerLinks) {
		getPersistence().cacheResult(dataTypeAnalyzerLinks);
	}

	/**
	* Creates a new data type analyzer link with the primary key. Does not add the data type analyzer link to the database.
	*
	* @param dataTypeAnalyzerLinkPK the primary key for the new data type analyzer link
	* @return the new data type analyzer link
	*/
	public static DataTypeAnalyzerLink create(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		return getPersistence().create(dataTypeAnalyzerLinkPK);
	}

	/**
	* Removes the data type analyzer link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link that was removed
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public static DataTypeAnalyzerLink remove(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence().remove(dataTypeAnalyzerLinkPK);
	}

	public static DataTypeAnalyzerLink updateImpl(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return getPersistence().updateImpl(dataTypeAnalyzerLink);
	}

	/**
	* Returns the data type analyzer link with the primary key or throws a {@link NoSuchDataTypeAnalyzerLinkException} if it could not be found.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public static DataTypeAnalyzerLink findByPrimaryKey(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException {
		return getPersistence().findByPrimaryKey(dataTypeAnalyzerLinkPK);
	}

	/**
	* Returns the data type analyzer link with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link, or <code>null</code> if a data type analyzer link with the primary key could not be found
	*/
	public static DataTypeAnalyzerLink fetchByPrimaryKey(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		return getPersistence().fetchByPrimaryKey(dataTypeAnalyzerLinkPK);
	}

	public static java.util.Map<java.io.Serializable, DataTypeAnalyzerLink> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the data type analyzer links.
	*
	* @return the data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the data type analyzer links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @return the range of data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the data type analyzer links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findAll(int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the data type analyzer links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data type analyzer links
	* @param end the upper bound of the range of data type analyzer links (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of data type analyzer links
	*/
	public static List<DataTypeAnalyzerLink> findAll(int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the data type analyzer links from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of data type analyzer links.
	*
	* @return the number of data type analyzer links
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DataTypeAnalyzerLinkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataTypeAnalyzerLinkPersistence, DataTypeAnalyzerLinkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DataTypeAnalyzerLinkPersistence.class);
}