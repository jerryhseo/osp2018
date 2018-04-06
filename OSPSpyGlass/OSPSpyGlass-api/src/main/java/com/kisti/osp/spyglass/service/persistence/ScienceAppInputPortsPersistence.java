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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppInputPortsException;
import com.kisti.osp.spyglass.model.ScienceAppInputPorts;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the science app input ports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.spyglass.service.persistence.impl.ScienceAppInputPortsPersistenceImpl
 * @see ScienceAppInputPortsUtil
 * @generated
 */
@ProviderType
public interface ScienceAppInputPortsPersistence extends BasePersistence<ScienceAppInputPorts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppInputPortsUtil} to access the science app input ports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the science app input ports in the entity cache if it is enabled.
	*
	* @param scienceAppInputPorts the science app input ports
	*/
	public void cacheResult(ScienceAppInputPorts scienceAppInputPorts);

	/**
	* Caches the science app input portses in the entity cache if it is enabled.
	*
	* @param scienceAppInputPortses the science app input portses
	*/
	public void cacheResult(
		java.util.List<ScienceAppInputPorts> scienceAppInputPortses);

	/**
	* Creates a new science app input ports with the primary key. Does not add the science app input ports to the database.
	*
	* @param scienceAppId the primary key for the new science app input ports
	* @return the new science app input ports
	*/
	public ScienceAppInputPorts create(long scienceAppId);

	/**
	* Removes the science app input ports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app input ports
	* @return the science app input ports that was removed
	* @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	*/
	public ScienceAppInputPorts remove(long scienceAppId)
		throws NoSuchScienceAppInputPortsException;

	public ScienceAppInputPorts updateImpl(
		ScienceAppInputPorts scienceAppInputPorts);

	/**
	* Returns the science app input ports with the primary key or throws a {@link NoSuchScienceAppInputPortsException} if it could not be found.
	*
	* @param scienceAppId the primary key of the science app input ports
	* @return the science app input ports
	* @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	*/
	public ScienceAppInputPorts findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppInputPortsException;

	/**
	* Returns the science app input ports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scienceAppId the primary key of the science app input ports
	* @return the science app input ports, or <code>null</code> if a science app input ports with the primary key could not be found
	*/
	public ScienceAppInputPorts fetchByPrimaryKey(long scienceAppId);

	@Override
	public java.util.Map<java.io.Serializable, ScienceAppInputPorts> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the science app input portses.
	*
	* @return the science app input portses
	*/
	public java.util.List<ScienceAppInputPorts> findAll();

	/**
	* Returns a range of all the science app input portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app input portses
	* @param end the upper bound of the range of science app input portses (not inclusive)
	* @return the range of science app input portses
	*/
	public java.util.List<ScienceAppInputPorts> findAll(int start, int end);

	/**
	* Returns an ordered range of all the science app input portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app input portses
	* @param end the upper bound of the range of science app input portses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of science app input portses
	*/
	public java.util.List<ScienceAppInputPorts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppInputPorts> orderByComparator);

	/**
	* Returns an ordered range of all the science app input portses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app input portses
	* @param end the upper bound of the range of science app input portses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of science app input portses
	*/
	public java.util.List<ScienceAppInputPorts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceAppInputPorts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the science app input portses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of science app input portses.
	*
	* @return the number of science app input portses
	*/
	public int countAll();
}