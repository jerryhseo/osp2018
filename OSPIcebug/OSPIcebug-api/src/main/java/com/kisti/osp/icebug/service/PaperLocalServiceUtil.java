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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Paper. This utility wraps
 * {@link com.kisti.osp.icebug.service.impl.PaperLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PaperLocalService
 * @see com.kisti.osp.icebug.service.base.PaperLocalServiceBaseImpl
 * @see com.kisti.osp.icebug.service.impl.PaperLocalServiceImpl
 * @generated
 */
@ProviderType
public class PaperLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.icebug.service.impl.PaperLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the paper to the database. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was added
	*/
	public static com.kisti.osp.icebug.model.Paper addPaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return getService().addPaper(paper);
	}

	/**
	* Creates a new paper with the primary key. Does not add the paper to the database.
	*
	* @param paperId the primary key for the new paper
	* @return the new paper
	*/
	public static com.kisti.osp.icebug.model.Paper createPaper(long paperId) {
		return getService().createPaper(paperId);
	}

	/**
	* Deletes the paper from the database. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was removed
	*/
	public static com.kisti.osp.icebug.model.Paper deletePaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return getService().deletePaper(paper);
	}

	/**
	* Deletes the paper with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paperId the primary key of the paper
	* @return the paper that was removed
	* @throws PortalException if a paper with the primary key could not be found
	*/
	public static com.kisti.osp.icebug.model.Paper deletePaper(long paperId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePaper(paperId);
	}

	public static com.kisti.osp.icebug.model.Paper fetchPaper(long paperId) {
		return getService().fetchPaper(paperId);
	}

	/**
	* Returns the paper matching the UUID and group.
	*
	* @param uuid the paper's UUID
	* @param groupId the primary key of the group
	* @return the matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public static com.kisti.osp.icebug.model.Paper fetchPaperByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchPaperByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the paper with the primary key.
	*
	* @param paperId the primary key of the paper
	* @return the paper
	* @throws PortalException if a paper with the primary key could not be found
	*/
	public static com.kisti.osp.icebug.model.Paper getPaper(long paperId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPaper(paperId);
	}

	/**
	* Returns the paper matching the UUID and group.
	*
	* @param uuid the paper's UUID
	* @param groupId the primary key of the group
	* @return the matching paper
	* @throws PortalException if a matching paper could not be found
	*/
	public static com.kisti.osp.icebug.model.Paper getPaperByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPaperByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the paper in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paper the paper
	* @return the paper that was updated
	*/
	public static com.kisti.osp.icebug.model.Paper updatePaper(
		com.kisti.osp.icebug.model.Paper paper) {
		return getService().updatePaper(paper);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of papers.
	*
	* @return the number of papers
	*/
	public static int getPapersCount() {
		return getService().getPapersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<com.kisti.osp.icebug.model.Paper> getPapers(
		int start, int end) {
		return getService().getPapers(start, end);
	}

	/**
	* Returns all the papers matching the UUID and company.
	*
	* @param uuid the UUID of the papers
	* @param companyId the primary key of the company
	* @return the matching papers, or an empty list if no matches were found
	*/
	public static java.util.List<com.kisti.osp.icebug.model.Paper> getPapersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getPapersByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.kisti.osp.icebug.model.Paper> getPapersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.icebug.model.Paper> orderByComparator) {
		return getService()
				   .getPapersByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PaperLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PaperLocalService, PaperLocalService> _serviceTracker =
		ServiceTrackerFactory.open(PaperLocalService.class);
}