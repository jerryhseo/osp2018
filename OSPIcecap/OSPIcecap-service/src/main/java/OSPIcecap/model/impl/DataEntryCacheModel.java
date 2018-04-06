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

import OSPIcecap.model.DataEntry;

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
 * The cache model class for representing DataEntry in entity cache.
 *
 * @author Jerry H. Seo
 * @see DataEntry
 * @generated
 */
@ProviderType
public class DataEntryCacheModel implements CacheModel<DataEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataEntryCacheModel)) {
			return false;
		}

		DataEntryCacheModel dataEntryCacheModel = (DataEntryCacheModel)obj;

		if (entryId == dataEntryCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{entryId=");
		sb.append(entryId);
		sb.append(", collectionId=");
		sb.append(collectionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", comments=");
		sb.append(comments);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataEntry toEntityModel() {
		DataEntryImpl dataEntryImpl = new DataEntryImpl();

		dataEntryImpl.setEntryId(entryId);
		dataEntryImpl.setCollectionId(collectionId);
		dataEntryImpl.setGroupId(groupId);
		dataEntryImpl.setCompanyId(companyId);
		dataEntryImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dataEntryImpl.setCreateDate(null);
		}
		else {
			dataEntryImpl.setCreateDate(new Date(createDate));
		}

		if (comments == null) {
			dataEntryImpl.setComments(StringPool.BLANK);
		}
		else {
			dataEntryImpl.setComments(comments);
		}

		dataEntryImpl.resetOriginalValues();

		return dataEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		entryId = objectInput.readLong();

		collectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		comments = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(entryId);

		objectOutput.writeLong(collectionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}
	}

	public long entryId;
	public long collectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public String comments;
}