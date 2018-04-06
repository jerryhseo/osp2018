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
 * This class is a wrapper for {@link ScienceAppLogPorts}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLogPorts
 * @generated
 */
@ProviderType
public class ScienceAppLogPortsWrapper implements ScienceAppLogPorts,
	ModelWrapper<ScienceAppLogPorts> {
	public ScienceAppLogPortsWrapper(ScienceAppLogPorts scienceAppLogPorts) {
		_scienceAppLogPorts = scienceAppLogPorts;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppLogPorts.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppLogPorts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("logPorts", getLogPorts());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String logPorts = (String)attributes.get("logPorts");

		if (logPorts != null) {
			setLogPorts(logPorts);
		}
	}

	@Override
	public ScienceAppLogPorts toEscapedModel() {
		return new ScienceAppLogPortsWrapper(_scienceAppLogPorts.toEscapedModel());
	}

	@Override
	public ScienceAppLogPorts toUnescapedModel() {
		return new ScienceAppLogPortsWrapper(_scienceAppLogPorts.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppLogPorts.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppLogPorts.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppLogPorts.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppLogPorts.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppLogPorts> toCacheModel() {
		return _scienceAppLogPorts.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppLogPorts scienceAppLogPorts) {
		return _scienceAppLogPorts.compareTo(scienceAppLogPorts);
	}

	@Override
	public int hashCode() {
		return _scienceAppLogPorts.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppLogPorts.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppLogPortsWrapper((ScienceAppLogPorts)_scienceAppLogPorts.clone());
	}

	/**
	* Returns the log ports of this science app log ports.
	*
	* @return the log ports of this science app log ports
	*/
	@Override
	public java.lang.String getLogPorts() {
		return _scienceAppLogPorts.getLogPorts();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppLogPorts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppLogPorts.toXmlString();
	}

	/**
	* Returns the primary key of this science app log ports.
	*
	* @return the primary key of this science app log ports
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppLogPorts.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app log ports.
	*
	* @return the science app ID of this science app log ports
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppLogPorts.getScienceAppId();
	}

	@Override
	public void persist() {
		_scienceAppLogPorts.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppLogPorts.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppLogPorts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppLogPorts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppLogPorts.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the log ports of this science app log ports.
	*
	* @param logPorts the log ports of this science app log ports
	*/
	@Override
	public void setLogPorts(java.lang.String logPorts) {
		_scienceAppLogPorts.setLogPorts(logPorts);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppLogPorts.setNew(n);
	}

	/**
	* Sets the primary key of this science app log ports.
	*
	* @param primaryKey the primary key of this science app log ports
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppLogPorts.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppLogPorts.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the science app ID of this science app log ports.
	*
	* @param scienceAppId the science app ID of this science app log ports
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppLogPorts.setScienceAppId(scienceAppId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppLogPortsWrapper)) {
			return false;
		}

		ScienceAppLogPortsWrapper scienceAppLogPortsWrapper = (ScienceAppLogPortsWrapper)obj;

		if (Objects.equals(_scienceAppLogPorts,
					scienceAppLogPortsWrapper._scienceAppLogPorts)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppLogPorts getWrappedModel() {
		return _scienceAppLogPorts;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppLogPorts.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppLogPorts.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppLogPorts.resetOriginalValues();
	}

	private final ScienceAppLogPorts _scienceAppLogPorts;
}