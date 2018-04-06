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

package com.kisti.osp.meridian.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Lab}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Lab
 * @generated
 */
@ProviderType
public class LabWrapper implements Lab, ModelWrapper<Lab> {
	public LabWrapper(Lab lab) {
		_lab = lab;
	}

	@Override
	public Class<?> getModelClass() {
		return Lab.class;
	}

	@Override
	public String getModelClassName() {
		return Lab.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("labId", getLabId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long labId = (Long)attributes.get("labId");

		if (labId != null) {
			setLabId(labId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Lab toEscapedModel() {
		return new LabWrapper(_lab.toEscapedModel());
	}

	@Override
	public Lab toUnescapedModel() {
		return new LabWrapper(_lab.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _lab.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _lab.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _lab.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lab.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Lab> toCacheModel() {
		return _lab.toCacheModel();
	}

	@Override
	public int compareTo(Lab lab) {
		return _lab.compareTo(lab);
	}

	@Override
	public int hashCode() {
		return _lab.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lab.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LabWrapper((Lab)_lab.clone());
	}

	/**
	* Returns the user name of this lab.
	*
	* @return the user name of this lab
	*/
	@Override
	public java.lang.String getUserName() {
		return _lab.getUserName();
	}

	/**
	* Returns the user uuid of this lab.
	*
	* @return the user uuid of this lab
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _lab.getUserUuid();
	}

	/**
	* Returns the uuid of this lab.
	*
	* @return the uuid of this lab
	*/
	@Override
	public java.lang.String getUuid() {
		return _lab.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _lab.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lab.toXmlString();
	}

	/**
	* Returns the create date of this lab.
	*
	* @return the create date of this lab
	*/
	@Override
	public Date getCreateDate() {
		return _lab.getCreateDate();
	}

	/**
	* Returns the modified date of this lab.
	*
	* @return the modified date of this lab
	*/
	@Override
	public Date getModifiedDate() {
		return _lab.getModifiedDate();
	}

	/**
	* Returns the company ID of this lab.
	*
	* @return the company ID of this lab
	*/
	@Override
	public long getCompanyId() {
		return _lab.getCompanyId();
	}

	/**
	* Returns the group ID of this lab.
	*
	* @return the group ID of this lab
	*/
	@Override
	public long getGroupId() {
		return _lab.getGroupId();
	}

	/**
	* Returns the lab ID of this lab.
	*
	* @return the lab ID of this lab
	*/
	@Override
	public long getLabId() {
		return _lab.getLabId();
	}

	/**
	* Returns the primary key of this lab.
	*
	* @return the primary key of this lab
	*/
	@Override
	public long getPrimaryKey() {
		return _lab.getPrimaryKey();
	}

	/**
	* Returns the user ID of this lab.
	*
	* @return the user ID of this lab
	*/
	@Override
	public long getUserId() {
		return _lab.getUserId();
	}

	@Override
	public void persist() {
		_lab.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lab.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this lab.
	*
	* @param companyId the company ID of this lab
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lab.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this lab.
	*
	* @param createDate the create date of this lab
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_lab.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lab.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_lab.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lab.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this lab.
	*
	* @param groupId the group ID of this lab
	*/
	@Override
	public void setGroupId(long groupId) {
		_lab.setGroupId(groupId);
	}

	/**
	* Sets the lab ID of this lab.
	*
	* @param labId the lab ID of this lab
	*/
	@Override
	public void setLabId(long labId) {
		_lab.setLabId(labId);
	}

	/**
	* Sets the modified date of this lab.
	*
	* @param modifiedDate the modified date of this lab
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_lab.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_lab.setNew(n);
	}

	/**
	* Sets the primary key of this lab.
	*
	* @param primaryKey the primary key of this lab
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lab.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lab.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this lab.
	*
	* @param userId the user ID of this lab
	*/
	@Override
	public void setUserId(long userId) {
		_lab.setUserId(userId);
	}

	/**
	* Sets the user name of this lab.
	*
	* @param userName the user name of this lab
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_lab.setUserName(userName);
	}

	/**
	* Sets the user uuid of this lab.
	*
	* @param userUuid the user uuid of this lab
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_lab.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this lab.
	*
	* @param uuid the uuid of this lab
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_lab.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LabWrapper)) {
			return false;
		}

		LabWrapper labWrapper = (LabWrapper)obj;

		if (Objects.equals(_lab, labWrapper._lab)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _lab.getStagedModelType();
	}

	@Override
	public Lab getWrappedModel() {
		return _lab;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lab.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lab.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lab.resetOriginalValues();
	}

	private final Lab _lab;
}