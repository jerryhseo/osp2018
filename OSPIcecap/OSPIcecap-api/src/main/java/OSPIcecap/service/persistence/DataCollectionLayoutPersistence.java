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

import OSPIcecap.exception.NoSuchDataCollectionLayoutException;

import OSPIcecap.model.DataCollectionLayout;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the data collection layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.persistence.impl.DataCollectionLayoutPersistenceImpl
 * @see DataCollectionLayoutUtil
 * @generated
 */
@ProviderType
public interface DataCollectionLayoutPersistence extends BasePersistence<DataCollectionLayout> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DataCollectionLayoutUtil} to access the data collection layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the data collection layout in the entity cache if it is enabled.
	*
	* @param dataCollectionLayout the data collection layout
	*/
	public void cacheResult(DataCollectionLayout dataCollectionLayout);

	/**
	* Caches the data collection layouts in the entity cache if it is enabled.
	*
	* @param dataCollectionLayouts the data collection layouts
	*/
	public void cacheResult(
		java.util.List<DataCollectionLayout> dataCollectionLayouts);

	/**
	* Creates a new data collection layout with the primary key. Does not add the data collection layout to the database.
	*
	* @param collectionId the primary key for the new data collection layout
	* @return the new data collection layout
	*/
	public DataCollectionLayout create(long collectionId);

	/**
	* Removes the data collection layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout that was removed
	* @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	*/
	public DataCollectionLayout remove(long collectionId)
		throws NoSuchDataCollectionLayoutException;

	public DataCollectionLayout updateImpl(
		DataCollectionLayout dataCollectionLayout);

	/**
	* Returns the data collection layout with the primary key or throws a {@link NoSuchDataCollectionLayoutException} if it could not be found.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout
	* @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	*/
	public DataCollectionLayout findByPrimaryKey(long collectionId)
		throws NoSuchDataCollectionLayoutException;

	/**
	* Returns the data collection layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param collectionId the primary key of the data collection layout
	* @return the data collection layout, or <code>null</code> if a data collection layout with the primary key could not be found
	*/
	public DataCollectionLayout fetchByPrimaryKey(long collectionId);

	@Override
	public java.util.Map<java.io.Serializable, DataCollectionLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the data collection layouts.
	*
	* @return the data collection layouts
	*/
	public java.util.List<DataCollectionLayout> findAll();

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
	public java.util.List<DataCollectionLayout> findAll(int start, int end);

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
	public java.util.List<DataCollectionLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollectionLayout> orderByComparator);

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
	public java.util.List<DataCollectionLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DataCollectionLayout> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the data collection layouts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of data collection layouts.
	*
	* @return the number of data collection layouts
	*/
	public int countAll();
}