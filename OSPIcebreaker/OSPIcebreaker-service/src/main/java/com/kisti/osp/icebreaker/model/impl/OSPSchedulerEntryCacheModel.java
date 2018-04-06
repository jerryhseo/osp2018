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

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;

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
 * The cache model class for representing OSPSchedulerEntry in entity cache.
 *
 * @author Jerry H. Seo
 * @see OSPSchedulerEntry
 * @generated
 */
@ProviderType
public class OSPSchedulerEntryCacheModel implements CacheModel<OSPSchedulerEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OSPSchedulerEntryCacheModel)) {
			return false;
		}

		OSPSchedulerEntryCacheModel ospSchedulerEntryCacheModel = (OSPSchedulerEntryCacheModel)obj;

		if (schedulerEntryId == ospSchedulerEntryCacheModel.schedulerEntryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, schedulerEntryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", schedulerEntryId=");
		sb.append(schedulerEntryId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", version=");
		sb.append(version);
		sb.append(", className=");
		sb.append(className);
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
		sb.append(", accessMethod=");
		sb.append(accessMethod);
		sb.append(", authorizedUser=");
		sb.append(authorizedUser);
		sb.append(", status=");
		sb.append(status);
		sb.append(", description=");
		sb.append(description);
		sb.append(", serverIp=");
		sb.append(serverIp);
		sb.append(", sshPort=");
		sb.append(sshPort);
		sb.append(", templateDir=");
		sb.append(templateDir);
		sb.append(", templateRealDir=");
		sb.append(templateRealDir);
		sb.append(", authorizedPassword=");
		sb.append(authorizedPassword);
		sb.append(", schedulerClass=");
		sb.append(schedulerClass);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSPSchedulerEntry toEntityModel() {
		OSPSchedulerEntryImpl ospSchedulerEntryImpl = new OSPSchedulerEntryImpl();

		if (uuid == null) {
			ospSchedulerEntryImpl.setUuid(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setUuid(uuid);
		}

		ospSchedulerEntryImpl.setSchedulerEntryId(schedulerEntryId);

		if (name == null) {
			ospSchedulerEntryImpl.setName(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setName(name);
		}

		if (version == null) {
			ospSchedulerEntryImpl.setVersion(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setVersion(version);
		}

		if (className == null) {
			ospSchedulerEntryImpl.setClassName(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setClassName(className);
		}

		ospSchedulerEntryImpl.setGroupId(groupId);
		ospSchedulerEntryImpl.setCompanyId(companyId);
		ospSchedulerEntryImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			ospSchedulerEntryImpl.setCreateDate(null);
		}
		else {
			ospSchedulerEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ospSchedulerEntryImpl.setModifiedDate(null);
		}
		else {
			ospSchedulerEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (accessMethod == null) {
			ospSchedulerEntryImpl.setAccessMethod(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setAccessMethod(accessMethod);
		}

		if (authorizedUser == null) {
			ospSchedulerEntryImpl.setAuthorizedUser(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setAuthorizedUser(authorizedUser);
		}

		ospSchedulerEntryImpl.setStatus(status);

		if (description == null) {
			ospSchedulerEntryImpl.setDescription(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setDescription(description);
		}

		if (serverIp == null) {
			ospSchedulerEntryImpl.setServerIp(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setServerIp(serverIp);
		}

		if (sshPort == null) {
			ospSchedulerEntryImpl.setSshPort(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setSshPort(sshPort);
		}

		if (templateDir == null) {
			ospSchedulerEntryImpl.setTemplateDir(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setTemplateDir(templateDir);
		}

		if (templateRealDir == null) {
			ospSchedulerEntryImpl.setTemplateRealDir(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setTemplateRealDir(templateRealDir);
		}

		if (authorizedPassword == null) {
			ospSchedulerEntryImpl.setAuthorizedPassword(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setAuthorizedPassword(authorizedPassword);
		}

		if (schedulerClass == null) {
			ospSchedulerEntryImpl.setSchedulerClass(StringPool.BLANK);
		}
		else {
			ospSchedulerEntryImpl.setSchedulerClass(schedulerClass);
		}

		ospSchedulerEntryImpl.resetOriginalValues();

		return ospSchedulerEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		schedulerEntryId = objectInput.readLong();
		name = objectInput.readUTF();
		version = objectInput.readUTF();
		className = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		accessMethod = objectInput.readUTF();
		authorizedUser = objectInput.readUTF();

		status = objectInput.readInt();
		description = objectInput.readUTF();
		serverIp = objectInput.readUTF();
		sshPort = objectInput.readUTF();
		templateDir = objectInput.readUTF();
		templateRealDir = objectInput.readUTF();
		authorizedPassword = objectInput.readUTF();
		schedulerClass = objectInput.readUTF();
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

		objectOutput.writeLong(schedulerEntryId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (accessMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accessMethod);
		}

		if (authorizedUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(authorizedUser);
		}

		objectOutput.writeInt(status);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (serverIp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serverIp);
		}

		if (sshPort == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sshPort);
		}

		if (templateDir == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(templateDir);
		}

		if (templateRealDir == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(templateRealDir);
		}

		if (authorizedPassword == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(authorizedPassword);
		}

		if (schedulerClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(schedulerClass);
		}
	}

	public String uuid;
	public long schedulerEntryId;
	public String name;
	public String version;
	public String className;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String accessMethod;
	public String authorizedUser;
	public int status;
	public String description;
	public String serverIp;
	public String sshPort;
	public String templateDir;
	public String templateRealDir;
	public String authorizedPassword;
	public String schedulerClass;
}