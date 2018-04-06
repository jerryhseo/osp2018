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

package com.kisti.osp.icebug.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaperLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PaperLocalService
 * @generated
 */
@ProviderType
public class PaperLocalServiceWrapper implements PaperLocalService,
	ServiceWrapper<PaperLocalService> {
	public PaperLocalServiceWrapper(PaperLocalService paperLocalService) {
		_paperLocalService = paperLocalService;
	}

	/**
	* Adds the paper to the database. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was added
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper addPaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return _paperLocalService.addPaper(paper);
	}

	/**
	* Creates a new paper with the primary key. Does not add the paper to the database.
	*
	* @param paperId the primary key for the new paper
	* @return the new paper
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper createPaper(long paperId) {
		return _paperLocalService.createPaper(paperId);
	}

	/**
	* Deletes the paper from the database. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was removed
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper deletePaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return _paperLocalService.deletePaper(paper);
	}

	/**
	* Deletes the paper with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paperId the primary key of the paper
	* @return the paper that was removed
	* @throws PortalException if a paper with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper deletePaper(long paperId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paperLocalService.deletePaper(paperId);
	}

	@Override
	public com.kisti.osp.icebug.model.Paper fetchPaper(long paperId) {
		return _paperLocalService.fetchPaper(paperId);
	}

	/**
	* Returns the paper matching the UUID and group.
	*
	* @param uuid the paper's UUID
	* @param groupId the primary key of the group
	* @return the matching paper, or <code>null</code> if a matching paper could not be found
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper fetchPaperByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _paperLocalService.fetchPaperByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the paper with the primary key.
	*
	* @param paperId the primary key of the paper
	* @return the paper
	* @throws PortalException if a paper with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper getPaper(long paperId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paperLocalService.getPaper(paperId);
	}

	/**
	* Returns the paper matching the UUID and group.
	*
	* @param uuid the paper's UUID
	* @param groupId the primary key of the group
	* @return the matching paper
	* @throws PortalException if a matching paper could not be found
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper getPaperByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paperLocalService.getPaperByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the paper in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was updated
	*/
	@Override
	public com.kisti.osp.icebug.model.Paper updatePaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return _paperLocalService.updatePaper(paper);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _paperLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paperLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _paperLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _paperLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paperLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _paperLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of papers.
	*
	* @return the number of papers
	*/
	@Override
	public int getPapersCount() {
		return _paperLocalService.getPapersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _paperLocalService.getOSGiServiceIdentifier();
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
		return _paperLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebug.model.impl.PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paperLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebug.model.impl.PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paperLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the papers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebug.model.impl.PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @return the range of papers
	*/
	@Override
	public java.util.List<com.kisti.osp.icebug.model.Paper> getPapers(
		int start, int end) {
		return _paperLocalService.getPapers(start, end);
	}

	/**
	* Returns all the papers matching the UUID and company.
	*
	* @param uuid the UUID of the papers
	* @param companyId the primary key of the company
	* @return the matching papers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.icebug.model.Paper> getPapersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _paperLocalService.getPapersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of papers matching the UUID and company.
	*
	* @param uuid the UUID of the papers
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching papers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.icebug.model.Paper> getPapersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.icebug.model.Paper> orderByComparator) {
		return _paperLocalService.getPapersByUuidAndCompanyId(uuid, companyId,
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
		return _paperLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paperLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public PaperLocalService getWrappedService() {
		return _paperLocalService;
	}

	@Override
	public void setWrappedService(PaperLocalService paperLocalService) {
		_paperLocalService = paperLocalService;
	}

	private PaperLocalService _paperLocalService;
}