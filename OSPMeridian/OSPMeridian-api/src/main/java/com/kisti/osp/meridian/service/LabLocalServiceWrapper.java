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

package com.kisti.osp.meridian.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LabLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LabLocalService
 * @generated
 */
@ProviderType
public class LabLocalServiceWrapper implements LabLocalService,
	ServiceWrapper<LabLocalService> {
	public LabLocalServiceWrapper(LabLocalService labLocalService) {
		_labLocalService = labLocalService;
	}

	/**
	* Adds the lab to the database. Also notifies the appropriate model listeners.
	*
	* @param lab the lab
	* @return the lab that was added
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab addLab(
		com.kisti.osp.meridian.model.Lab lab) {
		return _labLocalService.addLab(lab);
	}

	/**
	* Creates a new lab with the primary key. Does not add the lab to the database.
	*
	* @param labId the primary key for the new lab
	* @return the new lab
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab createLab(long labId) {
		return _labLocalService.createLab(labId);
	}

	/**
	* Deletes the lab from the database. Also notifies the appropriate model listeners.
	*
	* @param lab the lab
	* @return the lab that was removed
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab deleteLab(
		com.kisti.osp.meridian.model.Lab lab) {
		return _labLocalService.deleteLab(lab);
	}

	/**
	* Deletes the lab with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param labId the primary key of the lab
	* @return the lab that was removed
	* @throws PortalException if a lab with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab deleteLab(long labId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _labLocalService.deleteLab(labId);
	}

	@Override
	public com.kisti.osp.meridian.model.Lab fetchLab(long labId) {
		return _labLocalService.fetchLab(labId);
	}

	/**
	* Returns the lab matching the UUID and group.
	*
	* @param uuid the lab's UUID
	* @param groupId the primary key of the group
	* @return the matching lab, or <code>null</code> if a matching lab could not be found
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab fetchLabByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _labLocalService.fetchLabByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the lab with the primary key.
	*
	* @param labId the primary key of the lab
	* @return the lab
	* @throws PortalException if a lab with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab getLab(long labId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _labLocalService.getLab(labId);
	}

	/**
	* Returns the lab matching the UUID and group.
	*
	* @param uuid the lab's UUID
	* @param groupId the primary key of the group
	* @return the matching lab
	* @throws PortalException if a matching lab could not be found
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab getLabByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _labLocalService.getLabByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the lab in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lab the lab
	* @return the lab that was updated
	*/
	@Override
	public com.kisti.osp.meridian.model.Lab updateLab(
		com.kisti.osp.meridian.model.Lab lab) {
		return _labLocalService.updateLab(lab);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _labLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _labLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _labLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _labLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _labLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _labLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of labs.
	*
	* @return the number of labs
	*/
	@Override
	public int getLabsCount() {
		return _labLocalService.getLabsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _labLocalService.getOSGiServiceIdentifier();
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
		return _labLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.meridian.model.impl.LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _labLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.meridian.model.impl.LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _labLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the labs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.meridian.model.impl.LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @return the range of labs
	*/
	@Override
	public java.util.List<com.kisti.osp.meridian.model.Lab> getLabs(int start,
		int end) {
		return _labLocalService.getLabs(start, end);
	}

	/**
	* Returns all the labs matching the UUID and company.
	*
	* @param uuid the UUID of the labs
	* @param companyId the primary key of the company
	* @return the matching labs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.meridian.model.Lab> getLabsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _labLocalService.getLabsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of labs matching the UUID and company.
	*
	* @param uuid the UUID of the labs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching labs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.meridian.model.Lab> getLabsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.meridian.model.Lab> orderByComparator) {
		return _labLocalService.getLabsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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
		return _labLocalService.dynamicQueryCount(dynamicQuery);
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
		return _labLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public LabLocalService getWrappedService() {
		return _labLocalService;
	}

	@Override
	public void setWrappedService(LabLocalService labLocalService) {
		_labLocalService = labLocalService;
	}

	private LabLocalService _labLocalService;
}