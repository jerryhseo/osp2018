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
 * This class is a wrapper for {@link DataType}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataType
 * @generated
 */
@ProviderType
public class DataTypeWrapper implements DataType, ModelWrapper<DataType> {
	public DataTypeWrapper(DataType dataType) {
		_dataType = dataType;
	}

	@Override
	public Class<?> getModelClass() {
		return DataType.class;
	}

	@Override
	public String getModelClassName() {
		return DataType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("typeId", getTypeId());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("samplePath", getSamplePath());
		attributes.put("status", getStatus());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		String samplePath = (String)attributes.get("samplePath");

		if (samplePath != null) {
			setSamplePath(samplePath);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public OSPIcecap.model.DataType toEscapedModel() {
		return new DataTypeWrapper(_dataType.toEscapedModel());
	}

	@Override
	public OSPIcecap.model.DataType toUnescapedModel() {
		return new DataTypeWrapper(_dataType.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _dataType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPIcecap.model.DataType> toCacheModel() {
		return _dataType.toCacheModel();
	}

	@Override
	public int compareTo(OSPIcecap.model.DataType dataType) {
		return _dataType.compareTo(dataType);
	}

	/**
	* Returns the status of this data type.
	*
	* @return the status of this data type
	*/
	@Override
	public int getStatus() {
		return _dataType.getStatus();
	}

	@Override
	public int hashCode() {
		return _dataType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataTypeWrapper((DataType)_dataType.clone());
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _dataType.getDefaultLanguageId();
	}

	/**
	* Returns the description of this data type.
	*
	* @return the description of this data type
	*/
	@Override
	public java.lang.String getDescription() {
		return _dataType.getDescription();
	}

	/**
	* Returns the localized description of this data type in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this data type
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _dataType.getDescription(languageId);
	}

	/**
	* Returns the localized description of this data type in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this data type
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _dataType.getDescription(languageId, useDefault);
	}

	/**
	* Returns the localized description of this data type in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this data type
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _dataType.getDescription(locale);
	}

	/**
	* Returns the localized description of this data type in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this data type. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _dataType.getDescription(locale, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _dataType.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _dataType.getDescriptionCurrentValue();
	}

	/**
	* Returns the name of this data type.
	*
	* @return the name of this data type
	*/
	@Override
	public java.lang.String getName() {
		return _dataType.getName();
	}

	/**
	* Returns the sample path of this data type.
	*
	* @return the sample path of this data type
	*/
	@Override
	public java.lang.String getSamplePath() {
		return _dataType.getSamplePath();
	}

	/**
	* Returns the user uuid of this data type.
	*
	* @return the user uuid of this data type
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _dataType.getUserUuid();
	}

	/**
	* Returns the uuid of this data type.
	*
	* @return the uuid of this data type
	*/
	@Override
	public java.lang.String getUuid() {
		return _dataType.getUuid();
	}

	/**
	* Returns the version of this data type.
	*
	* @return the version of this data type
	*/
	@Override
	public java.lang.String getVersion() {
		return _dataType.getVersion();
	}

	@Override
	public java.lang.String toString() {
		return _dataType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataType.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _dataType.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this data type.
	*
	* @return the create date of this data type
	*/
	@Override
	public Date getCreateDate() {
		return _dataType.getCreateDate();
	}

	/**
	* Returns the modified date of this data type.
	*
	* @return the modified date of this data type
	*/
	@Override
	public Date getModifiedDate() {
		return _dataType.getModifiedDate();
	}

	/**
	* Returns a map of the locales and localized descriptions of this data type.
	*
	* @return the locales and localized descriptions of this data type
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _dataType.getDescriptionMap();
	}

	/**
	* Returns the company ID of this data type.
	*
	* @return the company ID of this data type
	*/
	@Override
	public long getCompanyId() {
		return _dataType.getCompanyId();
	}

	/**
	* Returns the group ID of this data type.
	*
	* @return the group ID of this data type
	*/
	@Override
	public long getGroupId() {
		return _dataType.getGroupId();
	}

	/**
	* Returns the primary key of this data type.
	*
	* @return the primary key of this data type
	*/
	@Override
	public long getPrimaryKey() {
		return _dataType.getPrimaryKey();
	}

	/**
	* Returns the type ID of this data type.
	*
	* @return the type ID of this data type
	*/
	@Override
	public long getTypeId() {
		return _dataType.getTypeId();
	}

	/**
	* Returns the user ID of this data type.
	*
	* @return the user ID of this data type
	*/
	@Override
	public long getUserId() {
		return _dataType.getUserId();
	}

	@Override
	public void persist() {
		_dataType.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataType.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_dataType.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this data type.
	*
	* @param companyId the company ID of this data type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dataType.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this data type.
	*
	* @param createDate the create date of this data type
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dataType.setCreateDate(createDate);
	}

	/**
	* Sets the description of this data type.
	*
	* @param description the description of this data type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dataType.setDescription(description);
	}

	/**
	* Sets the localized description of this data type in the language.
	*
	* @param description the localized description of this data type
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_dataType.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this data type in the language, and sets the default locale.
	*
	* @param description the localized description of this data type
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_dataType.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_dataType.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this data type from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this data type
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap) {
		_dataType.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this data type from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this data type
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_dataType.setDescriptionMap(descriptionMap, defaultLocale);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this data type.
	*
	* @param groupId the group ID of this data type
	*/
	@Override
	public void setGroupId(long groupId) {
		_dataType.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this data type.
	*
	* @param modifiedDate the modified date of this data type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dataType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this data type.
	*
	* @param name the name of this data type
	*/
	@Override
	public void setName(java.lang.String name) {
		_dataType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_dataType.setNew(n);
	}

	/**
	* Sets the primary key of this data type.
	*
	* @param primaryKey the primary key of this data type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sample path of this data type.
	*
	* @param samplePath the sample path of this data type
	*/
	@Override
	public void setSamplePath(java.lang.String samplePath) {
		_dataType.setSamplePath(samplePath);
	}

	/**
	* Sets the status of this data type.
	*
	* @param status the status of this data type
	*/
	@Override
	public void setStatus(int status) {
		_dataType.setStatus(status);
	}

	/**
	* Sets the type ID of this data type.
	*
	* @param typeId the type ID of this data type
	*/
	@Override
	public void setTypeId(long typeId) {
		_dataType.setTypeId(typeId);
	}

	/**
	* Sets the user ID of this data type.
	*
	* @param userId the user ID of this data type
	*/
	@Override
	public void setUserId(long userId) {
		_dataType.setUserId(userId);
	}

	/**
	* Sets the user uuid of this data type.
	*
	* @param userUuid the user uuid of this data type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dataType.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this data type.
	*
	* @param uuid the uuid of this data type
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_dataType.setUuid(uuid);
	}

	/**
	* Sets the version of this data type.
	*
	* @param version the version of this data type
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_dataType.setVersion(version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeWrapper)) {
			return false;
		}

		DataTypeWrapper dataTypeWrapper = (DataTypeWrapper)obj;

		if (Objects.equals(_dataType, dataTypeWrapper._dataType)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dataType.getStagedModelType();
	}

	@Override
	public DataType getWrappedModel() {
		return _dataType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataType.resetOriginalValues();
	}

	private final DataType _dataType;
}