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

package com.kisti.osp.spyglass.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.spyglass.model.ScienceAppWorkflow;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ScienceAppWorkflow in entity cache.
 *
 * @author Jerry H. Seo
 * @see ScienceAppWorkflow
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowCacheModel implements CacheModel<ScienceAppWorkflow>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppWorkflowCacheModel)) {
			return false;
		}

		ScienceAppWorkflowCacheModel scienceAppWorkflowCacheModel = (ScienceAppWorkflowCacheModel)obj;

		if (scienceAppId == scienceAppWorkflowCacheModel.scienceAppId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, scienceAppId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{scienceAppId=");
		sb.append(scienceAppId);
		sb.append(", definition=");
		sb.append(definition);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ScienceAppWorkflow toEntityModel() {
		ScienceAppWorkflowImpl scienceAppWorkflowImpl = new ScienceAppWorkflowImpl();

		scienceAppWorkflowImpl.setScienceAppId(scienceAppId);

		if (definition == null) {
			scienceAppWorkflowImpl.setDefinition(StringPool.BLANK);
		}
		else {
			scienceAppWorkflowImpl.setDefinition(definition);
		}

		scienceAppWorkflowImpl.resetOriginalValues();

		return scienceAppWorkflowImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		scienceAppId = objectInput.readLong();
		definition = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(scienceAppId);

		if (definition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(definition);
		}
	}

	public long scienceAppId;
	public String definition;
}