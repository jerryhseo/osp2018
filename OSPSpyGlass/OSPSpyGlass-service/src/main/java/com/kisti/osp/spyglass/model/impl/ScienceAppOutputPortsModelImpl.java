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

package com.kisti.osp.spyglass.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.spyglass.model.ScienceAppOutputPorts;
import com.kisti.osp.spyglass.model.ScienceAppOutputPortsModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ScienceAppOutputPorts service. Represents a row in the &quot;spyglass_ScienceAppOutputPorts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ScienceAppOutputPortsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ScienceAppOutputPortsImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPortsImpl
 * @see ScienceAppOutputPorts
 * @see ScienceAppOutputPortsModel
 * @generated
 */
@ProviderType
public class ScienceAppOutputPortsModelImpl extends BaseModelImpl<ScienceAppOutputPorts>
	implements ScienceAppOutputPortsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a science app output ports model instance should use the {@link ScienceAppOutputPorts} interface instead.
	 */
	public static final String TABLE_NAME = "spyglass_ScienceAppOutputPorts";
	public static final Object[][] TABLE_COLUMNS = {
			{ "scienceAppId", Types.BIGINT },
			{ "outputPorts", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("scienceAppId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("outputPorts", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table spyglass_ScienceAppOutputPorts (scienceAppId LONG not null primary key,outputPorts VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table spyglass_ScienceAppOutputPorts";
	public static final String ORDER_BY_JPQL = " ORDER BY scienceAppOutputPorts.scienceAppId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY spyglass_ScienceAppOutputPorts.scienceAppId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.spyglass.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.kisti.osp.spyglass.model.ScienceAppOutputPorts"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.spyglass.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.kisti.osp.spyglass.model.ScienceAppOutputPorts"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.kisti.osp.spyglass.service.util.ServiceProps.get(
				"lock.expiration.time.com.kisti.osp.spyglass.model.ScienceAppOutputPorts"));

	public ScienceAppOutputPortsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _scienceAppId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setScienceAppId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceAppId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceAppOutputPorts.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceAppOutputPorts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("outputPorts", getOutputPorts());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		String outputPorts = (String)attributes.get("outputPorts");

		if (outputPorts != null) {
			setOutputPorts(outputPorts);
		}
	}

	@Override
	public long getScienceAppId() {
		return _scienceAppId;
	}

	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceAppId = scienceAppId;
	}

	@Override
	public String getOutputPorts() {
		if (_outputPorts == null) {
			return StringPool.BLANK;
		}
		else {
			return _outputPorts;
		}
	}

	@Override
	public void setOutputPorts(String outputPorts) {
		_outputPorts = outputPorts;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ScienceAppOutputPorts.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ScienceAppOutputPorts toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ScienceAppOutputPorts)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ScienceAppOutputPortsImpl scienceAppOutputPortsImpl = new ScienceAppOutputPortsImpl();

		scienceAppOutputPortsImpl.setScienceAppId(getScienceAppId());
		scienceAppOutputPortsImpl.setOutputPorts(getOutputPorts());

		scienceAppOutputPortsImpl.resetOriginalValues();

		return scienceAppOutputPortsImpl;
	}

	@Override
	public int compareTo(ScienceAppOutputPorts scienceAppOutputPorts) {
		long primaryKey = scienceAppOutputPorts.getPrimaryKey();

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

		if (!(obj instanceof ScienceAppOutputPorts)) {
			return false;
		}

		ScienceAppOutputPorts scienceAppOutputPorts = (ScienceAppOutputPorts)obj;

		long primaryKey = scienceAppOutputPorts.getPrimaryKey();

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
	public CacheModel<ScienceAppOutputPorts> toCacheModel() {
		ScienceAppOutputPortsCacheModel scienceAppOutputPortsCacheModel = new ScienceAppOutputPortsCacheModel();

		scienceAppOutputPortsCacheModel.scienceAppId = getScienceAppId();

		scienceAppOutputPortsCacheModel.outputPorts = getOutputPorts();

		String outputPorts = scienceAppOutputPortsCacheModel.outputPorts;

		if ((outputPorts != null) && (outputPorts.length() == 0)) {
			scienceAppOutputPortsCacheModel.outputPorts = null;
		}

		return scienceAppOutputPortsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{scienceAppId=");
		sb.append(getScienceAppId());
		sb.append(", outputPorts=");
		sb.append(getOutputPorts());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.kisti.osp.spyglass.model.ScienceAppOutputPorts");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>scienceAppId</column-name><column-value><![CDATA[");
		sb.append(getScienceAppId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outputPorts</column-name><column-value><![CDATA[");
		sb.append(getOutputPorts());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ScienceAppOutputPorts.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ScienceAppOutputPorts.class
		};
	private long _scienceAppId;
	private String _outputPorts;
	private ScienceAppOutputPorts _escapedModel;
}