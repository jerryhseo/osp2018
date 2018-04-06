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

package com.kisti.osp.spyglass.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the ScienceAppLogPorts service. Represents a row in the &quot;spyglass_ScienceAppLogPorts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLogPorts
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsImpl
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsModelImpl
 * @generated
 */
@ProviderType
public interface ScienceAppLogPortsModel extends BaseModel<ScienceAppLogPorts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a science app log ports model instance should use the {@link ScienceAppLogPorts} interface instead.
	 */

	/**
	 * Returns the primary key of this science app log ports.
	 *
	 * @return the primary key of this science app log ports
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this science app log ports.
	 *
	 * @param primaryKey the primary key of this science app log ports
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the science app ID of this science app log ports.
	 *
	 * @return the science app ID of this science app log ports
	 */
	public long getScienceAppId();

	/**
	 * Sets the science app ID of this science app log ports.
	 *
	 * @param scienceAppId the science app ID of this science app log ports
	 */
	public void setScienceAppId(long scienceAppId);

	/**
	 * Returns the log ports of this science app log ports.
	 *
	 * @return the log ports of this science app log ports
	 */
	@AutoEscape
	public String getLogPorts();

	/**
	 * Sets the log ports of this science app log ports.
	 *
	 * @param logPorts the log ports of this science app log ports
	 */
	public void setLogPorts(String logPorts);

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
	public int compareTo(ScienceAppLogPorts scienceAppLogPorts);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ScienceAppLogPorts> toCacheModel();

	@Override
	public ScienceAppLogPorts toEscapedModel();

	@Override
	public ScienceAppLogPorts toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}