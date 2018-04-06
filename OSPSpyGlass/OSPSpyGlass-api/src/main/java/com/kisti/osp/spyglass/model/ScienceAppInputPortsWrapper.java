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
 * This class is a wrapper for {@link ScienceAppInputPorts}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppInputPorts
 * @generated
 */
@ProviderType
public class ScienceAppInputPortsWrapper implements ScienceAppInputPorts,
	ModelWrapper<ScienceAppInputPorts> {
	public ScienceAppInputPortsWrapper(
		ScienceAppInputPorts scienceAppInputPorts) {
		_scienceAppInputPorts = scienceAppInputPorts;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppInputPorts.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppInputPorts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("samplePath", getSamplePath());
		attributes.put("inputPorts", getInputPorts());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String samplePath = (String)attributes.get("samplePath");

		if (samplePath != null) {
			setSamplePath(samplePath);
		}

		String inputPorts = (String)attributes.get("inputPorts");

		if (inputPorts != null) {
			setInputPorts(inputPorts);
		}
	}

	@Override
	public ScienceAppInputPorts toEscapedModel() {
		return new ScienceAppInputPortsWrapper(_scienceAppInputPorts.toEscapedModel());
	}

	@Override
	public ScienceAppInputPorts toUnescapedModel() {
		return new ScienceAppInputPortsWrapper(_scienceAppInputPorts.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppInputPorts.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppInputPorts.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppInputPorts.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppInputPorts.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppInputPorts> toCacheModel() {
		return _scienceAppInputPorts.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppInputPorts scienceAppInputPorts) {
		return _scienceAppInputPorts.compareTo(scienceAppInputPorts);
	}

	@Override
	public int hashCode() {
		return _scienceAppInputPorts.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppInputPorts.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppInputPortsWrapper((ScienceAppInputPorts)_scienceAppInputPorts.clone());
	}

	/**
	* Returns the input ports of this science app input ports.
	*
	* @return the input ports of this science app input ports
	*/
	@Override
	public java.lang.String getInputPorts() {
		return _scienceAppInputPorts.getInputPorts();
	}

	/**
	* Returns the sample path of this science app input ports.
	*
	* @return the sample path of this science app input ports
	*/
	@Override
	public java.lang.String getSamplePath() {
		return _scienceAppInputPorts.getSamplePath();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppInputPorts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppInputPorts.toXmlString();
	}

	/**
	* Returns the primary key of this science app input ports.
	*
	* @return the primary key of this science app input ports
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppInputPorts.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app input ports.
	*
	* @return the science app ID of this science app input ports
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppInputPorts.getScienceAppId();
	}

	@Override
	public void persist() {
		_scienceAppInputPorts.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppInputPorts.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppInputPorts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppInputPorts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppInputPorts.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the input ports of this science app input ports.
	*
	* @param inputPorts the input ports of this science app input ports
	*/
	@Override
	public void setInputPorts(java.lang.String inputPorts) {
		_scienceAppInputPorts.setInputPorts(inputPorts);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppInputPorts.setNew(n);
	}

	/**
	* Sets the primary key of this science app input ports.
	*
	* @param primaryKey the primary key of this science app input ports
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppInputPorts.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppInputPorts.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sample path of this science app input ports.
	*
	* @param samplePath the sample path of this science app input ports
	*/
	@Override
	public void setSamplePath(java.lang.String samplePath) {
		_scienceAppInputPorts.setSamplePath(samplePath);
	}

	/**
	* Sets the science app ID of this science app input ports.
	*
	* @param scienceAppId the science app ID of this science app input ports
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppInputPorts.setScienceAppId(scienceAppId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppInputPortsWrapper)) {
			return false;
		}

		ScienceAppInputPortsWrapper scienceAppInputPortsWrapper = (ScienceAppInputPortsWrapper)obj;

		if (Objects.equals(_scienceAppInputPorts,
					scienceAppInputPortsWrapper._scienceAppInputPorts)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppInputPorts getWrappedModel() {
		return _scienceAppInputPorts;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppInputPorts.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppInputPorts.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppInputPorts.resetOriginalValues();
	}

	private final ScienceAppInputPorts _scienceAppInputPorts;
}