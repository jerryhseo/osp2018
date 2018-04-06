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
 * This class is a wrapper for {@link DataCollection}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataCollection
 * @generated
 */
@ProviderType
public class DataCollectionWrapper implements DataCollection,
	ModelWrapper<DataCollection> {
	public DataCollectionWrapper(DataCollection dataCollection) {
		_dataCollection = dataCollection;
	}

	@Override
	public Class<?> getModelClass() {
		return DataCollection.class;
	}

	@Override
	public String getModelClassName() {
		return DataCollection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("title", getTitle());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("accessMethod", getAccessMethod());
		attributes.put("collectionId", getCollectionId());
		attributes.put("typeId", getTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
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

		Long description = (Long)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String accessMethod = (String)attributes.get("accessMethod");

		if (accessMethod != null) {
			setAccessMethod(accessMethod);
		}

		Long collectionId = (Long)attributes.get("collectionId");

		if (collectionId != null) {
			setCollectionId(collectionId);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}
	}

	@Override
	public OSPIcecap.model.DataCollection toEscapedModel() {
		return new DataCollectionWrapper(_dataCollection.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataCollection toUnescapedModel() {
		return new DataCollectionWrapper(_dataCollection.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dataCollection.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataCollection.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataCollection.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataCollection.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataCollection> toCacheModel() {
		return _dataCollection.toCacheModel();
	}

	@Override
	public int compareTo(OSPIcecap.model.DataCollection dataCollection) {
		return _dataCollection.compareTo(dataCollection);
	}

	/**
	* Returns the status of this data collection.
	*
	* @return the status of this data collection
	*/
	@Override
	public int getStatus() {
		return _dataCollection.getStatus();
	}

	@Override
	public int hashCode() {
		return _dataCollection.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataCollection.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataCollectionWrapper((DataCollection)_dataCollection.clone());
	}

	/**
	* Returns the access method of this data collection.
	*
	* @return the access method of this data collection
	*/
	@Override
	public java.lang.String getAccessMethod() {
		return _dataCollection.getAccessMethod();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _dataCollection.getDefaultLanguageId();
	}

	/**
	* Returns the name of this data collection.
	*
	* @return the name of this data collection
	*/
	@Override
	public java.lang.String getName() {
		return _dataCollection.getName();
	}

	/**
	* Returns the title of this data collection.
	*
	* @return the title of this data collection
	*/
	@Override
	public java.lang.String getTitle() {
		return _dataCollection.getTitle();
	}

	/**
	* Returns the localized title of this data collection in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this data collection
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _dataCollection.getTitle(languageId);
	}

	/**
	* Returns the localized title of this data collection in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this data collection
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _dataCollection.getTitle(languageId, useDefault);
	}

	/**
	* Returns the localized title of this data collection in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this data collection
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _dataCollection.getTitle(locale);
	}

	/**
	* Returns the localized title of this data collection in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this data collection. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _dataCollection.getTitle(locale, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _dataCollection.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _dataCollection.getTitleCurrentValue();
	}

	/**
	* Returns the user uuid of this data collection.
	*
	* @return the user uuid of this data collection
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dataCollection.getUserUuid();
	}

	/**
	* Returns the uuid of this data collection.
	*
	* @return the uuid of this data collection
	*/
	@Override
	public java.lang.String getUuid() {
		return _dataCollection.getUuid();
	}

	/**
	* Returns the version of this data collection.
	*
	* @return the version of this data collection
	*/
	@Override
	public java.lang.String getVersion() {
		return _dataCollection.getVersion();
	}

	@Override
	public java.lang.String toString() {
		return _dataCollection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataCollection.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _dataCollection.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this data collection.
	*
	* @return the create date of this data collection
	*/
	@Override
	public Date getCreateDate() {
		return _dataCollection.getCreateDate();
	}

	/**
	* Returns the modified date of this data collection.
	*
	* @return the modified date of this data collection
	*/
	@Override
	public Date getModifiedDate() {
		return _dataCollection.getModifiedDate();
	}

	/**
	* Returns a map of the locales and localized titles of this data collection.
	*
	* @return the locales and localized titles of this data collection
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _dataCollection.getTitleMap();
	}

	/**
	* Returns the collection ID of this data collection.
	*
	* @return the collection ID of this data collection
	*/
	@Override
	public long getCollectionId() {
		return _dataCollection.getCollectionId();
	}

	/**
	* Returns the company ID of this data collection.
	*
	* @return the company ID of this data collection
	*/
	@Override
	public long getCompanyId() {
		return _dataCollection.getCompanyId();
	}

	/**
	* Returns the description of this data collection.
	*
	* @return the description of this data collection
	*/
	@Override
	public long getDescription() {
		return _dataCollection.getDescription();
	}

	/**
	* Returns the group ID of this data collection.
	*
	* @return the group ID of this data collection
	*/
	@Override
	public long getGroupId() {
		return _dataCollection.getGroupId();
	}

	/**
	* Returns the primary key of this data collection.
	*
	* @return the primary key of this data collection
	*/
	@Override
	public long getPrimaryKey() {
		return _dataCollection.getPrimaryKey();
	}

	/**
	* Returns the type ID of this data collection.
	*
	* @return the type ID of this data collection
	*/
	@Override
	public long getTypeId() {
		return _dataCollection.getTypeId();
	}

	/**
	* Returns the user ID of this data collection.
	*
	* @return the user ID of this data collection
	*/
	@Override
	public long getUserId() {
		return _dataCollection.getUserId();
	}

	@Override
	public void persist() {
		_dataCollection.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataCollection.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataCollection.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	* Sets the access method of this data collection.
	*
	* @param accessMethod the access method of this data collection
	*/
	@Override
	public void setAccessMethod(java.lang.String accessMethod) {
		_dataCollection.setAccessMethod(accessMethod);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataCollection.setCachedModel(cachedModel);
	}

	/**
	* Sets the collection ID of this data collection.
	*
	* @param collectionId the collection ID of this data collection
	*/
	@Override
	public void setCollectionId(long collectionId) {
		_dataCollection.setCollectionId(collectionId);
	}

	/**
	* Sets the company ID of this data collection.
	*
	* @param companyId the company ID of this data collection
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dataCollection.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this data collection.
	*
	* @param createDate the create date of this data collection
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dataCollection.setCreateDate(createDate);
	}

	/**
	* Sets the description of this data collection.
	*
	* @param description the description of this data collection
	*/
	@Override
	public void setDescription(long description) {
		_dataCollection.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataCollection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataCollection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataCollection.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this data collection.
	*
	* @param groupId the group ID of this data collection
	*/
	@Override
	public void setGroupId(long groupId) {
		_dataCollection.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this data collection.
	*
	* @param modifiedDate the modified date of this data collection
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dataCollection.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this data collection.
	*
	* @param name the name of this data collection
	*/
	@Override
	public void setName(java.lang.String name) {
		_dataCollection.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_dataCollection.setNew(n);
	}

	/**
	* Sets the primary key of this data collection.
	*
	* @param primaryKey the primary key of this data collection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataCollection.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataCollection.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this data collection.
	*
	* @param status the status of this data collection
	*/
	@Override
	public void setStatus(int status) {
		_dataCollection.setStatus(status);
	}

	/**
	* Sets the title of this data collection.
	*
	* @param title the title of this data collection
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_dataCollection.setTitle(title);
	}

	/**
	* Sets the localized title of this data collection in the language.
	*
	* @param title the localized title of this data collection
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_dataCollection.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this data collection in the language, and sets the default locale.
	*
	* @param title the localized title of this data collection
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_dataCollection.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_dataCollection.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this data collection from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this data collection
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap) {
		_dataCollection.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this data collection from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this data collection
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_dataCollection.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Sets the type ID of this data collection.
	*
	* @param typeId the type ID of this data collection
	*/
	@Override
	public void setTypeId(long typeId) {
		_dataCollection.setTypeId(typeId);
	}

	/**
	* Sets the user ID of this data collection.
	*
	* @param userId the user ID of this data collection
	*/
	@Override
	public void setUserId(long userId) {
		_dataCollection.setUserId(userId);
	}

	/**
	* Sets the user uuid of this data collection.
	*
	* @param userUuid the user uuid of this data collection
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dataCollection.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this data collection.
	*
	* @param uuid the uuid of this data collection
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dataCollection.setUuid(uuid);
	}

	/**
	* Sets the version of this data collection.
	*
	* @param version the version of this data collection
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_dataCollection.setVersion(version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataCollectionWrapper)) {
			return false;
		}

		DataCollectionWrapper dataCollectionWrapper = (DataCollectionWrapper)obj;

		if (Objects.equals(_dataCollection,
					dataCollectionWrapper._dataCollection)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dataCollection.getStagedModelType();
	}

	@Override
	public DataCollection getWrappedModel() {
		return _dataCollection;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataCollection.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataCollection.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataCollection.resetOriginalValues();
	}

	private final DataCollection _dataCollection;
}