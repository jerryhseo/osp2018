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

import OSPIcecap.model.DataCollectionLayout;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DataCollectionLayout in entity cache.
 *
 * @author Jerry H. Seo
 * @see DataCollectionLayout
 * @generated
 */
@ProviderType
public class DataCollectionLayoutCacheModel implements CacheModel<DataCollectionLayout>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataCollectionLayoutCacheModel)) {
			return false;
		}

		DataCollectionLayoutCacheModel dataCollectionLayoutCacheModel = (DataCollectionLayoutCacheModel)obj;

		if (collectionId == dataCollectionLayoutCacheModel.collectionId) {
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
		StringBundler sb = new StringBundler(5);

		sb.append("{collectionId=");
		sb.append(collectionId);
		sb.append(", layout=");
		sb.append(layout);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataCollectionLayout toEntityModel() {
		DataCollectionLayoutImpl dataCollectionLayoutImpl = new DataCollectionLayoutImpl();

		dataCollectionLayoutImpl.setCollectionId(collectionId);

		if (layout == null) {
			dataCollectionLayoutImpl.setLayout(StringPool.BLANK);
		}
		else {
			dataCollectionLayoutImpl.setLayout(layout);
		}

		dataCollectionLayoutImpl.resetOriginalValues();

		return dataCollectionLayoutImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		collectionId = objectInput.readLong();
		layout = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(collectionId);

		if (layout == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(layout);
		}
	}

	public long collectionId;
	public String layout;
}