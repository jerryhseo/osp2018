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

package OSPIcecap.model.impl;

import OSPIcecap.model.DataTypeStructure;
import OSPIcecap.model.DataTypeStructureModel;
import OSPIcecap.model.DataTypeStructureSoap;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DataTypeStructure service. Represents a row in the &quot;icecap_DataTypeStructure&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DataTypeStructureModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DataTypeStructureImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeStructureImpl
 * @see DataTypeStructure
 * @see DataTypeStructureModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DataTypeStructureModelImpl extends BaseModelImpl<DataTypeStructure>
	implements DataTypeStructureModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a data type structure model instance should use the {@link DataTypeStructure} interface instead.
	 */
	public static final String TABLE_NAME = "icecap_DataTypeStructure";
	public static final Object[][] TABLE_COLUMNS = {
			{ "typeId", Types.BIGINT },
			{ "structure", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("typeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("structure", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table icecap_DataTypeStructure (typeId LONG not null primary key,structure VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table icecap_DataTypeStructure";
	public static final String ORDER_BY_JPQL = " ORDER BY dataTypeStructure.typeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY icecap_DataTypeStructure.typeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(OSPIcecap.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.OSPIcecap.model.DataTypeStructure"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(OSPIcecap.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.OSPIcecap.model.DataTypeStructure"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DataTypeStructure toModel(DataTypeStructureSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DataTypeStructure model = new DataTypeStructureImpl();

		model.setTypeId(soapModel.getTypeId());
		model.setStructure(soapModel.getStructure());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DataTypeStructure> toModels(
		DataTypeStructureSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DataTypeStructure> models = new ArrayList<DataTypeStructure>(soapModels.length);

		for (DataTypeStructureSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(OSPIcecap.service.util.ServiceProps.get(
				"lock.expiration.time.OSPIcecap.model.DataTypeStructure"));

	public DataTypeStructureModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _typeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTypeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _typeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getTypeId() {
		return _typeId;
	}

	@Override
	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	@JSON
	@Override
	public String getStructure() {
		if (_structure == null) {
			return StringPool.BLANK;
		}
		else {
			return _structure;
		}
	}

	@Override
	public void setStructure(String structure) {
		_structure = structure;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DataTypeStructure.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DataTypeStructure toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DataTypeStructure)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DataTypeStructureImpl dataTypeStructureImpl = new DataTypeStructureImpl();

		dataTypeStructureImpl.setTypeId(getTypeId());
		dataTypeStructureImpl.setStructure(getStructure());

		dataTypeStructureImpl.resetOriginalValues();

		return dataTypeStructureImpl;
	}

	@Override
	public int compareTo(DataTypeStructure dataTypeStructure) {
		long primaryKey = dataTypeStructure.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeStructure)) {
			return false;
		}

		DataTypeStructure dataTypeStructure = (DataTypeStructure)obj;

		long primaryKey = dataTypeStructure.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<DataTypeStructure> toCacheModel() {
		DataTypeStructureCacheModel dataTypeStructureCacheModel = new DataTypeStructureCacheModel();

		dataTypeStructureCacheModel.typeId = getTypeId();

		dataTypeStructureCacheModel.structure = getStructure();

		String structure = dataTypeStructureCacheModel.structure;

		if ((structure != null) && (structure.length() == 0)) {
			dataTypeStructureCacheModel.structure = null;
		}

		return dataTypeStructureCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{typeId=");
		sb.append(getTypeId());
		sb.append(", structure=");
		sb.append(getStructure());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("OSPIcecap.model.DataTypeStructure");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>structure</column-name><column-value><![CDATA[");
		sb.append(getStructure());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = DataTypeStructure.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			DataTypeStructure.class
		};
	private long _typeId;
	private String _structure;
	private DataTypeStructure _escapedModel;
}