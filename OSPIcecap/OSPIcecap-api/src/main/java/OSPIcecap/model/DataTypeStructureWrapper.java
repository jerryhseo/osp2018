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
 * This class is a wrapper for {@link DataTypeStructure}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeStructure
 * @generated
 */
@ProviderType
public class DataTypeStructureWrapper implements DataTypeStructure,
	ModelWrapper<DataTypeStructure> {
	public DataTypeStructureWrapper(DataTypeStructure dataTypeStructure) {
		_dataTypeStructure = dataTypeStructure;
	}

	@Override
	public Class<?> getModelClass() {
		return DataTypeStructure.class;
	}

	@Override
	public String getModelClassName() {
		return DataTypeStructure.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("structure", getStructure());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String structure = (String)attributes.get("structure");

		if (structure != null) {
			setStructure(structure);
		}
	}

	@Override
	public OSPIcecap.model.DataTypeStructure toEscapedModel() {
		return new DataTypeStructureWrapper(_dataTypeStructure.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataTypeStructure toUnescapedModel() {
		return new DataTypeStructureWrapper(_dataTypeStructure.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dataTypeStructure.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataTypeStructure.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataTypeStructure.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataTypeStructure.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataTypeStructure> toCacheModel() {
		return _dataTypeStructure.toCacheModel();
	}

	@Override
	public int compareTo(OSPIcecap.model.DataTypeStructure dataTypeStructure) {
		return _dataTypeStructure.compareTo(dataTypeStructure);
	}

	@Override
	public int hashCode() {
		return _dataTypeStructure.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataTypeStructure.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataTypeStructureWrapper((DataTypeStructure)_dataTypeStructure.clone());
	}

	/**
	* Returns the structure of this data type structure.
	*
	* @return the structure of this data type structure
	*/
	@Override
	public java.lang.String getStructure() {
		return _dataTypeStructure.getStructure();
	}

	@Override
	public java.lang.String toString() {
		return _dataTypeStructure.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataTypeStructure.toXmlString();
	}

	/**
	* Returns the primary key of this data type structure.
	*
	* @return the primary key of this data type structure
	*/
	@Override
	public long getPrimaryKey() {
		return _dataTypeStructure.getPrimaryKey();
	}

	/**
	* Returns the type ID of this data type structure.
	*
	* @return the type ID of this data type structure
	*/
	@Override
	public long getTypeId() {
		return _dataTypeStructure.getTypeId();
	}

	@Override
	public void persist() {
		_dataTypeStructure.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataTypeStructure.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataTypeStructure.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataTypeStructure.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataTypeStructure.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_dataTypeStructure.setNew(n);
	}

	/**
	* Sets the primary key of this data type structure.
	*
	* @param primaryKey the primary key of this data type structure
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataTypeStructure.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataTypeStructure.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the structure of this data type structure.
	*
	* @param structure the structure of this data type structure
	*/
	@Override
	public void setStructure(java.lang.String structure) {
		_dataTypeStructure.setStructure(structure);
	}

	/**
	* Sets the type ID of this data type structure.
	*
	* @param typeId the type ID of this data type structure
	*/
	@Override
	public void setTypeId(long typeId) {
		_dataTypeStructure.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeStructureWrapper)) {
			return false;
		}

		DataTypeStructureWrapper dataTypeStructureWrapper = (DataTypeStructureWrapper)obj;

		if (Objects.equals(_dataTypeStructure,
					dataTypeStructureWrapper._dataTypeStructure)) {
			return true;
		}

		return false;
	}

	@Override
	public DataTypeStructure getWrappedModel() {
		return _dataTypeStructure;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataTypeStructure.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataTypeStructure.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataTypeStructure.resetOriginalValues();
	}

	private final DataTypeStructure _dataTypeStructure;
}