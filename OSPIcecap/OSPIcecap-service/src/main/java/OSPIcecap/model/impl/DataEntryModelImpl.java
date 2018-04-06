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

import OSPIcecap.model.DataEntry;
import OSPIcecap.model.DataEntryModel;
import OSPIcecap.model.DataEntrySoap;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
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
 * The base model implementation for the DataEntry service. Represents a row in the &quot;icecap_DataEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DataEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DataEntryImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataEntryImpl
 * @see DataEntry
 * @see DataEntryModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DataEntryModelImpl extends BaseModelImpl<DataEntry>
	implements DataEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a data entry model instance should use the {@link DataEntry} interface instead.
	 */
	public static final String TABLE_NAME = "icecap_DataEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "entryId", Types.BIGINT },
			{ "collectionId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "comments", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("entryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("collectionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("comments", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table icecap_DataEntry (entryId LONG not null primary key,collectionId LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,comments STRING null)";
	public static final String TABLE_SQL_DROP = "drop table icecap_DataEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY dataEntry.entryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY icecap_DataEntry.entryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(OSPIcecap.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.OSPIcecap.model.DataEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(OSPIcecap.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.OSPIcecap.model.DataEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(OSPIcecap.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.OSPIcecap.model.DataEntry"),
			true);
	public static final long COLLECTIONID_COLUMN_BITMASK = 1L;
	public static final long ENTRYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DataEntry toModel(DataEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DataEntry model = new DataEntryImpl();

		model.setEntryId(soapModel.getEntryId());
		model.setCollectionId(soapModel.getCollectionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setComments(soapModel.getComments());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DataEntry> toModels(DataEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DataEntry> models = new ArrayList<DataEntry>(soapModels.length);

		for (DataEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(OSPIcecap.service.util.ServiceProps.get(
				"lock.expiration.time.OSPIcecap.model.DataEntry"));

	public DataEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _entryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DataEntry.class;
	}

	@Override
	public String getModelClassName() {
		return DataEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entryId", getEntryId());
		attributes.put("collectionId", getCollectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("comments", getComments());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long collectionId = (Long)attributes.get("collectionId");

		if (collectionId != null) {
			setCollectionId(collectionId);
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

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}
	}

	@JSON
	@Override
	public long getEntryId() {
		return _entryId;
	}

	@Override
	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	@JSON
	@Override
	public long getCollectionId() {
		return _collectionId;
	}

	@Override
	public void setCollectionId(long collectionId) {
		_columnBitmask |= COLLECTIONID_COLUMN_BITMASK;

		if (!_setOriginalCollectionId) {
			_setOriginalCollectionId = true;

			_originalCollectionId = _collectionId;
		}

		_collectionId = collectionId;
	}

	public long getOriginalCollectionId() {
		return _originalCollectionId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	@Override
	public String getComments(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getComments(languageId);
	}

	@Override
	public String getComments(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getComments(languageId, useDefault);
	}

	@Override
	public String getComments(String languageId) {
		return LocalizationUtil.getLocalization(getComments(), languageId);
	}

	@Override
	public String getComments(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getComments(), languageId,
			useDefault);
	}

	@Override
	public String getCommentsCurrentLanguageId() {
		return _commentsCurrentLanguageId;
	}

	@JSON
	@Override
	public String getCommentsCurrentValue() {
		Locale locale = getLocale(_commentsCurrentLanguageId);

		return getComments(locale);
	}

	@Override
	public Map<Locale, String> getCommentsMap() {
		return LocalizationUtil.getLocalizationMap(getComments());
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;
	}

	@Override
	public void setComments(String comments, Locale locale) {
		setComments(comments, locale, LocaleUtil.getDefault());
	}

	@Override
	public void setComments(String comments, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(comments)) {
			setComments(LocalizationUtil.updateLocalization(getComments(),
					"Comments", comments, languageId, defaultLanguageId));
		}
		else {
			setComments(LocalizationUtil.removeLocalization(getComments(),
					"Comments", languageId));
		}
	}

	@Override
	public void setCommentsCurrentLanguageId(String languageId) {
		_commentsCurrentLanguageId = languageId;
	}

	@Override
	public void setCommentsMap(Map<Locale, String> commentsMap) {
		setCommentsMap(commentsMap, LocaleUtil.getDefault());
	}

	@Override
	public void setCommentsMap(Map<Locale, String> commentsMap,
		Locale defaultLocale) {
		if (commentsMap == null) {
			return;
		}

		setComments(LocalizationUtil.updateLocalization(commentsMap,
				getComments(), "Comments",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DataEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> commentsMap = getCommentsMap();

		for (Map.Entry<Locale, String> entry : commentsMap.entrySet()) {
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
		String xml = getComments();

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

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(DataEntry.class.getName(),
				getPrimaryKey(), defaultLocale, availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String comments = getComments(defaultLocale);

		if (Validator.isNull(comments)) {
			setComments(getComments(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setComments(getComments(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public DataEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DataEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DataEntryImpl dataEntryImpl = new DataEntryImpl();

		dataEntryImpl.setEntryId(getEntryId());
		dataEntryImpl.setCollectionId(getCollectionId());
		dataEntryImpl.setGroupId(getGroupId());
		dataEntryImpl.setCompanyId(getCompanyId());
		dataEntryImpl.setUserId(getUserId());
		dataEntryImpl.setCreateDate(getCreateDate());
		dataEntryImpl.setComments(getComments());

		dataEntryImpl.resetOriginalValues();

		return dataEntryImpl;
	}

	@Override
	public int compareTo(DataEntry dataEntry) {
		long primaryKey = dataEntry.getPrimaryKey();

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

		if (!(obj instanceof DataEntry)) {
			return false;
		}

		DataEntry dataEntry = (DataEntry)obj;

		long primaryKey = dataEntry.getPrimaryKey();

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
		DataEntryModelImpl dataEntryModelImpl = this;

		dataEntryModelImpl._originalCollectionId = dataEntryModelImpl._collectionId;

		dataEntryModelImpl._setOriginalCollectionId = false;

		dataEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DataEntry> toCacheModel() {
		DataEntryCacheModel dataEntryCacheModel = new DataEntryCacheModel();

		dataEntryCacheModel.entryId = getEntryId();

		dataEntryCacheModel.collectionId = getCollectionId();

		dataEntryCacheModel.groupId = getGroupId();

		dataEntryCacheModel.companyId = getCompanyId();

		dataEntryCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dataEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			dataEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		dataEntryCacheModel.comments = getComments();

		String comments = dataEntryCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			dataEntryCacheModel.comments = null;
		}

		return dataEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{entryId=");
		sb.append(getEntryId());
		sb.append(", collectionId=");
		sb.append(getCollectionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("OSPIcecap.model.DataEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>entryId</column-name><column-value><![CDATA[");
		sb.append(getEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collectionId</column-name><column-value><![CDATA[");
		sb.append(getCollectionId());
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
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = DataEntry.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			DataEntry.class
		};
	private long _entryId;
	private long _collectionId;
	private long _originalCollectionId;
	private boolean _setOriginalCollectionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private String _comments;
	private String _commentsCurrentLanguageId;
	private long _columnBitmask;
	private DataEntry _escapedModel;
}