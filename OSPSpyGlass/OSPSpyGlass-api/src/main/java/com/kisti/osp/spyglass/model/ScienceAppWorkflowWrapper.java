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
 * This class is a wrapper for {@link ScienceAppWorkflow}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppWorkflow
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowWrapper implements ScienceAppWorkflow,
	ModelWrapper<ScienceAppWorkflow> {
	public ScienceAppWorkflowWrapper(ScienceAppWorkflow scienceAppWorkflow) {
		_scienceAppWorkflow = scienceAppWorkflow;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppWorkflow.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppWorkflow.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("definition", getDefinition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String definition = (String)attributes.get("definition");

		if (definition != null) {
			setDefinition(definition);
		}
	}

	@Override
	public ScienceAppWorkflow toEscapedModel() {
		return new ScienceAppWorkflowWrapper(_scienceAppWorkflow.toEscapedModel());
	}

	@Override
	public ScienceAppWorkflow toUnescapedModel() {
		return new ScienceAppWorkflowWrapper(_scienceAppWorkflow.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppWorkflow.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppWorkflow.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppWorkflow.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppWorkflow.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppWorkflow> toCacheModel() {
		return _scienceAppWorkflow.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppWorkflow scienceAppWorkflow) {
		return _scienceAppWorkflow.compareTo(scienceAppWorkflow);
	}

	@Override
	public int hashCode() {
		return _scienceAppWorkflow.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppWorkflow.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppWorkflowWrapper((ScienceAppWorkflow)_scienceAppWorkflow.clone());
	}

	/**
	* Returns the definition of this science app workflow.
	*
	* @return the definition of this science app workflow
	*/
	@Override
	public java.lang.String getDefinition() {
		return _scienceAppWorkflow.getDefinition();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppWorkflow.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppWorkflow.toXmlString();
	}

	/**
	* Returns the primary key of this science app workflow.
	*
	* @return the primary key of this science app workflow
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppWorkflow.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app workflow.
	*
	* @return the science app ID of this science app workflow
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppWorkflow.getScienceAppId();
	}

	@Override
	public void persist() {
		_scienceAppWorkflow.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppWorkflow.setCachedModel(cachedModel);
	}

	/**
	* Sets the definition of this science app workflow.
	*
	* @param definition the definition of this science app workflow
	*/
	@Override
	public void setDefinition(java.lang.String definition) {
		_scienceAppWorkflow.setDefinition(definition);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppWorkflow.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppWorkflow.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppWorkflow.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppWorkflow.setNew(n);
	}

	/**
	* Sets the primary key of this science app workflow.
	*
	* @param primaryKey the primary key of this science app workflow
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppWorkflow.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppWorkflow.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the science app ID of this science app workflow.
	*
	* @param scienceAppId the science app ID of this science app workflow
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppWorkflow.setScienceAppId(scienceAppId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppWorkflowWrapper)) {
			return false;
		}

		ScienceAppWorkflowWrapper scienceAppWorkflowWrapper = (ScienceAppWorkflowWrapper)obj;

		if (Objects.equals(_scienceAppWorkflow,
					scienceAppWorkflowWrapper._scienceAppWorkflow)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppWorkflow getWrappedModel() {
		return _scienceAppWorkflow;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppWorkflow.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppWorkflow.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppWorkflow.resetOriginalValues();
	}

	private final ScienceAppWorkflow _scienceAppWorkflow;
}