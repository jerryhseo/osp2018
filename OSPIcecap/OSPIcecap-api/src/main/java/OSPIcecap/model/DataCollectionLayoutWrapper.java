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
 * This class is a wrapper for {@link DataCollectionLayout}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataCollectionLayout
 * @generated
 */
@ProviderType
public class DataCollectionLayoutWrapper implements DataCollectionLayout,
	ModelWrapper<DataCollectionLayout> {
	public DataCollectionLayoutWrapper(
		DataCollectionLayout dataCollectionLayout) {
		_dataCollectionLayout = dataCollectionLayout;
	}

	@Override
	public Class<?> getModelClass() {
		return DataCollectionLayout.class;
	}

	@Override
	public String getModelClassName() {
		return DataCollectionLayout.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("collectionId", getCollectionId());
		attributes.put("layout", getLayout());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long collectionId = (Long)attributes.get("collectionId");

		if (collectionId != null) {
			setCollectionId(collectionId);
		}

		String layout = (String)attributes.get("layout");

		if (layout != null) {
			setLayout(layout);
		}
	}

	@Override
	public OSPIcecap.model.DataCollectionLayout toEscapedModel() {
		return new DataCollectionLayoutWrapper(_dataCollectionLayout.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataCollectionLayout toUnescapedModel() {
		return new DataCollectionLayoutWrapper(_dataCollectionLayout.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dataCollectionLayout.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataCollectionLayout.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataCollectionLayout.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataCollectionLayout.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataCollectionLayout> toCacheModel() {
		return _dataCollectionLayout.toCacheModel();
	}

	@Override
	public int compareTo(
		OSPIcecap.model.DataCollectionLayout dataCollectionLayout) {
		return _dataCollectionLayout.compareTo(dataCollectionLayout);
	}

	@Override
	public int hashCode() {
		return _dataCollectionLayout.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataCollectionLayout.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataCollectionLayoutWrapper((DataCollectionLayout)_dataCollectionLayout.clone());
	}

	/**
	* Returns the layout of this data collection layout.
	*
	* @return the layout of this data collection layout
	*/
	@Override
	public java.lang.String getLayout() {
		return _dataCollectionLayout.getLayout();
	}

	@Override
	public java.lang.String toString() {
		return _dataCollectionLayout.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataCollectionLayout.toXmlString();
	}

	/**
	* Returns the collection ID of this data collection layout.
	*
	* @return the collection ID of this data collection layout
	*/
	@Override
	public long getCollectionId() {
		return _dataCollectionLayout.getCollectionId();
	}

	/**
	* Returns the primary key of this data collection layout.
	*
	* @return the primary key of this data collection layout
	*/
	@Override
	public long getPrimaryKey() {
		return _dataCollectionLayout.getPrimaryKey();
	}

	@Override
	public void persist() {
		_dataCollectionLayout.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataCollectionLayout.setCachedModel(cachedModel);
	}

	/**
	* Sets the collection ID of this data collection layout.
	*
	* @param collectionId the collection ID of this data collection layout
	*/
	@Override
	public void setCollectionId(long collectionId) {
		_dataCollectionLayout.setCollectionId(collectionId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataCollectionLayout.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataCollectionLayout.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataCollectionLayout.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the layout of this data collection layout.
	*
	* @param layout the layout of this data collection layout
	*/
	@Override
	public void setLayout(java.lang.String layout) {
		_dataCollectionLayout.setLayout(layout);
	}

	@Override
	public void setNew(boolean n) {
		_dataCollectionLayout.setNew(n);
	}

	/**
	* Sets the primary key of this data collection layout.
	*
	* @param primaryKey the primary key of this data collection layout
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataCollectionLayout.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataCollectionLayout.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataCollectionLayoutWrapper)) {
			return false;
		}

		DataCollectionLayoutWrapper dataCollectionLayoutWrapper = (DataCollectionLayoutWrapper)obj;

		if (Objects.equals(_dataCollectionLayout,
					dataCollectionLayoutWrapper._dataCollectionLayout)) {
			return true;
		}

		return false;
	}

	@Override
	public DataCollectionLayout getWrappedModel() {
		return _dataCollectionLayout;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataCollectionLayout.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataCollectionLayout.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataCollectionLayout.resetOriginalValues();
	}

	private final DataCollectionLayout _dataCollectionLayout;
}