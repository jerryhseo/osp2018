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

package OSPIcecap.model;

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
 * This class is a wrapper for {@link DataTypeAnalyzerLink}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLink
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkWrapper implements DataTypeAnalyzerLink,
	ModelWrapper<DataTypeAnalyzerLink> {
	public DataTypeAnalyzerLinkWrapper(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		_dataTypeAnalyzerLink = dataTypeAnalyzerLink;
	}

	@Override
	public Class<?> getModelClass() {
		return DataTypeAnalyzerLink.class;
	}

	@Override
	public String getModelClassName() {
		return DataTypeAnalyzerLink.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linkId", getLinkId());
		attributes.put("typeId", getTypeId());
		attributes.put("analyzerId", getAnalyzerId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linkId = (Long)attributes.get("linkId");

		if (linkId != null) {
			setLinkId(linkId);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Long analyzerId = (Long)attributes.get("analyzerId");

		if (analyzerId != null) {
			setAnalyzerId(analyzerId);
		}
	}

	@Override
	public OSPIcecap.model.DataTypeAnalyzerLink toEscapedModel() {
		return new DataTypeAnalyzerLinkWrapper(_dataTypeAnalyzerLink.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataTypeAnalyzerLink toUnescapedModel() {
		return new DataTypeAnalyzerLinkWrapper(_dataTypeAnalyzerLink.toUnescapedModel());
	}

	/**
	* Returns the primary key of this data type analyzer link.
	*
	* @return the primary key of this data type analyzer link
	*/
	@Override
	public OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK getPrimaryKey() {
		return _dataTypeAnalyzerLink.getPrimaryKey();
	}

	@Override
	public boolean isCachedModel() {
		return _dataTypeAnalyzerLink.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataTypeAnalyzerLink.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataTypeAnalyzerLink.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataTypeAnalyzerLink.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataTypeAnalyzerLink> toCacheModel() {
		return _dataTypeAnalyzerLink.toCacheModel();
	}

	@Override
	public int compareTo(
		OSPIcecap.model.DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		return _dataTypeAnalyzerLink.compareTo(dataTypeAnalyzerLink);
	}

	@Override
	public int hashCode() {
		return _dataTypeAnalyzerLink.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataTypeAnalyzerLink.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataTypeAnalyzerLinkWrapper((DataTypeAnalyzerLink)_dataTypeAnalyzerLink.clone());
	}

	@Override
	public java.lang.String toString() {
		return _dataTypeAnalyzerLink.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataTypeAnalyzerLink.toXmlString();
	}

	/**
	* Returns the analyzer ID of this data type analyzer link.
	*
	* @return the analyzer ID of this data type analyzer link
	*/
	@Override
	public long getAnalyzerId() {
		return _dataTypeAnalyzerLink.getAnalyzerId();
	}

	/**
	* Returns the link ID of this data type analyzer link.
	*
	* @return the link ID of this data type analyzer link
	*/
	@Override
	public long getLinkId() {
		return _dataTypeAnalyzerLink.getLinkId();
	}

	/**
	* Returns the type ID of this data type analyzer link.
	*
	* @return the type ID of this data type analyzer link
	*/
	@Override
	public long getTypeId() {
		return _dataTypeAnalyzerLink.getTypeId();
	}

	@Override
	public void persist() {
		_dataTypeAnalyzerLink.persist();
	}

	/**
	* Sets the analyzer ID of this data type analyzer link.
	*
	* @param analyzerId the analyzer ID of this data type analyzer link
	*/
	@Override
	public void setAnalyzerId(long analyzerId) {
		_dataTypeAnalyzerLink.setAnalyzerId(analyzerId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataTypeAnalyzerLink.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataTypeAnalyzerLink.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataTypeAnalyzerLink.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataTypeAnalyzerLink.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the link ID of this data type analyzer link.
	*
	* @param linkId the link ID of this data type analyzer link
	*/
	@Override
	public void setLinkId(long linkId) {
		_dataTypeAnalyzerLink.setLinkId(linkId);
	}

	@Override
	public void setNew(boolean n) {
		_dataTypeAnalyzerLink.setNew(n);
	}

	/**
	* Sets the primary key of this data type analyzer link.
	*
	* @param primaryKey the primary key of this data type analyzer link
	*/
	@Override
	public void setPrimaryKey(
		OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK primaryKey) {
		_dataTypeAnalyzerLink.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataTypeAnalyzerLink.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type ID of this data type analyzer link.
	*
	* @param typeId the type ID of this data type analyzer link
	*/
	@Override
	public void setTypeId(long typeId) {
		_dataTypeAnalyzerLink.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeAnalyzerLinkWrapper)) {
			return false;
		}

		DataTypeAnalyzerLinkWrapper dataTypeAnalyzerLinkWrapper = (DataTypeAnalyzerLinkWrapper)obj;

		if (Objects.equals(_dataTypeAnalyzerLink,
					dataTypeAnalyzerLinkWrapper._dataTypeAnalyzerLink)) {
			return true;
		}

		return false;
	}

	@Override
	public DataTypeAnalyzerLink getWrappedModel() {
		return _dataTypeAnalyzerLink;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataTypeAnalyzerLink.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataTypeAnalyzerLink.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataTypeAnalyzerLink.resetOriginalValues();
	}

	private final DataTypeAnalyzerLink _dataTypeAnalyzerLink;
}