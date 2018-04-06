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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link DataEntry}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataEntry
 * @generated
 */
@ProviderType
public class DataEntryWrapper implements DataEntry, ModelWrapper<DataEntry> {
	public DataEntryWrapper(DataEntry dataEntry) {
		_dataEntry = dataEntry;
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

	@Override
	public OSPIcecap.model.DataEntry toEscapedModel() {
		return new DataEntryWrapper(_dataEntry.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataEntry toUnescapedModel() {
		return new DataEntryWrapper(_dataEntry.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dataEntry.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataEntry.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataEntry.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataEntry.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataEntry> toCacheModel() {
		return _dataEntry.toCacheModel();
	}

	@Override
	public int compareTo(OSPIcecap.model.DataEntry dataEntry) {
		return _dataEntry.compareTo(dataEntry);
	}

	@Override
	public int hashCode() {
		return _dataEntry.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataEntry.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataEntryWrapper((DataEntry)_dataEntry.clone());
	}

	/**
	* Returns the comments of this data entry.
	*
	* @return the comments of this data entry
	*/
	@Override
	public java.lang.String getComments() {
		return _dataEntry.getComments();
	}

	/**
	* Returns the localized comments of this data entry in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized comments of this data entry
	*/
	@Override
	public java.lang.String getComments(java.lang.String languageId) {
		return _dataEntry.getComments(languageId);
	}

	/**
	* Returns the localized comments of this data entry in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized comments of this data entry
	*/
	@Override
	public java.lang.String getComments(java.lang.String languageId,
		boolean useDefault) {
		return _dataEntry.getComments(languageId, useDefault);
	}

	/**
	* Returns the localized comments of this data entry in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized comments of this data entry
	*/
	@Override
	public java.lang.String getComments(java.util.Locale locale) {
		return _dataEntry.getComments(locale);
	}

	/**
	* Returns the localized comments of this data entry in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized comments of this data entry. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getComments(java.util.Locale locale,
		boolean useDefault) {
		return _dataEntry.getComments(locale, useDefault);
	}

	@Override
	public java.lang.String getCommentsCurrentLanguageId() {
		return _dataEntry.getCommentsCurrentLanguageId();
	}

	@Override
	public java.lang.String getCommentsCurrentValue() {
		return _dataEntry.getCommentsCurrentValue();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _dataEntry.getDefaultLanguageId();
	}

	/**
	* Returns the user uuid of this data entry.
	*
	* @return the user uuid of this data entry
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dataEntry.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _dataEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataEntry.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _dataEntry.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this data entry.
	*
	* @return the create date of this data entry
	*/
	@Override
	public Date getCreateDate() {
		return _dataEntry.getCreateDate();
	}

	/**
	* Returns a map of the locales and localized commentses of this data entry.
	*
	* @return the locales and localized commentses of this data entry
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getCommentsMap() {
		return _dataEntry.getCommentsMap();
	}

	/**
	* Returns the collection ID of this data entry.
	*
	* @return the collection ID of this data entry
	*/
	@Override
	public long getCollectionId() {
		return _dataEntry.getCollectionId();
	}

	/**
	* Returns the company ID of this data entry.
	*
	* @return the company ID of this data entry
	*/
	@Override
	public long getCompanyId() {
		return _dataEntry.getCompanyId();
	}

	/**
	* Returns the entry ID of this data entry.
	*
	* @return the entry ID of this data entry
	*/
	@Override
	public long getEntryId() {
		return _dataEntry.getEntryId();
	}

	/**
	* Returns the group ID of this data entry.
	*
	* @return the group ID of this data entry
	*/
	@Override
	public long getGroupId() {
		return _dataEntry.getGroupId();
	}

	/**
	* Returns the primary key of this data entry.
	*
	* @return the primary key of this data entry
	*/
	@Override
	public long getPrimaryKey() {
		return _dataEntry.getPrimaryKey();
	}

	/**
	* Returns the user ID of this data entry.
	*
	* @return the user ID of this data entry
	*/
	@Override
	public long getUserId() {
		return _dataEntry.getUserId();
	}

	@Override
	public void persist() {
		_dataEntry.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataEntry.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataEntry.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataEntry.setCachedModel(cachedModel);
	}

	/**
	* Sets the collection ID of this data entry.
	*
	* @param collectionId the collection ID of this data entry
	*/
	@Override
	public void setCollectionId(long collectionId) {
		_dataEntry.setCollectionId(collectionId);
	}

	/**
	* Sets the comments of this data entry.
	*
	* @param comments the comments of this data entry
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_dataEntry.setComments(comments);
	}

	/**
	* Sets the localized comments of this data entry in the language.
	*
	* @param comments the localized comments of this data entry
	* @param locale the locale of the language
	*/
	@Override
	public void setComments(java.lang.String comments, java.util.Locale locale) {
		_dataEntry.setComments(comments, locale);
	}

	/**
	* Sets the localized comments of this data entry in the language, and sets the default locale.
	*
	* @param comments the localized comments of this data entry
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setComments(java.lang.String comments, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_dataEntry.setComments(comments, locale, defaultLocale);
	}

	@Override
	public void setCommentsCurrentLanguageId(java.lang.String languageId) {
		_dataEntry.setCommentsCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized commentses of this data entry from the map of locales and localized commentses.
	*
	* @param commentsMap the locales and localized commentses of this data entry
	*/
	@Override
	public void setCommentsMap(
		Map<java.util.Locale, java.lang.String> commentsMap) {
		_dataEntry.setCommentsMap(commentsMap);
	}

	/**
	* Sets the localized commentses of this data entry from the map of locales and localized commentses, and sets the default locale.
	*
	* @param commentsMap the locales and localized commentses of this data entry
	* @param defaultLocale the default locale
	*/
	@Override
	public void setCommentsMap(
		Map<java.util.Locale, java.lang.String> commentsMap,
		java.util.Locale defaultLocale) {
		_dataEntry.setCommentsMap(commentsMap, defaultLocale);
	}

	/**
	* Sets the company ID of this data entry.
	*
	* @param companyId the company ID of this data entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dataEntry.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this data entry.
	*
	* @param createDate the create date of this data entry
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dataEntry.setCreateDate(createDate);
	}

	/**
	* Sets the entry ID of this data entry.
	*
	* @param entryId the entry ID of this data entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_dataEntry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this data entry.
	*
	* @param groupId the group ID of this data entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_dataEntry.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_dataEntry.setNew(n);
	}

	/**
	* Sets the primary key of this data entry.
	*
	* @param primaryKey the primary key of this data entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this data entry.
	*
	* @param userId the user ID of this data entry
	*/
	@Override
	public void setUserId(long userId) {
		_dataEntry.setUserId(userId);
	}

	/**
	* Sets the user uuid of this data entry.
	*
	* @param userUuid the user uuid of this data entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dataEntry.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataEntryWrapper)) {
			return false;
		}

		DataEntryWrapper dataEntryWrapper = (DataEntryWrapper)obj;

		if (Objects.equals(_dataEntry, dataEntryWrapper._dataEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public DataEntry getWrappedModel() {
		return _dataEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataEntry.resetOriginalValues();
	}

	private final DataEntry _dataEntry;
}