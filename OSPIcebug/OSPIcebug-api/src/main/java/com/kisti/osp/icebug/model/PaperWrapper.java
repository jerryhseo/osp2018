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

package com.kisti.osp.icebug.model;

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
 * This class is a wrapper for {@link Paper}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Paper
 * @generated
 */
@ProviderType
public class PaperWrapper implements Paper, ModelWrapper<Paper> {
	public PaperWrapper(Paper paper) {
		_paper = paper;
	}

	@Override
	public Class<?> getModelClass() {
		return Paper.class;
	}

	@Override
	public String getModelClassName() {
		return Paper.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("paperId", getPaperId());
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

		Long paperId = (Long)attributes.get("paperId");

		if (paperId != null) {
			setPaperId(paperId);
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
	public Paper toEscapedModel() {
		return new PaperWrapper(_paper.toEscapedModel());
	}

	@Override
	public Paper toUnescapedModel() {
		return new PaperWrapper(_paper.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _paper.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _paper.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _paper.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _paper.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Paper> toCacheModel() {
		return _paper.toCacheModel();
	}

	@Override
	public int compareTo(Paper paper) {
		return _paper.compareTo(paper);
	}

	@Override
	public int hashCode() {
		return _paper.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paper.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PaperWrapper((Paper)_paper.clone());
	}

	/**
	* Returns the user name of this paper.
	*
	* @return the user name of this paper
	*/
	@Override
	public java.lang.String getUserName() {
		return _paper.getUserName();
	}

	/**
	* Returns the user uuid of this paper.
	*
	* @return the user uuid of this paper
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _paper.getUserUuid();
	}

	/**
	* Returns the uuid of this paper.
	*
	* @return the uuid of this paper
	*/
	@Override
	public java.lang.String getUuid() {
		return _paper.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _paper.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paper.toXmlString();
	}

	/**
	* Returns the create date of this paper.
	*
	* @return the create date of this paper
	*/
	@Override
	public Date getCreateDate() {
		return _paper.getCreateDate();
	}

	/**
	* Returns the modified date of this paper.
	*
	* @return the modified date of this paper
	*/
	@Override
	public Date getModifiedDate() {
		return _paper.getModifiedDate();
	}

	/**
	* Returns the company ID of this paper.
	*
	* @return the company ID of this paper
	*/
	@Override
	public long getCompanyId() {
		return _paper.getCompanyId();
	}

	/**
	* Returns the group ID of this paper.
	*
	* @return the group ID of this paper
	*/
	@Override
	public long getGroupId() {
		return _paper.getGroupId();
	}

	/**
	* Returns the paper ID of this paper.
	*
	* @return the paper ID of this paper
	*/
	@Override
	public long getPaperId() {
		return _paper.getPaperId();
	}

	/**
	* Returns the primary key of this paper.
	*
	* @return the primary key of this paper
	*/
	@Override
	public long getPrimaryKey() {
		return _paper.getPrimaryKey();
	}

	/**
	* Returns the user ID of this paper.
	*
	* @return the user ID of this paper
	*/
	@Override
	public long getUserId() {
		return _paper.getUserId();
	}

	@Override
	public void persist() {
		_paper.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paper.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this paper.
	*
	* @param companyId the company ID of this paper
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paper.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this paper.
	*
	* @param createDate the create date of this paper
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_paper.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_paper.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_paper.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_paper.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this paper.
	*
	* @param groupId the group ID of this paper
	*/
	@Override
	public void setGroupId(long groupId) {
		_paper.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this paper.
	*
	* @param modifiedDate the modified date of this paper
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_paper.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_paper.setNew(n);
	}

	/**
	* Sets the paper ID of this paper.
	*
	* @param paperId the paper ID of this paper
	*/
	@Override
	public void setPaperId(long paperId) {
		_paper.setPaperId(paperId);
	}

	/**
	* Sets the primary key of this paper.
	*
	* @param primaryKey the primary key of this paper
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paper.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_paper.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this paper.
	*
	* @param userId the user ID of this paper
	*/
	@Override
	public void setUserId(long userId) {
		_paper.setUserId(userId);
	}

	/**
	* Sets the user name of this paper.
	*
	* @param userName the user name of this paper
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_paper.setUserName(userName);
	}

	/**
	* Sets the user uuid of this paper.
	*
	* @param userUuid the user uuid of this paper
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_paper.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this paper.
	*
	* @param uuid the uuid of this paper
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_paper.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaperWrapper)) {
			return false;
		}

		PaperWrapper paperWrapper = (PaperWrapper)obj;

		if (Objects.equals(_paper, paperWrapper._paper)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _paper.getStagedModelType();
	}

	@Override
	public Paper getWrappedModel() {
		return _paper;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _paper.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _paper.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_paper.resetOriginalValues();
	}

	private final Paper _paper;
}