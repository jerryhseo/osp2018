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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ScienceAppOutputPorts}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPorts
 * @generated
 */
@ProviderType
public class ScienceAppOutputPortsWrapper implements ScienceAppOutputPorts,
	ModelWrapper<ScienceAppOutputPorts> {
	public ScienceAppOutputPortsWrapper(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		_scienceAppOutputPorts = scienceAppOutputPorts;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppOutputPorts.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppOutputPorts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("outputPorts", getOutputPorts());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String outputPorts = (String)attributes.get("outputPorts");

		if (outputPorts != null) {
			setOutputPorts(outputPorts);
		}
	}

	@Override
	public ScienceAppOutputPorts toEscapedModel() {
		return new ScienceAppOutputPortsWrapper(_scienceAppOutputPorts.toEscapedModel());
	}

	@Override
	public ScienceAppOutputPorts toUnescapedModel() {
		return new ScienceAppOutputPortsWrapper(_scienceAppOutputPorts.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppOutputPorts.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppOutputPorts.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppOutputPorts.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppOutputPorts.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppOutputPorts> toCacheModel() {
		return _scienceAppOutputPorts.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppOutputPorts scienceAppOutputPorts) {
		return _scienceAppOutputPorts.compareTo(scienceAppOutputPorts);
	}

	@Override
	public int hashCode() {
		return _scienceAppOutputPorts.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppOutputPorts.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppOutputPortsWrapper((ScienceAppOutputPorts)_scienceAppOutputPorts.clone());
	}

	/**
	* Returns the output ports of this science app output ports.
	*
	* @return the output ports of this science app output ports
	*/
	@Override
	public java.lang.String getOutputPorts() {
		return _scienceAppOutputPorts.getOutputPorts();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppOutputPorts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppOutputPorts.toXmlString();
	}

	/**
	* Returns the primary key of this science app output ports.
	*
	* @return the primary key of this science app output ports
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppOutputPorts.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app output ports.
	*
	* @return the science app ID of this science app output ports
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppOutputPorts.getScienceAppId();
	}

	@Override
	public void persist() {
		_scienceAppOutputPorts.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppOutputPorts.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppOutputPorts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppOutputPorts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppOutputPorts.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppOutputPorts.setNew(n);
	}

	/**
	* Sets the output ports of this science app output ports.
	*
	* @param outputPorts the output ports of this science app output ports
	*/
	@Override
	public void setOutputPorts(java.lang.String outputPorts) {
		_scienceAppOutputPorts.setOutputPorts(outputPorts);
	}

	/**
	* Sets the primary key of this science app output ports.
	*
	* @param primaryKey the primary key of this science app output ports
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppOutputPorts.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppOutputPorts.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the science app ID of this science app output ports.
	*
	* @param scienceAppId the science app ID of this science app output ports
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppOutputPorts.setScienceAppId(scienceAppId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppOutputPortsWrapper)) {
			return false;
		}

		ScienceAppOutputPortsWrapper scienceAppOutputPortsWrapper = (ScienceAppOutputPortsWrapper)obj;

		if (Objects.equals(_scienceAppOutputPorts,
					scienceAppOutputPortsWrapper._scienceAppOutputPorts)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppOutputPorts getWrappedModel() {
		return _scienceAppOutputPorts;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppOutputPorts.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppOutputPorts.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppOutputPorts.resetOriginalValues();
	}

	private final ScienceAppOutputPorts _scienceAppOutputPorts;
}