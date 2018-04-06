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
 * Provides a wrapper for {@link ScienceAppLayoutLocalService}.
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayoutLocalService
 * @generated
 */
@ProviderType
public class ScienceAppLayoutLocalServiceWrapper
	implements ScienceAppLayoutLocalService,
		ServiceWrapper<ScienceAppLayoutLocalService> {
	public ScienceAppLayoutLocalServiceWrapper(
		ScienceAppLayoutLocalService scienceAppLayoutLocalService) {
		_scienceAppLayoutLocalService = scienceAppLayoutLocalService;
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout addLayout(
		long scienceAppId, java.lang.String strLayout) {
		return _scienceAppLayoutLocalService.addLayout(scienceAppId, strLayout);
	}

	/**
	* Adds the science app layout to the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppLayout the science app layout
	* @return the science app layout that was added
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout addScienceAppLayout(
		com.kisti.osp.spyglass.model.ScienceAppLayout scienceAppLayout) {
		return _scienceAppLayoutLocalService.addScienceAppLayout(scienceAppLayout);
	}

	/**
	* Creates a new science app layout with the primary key. Does not add the science app layout to the database.
	*
	* @param scienceAppId the primary key for the new science app layout
	* @return the new science app layout
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout createScienceAppLayout(
		long scienceAppId) {
		return _scienceAppLayoutLocalService.createScienceAppLayout(scienceAppId);
	}

	/**
	* Deletes the science app layout from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppLayout the science app layout
	* @return the science app layout that was removed
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout deleteScienceAppLayout(
		com.kisti.osp.spyglass.model.ScienceAppLayout scienceAppLayout) {
		return _scienceAppLayoutLocalService.deleteScienceAppLayout(scienceAppLayout);
	}

	/**
	* Deletes the science app layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout that was removed
	* @throws PortalException if a science app layout with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout deleteScienceAppLayout(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLayoutLocalService.deleteScienceAppLayout(scienceAppId);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout fetchScienceAppLayout(
		long scienceAppId) {
		return _scienceAppLayoutLocalService.fetchScienceAppLayout(scienceAppId);
	}

	/**
	* Returns the science app layout with the primary key.
	*
	* @param scienceAppId the primary key of the science app layout
	* @return the science app layout
	* @throws PortalException if a science app layout with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout getScienceAppLayout(
		long scienceAppId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLayoutLocalService.getScienceAppLayout(scienceAppId);
	}

	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout updateLayout(
		long scienceAppId, java.lang.String strLayout)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLayoutLocalService.updateLayout(scienceAppId,
			strLayout);
	}

	/**
	* Updates the science app layout in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param scienceAppLayout the science app layout
	* @return the science app layout that was updated
	*/
	@Override
	public com.kisti.osp.spyglass.model.ScienceAppLayout updateScienceAppLayout(
		com.kisti.osp.spyglass.model.ScienceAppLayout scienceAppLayout) {
		return _scienceAppLayoutLocalService.updateScienceAppLayout(scienceAppLayout);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _scienceAppLayoutLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _scienceAppLayoutLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _scienceAppLayoutLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLayoutLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _scienceAppLayoutLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of science app layouts.
	*
	* @return the number of science app layouts
	*/
	@Override
	public int getScienceAppLayoutsCount() {
		return _scienceAppLayoutLocalService.getScienceAppLayoutsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _scienceAppLayoutLocalService.getOSGiServiceIdentifier();
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
		return _scienceAppLayoutLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _scienceAppLayoutLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _scienceAppLayoutLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the science app layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.spyglass.model.impl.ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of science app layouts
	* @param end the upper bound of the range of science app layouts (not inclusive)
	* @return the range of science app layouts
	*/
	@Override
	public java.util.List<com.kisti.osp.spyglass.model.ScienceAppLayout> getScienceAppLayouts(
		int start, int end) {
		return _scienceAppLayoutLocalService.getScienceAppLayouts(start, end);
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
		return _scienceAppLayoutLocalService.dynamicQueryCount(dynamicQuery);
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
		return _scienceAppLayoutLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ScienceAppLayoutLocalService getWrappedService() {
		return _scienceAppLayoutLocalService;
	}

	@Override
	public void setWrappedService(
		ScienceAppLayoutLocalService scienceAppLayoutLocalService) {
		_scienceAppLayoutLocalService = scienceAppLayoutLocalService;
	}

	private ScienceAppLayoutLocalService _scienceAppLayoutLocalService;
}