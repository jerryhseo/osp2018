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

package com.kisti.osp.icebreaker.service.impl;

import java.util.Date;
import java.util.List;

import com.kisti.osp.icebreaker.job.constant.OSPJobStatus;
import com.kisti.osp.icebreaker.model.Job;
import com.kisti.osp.icebreaker.service.base.JobLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

/**
 * The implementation of the job local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.icebreaker.service.JobLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jerry H. Seo
 * @see JobLocalServiceBaseImpl
 * @see com.kisti.osp.icebreaker.service.JobLocalServiceUtil
 */
public class JobLocalServiceImpl extends JobLocalServiceBaseImpl {
	public Job addJob(
			long simulationId,
			long schedulerId,
			long workflowId,
			String solverExeDir,
			String solverExe,
			String workingDir,
			String logFileName,
			String title, 
			String queueName,
			String command,
			String referenceFiles,
			String environmentVars,
			int nodes,
			int processorsPerNode,
			String wallTime,
			String eligibleTime,
			long[] permissionGroupIds,
			boolean reserveResults,
			ServiceContext sc) throws SystemException, PortalException{
		long jobId = super.counterLocalService.increment();
		Job job = super.createJob(jobId);
		
		job.setUuid(sc.getUuid());
		job.setCompanyId(sc.getCompanyId());
		job.setGroupId(sc.getScopeGroupId());
		job.setUserId(sc.getUserId());

		job.setSimulationId(simulationId);
		job.setSchedulerId(schedulerId);
		job.setWorkflowId(workflowId);
		job.setSolverExe(solverExe);
		job.setWorkingDir(workingDir);
		job.setLogFileName(logFileName);
		job.setTitle(title);
		job.setQueueName(queueName);
		
		job.setCommand(command);;
		job.setReferenceFiles(referenceFiles);
		job.setEnvironmentVars(environmentVars);
		
		job.setNodes(nodes);
		job.setProcessorsPerNode(processorsPerNode);
		job.setWallTime(wallTime);
		job.setEligibleTime(eligibleTime);

		Date now = new Date();
		job.setCreateDate(now);
		job.setModifiedDate(now);
		job.setReserveResults(reserveResults);

		job.setStatus(WorkflowConstants.STATUS_DRAFT);
		job.setJobStatus(OSPJobStatus.INIT.value());
		
		super.addJob(job);
		
		super.resourceLocalService.addResources(
				job.getCompanyId(), 
				job.getGroupId(), 
				job.getUserId(), 
				Job.class.getName(), 
				jobId, 
				false, 
				true, 
				true);
		
		return job;
	}
	
	public Job removeJob( long jobId ) throws PortalException, SystemException{
		Job job = super.getJob(jobId);
		super.resourceLocalService.deleteResource(
				job.getCompanyId(), 
				Job.class.getName(), 
				ResourceConstants.SCOPE_INDIVIDUAL, 
				job.getJobId());
		return super.deleteJob(jobId);
	}
	
	public Job updateJobPermissions( 
			long jobId, 
			String[] groupPermissions, 
			String[] guestPermissions, 
			ServiceContext sc) throws PortalException, SystemException{
		Job job = super.getJob(jobId);
		super.resourceLocalService.updateResources(
				job.getCompanyId(), 
				job.getGroupId(), 
				Job.class.getName(), 
				job.getJobId(), 
				groupPermissions, 
				guestPermissions);
		return super.updateJob(job);
	}
	
	public Job updateJobStatus(
			long jobId,
			int status) throws SystemException, PortalException{
		Job job = super.getJob(jobId);
		job.setJobStatus(status);
		
		return super.updateJob(job);
	}
	
	public int countAllJobs() throws SystemException{
		return super.jobPersistence.countAll();
	}

	public List<Job> getAllJobs() throws SystemException{
		return super.jobPersistence.findAll();
	}
	
	public List<Job> getAllJobs( int start, int end ) throws SystemException{
		return super.jobPersistence.findAll(start, end);
	}
	
	public int countGroupJobs( long groupId ) throws SystemException{
		return super.jobPersistence.countByGroupId(groupId);
	}
	
	public List<Job> getGroupJobs( long groupId ) throws SystemException{
		return super.jobPersistence.filterFindByGroupId(groupId);
	}

	public List<Job> getGroupJobs( long groupId, int start, int end ) throws SystemException{
		return super.jobPersistence.filterFindByGroupId(groupId, start, end);
	}
	
	public int countJobsBySimulationId( long simulationId ) throws SystemException{
		return super.jobPersistence.countBySimulationId(simulationId);
	}
	
	public List<Job> getJobsBySimulationId(long simulationId ) throws SystemException{
		return super.jobPersistence.findBySimulationId(simulationId);
	}

	public List<Job> getJobsBySimulationId(long simulationId, int start, int end ) throws SystemException{
		return super.jobPersistence.findBySimulationId(simulationId, start, end);
	}

	public int countGroupJobsBySimulationId( long groupId, long simulationId ) throws SystemException{
		return super.jobPersistence.countBySimulationId_G(groupId, simulationId);
	}
	
	public List<Job> getGroupJobsBySimulationId(long groupId, long simulationId ) throws SystemException{
		return super.jobPersistence.findBySimulationId_G(groupId, simulationId);
	}

	public List<Job> getGroupJobsBySimulationId(long groupId, long simulationId, int start, int end ) throws SystemException{
		return super.jobPersistence.findBySimulationId_G(groupId, simulationId, start, end);
	}

	public int countJobsByStatus( int status ) throws SystemException{
		return super.jobPersistence.countByJobStatus(status);
	}
	
	public List<Job> getJobsByStatus( int status ) throws SystemException{
		return super.jobPersistence.findByJobStatus(status);
	}
	
	public List<Job> getJobsByStatus( int status, int start, int end ) throws SystemException{
		return super.jobPersistence.findByJobStatus(status, start, end);
	}

	public int countGroupJobsByStatus( long groupId, int status ) throws SystemException{
		return super.jobPersistence.countByStatus_G(groupId, status);
	}
	
	public List<Job> getGroupJobsByStatus( long groupId, int status ) throws SystemException{
		return super.jobPersistence.filterFindByStatus_G(groupId, status);
	}

	public List<Job> getGroupJobsByStatus( long groupId, int status, int start, int end ) throws SystemException{
		return super.jobPersistence.filterFindByStatus_G(groupId, status, start, end);
	}
	
	public int countJobsByQueueName( String queueName ) throws SystemException{
		return super.jobPersistence.countByQueueName(queueName);
	}
	
	public List<Job> getJobsByQueueName( String queueName ) throws SystemException{
		return super.jobPersistence.findByQueueName(queueName);
	}

	public List<Job> getJobsByQueueName( String queueName, int start, int end ) throws SystemException{
		return super.jobPersistence.findByQueueName(queueName, start, end);
	}
	
	public int countJobsBySchedulerId( long schedulerId ) throws SystemException{
		return super.jobPersistence.countBySchedulerId(schedulerId);
	}
	
	public List<Job> getJobsBySchedulerId( long schedulerId ) throws SystemException{
		return super.jobPersistence.findBySchedulerId(schedulerId);
	}

	public List<Job> getJobsBySchedulerId( long schedulerId , int start, int end ) throws SystemException{
		return super.jobPersistence.findBySchedulerId(schedulerId, start, end);
	}
	
	public int countGroupJobsBySchedulerId( long groupId, long schedulerId  ) throws SystemException{
		return super.jobPersistence.countBySchedulerId_G(groupId, schedulerId);
	}
	
	public List<Job> getGroupJobsBySchedulerId( long groupId, long schedulerId  ) throws SystemException{
		return super.jobPersistence.filterFindBySchedulerId_G(groupId, schedulerId);
	}
	
	public List<Job> getGroupJobsBySchedulerId( long groupId, long schedulerId , int start, int end ) throws SystemException{
		return super.jobPersistence.filterFindBySchedulerId_G(groupId, schedulerId, start, end);
	}
	
	
}