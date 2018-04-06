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

package com.kisti.osp.icebreaker.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Job. This utility wraps
 * {@link com.kisti.osp.icebreaker.service.impl.JobLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see JobLocalService
 * @see com.kisti.osp.icebreaker.service.base.JobLocalServiceBaseImpl
 * @see com.kisti.osp.icebreaker.service.impl.JobLocalServiceImpl
 * @generated
 */
@ProviderType
public class JobLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.icebreaker.service.impl.JobLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the job to the database. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was added
	*/
	public static com.kisti.osp.icebreaker.model.Job addJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return getService().addJob(job);
	}

	public static com.kisti.osp.icebreaker.model.Job addJob(long simulationId,
		long schedulerId, long workflowId, java.lang.String solverExeDir,
		java.lang.String solverExe, java.lang.String workingDir,
		java.lang.String logFileName, java.lang.String title,
		java.lang.String queueName, java.lang.String command,
		java.lang.String referenceFiles, java.lang.String environmentVars,
		int nodes, int processorsPerNode, java.lang.String wallTime,
		java.lang.String eligibleTime, long[] permissionGroupIds,
		boolean reserveResults,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addJob(simulationId, schedulerId, workflowId, solverExeDir,
			solverExe, workingDir, logFileName, title, queueName, command,
			referenceFiles, environmentVars, nodes, processorsPerNode,
			wallTime, eligibleTime, permissionGroupIds, reserveResults, sc);
	}

	/**
	* Creates a new job with the primary key. Does not add the job to the database.
	*
	* @param jobId the primary key for the new job
	* @return the new job
	*/
	public static com.kisti.osp.icebreaker.model.Job createJob(long jobId) {
		return getService().createJob(jobId);
	}

	/**
	* Deletes the job from the database. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was removed
	*/
	public static com.kisti.osp.icebreaker.model.Job deleteJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return getService().deleteJob(job);
	}

	/**
	* Deletes the job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the job
	* @return the job that was removed
	* @throws PortalException if a job with the primary key could not be found
	*/
	public static com.kisti.osp.icebreaker.model.Job deleteJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteJob(jobId);
	}

	public static com.kisti.osp.icebreaker.model.Job fetchJob(long jobId) {
		return getService().fetchJob(jobId);
	}

	/**
	* Returns the job matching the UUID and group.
	*
	* @param uuid the job's UUID
	* @param groupId the primary key of the group
	* @return the matching job, or <code>null</code> if a matching job could not be found
	*/
	public static com.kisti.osp.icebreaker.model.Job fetchJobByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchJobByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the job with the primary key.
	*
	* @param jobId the primary key of the job
	* @return the job
	* @throws PortalException if a job with the primary key could not be found
	*/
	public static com.kisti.osp.icebreaker.model.Job getJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJob(jobId);
	}

	/**
	* Returns the job matching the UUID and group.
	*
	* @param uuid the job's UUID
	* @param groupId the primary key of the group
	* @return the matching job
	* @throws PortalException if a matching job could not be found
	*/
	public static com.kisti.osp.icebreaker.model.Job getJobByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJobByUuidAndGroupId(uuid, groupId);
	}

	public static com.kisti.osp.icebreaker.model.Job removeJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().removeJob(jobId);
	}

	/**
	* Updates the job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was updated
	*/
	public static com.kisti.osp.icebreaker.model.Job updateJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return getService().updateJob(job);
	}

	public static com.kisti.osp.icebreaker.model.Job updateJobPermissions(
		long jobId, java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateJobPermissions(jobId, groupPermissions,
			guestPermissions, sc);
	}

	public static com.kisti.osp.icebreaker.model.Job updateJobStatus(
		long jobId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJobStatus(jobId, status);
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

	public static int countAllJobs()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAllJobs();
	}

	public static int countGroupJobs(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countGroupJobs(groupId);
	}

	public static int countGroupJobsBySchedulerId(long groupId, long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countGroupJobsBySchedulerId(groupId, schedulerId);
	}

	public static int countGroupJobsBySimulationId(long groupId,
		long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countGroupJobsBySimulationId(groupId, simulationId);
	}

	public static int countGroupJobsByStatus(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countGroupJobsByStatus(groupId, status);
	}

	public static int countJobsByQueueName(java.lang.String queueName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobsByQueueName(queueName);
	}

	public static int countJobsBySchedulerId(long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobsBySchedulerId(schedulerId);
	}

	public static int countJobsBySimulationId(long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobsBySimulationId(simulationId);
	}

	public static int countJobsByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobsByStatus(status);
	}

	/**
	* Returns the number of jobs.
	*
	* @return the number of jobs
	*/
	public static int getJobsCount() {
		return getService().getJobsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getAllJobs()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllJobs();
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getAllJobs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllJobs(start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobs(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobs(groupId);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobs(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobs(groupId, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySchedulerId(
		long groupId, long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobsBySchedulerId(groupId, schedulerId);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySchedulerId(
		long groupId, long schedulerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGroupJobsBySchedulerId(groupId, schedulerId, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySimulationId(
		long groupId, long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobsBySimulationId(groupId, simulationId);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySimulationId(
		long groupId, long simulationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getGroupJobsBySimulationId(groupId, simulationId, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsByStatus(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobsByStatus(groupId, status);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsByStatus(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupJobsByStatus(groupId, status, start, end);
	}

	/**
	* Returns a range of all the jobs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.icebreaker.model.impl.JobModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jobs
	* @param end the upper bound of the range of jobs (not inclusive)
	* @return the range of jobs
	*/
	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobs(
		int start, int end) {
		return getService().getJobs(start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByQueueName(
		java.lang.String queueName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsByQueueName(queueName);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByQueueName(
		java.lang.String queueName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsByQueueName(queueName, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySchedulerId(
		long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsBySchedulerId(schedulerId);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySchedulerId(
		long schedulerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsBySchedulerId(schedulerId, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySimulationId(
		long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsBySimulationId(simulationId);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySimulationId(
		long simulationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsBySimulationId(simulationId, start, end);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsByStatus(status);
	}

	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobsByStatus(status, start, end);
	}

	/**
	* Returns all the jobs matching the UUID and company.
	*
	* @param uuid the UUID of the jobs
	* @param companyId the primary key of the company
	* @return the matching jobs, or an empty list if no matches were found
	*/
	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getJobsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of jobs matching the UUID and company.
	*
	* @param uuid the UUID of the jobs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of jobs
	* @param end the upper bound of the range of jobs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching jobs, or an empty list if no matches were found
	*/
	public static java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.icebreaker.model.Job> orderByComparator) {
		return getService()
				   .getJobsByUuidAndCompanyId(uuid, companyId, start, end,
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

	public static JobLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobLocalService, JobLocalService> _serviceTracker =
		ServiceTrackerFactory.open(JobLocalService.class);
}