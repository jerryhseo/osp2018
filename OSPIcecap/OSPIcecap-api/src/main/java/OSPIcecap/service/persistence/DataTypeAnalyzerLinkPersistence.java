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

import OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException;

import OSPIcecap.model.DataTypeAnalyzerLink;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the data type analyzer link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.persistence.impl.DataTypeAnalyzerLinkPersistenceImpl
 * @see DataTypeAnalyzerLinkUtil
 * @generated
 */
@ProviderType
public interface DataTypeAnalyzerLinkPersistence extends BasePersistence<DataTypeAnalyzerLink> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DataTypeAnalyzerLinkUtil} to access the data type analyzer link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the data type analyzer links where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @return the matching data type analyzer links
	*/
	public java.util.List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId);

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
	public java.util.List<DataTypeAnalyzerLink> findByAnalyzer(
		long analyzerId, int start, int end);

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
	public java.util.List<DataTypeAnalyzerLink> findByAnalyzer(
		long analyzerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

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
	public java.util.List<DataTypeAnalyzerLink> findByAnalyzer(
		long analyzerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink findByAnalyzer_First(long analyzerId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink fetchByAnalyzer_First(long analyzerId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

	/**
	* Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink findByAnalyzer_Last(long analyzerId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink fetchByAnalyzer_Last(long analyzerId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

	/**
	* Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where analyzerId = &#63;.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	* @param analyzerId the analyzer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public DataTypeAnalyzerLink[] findByAnalyzer_PrevAndNext(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK,
		long analyzerId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Removes all the data type analyzer links where analyzerId = &#63; from the database.
	*
	* @param analyzerId the analyzer ID
	*/
	public void removeByAnalyzer(long analyzerId);

	/**
	* Returns the number of data type analyzer links where analyzerId = &#63;.
	*
	* @param analyzerId the analyzer ID
	* @return the number of matching data type analyzer links
	*/
	public int countByAnalyzer(long analyzerId);

	/**
	* Returns all the data type analyzer links where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching data type analyzer links
	*/
	public java.util.List<DataTypeAnalyzerLink> findByTypeID(long typeId);

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
	public java.util.List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end);

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
	public java.util.List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

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
	public java.util.List<DataTypeAnalyzerLink> findByTypeID(long typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink findByTypeID_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink fetchByTypeID_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

	/**
	* Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink findByTypeID_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	*/
	public DataTypeAnalyzerLink fetchByTypeID_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

	/**
	* Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where typeId = &#63;.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public DataTypeAnalyzerLink[] findByTypeID_PrevAndNext(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK,
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Removes all the data type analyzer links where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public void removeByTypeID(long typeId);

	/**
	* Returns the number of data type analyzer links where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching data type analyzer links
	*/
	public int countByTypeID(long typeId);

	/**
	* Caches the data type analyzer link in the entity cache if it is enabled.
	*
	* @param dataTypeAnalyzerLink the data type analyzer link
	*/
	public void cacheResult(DataTypeAnalyzerLink dataTypeAnalyzerLink);

	/**
	* Caches the data type analyzer links in the entity cache if it is enabled.
	*
	* @param dataTypeAnalyzerLinks the data type analyzer links
	*/
	public void cacheResult(
		java.util.List<DataTypeAnalyzerLink> dataTypeAnalyzerLinks);

	/**
	* Creates a new data type analyzer link with the primary key. Does not add the data type analyzer link to the database.
	*
	* @param dataTypeAnalyzerLinkPK the primary key for the new data type analyzer link
	* @return the new data type analyzer link
	*/
	public DataTypeAnalyzerLink create(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK);

	/**
	* Removes the data type analyzer link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link that was removed
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public DataTypeAnalyzerLink remove(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws NoSuchDataTypeAnalyzerLinkException;

	public DataTypeAnalyzerLink updateImpl(
		DataTypeAnalyzerLink dataTypeAnalyzerLink);

	/**
	* Returns the data type analyzer link with the primary key or throws a {@link NoSuchDataTypeAnalyzerLinkException} if it could not be found.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link
	* @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	*/
	public DataTypeAnalyzerLink findByPrimaryKey(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws NoSuchDataTypeAnalyzerLinkException;

	/**
	* Returns the data type analyzer link with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	* @return the data type analyzer link, or <code>null</code> if a data type analyzer link with the primary key could not be found
	*/
	public DataTypeAnalyzerLink fetchByPrimaryKey(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK);

	@Override
	public java.util.Map<java.io.Serializable, DataTypeAnalyzerLink> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the data type analyzer links.
	*
	* @return the data type analyzer links
	*/
	public java.util.List<DataTypeAnalyzerLink> findAll();

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
	public java.util.List<DataTypeAnalyzerLink> findAll(int start, int end);

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
	public java.util.List<DataTypeAnalyzerLink> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator);

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
	public java.util.List<DataTypeAnalyzerLink> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the data type analyzer links from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of data type analyzer links.
	*
	* @return the number of data type analyzer links
	*/
	public int countAll();
}