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

package com.kisti.osp.icebreaker.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Job service. Represents a row in the &quot;icebreaker_Job&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.osp.icebreaker.model.impl.JobModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.osp.icebreaker.model.impl.JobImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see Job
 * @see com.kisti.osp.icebreaker.model.impl.JobImpl
 * @see com.kisti.osp.icebreaker.model.impl.JobModelImpl
 * @generated
 */
@ProviderType
public interface JobModel extends BaseModel<Job>, ShardedModel, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a job model instance should use the {@link Job} interface instead.
	 */

	/**
	 * Returns the primary key of this job.
	 *
	 * @return the primary key of this job
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this job.
	 *
	 * @param primaryKey the primary key of this job
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this job.
	 *
	 * @return the uuid of this job
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this job.
	 *
	 * @param uuid the uuid of this job
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the job ID of this job.
	 *
	 * @return the job ID of this job
	 */
	public long getJobId();

	/**
	 * Sets the job ID of this job.
	 *
	 * @param jobId the job ID of this job
	 */
	public void setJobId(long jobId);

	/**
	 * Returns the job name of this job.
	 *
	 * @return the job name of this job
	 */
	@AutoEscape
	public String getJobName();

	/**
	 * Sets the job name of this job.
	 *
	 * @param jobName the job name of this job
	 */
	public void setJobName(String jobName);

	/**
	 * Returns the company ID of this job.
	 *
	 * @return the company ID of this job
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this job.
	 *
	 * @param companyId the company ID of this job
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this job.
	 *
	 * @return the group ID of this job
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this job.
	 *
	 * @param groupId the group ID of this job
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this job.
	 *
	 * @return the user ID of this job
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this job.
	 *
	 * @param userId the user ID of this job
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this job.
	 *
	 * @return the user uuid of this job
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this job.
	 *
	 * @param userUuid the user uuid of this job
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the simulation ID of this job.
	 *
	 * @return the simulation ID of this job
	 */
	public long getSimulationId();

	/**
	 * Sets the simulation ID of this job.
	 *
	 * @param simulationId the simulation ID of this job
	 */
	public void setSimulationId(long simulationId);

	/**
	 * Returns the scheduler ID of this job.
	 *
	 * @return the scheduler ID of this job
	 */
	public long getSchedulerId();

	/**
	 * Sets the scheduler ID of this job.
	 *
	 * @param schedulerId the scheduler ID of this job
	 */
	public void setSchedulerId(long schedulerId);

	/**
	 * Returns the workflow ID of this job.
	 *
	 * @return the workflow ID of this job
	 */
	public long getWorkflowId();

	/**
	 * Sets the workflow ID of this job.
	 *
	 * @param workflowId the workflow ID of this job
	 */
	public void setWorkflowId(long workflowId);

	/**
	 * Returns the solver exe of this job.
	 *
	 * @return the solver exe of this job
	 */
	@AutoEscape
	public String getSolverExe();

	/**
	 * Sets the solver exe of this job.
	 *
	 * @param solverExe the solver exe of this job
	 */
	public void setSolverExe(String solverExe);

	/**
	 * Returns the working dir of this job.
	 *
	 * @return the working dir of this job
	 */
	@AutoEscape
	public String getWorkingDir();

	/**
	 * Sets the working dir of this job.
	 *
	 * @param workingDir the working dir of this job
	 */
	public void setWorkingDir(String workingDir);

	/**
	 * Returns the run type of this job.
	 *
	 * @return the run type of this job
	 */
	@AutoEscape
	public String getRunType();

	/**
	 * Sets the run type of this job.
	 *
	 * @param runType the run type of this job
	 */
	public void setRunType(String runType);

	/**
	 * Returns the log file name of this job.
	 *
	 * @return the log file name of this job
	 */
	@AutoEscape
	public String getLogFileName();

	/**
	 * Sets the log file name of this job.
	 *
	 * @param logFileName the log file name of this job
	 */
	public void setLogFileName(String logFileName);

	/**
	 * Returns the title of this job.
	 *
	 * @return the title of this job
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this job.
	 *
	 * @param title the title of this job
	 */
	public void setTitle(String title);

	/**
	 * Returns the queue name of this job.
	 *
	 * @return the queue name of this job
	 */
	@AutoEscape
	public String getQueueName();

	/**
	 * Sets the queue name of this job.
	 *
	 * @param queueName the queue name of this job
	 */
	public void setQueueName(String queueName);

	/**
	 * Returns the command of this job.
	 *
	 * @return the command of this job
	 */
	@AutoEscape
	public String getCommand();

	/**
	 * Sets the command of this job.
	 *
	 * @param command the command of this job
	 */
	public void setCommand(String command);

	/**
	 * Returns the reference files of this job.
	 *
	 * @return the reference files of this job
	 */
	@AutoEscape
	public String getReferenceFiles();

	/**
	 * Sets the reference files of this job.
	 *
	 * @param referenceFiles the reference files of this job
	 */
	public void setReferenceFiles(String referenceFiles);

	/**
	 * Returns the environment vars of this job.
	 *
	 * @return the environment vars of this job
	 */
	@AutoEscape
	public String getEnvironmentVars();

	/**
	 * Sets the environment vars of this job.
	 *
	 * @param environmentVars the environment vars of this job
	 */
	public void setEnvironmentVars(String environmentVars);

	/**
	 * Returns the nodes of this job.
	 *
	 * @return the nodes of this job
	 */
	public int getNodes();

	/**
	 * Sets the nodes of this job.
	 *
	 * @param nodes the nodes of this job
	 */
	public void setNodes(int nodes);

	/**
	 * Returns the processors per node of this job.
	 *
	 * @return the processors per node of this job
	 */
	public int getProcessorsPerNode();

	/**
	 * Sets the processors per node of this job.
	 *
	 * @param processorsPerNode the processors per node of this job
	 */
	public void setProcessorsPerNode(int processorsPerNode);

	/**
	 * Returns the wall time of this job.
	 *
	 * @return the wall time of this job
	 */
	@AutoEscape
	public String getWallTime();

	/**
	 * Sets the wall time of this job.
	 *
	 * @param wallTime the wall time of this job
	 */
	public void setWallTime(String wallTime);

	/**
	 * Returns the eligible time of this job.
	 *
	 * @return the eligible time of this job
	 */
	@AutoEscape
	public String getEligibleTime();

	/**
	 * Sets the eligible time of this job.
	 *
	 * @param eligibleTime the eligible time of this job
	 */
	public void setEligibleTime(String eligibleTime);

	/**
	 * Returns the after any of this job.
	 *
	 * @return the after any of this job
	 */
	@AutoEscape
	public String getAfterAny();

	/**
	 * Sets the after any of this job.
	 *
	 * @param afterAny the after any of this job
	 */
	public void setAfterAny(String afterAny);

	/**
	 * Returns the after ok of this job.
	 *
	 * @return the after ok of this job
	 */
	@AutoEscape
	public String getAfterOk();

	/**
	 * Sets the after ok of this job.
	 *
	 * @param afterOk the after ok of this job
	 */
	public void setAfterOk(String afterOk);

	/**
	 * Returns the submit args of this job.
	 *
	 * @return the submit args of this job
	 */
	@AutoEscape
	public String getSubmitArgs();

	/**
	 * Sets the submit args of this job.
	 *
	 * @param submitArgs the submit args of this job
	 */
	public void setSubmitArgs(String submitArgs);

	/**
	 * Returns the status of this job.
	 *
	 * @return the status of this job
	 */
	public int getStatus();

	/**
	 * Sets the status of this job.
	 *
	 * @param status the status of this job
	 */
	public void setStatus(int status);

	/**
	 * Returns the job status of this job.
	 *
	 * @return the job status of this job
	 */
	public int getJobStatus();

	/**
	 * Sets the job status of this job.
	 *
	 * @param jobStatus the job status of this job
	 */
	public void setJobStatus(int jobStatus);

	/**
	 * Returns the reserve results of this job.
	 *
	 * @return the reserve results of this job
	 */
	public boolean getReserveResults();

	/**
	 * Returns <code>true</code> if this job is reserve results.
	 *
	 * @return <code>true</code> if this job is reserve results; <code>false</code> otherwise
	 */
	public boolean isReserveResults();

	/**
	 * Sets whether this job is reserve results.
	 *
	 * @param reserveResults the reserve results of this job
	 */
	public void setReserveResults(boolean reserveResults);

	/**
	 * Returns the create date of this job.
	 *
	 * @return the create date of this job
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this job.
	 *
	 * @param createDate the create date of this job
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this job.
	 *
	 * @return the modified date of this job
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this job.
	 *
	 * @param modifiedDate the modified date of this job
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the queued date of this job.
	 *
	 * @return the queued date of this job
	 */
	public Date getQueuedDate();

	/**
	 * Sets the queued date of this job.
	 *
	 * @param queuedDate the queued date of this job
	 */
	public void setQueuedDate(Date queuedDate);

	/**
	 * Returns the start date of this job.
	 *
	 * @return the start date of this job
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this job.
	 *
	 * @param startDate the start date of this job
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the complete date of this job.
	 *
	 * @return the complete date of this job
	 */
	public Date getCompleteDate();

	/**
	 * Sets the complete date of this job.
	 *
	 * @param completeDate the complete date of this job
	 */
	public void setCompleteDate(Date completeDate);

	/**
	 * Returns the used memory of this job.
	 *
	 * @return the used memory of this job
	 */
	@AutoEscape
	public String getUsedMemory();

	/**
	 * Sets the used memory of this job.
	 *
	 * @param usedMemory the used memory of this job
	 */
	public void setUsedMemory(String usedMemory);

	/**
	 * Returns the used cpu time of this job.
	 *
	 * @return the used cpu time of this job
	 */
	@AutoEscape
	public String getUsedCpuTime();

	/**
	 * Sets the used cpu time of this job.
	 *
	 * @param usedCpuTime the used cpu time of this job
	 */
	public void setUsedCpuTime(String usedCpuTime);

	/**
	 * Returns the used walltime of this job.
	 *
	 * @return the used walltime of this job
	 */
	@AutoEscape
	public String getUsedWalltime();

	/**
	 * Sets the used walltime of this job.
	 *
	 * @param usedWalltime the used walltime of this job
	 */
	public void setUsedWalltime(String usedWalltime);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Job job);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Job> toCacheModel();

	@Override
	public Job toEscapedModel();

	@Override
	public Job toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}