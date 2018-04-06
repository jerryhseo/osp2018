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

package OSPIcecap.model.impl;

import OSPIcecap.model.DataType;

import aQute.bnd.annotation.ProviderType;

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
 * The cache model class for representing DataType in entity cache.
 *
 * @author Jerry H. Seo
 * @see DataType
 * @generated
 */
@ProviderType
public class DataTypeCacheModel implements CacheModel<DataType>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeCacheModel)) {
			return false;
		}

		DataTypeCacheModel dataTypeCacheModel = (DataTypeCacheModel)obj;

		if (typeId == dataTypeCacheModel.typeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, typeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", version=");
		sb.append(version);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", samplePath=");
		sb.append(samplePath);
		sb.append(", status=");
		sb.append(status);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataType toEntityModel() {
		DataTypeImpl dataTypeImpl = new DataTypeImpl();

		if (uuid == null) {
			dataTypeImpl.setUuid(StringPool.BLANK);
		}
		else {
			dataTypeImpl.setUuid(uuid);
		}

		dataTypeImpl.setTypeId(typeId);

		if (name == null) {
			dataTypeImpl.setName(StringPool.BLANK);
		}
		else {
			dataTypeImpl.setName(name);
		}

		if (version == null) {
			dataTypeImpl.setVersion(StringPool.BLANK);
		}
		else {
			dataTypeImpl.setVersion(version);
		}

		dataTypeImpl.setCompanyId(companyId);
		dataTypeImpl.setGroupId(groupId);
		dataTypeImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dataTypeImpl.setCreateDate(null);
		}
		else {
			dataTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dataTypeImpl.setModifiedDate(null);
		}
		else {
			dataTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (samplePath == null) {
			dataTypeImpl.setSamplePath(StringPool.BLANK);
		}
		else {
			dataTypeImpl.setSamplePath(samplePath);
		}

		dataTypeImpl.setStatus(status);

		if (description == null) {
			dataTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			dataTypeImpl.setDescription(description);
		}

		dataTypeImpl.resetOriginalValues();

		return dataTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		typeId = objectInput.readLong();
		name = objectInput.readUTF();
		version = objectInput.readUTF();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		samplePath = objectInput.readUTF();

		status = objectInput.readInt();
		description = objectInput.readUTF();
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

		objectOutput.writeLong(typeId);

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

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (samplePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(samplePath);
		}

		objectOutput.writeInt(status);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long typeId;
	public String name;
	public String version;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String samplePath;
	public int status;
	public String description;
}