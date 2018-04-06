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
 * This class is a wrapper for {@link ScienceAppLayout}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayout
 * @generated
 */
@ProviderType
public class ScienceAppLayoutWrapper implements ScienceAppLayout,
	ModelWrapper<ScienceAppLayout> {
	public ScienceAppLayoutWrapper(ScienceAppLayout scienceAppLayout) {
		_scienceAppLayout = scienceAppLayout;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppLayout.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppLayout.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("layout", getLayout());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String layout = (String)attributes.get("layout");

		if (layout != null) {
			setLayout(layout);
		}
	}

	@Override
	public ScienceAppLayout toEscapedModel() {
		return new ScienceAppLayoutWrapper(_scienceAppLayout.toEscapedModel());
	}

	@Override
	public ScienceAppLayout toUnescapedModel() {
		return new ScienceAppLayoutWrapper(_scienceAppLayout.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppLayout.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppLayout.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppLayout.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppLayout.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppLayout> toCacheModel() {
		return _scienceAppLayout.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppLayout scienceAppLayout) {
		return _scienceAppLayout.compareTo(scienceAppLayout);
	}

	@Override
	public int hashCode() {
		return _scienceAppLayout.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppLayout.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppLayoutWrapper((ScienceAppLayout)_scienceAppLayout.clone());
	}

	/**
	* Returns the layout of this science app layout.
	*
	* @return the layout of this science app layout
	*/
	@Override
	public java.lang.String getLayout() {
		return _scienceAppLayout.getLayout();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppLayout.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppLayout.toXmlString();
	}

	/**
	* Returns the primary key of this science app layout.
	*
	* @return the primary key of this science app layout
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppLayout.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app layout.
	*
	* @return the science app ID of this science app layout
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppLayout.getScienceAppId();
	}

	@Override
	public void persist() {
		_scienceAppLayout.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppLayout.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppLayout.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppLayout.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppLayout.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the layout of this science app layout.
	*
	* @param layout the layout of this science app layout
	*/
	@Override
	public void setLayout(java.lang.String layout) {
		_scienceAppLayout.setLayout(layout);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppLayout.setNew(n);
	}

	/**
	* Sets the primary key of this science app layout.
	*
	* @param primaryKey the primary key of this science app layout
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppLayout.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppLayout.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the science app ID of this science app layout.
	*
	* @param scienceAppId the science app ID of this science app layout
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppLayout.setScienceAppId(scienceAppId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppLayoutWrapper)) {
			return false;
		}

		ScienceAppLayoutWrapper scienceAppLayoutWrapper = (ScienceAppLayoutWrapper)obj;

		if (Objects.equals(_scienceAppLayout,
					scienceAppLayoutWrapper._scienceAppLayout)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppLayout getWrappedModel() {
		return _scienceAppLayout;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppLayout.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppLayout.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppLayout.resetOriginalValues();
	}

	private final ScienceAppLayout _scienceAppLayout;
}