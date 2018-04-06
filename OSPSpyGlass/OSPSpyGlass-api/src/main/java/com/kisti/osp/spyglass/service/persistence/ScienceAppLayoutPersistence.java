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

package com.kisti.osp.spyglass.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.spyglass.exception.NoSuchScienceAppLayoutException;
import com.kisti.osp.spyglass.model.ScienceAppLayout;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the science app layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppLayoutPersistenceImpl
 * @see ScienceAppLayoutUtil
 * @generated
 */
@ProviderType
public interface ScienceAppLayoutPersistence extends BasePersistence<ScienceAppLayout> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppLayoutUtil} to access the science app layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the science app layout in the entity cache if it is enabled.
	*
	* @param scienceAppLayout the science app layout
	*/
	public void cacheResult(ScienceAppLayout scienceAppLayout);

	/**
	* Caches the science app layouts in the entity cache if it is enabled.
	*
	* @param scienceAppLayouts the science app layouts
	*/
	public void cacheResult(java.util.List<ScienceAppLayout> scienceAppLayouts);

	/**
	* Creates a new science app layout with the primary key. Does not add the science app layout to the database.
	*
	* @param scienceAppId the primary key for the new science app layout
	* @return the new science app layout
	*/
	public ScienceAppLayout create(long scienceAppId);

	/**
	* Removes the science app layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout that was removed
	* @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	*/
	public ScienceAppLayout remove(long scienceAppId)
		throws NoSuchScienceAppLayoutException;

	public ScienceAppLayout updateImpl(ScienceAppLayout scienceAppLayout);

	/**
	* Returns the science app layout with the primary key or throws a {@link NoSuchScienceAppLayoutException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout
	* @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	*/
	public ScienceAppLayout findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppLayoutException;

	/**
	* Returns the science app layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout, or <code>null</code> if a science app layout with the primary key could not be found
	*/
	public ScienceAppLayout fetchByPrimaryKey(long scienceAppId);

	@Override
	public java.util.Map<java.io.Serializable, ScienceAppLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the science app layouts.
	*
	* @return the science app layouts
	*/
	public java.util.List<ScienceAppLayout> findAll();

	/**
	* Returns a range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @return the range of science app layouts
	*/
	public java.util.List<ScienceAppLayout> findAll(int start, int end);

	/**
	* Returns an ordered range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app layouts
	*/
	public java.util.List<ScienceAppLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppLayout> orderByComparator);

	/**
	* Returns an ordered range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app layouts
	*/
	public java.util.List<ScienceAppLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppLayout> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the science app layouts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of science app layouts.
	*
	* @return the number of science app layouts
	*/
	public int countAll();
}