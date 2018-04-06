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
 * The base model interface for the ScienceAppOutputPorts service. Represents a row in the &quot;spyglass_ScienceAppOutputPorts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPorts
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsImpl
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsModelImpl
 * @generated
 */
@ProviderType
public interface ScienceAppOutputPortsModel extends BaseModel<ScienceAppOutputPorts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a science app output ports model instance should use the {@link ScienceAppOutputPorts} interface instead.
	 */

	/**
	 * Returns the primary key of this science app output ports.
	 *
	 * @return the primary key of this science app output ports
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this science app output ports.
	 *
	 * @param primaryKey the primary key of this science app output ports
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the science app ID of this science app output ports.
	 *
	 * @return the science app ID of this science app output ports
	 */
	public long getScienceAppId();

	/**
	 * Sets the science app ID of this science app output ports.
	 *
	 * @param scienceAppId the science app ID of this science app output ports
	 */
	public void setScienceAppId(long scienceAppId);

	/**
	 * Returns the output ports of this science app output ports.
	 *
	 * @return the output ports of this science app output ports
	 */
	@AutoEscape
	public String getOutputPorts();

	/**
	 * Sets the output ports of this science app output ports.
	 *
	 * @param outputPorts the output ports of this science app output ports
	 */
	public void setOutputPorts(String outputPorts);

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
	public int compareTo(ScienceAppOutputPorts scienceAppOutputPorts);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ScienceAppOutputPorts> toCacheModel();

	@Override
	public ScienceAppOutputPorts toEscapedModel();

	@Override
	public ScienceAppOutputPorts toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}