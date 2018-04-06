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

import OSPIcecap.model.DataCollection;

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
 * The cache model class for representing DataCollection in entity cache.
 *
 * @author Jerry H. Seo
 * @see DataCollection
 * @generated
 */
@ProviderType
public class DataCollectionCacheModel implements CacheModel<DataCollection>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataCollectionCacheModel)) {
			return false;
		}

		DataCollectionCacheModel dataCollectionCacheModel = (DataCollectionCacheModel)obj;

		if (collectionId == dataCollectionCacheModel.collectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, collectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", version=");
		sb.append(version);
		sb.append(", title=");
		sb.append(title);
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
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append(", accessMethod=");
		sb.append(accessMethod);
		sb.append(", collectionId=");
		sb.append(collectionId);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataCollection toEntityModel() {
		DataCollectionImpl dataCollectionImpl = new DataCollectionImpl();

		if (uuid == null) {
			dataCollectionImpl.setUuid(StringPool.BLANK);
		}
		else {
			dataCollectionImpl.setUuid(uuid);
		}

		if (name == null) {
			dataCollectionImpl.setName(StringPool.BLANK);
		}
		else {
			dataCollectionImpl.setName(name);
		}

		if (version == null) {
			dataCollectionImpl.setVersion(StringPool.BLANK);
		}
		else {
			dataCollectionImpl.setVersion(version);
		}

		if (title == null) {
			dataCollectionImpl.setTitle(StringPool.BLANK);
		}
		else {
			dataCollectionImpl.setTitle(title);
		}

		dataCollectionImpl.setGroupId(groupId);
		dataCollectionImpl.setCompanyId(companyId);
		dataCollectionImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dataCollectionImpl.setCreateDate(null);
		}
		else {
			dataCollectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dataCollectionImpl.setModifiedDate(null);
		}
		else {
			dataCollectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		dataCollectionImpl.setDescription(description);
		dataCollectionImpl.setStatus(status);

		if (accessMethod == null) {
			dataCollectionImpl.setAccessMethod(StringPool.BLANK);
		}
		else {
			dataCollectionImpl.setAccessMethod(accessMethod);
		}

		dataCollectionImpl.setCollectionId(collectionId);
		dataCollectionImpl.setTypeId(typeId);

		dataCollectionImpl.resetOriginalValues();

		return dataCollectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		name = objectInput.readUTF();
		version = objectInput.readUTF();
		title = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		description = objectInput.readLong();

		status = objectInput.readInt();
		accessMethod = objectInput.readUTF();

		collectionId = objectInput.readLong();

		typeId = objectInput.readLong();
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

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(description);

		objectOutput.writeInt(status);

		if (accessMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accessMethod);
		}

		objectOutput.writeLong(collectionId);

		objectOutput.writeLong(typeId);
	}

	public String uuid;
	public String name;
	public String version;
	public String title;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long description;
	public int status;
	public String accessMethod;
	public long collectionId;
	public long typeId;
}