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

package com.kisti.osp.zodiac.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.zodiac.model.Simulation;
import com.kisti.osp.zodiac.model.SimulationModel;
import com.kisti.osp.zodiac.model.SimulationSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * The base model implementation for the Simulation service. Represents a row in the &quot;zodiac_Simulation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SimulationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SimulationImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see SimulationImpl
 * @see Simulation
 * @see SimulationModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SimulationModelImpl extends BaseModelImpl<Simulation>
	implements SimulationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a simulation model instance should use the {@link Simulation} interface instead.
	 */
	public static final String TABLE_NAME = "zodiac_Simulation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "simulationId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "title", Types.VARCHAR },
			{ "webContentId", Types.BIGINT },
			{ "iconId", Types.BIGINT },
			{ "simulationStatus", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "tasks", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("simulationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("webContentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("iconId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("simulationStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("tasks", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table zodiac_Simulation (uuid_ VARCHAR(75) null,simulationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,title STRING null,webContentId LONG,iconId LONG,simulationStatus VARCHAR(75) null,status INTEGER,tasks VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table zodiac_Simulation";
	public static final String ORDER_BY_JPQL = " ORDER BY simulation.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY zodiac_Simulation.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.zodiac.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.kisti.osp.zodiac.model.Simulation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.kisti.osp.zodiac.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.kisti.osp.zodiac.model.Simulation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.kisti.osp.zodiac.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.kisti.osp.zodiac.model.Simulation"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long SIMULATIONSTATUS_COLUMN_BITMASK = 4L;
	public static final long STATUS_COLUMN_BITMASK = 8L;
	public static final long USERID_COLUMN_BITMASK = 16L;
	public static final long UUID_COLUMN_BITMASK = 32L;
	public static final long CREATEDATE_COLUMN_BITMASK = 64L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Simulation toModel(SimulationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Simulation model = new SimulationImpl();

		model.setUuid(soapModel.getUuid());
		model.setSimulationId(soapModel.getSimulationId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setWebContentId(soapModel.getWebContentId());
		model.setIconId(soapModel.getIconId());
		model.setSimulationStatus(soapModel.getSimulationStatus());
		model.setStatus(soapModel.getStatus());
		model.setTasks(soapModel.getTasks());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Simulation> toModels(SimulationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Simulation> models = new ArrayList<Simulation>(soapModels.length);

		for (SimulationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.kisti.osp.zodiac.service.util.ServiceProps.get(
				"lock.expiration.time.com.kisti.osp.zodiac.model.Simulation"));

	public SimulationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _simulationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSimulationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _simulationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Simulation.class;
	}

	@Override
	public String getModelClassName() {
		return Simulation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("simulationId", getSimulationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("webContentId", getWebContentId());
		attributes.put("iconId", getIconId());
		attributes.put("simulationStatus", getSimulationStatus());
		attributes.put("status", getStatus());
		attributes.put("tasks", getTasks());

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

		Long simulationId = (Long)attributes.get("simulationId");

		if (simulationId != null) {
			setSimulationId(simulationId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long webContentId = (Long)attributes.get("webContentId");

		if (webContentId != null) {
			setWebContentId(webContentId);
		}

		Long iconId = (Long)attributes.get("iconId");

		if (iconId != null) {
			setIconId(iconId);
		}

		String simulationStatus = (String)attributes.get("simulationStatus");

		if (simulationStatus != null) {
			setSimulationStatus(simulationStatus);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String tasks = (String)attributes.get("tasks");

		if (tasks != null) {
			setTasks(tasks);
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
	public long getSimulationId() {
		return _simulationId;
	}

	@Override
	public void setSimulationId(long simulationId) {
		_simulationId = simulationId;
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
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

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

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public String getTitle(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId);
	}

	@Override
	public String getTitle(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId, useDefault);
	}

	@Override
	public String getTitle(String languageId) {
		return LocalizationUtil.getLocalization(getTitle(), languageId);
	}

	@Override
	public String getTitle(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getTitle(), languageId,
			useDefault);
	}

	@Override
	public String getTitleCurrentLanguageId() {
		return _titleCurrentLanguageId;
	}

	@JSON
	@Override
	public String getTitleCurrentValue() {
		Locale locale = getLocale(_titleCurrentLanguageId);

		return getTitle(locale);
	}

	@Override
	public Map<Locale, String> getTitleMap() {
		return LocalizationUtil.getLocalizationMap(getTitle());
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public void setTitle(String title, Locale locale) {
		setTitle(title, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setTitle(String title, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(title)) {
			setTitle(LocalizationUtil.updateLocalization(getTitle(), "Title",
					title, languageId, defaultLanguageId));
		}
		else {
			setTitle(LocalizationUtil.removeLocalization(getTitle(), "Title",
					languageId));
		}
	}

	@Override
	public void setTitleCurrentLanguageId(String languageId) {
		_titleCurrentLanguageId = languageId;
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap) {
		setTitleMap(titleMap, LocaleUtil.getDefault());
	}

	@Override
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale) {
		if (titleMap == null) {
			return;
		}

		setTitle(LocalizationUtil.updateLocalization(titleMap, getTitle(),
				"Title", LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public long getWebContentId() {
		return _webContentId;
	}

	@Override
	public void setWebContentId(long webContentId) {
		_webContentId = webContentId;
	}

	@JSON
	@Override
	public long getIconId() {
		return _iconId;
	}

	@Override
	public void setIconId(long iconId) {
		_iconId = iconId;
	}

	@JSON
	@Override
	public String getSimulationStatus() {
		if (_simulationStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _simulationStatus;
		}
	}

	@Override
	public void setSimulationStatus(String simulationStatus) {
		_columnBitmask |= SIMULATIONSTATUS_COLUMN_BITMASK;

		if (_originalSimulationStatus == null) {
			_originalSimulationStatus = _simulationStatus;
		}

		_simulationStatus = simulationStatus;
	}

	public String getOriginalSimulationStatus() {
		return GetterUtil.getString(_originalSimulationStatus);
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@JSON
	@Override
	public String getTasks() {
		if (_tasks == null) {
			return StringPool.BLANK;
		}
		else {
			return _tasks;
		}
	}

	@Override
	public void setTasks(String tasks) {
		_tasks = tasks;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Simulation.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Simulation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> titleMap = getTitleMap();

		for (Map.Entry<Locale, String> entry : titleMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getTitle();

		if (xml == null) {
			return StringPool.BLANK;
		}

		Locale defaultLocale = LocaleUtil.getDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		Locale defaultLocale = LocaleUtil.fromLanguageId(getDefaultLanguageId());

		Locale[] availableLocales = LocaleUtil.fromLanguageIds(getAvailableLanguageIds());

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(Simulation.class.getName(),
				getPrimaryKey(), defaultLocale, availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String title = getTitle(defaultLocale);

		if (Validator.isNull(title)) {
			setTitle(getTitle(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setTitle(getTitle(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public Simulation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Simulation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SimulationImpl simulationImpl = new SimulationImpl();

		simulationImpl.setUuid(getUuid());
		simulationImpl.setSimulationId(getSimulationId());
		simulationImpl.setGroupId(getGroupId());
		simulationImpl.setCompanyId(getCompanyId());
		simulationImpl.setUserId(getUserId());
		simulationImpl.setCreateDate(getCreateDate());
		simulationImpl.setModifiedDate(getModifiedDate());
		simulationImpl.setTitle(getTitle());
		simulationImpl.setWebContentId(getWebContentId());
		simulationImpl.setIconId(getIconId());
		simulationImpl.setSimulationStatus(getSimulationStatus());
		simulationImpl.setStatus(getStatus());
		simulationImpl.setTasks(getTasks());

		simulationImpl.resetOriginalValues();

		return simulationImpl;
	}

	@Override
	public int compareTo(Simulation simulation) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), simulation.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Simulation)) {
			return false;
		}

		Simulation simulation = (Simulation)obj;

		long primaryKey = simulation.getPrimaryKey();

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
		SimulationModelImpl simulationModelImpl = this;

		simulationModelImpl._originalUuid = simulationModelImpl._uuid;

		simulationModelImpl._originalGroupId = simulationModelImpl._groupId;

		simulationModelImpl._setOriginalGroupId = false;

		simulationModelImpl._originalCompanyId = simulationModelImpl._companyId;

		simulationModelImpl._setOriginalCompanyId = false;

		simulationModelImpl._originalUserId = simulationModelImpl._userId;

		simulationModelImpl._setOriginalUserId = false;

		simulationModelImpl._setModifiedDate = false;

		simulationModelImpl._originalSimulationStatus = simulationModelImpl._simulationStatus;

		simulationModelImpl._originalStatus = simulationModelImpl._status;

		simulationModelImpl._setOriginalStatus = false;

		simulationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Simulation> toCacheModel() {
		SimulationCacheModel simulationCacheModel = new SimulationCacheModel();

		simulationCacheModel.uuid = getUuid();

		String uuid = simulationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			simulationCacheModel.uuid = null;
		}

		simulationCacheModel.simulationId = getSimulationId();

		simulationCacheModel.groupId = getGroupId();

		simulationCacheModel.companyId = getCompanyId();

		simulationCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			simulationCacheModel.createDate = createDate.getTime();
		}
		else {
			simulationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			simulationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			simulationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		simulationCacheModel.title = getTitle();

		String title = simulationCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			simulationCacheModel.title = null;
		}

		simulationCacheModel.webContentId = getWebContentId();

		simulationCacheModel.iconId = getIconId();

		simulationCacheModel.simulationStatus = getSimulationStatus();

		String simulationStatus = simulationCacheModel.simulationStatus;

		if ((simulationStatus != null) && (simulationStatus.length() == 0)) {
			simulationCacheModel.simulationStatus = null;
		}

		simulationCacheModel.status = getStatus();

		simulationCacheModel.tasks = getTasks();

		String tasks = simulationCacheModel.tasks;

		if ((tasks != null) && (tasks.length() == 0)) {
			simulationCacheModel.tasks = null;
		}

		return simulationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", simulationId=");
		sb.append(getSimulationId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", webContentId=");
		sb.append(getWebContentId());
		sb.append(", iconId=");
		sb.append(getIconId());
		sb.append(", simulationStatus=");
		sb.append(getSimulationStatus());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", tasks=");
		sb.append(getTasks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.kisti.osp.zodiac.model.Simulation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>simulationId</column-name><column-value><![CDATA[");
		sb.append(getSimulationId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webContentId</column-name><column-value><![CDATA[");
		sb.append(getWebContentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iconId</column-name><column-value><![CDATA[");
		sb.append(getIconId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>simulationStatus</column-name><column-value><![CDATA[");
		sb.append(getSimulationStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tasks</column-name><column-value><![CDATA[");
		sb.append(getTasks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Simulation.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Simulation.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _simulationId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _title;
	private String _titleCurrentLanguageId;
	private long _webContentId;
	private long _iconId;
	private String _simulationStatus;
	private String _originalSimulationStatus;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private String _tasks;
	private long _columnBitmask;
	private Simulation _escapedModel;
}