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

package com.kisti.osp.icebug.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebug.model.Paper;
import com.kisti.osp.icebug.model.PaperModel;
import com.kisti.osp.icebug.model.PaperSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Paper service. Represents a row in the &quot;icebug_Paper&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link PaperModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaperImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PaperImpl
 * @see Paper
 * @see PaperModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class PaperModelImpl extends BaseModelImpl<Paper> implements PaperModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a paper model instance should use the {@link Paper} interface instead.
	 */
	public static final String TABLE_NAME = "icebug_Paper";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "paperId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("paperId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table icebug_Paper (uuid_ VARCHAR(75) null,paperId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table icebug_Paper";
	public static final String ORDER_BY_JPQL = " ORDER BY paper.paperId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY icebug_Paper.paperId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.icebug.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.kisti.osp.icebug.model.Paper"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.icebug.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.kisti.osp.icebug.model.Paper"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.kisti.osp.icebug.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.kisti.osp.icebug.model.Paper"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long PAPERID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Paper toModel(PaperSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Paper model = new PaperImpl();

		model.setUuid(soapModel.getUuid());
		model.setPaperId(soapModel.getPaperId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Paper> toModels(PaperSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Paper> models = new ArrayList<Paper>(soapModels.length);

		for (PaperSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.kisti.osp.icebug.service.util.ServiceProps.get(
				"lock.expiration.time.com.kisti.osp.icebug.model.Paper"));

	public PaperModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _paperId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaperId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paperId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getPaperId() {
		return _paperId;
	}

	@Override
	public void setPaperId(long paperId) {
		_paperId = paperId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Paper.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Paper.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Paper toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Paper)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PaperImpl paperImpl = new PaperImpl();

		paperImpl.setUuid(getUuid());
		paperImpl.setPaperId(getPaperId());
		paperImpl.setGroupId(getGroupId());
		paperImpl.setCompanyId(getCompanyId());
		paperImpl.setUserId(getUserId());
		paperImpl.setUserName(getUserName());
		paperImpl.setCreateDate(getCreateDate());
		paperImpl.setModifiedDate(getModifiedDate());

		paperImpl.resetOriginalValues();

		return paperImpl;
	}

	@Override
	public int compareTo(Paper paper) {
		long primaryKey = paper.getPrimaryKey();

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

		if (!(obj instanceof Paper)) {
			return false;
		}

		Paper paper = (Paper)obj;

		long primaryKey = paper.getPrimaryKey();

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
		PaperModelImpl paperModelImpl = this;

		paperModelImpl._originalUuid = paperModelImpl._uuid;

		paperModelImpl._originalGroupId = paperModelImpl._groupId;

		paperModelImpl._setOriginalGroupId = false;

		paperModelImpl._originalCompanyId = paperModelImpl._companyId;

		paperModelImpl._setOriginalCompanyId = false;

		paperModelImpl._setModifiedDate = false;

		paperModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Paper> toCacheModel() {
		PaperCacheModel paperCacheModel = new PaperCacheModel();

		paperCacheModel.uuid = getUuid();

		String uuid = paperCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			paperCacheModel.uuid = null;
		}

		paperCacheModel.paperId = getPaperId();

		paperCacheModel.groupId = getGroupId();

		paperCacheModel.companyId = getCompanyId();

		paperCacheModel.userId = getUserId();

		paperCacheModel.userName = getUserName();

		String userName = paperCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			paperCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			paperCacheModel.createDate = createDate.getTime();
		}
		else {
			paperCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			paperCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			paperCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return paperCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", paperId=");
		sb.append(getPaperId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.kisti.osp.icebug.model.Paper");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paperId</column-name><column-value><![CDATA[");
		sb.append(getPaperId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Paper.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Paper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _paperId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Paper _escapedModel;
}