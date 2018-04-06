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

package com.kisti.osp.spyglass.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ScienceAppManagerLocalService}.
 *
 * @author Jerry H. Seo
 * @see ScienceAppManagerLocalService
 * @generated
 */
@ProviderType
public class ScienceAppManagerLocalServiceWrapper
	implements ScienceAppManagerLocalService,
		ServiceWrapper<ScienceAppManagerLocalService> {
	public ScienceAppManagerLocalServiceWrapper(
		ScienceAppManagerLocalService scienceAppManagerLocalService) {
		_scienceAppManagerLocalService = scienceAppManagerLocalService;
	}

	/**
	* Adds the science app manager to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManager the science app manager
	* @return the science app manager that was added
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager addScienceAppManager(
		com.kisti.osp.spyglass.model.ScienceAppManager scienceAppManager) {
		return _scienceAppManagerLocalService.addScienceAppManager(scienceAppManager);
	}

	/**
	* Creates a new science app manager with the primary key. Does not add the science app manager to the database.
	*
	* @param scienceAppManagerId the primary key for the new science app manager
	* @return the new science app manager
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager createScienceAppManager(
		long scienceAppManagerId) {
		return _scienceAppManagerLocalService.createScienceAppManager(scienceAppManagerId);
	}

	/**
	* Deletes the science app manager from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManager the science app manager
	* @return the science app manager that was removed
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager deleteScienceAppManager(
		com.kisti.osp.spyglass.model.ScienceAppManager scienceAppManager) {
		return _scienceAppManagerLocalService.deleteScienceAppManager(scienceAppManager);
	}

	/**
	* Deletes the science app manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager that was removed
	* @throws PortalException if a science app manager with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager deleteScienceAppManager(
		long scienceAppManagerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppManagerLocalService.deleteScienceAppManager(scienceAppManagerId);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager fetchScienceAppManager(
		long scienceAppManagerId) {
		return _scienceAppManagerLocalService.fetchScienceAppManager(scienceAppManagerId);
	}

	/**
	* Returns the science app manager with the primary key.
	*
	* @param scienceAppManagerId the primary key of the science app manager
	* @return the science app manager
	* @throws PortalException if a science app manager with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager getScienceAppManager(
		long scienceAppManagerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppManagerLocalService.getScienceAppManager(scienceAppManagerId);
	}

	/**
	* Updates the science app manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceAppManager the science app manager
	* @return the science app manager that was updated
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppManager updateScienceAppManager(
		com.kisti.osp.spyglass.model.ScienceAppManager scienceAppManager) {
		return _scienceAppManagerLocalService.updateScienceAppManager(scienceAppManager);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _scienceAppManagerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _scienceAppManagerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _scienceAppManagerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppManagerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppManagerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of science app managers.
	*
	* @return the number of science app managers
	*/
	@Override
	public int getScienceAppManagersCount() {
		return _scienceAppManagerLocalService.getScienceAppManagersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _scienceAppManagerLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _scienceAppManagerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _scienceAppManagerLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _scienceAppManagerLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the science app managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app managers
	* @param end the upper bound of the range of science app managers (not inclusive)
	* @return the range of science app managers
	*/
	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceAppManager> getScienceAppManagers(
		int start, int end) {
		return _scienceAppManagerLocalService.getScienceAppManagers(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _scienceAppManagerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _scienceAppManagerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ScienceAppManagerLocalService getWrappedService() {
		return _scienceAppManagerLocalService;
	}

	@Override
	public void setWrappedService(
		ScienceAppManagerLocalService scienceAppManagerLocalService) {
		_scienceAppManagerLocalService = scienceAppManagerLocalService;
	}

	private ScienceAppManagerLocalService _scienceAppManagerLocalService;
}