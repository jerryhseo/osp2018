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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the DataTypeStructure service. Represents a row in the &quot;icecap_DataTypeStructure&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link OSPIcecap.model.impl.DataTypeStructureModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OSPIcecap.model.impl.DataTypeStructureImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeStructure
 * @see OSPIcecap.model.impl.DataTypeStructureImpl
 * @see OSPIcecap.model.impl.DataTypeStructureModelImpl
 * @generated
 */
@ProviderType
public interface DataTypeStructureModel extends BaseModel<DataTypeStructure> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a data type structure model instance should use the {@link DataTypeStructure} interface instead.
	 */

	/**
	 * Returns the primary key of this data type structure.
	 *
	 * @return the primary key of this data type structure
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this data type structure.
	 *
	 * @param primaryKey the primary key of this data type structure
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the type ID of this data type structure.
	 *
	 * @return the type ID of this data type structure
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this data type structure.
	 *
	 * @param typeId the type ID of this data type structure
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the structure of this data type structure.
	 *
	 * @return the structure of this data type structure
	 */
	@AutoEscape
	public String getStructure();

	/**
	 * Sets the structure of this data type structure.
	 *
	 * @param structure the structure of this data type structure
	 */
	public void setStructure(String structure);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(OSPIcecap.model.DataTypeStructure dataTypeStructure);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OSPIcecap.model.DataTypeStructure> toCacheModel();

	@Override
	public OSPIcecap.model.DataTypeStructure toEscapedModel();

	@Override
	public OSPIcecap.model.DataTypeStructure toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}