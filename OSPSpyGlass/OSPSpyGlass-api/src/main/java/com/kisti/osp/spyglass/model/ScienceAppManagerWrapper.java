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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ScienceAppManager}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppManager
 * @generated
 */
@ProviderType
public class ScienceAppManagerWrapper implements ScienceAppManager,
	ModelWrapper<ScienceAppManager> {
	public ScienceAppManagerWrapper(ScienceAppManager scienceAppManager) {
		_scienceAppManager = scienceAppManager;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppManager.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppManager.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppManagerId", getScienceAppManagerId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("managerId", getManagerId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppManagerId = (Long)attributes.get("scienceAppManagerId");

		if (scienceAppManagerId != null) {
			setScienceAppManagerId(scienceAppManagerId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		Long managerId = (Long)attributes.get("managerId");

		if (managerId != null) {
			setManagerId(managerId);
		}
	}

	@Override
	public ScienceAppManager toEscapedModel() {
		return new ScienceAppManagerWrapper(_scienceAppManager.toEscapedModel());
	}

	@Override
	public ScienceAppManager toUnescapedModel() {
		return new ScienceAppManagerWrapper(_scienceAppManager.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceAppManager.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceAppManager.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceAppManager.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceAppManager.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceAppManager> toCacheModel() {
		return _scienceAppManager.toCacheModel();
	}

	@Override
	public int compareTo(ScienceAppManager scienceAppManager) {
		return _scienceAppManager.compareTo(scienceAppManager);
	}

	@Override
	public int hashCode() {
		return _scienceAppManager.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppManager.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppManagerWrapper((ScienceAppManager)_scienceAppManager.clone());
	}

	/**
	* Returns the user uuid of this science app manager.
	*
	* @return the user uuid of this science app manager
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _scienceAppManager.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _scienceAppManager.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceAppManager.toXmlString();
	}

	/**
	* Returns the create date of this science app manager.
	*
	* @return the create date of this science app manager
	*/
	@Override
	public Date getCreateDate() {
		return _scienceAppManager.getCreateDate();
	}

	/**
	* Returns the manager ID of this science app manager.
	*
	* @return the manager ID of this science app manager
	*/
	@Override
	public long getManagerId() {
		return _scienceAppManager.getManagerId();
	}

	/**
	* Returns the primary key of this science app manager.
	*
	* @return the primary key of this science app manager
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceAppManager.getPrimaryKey();
	}

	/**
	* Returns the science app ID of this science app manager.
	*
	* @return the science app ID of this science app manager
	*/
	@Override
	public long getScienceAppId() {
		return _scienceAppManager.getScienceAppId();
	}

	/**
	* Returns the science app manager ID of this science app manager.
	*
	* @return the science app manager ID of this science app manager
	*/
	@Override
	public long getScienceAppManagerId() {
		return _scienceAppManager.getScienceAppManagerId();
	}

	/**
	* Returns the user ID of this science app manager.
	*
	* @return the user ID of this science app manager
	*/
	@Override
	public long getUserId() {
		return _scienceAppManager.getUserId();
	}

	@Override
	public void persist() {
		_scienceAppManager.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceAppManager.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this science app manager.
	*
	* @param createDate the create date of this science app manager
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_scienceAppManager.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceAppManager.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceAppManager.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceAppManager.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the manager ID of this science app manager.
	*
	* @param managerId the manager ID of this science app manager
	*/
	@Override
	public void setManagerId(long managerId) {
		_scienceAppManager.setManagerId(managerId);
	}

	@Override
	public void setNew(boolean n) {
		_scienceAppManager.setNew(n);
	}

	/**
	* Sets the primary key of this science app manager.
	*
	* @param primaryKey the primary key of this science app manager
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceAppManager.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceAppManager.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the science app ID of this science app manager.
	*
	* @param scienceAppId the science app ID of this science app manager
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppManager.setScienceAppId(scienceAppId);
	}

	/**
	* Sets the science app manager ID of this science app manager.
	*
	* @param scienceAppManagerId the science app manager ID of this science app manager
	*/
	@Override
	public void setScienceAppManagerId(long scienceAppManagerId) {
		_scienceAppManager.setScienceAppManagerId(scienceAppManagerId);
	}

	/**
	* Sets the user ID of this science app manager.
	*
	* @param userId the user ID of this science app manager
	*/
	@Override
	public void setUserId(long userId) {
		_scienceAppManager.setUserId(userId);
	}

	/**
	* Sets the user uuid of this science app manager.
	*
	* @param userUuid the user uuid of this science app manager
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_scienceAppManager.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppManagerWrapper)) {
			return false;
		}

		ScienceAppManagerWrapper scienceAppManagerWrapper = (ScienceAppManagerWrapper)obj;

		if (Objects.equals(_scienceAppManager,
					scienceAppManagerWrapper._scienceAppManager)) {
			return true;
		}

		return false;
	}

	@Override
	public ScienceAppManager getWrappedModel() {
		return _scienceAppManager;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceAppManager.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceAppManager.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceAppManager.resetOriginalValues();
	}

	private final ScienceAppManager _scienceAppManager;
}