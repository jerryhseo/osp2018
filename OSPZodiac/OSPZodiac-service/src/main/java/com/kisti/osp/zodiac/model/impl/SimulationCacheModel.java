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

package com.kisti.osp.zodiac.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.zodiac.model.Simulation;

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
 * The cache model class for representing Simulation in entity cache.
 *
 * @author Jerry H. Seo
 * @see Simulation
 * @generated
 */
@ProviderType
public class SimulationCacheModel implements CacheModel<Simulation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SimulationCacheModel)) {
			return false;
		}

		SimulationCacheModel simulationCacheModel = (SimulationCacheModel)obj;

		if (simulationId == simulationCacheModel.simulationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, simulationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", simulationId=");
		sb.append(simulationId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", webContentId=");
		sb.append(webContentId);
		sb.append(", iconId=");
		sb.append(iconId);
		sb.append(", simulationStatus=");
		sb.append(simulationStatus);
		sb.append(", status=");
		sb.append(status);
		sb.append(", tasks=");
		sb.append(tasks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Simulation toEntityModel() {
		SimulationImpl simulationImpl = new SimulationImpl();

		if (uuid == null) {
			simulationImpl.setUuid(StringPool.BLANK);
		}
		else {
			simulationImpl.setUuid(uuid);
		}

		simulationImpl.setSimulationId(simulationId);
		simulationImpl.setGroupId(groupId);
		simulationImpl.setCompanyId(companyId);
		simulationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			simulationImpl.setCreateDate(null);
		}
		else {
			simulationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			simulationImpl.setModifiedDate(null);
		}
		else {
			simulationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			simulationImpl.setTitle(StringPool.BLANK);
		}
		else {
			simulationImpl.setTitle(title);
		}

		simulationImpl.setWebContentId(webContentId);
		simulationImpl.setIconId(iconId);

		if (simulationStatus == null) {
			simulationImpl.setSimulationStatus(StringPool.BLANK);
		}
		else {
			simulationImpl.setSimulationStatus(simulationStatus);
		}

		simulationImpl.setStatus(status);

		if (tasks == null) {
			simulationImpl.setTasks(StringPool.BLANK);
		}
		else {
			simulationImpl.setTasks(tasks);
		}

		simulationImpl.resetOriginalValues();

		return simulationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		simulationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();

		webContentId = objectInput.readLong();

		iconId = objectInput.readLong();
		simulationStatus = objectInput.readUTF();

		status = objectInput.readInt();
		tasks = objectInput.readUTF();
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

		objectOutput.writeLong(simulationId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(webContentId);

		objectOutput.writeLong(iconId);

		if (simulationStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(simulationStatus);
		}

		objectOutput.writeInt(status);

		if (tasks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tasks);
		}
	}

	public String uuid;
	public long simulationId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String title;
	public long webContentId;
	public long iconId;
	public String simulationStatus;
	public int status;
	public String tasks;
}