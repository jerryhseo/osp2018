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

import OSPIcecap.model.DataTypeAnalyzerLink;

import OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DataTypeAnalyzerLink in entity cache.
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLink
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkCacheModel implements CacheModel<DataTypeAnalyzerLink>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeAnalyzerLinkCacheModel)) {
			return false;
		}

		DataTypeAnalyzerLinkCacheModel dataTypeAnalyzerLinkCacheModel = (DataTypeAnalyzerLinkCacheModel)obj;

		if (dataTypeAnalyzerLinkPK.equals(
					dataTypeAnalyzerLinkCacheModel.dataTypeAnalyzerLinkPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dataTypeAnalyzerLinkPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{linkId=");
		sb.append(linkId);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", analyzerId=");
		sb.append(analyzerId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataTypeAnalyzerLink toEntityModel() {
		DataTypeAnalyzerLinkImpl dataTypeAnalyzerLinkImpl = new DataTypeAnalyzerLinkImpl();

		dataTypeAnalyzerLinkImpl.setLinkId(linkId);
		dataTypeAnalyzerLinkImpl.setTypeId(typeId);
		dataTypeAnalyzerLinkImpl.setAnalyzerId(analyzerId);

		dataTypeAnalyzerLinkImpl.resetOriginalValues();

		return dataTypeAnalyzerLinkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		linkId = objectInput.readLong();

		typeId = objectInput.readLong();

		analyzerId = objectInput.readLong();

		dataTypeAnalyzerLinkPK = new DataTypeAnalyzerLinkPK(linkId, analyzerId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(linkId);

		objectOutput.writeLong(typeId);

		objectOutput.writeLong(analyzerId);
	}

	public long linkId;
	public long typeId;
	public long analyzerId;
	public transient DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK;
}