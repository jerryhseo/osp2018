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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JobLocalService}.
 *
 * @author Jerry H. Seo
 * @see JobLocalService
 * @generated
 */
@ProviderType
public class JobLocalServiceWrapper implements JobLocalService,
	ServiceWrapper<JobLocalService> {
	public JobLocalServiceWrapper(JobLocalService jobLocalService) {
		_jobLocalService = jobLocalService;
	}

	/**
	* Adds the job to the database. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was added
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job addJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return _jobLocalService.addJob(job);
	}

	@Override
	public com.kisti.osp.icebreaker.model.Job addJob(long simulationId,
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
		return _jobLocalService.addJob(simulationId, schedulerId, workflowId,
			solverExeDir, solverExe, workingDir, logFileName, title, queueName,
			command, referenceFiles, environmentVars, nodes, processorsPerNode,
			wallTime, eligibleTime, permissionGroupIds, reserveResults, sc);
	}

	/**
	* Creates a new job with the primary key. Does not add the job to the database.
	*
	* @param jobId the primary key for the new job
	* @return the new job
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job createJob(long jobId) {
		return _jobLocalService.createJob(jobId);
	}

	/**
	* Deletes the job from the database. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was removed
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job deleteJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return _jobLocalService.deleteJob(job);
	}

	/**
	* Deletes the job with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the job
	* @return the job that was removed
	* @throws PortalException if a job with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job deleteJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobLocalService.deleteJob(jobId);
	}

	@Override
	public com.kisti.osp.icebreaker.model.Job fetchJob(long jobId) {
		return _jobLocalService.fetchJob(jobId);
	}

	/**
	* Returns the job matching the UUID and group.
	*
	* @param uuid the job's UUID
	* @param groupId the primary key of the group
	* @return the matching job, or <code>null</code> if a matching job could not be found
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job fetchJobByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _jobLocalService.fetchJobByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the job with the primary key.
	*
	* @param jobId the primary key of the job
	* @return the job
	* @throws PortalException if a job with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job getJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobLocalService.getJob(jobId);
	}

	/**
	* Returns the job matching the UUID and group.
	*
	* @param uuid the job's UUID
	* @param groupId the primary key of the group
	* @return the matching job
	* @throws PortalException if a matching job could not be found
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job getJobByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobLocalService.getJobByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.kisti.osp.icebreaker.model.Job removeJob(long jobId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.removeJob(jobId);
	}

	/**
	* Updates the job in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param job the job
	* @return the job that was updated
	*/
	@Override
	public com.kisti.osp.icebreaker.model.Job updateJob(
		com.kisti.osp.icebreaker.model.Job job) {
		return _jobLocalService.updateJob(job);
	}

	@Override
	public com.kisti.osp.icebreaker.model.Job updateJobPermissions(long jobId,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.kernel.service.ServiceContext sc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.updateJobPermissions(jobId, groupPermissions,
			guestPermissions, sc);
	}

	@Override
	public com.kisti.osp.icebreaker.model.Job updateJobStatus(long jobId,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.updateJobStatus(jobId, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jobLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jobLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _jobLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jobLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countAllJobs()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countAllJobs();
	}

	@Override
	public int countGroupJobs(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countGroupJobs(groupId);
	}

	@Override
	public int countGroupJobsBySchedulerId(long groupId, long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countGroupJobsBySchedulerId(groupId, schedulerId);
	}

	@Override
	public int countGroupJobsBySimulationId(long groupId, long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countGroupJobsBySimulationId(groupId,
			simulationId);
	}

	@Override
	public int countGroupJobsByStatus(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countGroupJobsByStatus(groupId, status);
	}

	@Override
	public int countJobsByQueueName(java.lang.String queueName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countJobsByQueueName(queueName);
	}

	@Override
	public int countJobsBySchedulerId(long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countJobsBySchedulerId(schedulerId);
	}

	@Override
	public int countJobsBySimulationId(long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countJobsBySimulationId(simulationId);
	}

	@Override
	public int countJobsByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.countJobsByStatus(status);
	}

	/**
	* Returns the number of jobs.
	*
	* @return the number of jobs
	*/
	@Override
	public int getJobsCount() {
		return _jobLocalService.getJobsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jobLocalService.getOSGiServiceIdentifier();
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
		return _jobLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _jobLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _jobLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getAllJobs()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getAllJobs();
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getAllJobs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getAllJobs(start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobs(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobs(groupId);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobs(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobs(groupId, start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySchedulerId(
		long groupId, long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsBySchedulerId(groupId, schedulerId);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySchedulerId(
		long groupId, long schedulerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsBySchedulerId(groupId, schedulerId,
			start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySimulationId(
		long groupId, long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsBySimulationId(groupId, simulationId);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsBySimulationId(
		long groupId, long simulationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsBySimulationId(groupId,
			simulationId, start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsByStatus(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsByStatus(groupId, status);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getGroupJobsByStatus(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getGroupJobsByStatus(groupId, status, start, end);
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
	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobs(
		int start, int end) {
		return _jobLocalService.getJobs(start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByQueueName(
		java.lang.String queueName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsByQueueName(queueName);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByQueueName(
		java.lang.String queueName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsByQueueName(queueName, start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySchedulerId(
		long schedulerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsBySchedulerId(schedulerId);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySchedulerId(
		long schedulerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsBySchedulerId(schedulerId, start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySimulationId(
		long simulationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsBySimulationId(simulationId);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsBySimulationId(
		long simulationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsBySimulationId(simulationId, start, end);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsByStatus(status);
	}

	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobLocalService.getJobsByStatus(status, start, end);
	}

	/**
	* Returns all the jobs matching the UUID and company.
	*
	* @param uuid the UUID of the jobs
	* @param companyId the primary key of the company
	* @return the matching jobs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _jobLocalService.getJobsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.kisti.osp.icebreaker.model.Job> getJobsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.icebreaker.model.Job> orderByComparator) {
		return _jobLocalService.getJobsByUuidAndCompanyId(uuid, companyId,
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
		return _jobLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jobLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public JobLocalService getWrappedService() {
		return _jobLocalService;
	}

	@Override
	public void setWrappedService(JobLocalService jobLocalService) {
		_jobLocalService = jobLocalService;
	}

	private JobLocalService _jobLocalService;
}