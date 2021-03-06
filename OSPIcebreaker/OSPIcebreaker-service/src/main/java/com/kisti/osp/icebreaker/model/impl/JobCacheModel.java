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

package com.kisti.osp.icebreaker.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebreaker.model.Job;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Job in entity cache.
 *
 * @author Jerry H. Seo
 * @see Job
 * @generated
 */
@ProviderType
public class JobCacheModel implements CacheModel<Job>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobCacheModel)) {
			return false;
		}

		JobCacheModel jobCacheModel = (JobCacheModel)obj;

		if (jobId == jobCacheModel.jobId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jobId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jobId=");
		sb.append(jobId);
		sb.append(", jobName=");
		sb.append(jobName);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", simulationId=");
		sb.append(simulationId);
		sb.append(", schedulerId=");
		sb.append(schedulerId);
		sb.append(", workflowId=");
		sb.append(workflowId);
		sb.append(", solverExe=");
		sb.append(solverExe);
		sb.append(", workingDir=");
		sb.append(workingDir);
		sb.append(", runType=");
		sb.append(runType);
		sb.append(", logFileName=");
		sb.append(logFileName);
		sb.append(", title=");
		sb.append(title);
		sb.append(", queueName=");
		sb.append(queueName);
		sb.append(", command=");
		sb.append(command);
		sb.append(", referenceFiles=");
		sb.append(referenceFiles);
		sb.append(", environmentVars=");
		sb.append(environmentVars);
		sb.append(", nodes=");
		sb.append(nodes);
		sb.append(", processorsPerNode=");
		sb.append(processorsPerNode);
		sb.append(", wallTime=");
		sb.append(wallTime);
		sb.append(", eligibleTime=");
		sb.append(eligibleTime);
		sb.append(", afterAny=");
		sb.append(afterAny);
		sb.append(", afterOk=");
		sb.append(afterOk);
		sb.append(", submitArgs=");
		sb.append(submitArgs);
		sb.append(", status=");
		sb.append(status);
		sb.append(", jobStatus=");
		sb.append(jobStatus);
		sb.append(", reserveResults=");
		sb.append(reserveResults);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", queuedDate=");
		sb.append(queuedDate);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", completeDate=");
		sb.append(completeDate);
		sb.append(", usedMemory=");
		sb.append(usedMemory);
		sb.append(", usedCpuTime=");
		sb.append(usedCpuTime);
		sb.append(", usedWalltime=");
		sb.append(usedWalltime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Job toEntityModel() {
		JobImpl jobImpl = new JobImpl();

		if (uuid == null) {
			jobImpl.setUuid(StringPool.BLANK);
		}
		else {
			jobImpl.setUuid(uuid);
		}

		jobImpl.setJobId(jobId);

		if (jobName == null) {
			jobImpl.setJobName(StringPool.BLANK);
		}
		else {
			jobImpl.setJobName(jobName);
		}

		jobImpl.setCompanyId(companyId);
		jobImpl.setGroupId(groupId);
		jobImpl.setUserId(userId);
		jobImpl.setSimulationId(simulationId);
		jobImpl.setSchedulerId(schedulerId);
		jobImpl.setWorkflowId(workflowId);

		if (solverExe == null) {
			jobImpl.setSolverExe(StringPool.BLANK);
		}
		else {
			jobImpl.setSolverExe(solverExe);
		}

		if (workingDir == null) {
			jobImpl.setWorkingDir(StringPool.BLANK);
		}
		else {
			jobImpl.setWorkingDir(workingDir);
		}

		if (runType == null) {
			jobImpl.setRunType(StringPool.BLANK);
		}
		else {
			jobImpl.setRunType(runType);
		}

		if (logFileName == null) {
			jobImpl.setLogFileName(StringPool.BLANK);
		}
		else {
			jobImpl.setLogFileName(logFileName);
		}

		if (title == null) {
			jobImpl.setTitle(StringPool.BLANK);
		}
		else {
			jobImpl.setTitle(title);
		}

		if (queueName == null) {
			jobImpl.setQueueName(StringPool.BLANK);
		}
		else {
			jobImpl.setQueueName(queueName);
		}

		if (command == null) {
			jobImpl.setCommand(StringPool.BLANK);
		}
		else {
			jobImpl.setCommand(command);
		}

		if (referenceFiles == null) {
			jobImpl.setReferenceFiles(StringPool.BLANK);
		}
		else {
			jobImpl.setReferenceFiles(referenceFiles);
		}

		if (environmentVars == null) {
			jobImpl.setEnvironmentVars(StringPool.BLANK);
		}
		else {
			jobImpl.setEnvironmentVars(environmentVars);
		}

		jobImpl.setNodes(nodes);
		jobImpl.setProcessorsPerNode(processorsPerNode);

		if (wallTime == null) {
			jobImpl.setWallTime(StringPool.BLANK);
		}
		else {
			jobImpl.setWallTime(wallTime);
		}

		if (eligibleTime == null) {
			jobImpl.setEligibleTime(StringPool.BLANK);
		}
		else {
			jobImpl.setEligibleTime(eligibleTime);
		}

		if (afterAny == null) {
			jobImpl.setAfterAny(StringPool.BLANK);
		}
		else {
			jobImpl.setAfterAny(afterAny);
		}

		if (afterOk == null) {
			jobImpl.setAfterOk(StringPool.BLANK);
		}
		else {
			jobImpl.setAfterOk(afterOk);
		}

		if (submitArgs == null) {
			jobImpl.setSubmitArgs(StringPool.BLANK);
		}
		else {
			jobImpl.setSubmitArgs(submitArgs);
		}

		jobImpl.setStatus(status);
		jobImpl.setJobStatus(jobStatus);
		jobImpl.setReserveResults(reserveResults);

		if (createDate == Long.MIN_VALUE) {
			jobImpl.setCreateDate(null);
		}
		else {
			jobImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jobImpl.setModifiedDate(null);
		}
		else {
			jobImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (queuedDate == Long.MIN_VALUE) {
			jobImpl.setQueuedDate(null);
		}
		else {
			jobImpl.setQueuedDate(new Date(queuedDate));
		}

		if (startDate == Long.MIN_VALUE) {
			jobImpl.setStartDate(null);
		}
		else {
			jobImpl.setStartDate(new Date(startDate));
		}

		if (completeDate == Long.MIN_VALUE) {
			jobImpl.setCompleteDate(null);
		}
		else {
			jobImpl.setCompleteDate(new Date(completeDate));
		}

		if (usedMemory == null) {
			jobImpl.setUsedMemory(StringPool.BLANK);
		}
		else {
			jobImpl.setUsedMemory(usedMemory);
		}

		if (usedCpuTime == null) {
			jobImpl.setUsedCpuTime(StringPool.BLANK);
		}
		else {
			jobImpl.setUsedCpuTime(usedCpuTime);
		}

		if (usedWalltime == null) {
			jobImpl.setUsedWalltime(StringPool.BLANK);
		}
		else {
			jobImpl.setUsedWalltime(usedWalltime);
		}

		jobImpl.resetOriginalValues();

		return jobImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jobId = objectInput.readLong();
		jobName = objectInput.readUTF();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();

		simulationId = objectInput.readLong();

		schedulerId = objectInput.readLong();

		workflowId = objectInput.readLong();
		solverExe = objectInput.readUTF();
		workingDir = objectInput.readUTF();
		runType = objectInput.readUTF();
		logFileName = objectInput.readUTF();
		title = objectInput.readUTF();
		queueName = objectInput.readUTF();
		command = objectInput.readUTF();
		referenceFiles = objectInput.readUTF();
		environmentVars = objectInput.readUTF();

		nodes = objectInput.readInt();

		processorsPerNode = objectInput.readInt();
		wallTime = objectInput.readUTF();
		eligibleTime = objectInput.readUTF();
		afterAny = objectInput.readUTF();
		afterOk = objectInput.readUTF();
		submitArgs = objectInput.readUTF();

		status = objectInput.readInt();

		jobStatus = objectInput.readInt();

		reserveResults = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		queuedDate = objectInput.readLong();
		startDate = objectInput.readLong();
		completeDate = objectInput.readLong();
		usedMemory = objectInput.readUTF();
		usedCpuTime = objectInput.readUTF();
		usedWalltime = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jobId);

		if (jobName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jobName);
		}

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(simulationId);

		objectOutput.writeLong(schedulerId);

		objectOutput.writeLong(workflowId);

		if (solverExe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(solverExe);
		}

		if (workingDir == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workingDir);
		}

		if (runType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(runType);
		}

		if (logFileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logFileName);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (queueName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(queueName);
		}

		if (command == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(command);
		}

		if (referenceFiles == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceFiles);
		}

		if (environmentVars == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(environmentVars);
		}

		objectOutput.writeInt(nodes);

		objectOutput.writeInt(processorsPerNode);

		if (wallTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wallTime);
		}

		if (eligibleTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eligibleTime);
		}

		if (afterAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(afterAny);
		}

		if (afterOk == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(afterOk);
		}

		if (submitArgs == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(submitArgs);
		}

		objectOutput.writeInt(status);

		objectOutput.writeInt(jobStatus);

		objectOutput.writeBoolean(reserveResults);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(queuedDate);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(completeDate);

		if (usedMemory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usedMemory);
		}

		if (usedCpuTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usedCpuTime);
		}

		if (usedWalltime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usedWalltime);
		}
	}

	public String uuid;
	public long jobId;
	public String jobName;
	public long companyId;
	public long groupId;
	public long userId;
	public long simulationId;
	public long schedulerId;
	public long workflowId;
	public String solverExe;
	public String workingDir;
	public String runType;
	public String logFileName;
	public String title;
	public String queueName;
	public String command;
	public String referenceFiles;
	public String environmentVars;
	public int nodes;
	public int processorsPerNode;
	public String wallTime;
	public String eligibleTime;
	public String afterAny;
	public String afterOk;
	public String submitArgs;
	public int status;
	public int jobStatus;
	public boolean reserveResults;
	public long createDate;
	public long modifiedDate;
	public long queuedDate;
	public long startDate;
	public long completeDate;
	public String usedMemory;
	public String usedCpuTime;
	public String usedWalltime;
}