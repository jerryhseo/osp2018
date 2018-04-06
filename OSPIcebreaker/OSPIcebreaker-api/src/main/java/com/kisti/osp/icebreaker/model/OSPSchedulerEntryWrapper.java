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

package com.kisti.osp.icebreaker.model;

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
 * This class is a wrapper for {@link OSPSchedulerEntry}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see OSPSchedulerEntry
 * @generated
 */
@ProviderType
public class OSPSchedulerEntryWrapper implements OSPSchedulerEntry,
	ModelWrapper<OSPSchedulerEntry> {
	public OSPSchedulerEntryWrapper(OSPSchedulerEntry ospSchedulerEntry) {
		_ospSchedulerEntry = ospSchedulerEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return OSPSchedulerEntry.class;
	}

	@Override
	public String getModelClassName() {
		return OSPSchedulerEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("schedulerEntryId", getSchedulerEntryId());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("className", getClassName());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("accessMethod", getAccessMethod());
		attributes.put("authorizedUser", getAuthorizedUser());
		attributes.put("status", getStatus());
		attributes.put("description", getDescription());
		attributes.put("serverIp", getServerIp());
		attributes.put("sshPort", getSshPort());
		attributes.put("templateDir", getTemplateDir());
		attributes.put("templateRealDir", getTemplateRealDir());
		attributes.put("authorizedPassword", getAuthorizedPassword());
		attributes.put("schedulerClass", getSchedulerClass());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long schedulerEntryId = (Long)attributes.get("schedulerEntryId");

		if (schedulerEntryId != null) {
			setSchedulerEntryId(schedulerEntryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
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

		String accessMethod = (String)attributes.get("accessMethod");

		if (accessMethod != null) {
			setAccessMethod(accessMethod);
		}

		String authorizedUser = (String)attributes.get("authorizedUser");

		if (authorizedUser != null) {
			setAuthorizedUser(authorizedUser);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String serverIp = (String)attributes.get("serverIp");

		if (serverIp != null) {
			setServerIp(serverIp);
		}

		String sshPort = (String)attributes.get("sshPort");

		if (sshPort != null) {
			setSshPort(sshPort);
		}

		String templateDir = (String)attributes.get("templateDir");

		if (templateDir != null) {
			setTemplateDir(templateDir);
		}

		String templateRealDir = (String)attributes.get("templateRealDir");

		if (templateRealDir != null) {
			setTemplateRealDir(templateRealDir);
		}

		String authorizedPassword = (String)attributes.get("authorizedPassword");

		if (authorizedPassword != null) {
			setAuthorizedPassword(authorizedPassword);
		}

		String schedulerClass = (String)attributes.get("schedulerClass");

		if (schedulerClass != null) {
			setSchedulerClass(schedulerClass);
		}
	}

	@Override
	public OSPSchedulerEntry toEscapedModel() {
		return new OSPSchedulerEntryWrapper(_ospSchedulerEntry.toEscapedModel());
	}

	@Override
	public OSPSchedulerEntry toUnescapedModel() {
		return new OSPSchedulerEntryWrapper(_ospSchedulerEntry.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _ospSchedulerEntry.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ospSchedulerEntry.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ospSchedulerEntry.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ospSchedulerEntry.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OSPSchedulerEntry> toCacheModel() {
		return _ospSchedulerEntry.toCacheModel();
	}

	@Override
	public int compareTo(OSPSchedulerEntry ospSchedulerEntry) {
		return _ospSchedulerEntry.compareTo(ospSchedulerEntry);
	}

	/**
	* Returns the status of this osp scheduler entry.
	*
	* @return the status of this osp scheduler entry
	*/
	@Override
	public int getStatus() {
		return _ospSchedulerEntry.getStatus();
	}

	@Override
	public int hashCode() {
		return _ospSchedulerEntry.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ospSchedulerEntry.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OSPSchedulerEntryWrapper((OSPSchedulerEntry)_ospSchedulerEntry.clone());
	}

	/**
	* Returns the access method of this osp scheduler entry.
	*
	* @return the access method of this osp scheduler entry
	*/
	@Override
	public java.lang.String getAccessMethod() {
		return _ospSchedulerEntry.getAccessMethod();
	}

	/**
	* Returns the authorized password of this osp scheduler entry.
	*
	* @return the authorized password of this osp scheduler entry
	*/
	@Override
	public java.lang.String getAuthorizedPassword() {
		return _ospSchedulerEntry.getAuthorizedPassword();
	}

	/**
	* Returns the authorized user of this osp scheduler entry.
	*
	* @return the authorized user of this osp scheduler entry
	*/
	@Override
	public java.lang.String getAuthorizedUser() {
		return _ospSchedulerEntry.getAuthorizedUser();
	}

	/**
	* Returns the class name of this osp scheduler entry.
	*
	* @return the class name of this osp scheduler entry
	*/
	@Override
	public java.lang.String getClassName() {
		return _ospSchedulerEntry.getClassName();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _ospSchedulerEntry.getDefaultLanguageId();
	}

	/**
	* Returns the description of this osp scheduler entry.
	*
	* @return the description of this osp scheduler entry
	*/
	@Override
	public java.lang.String getDescription() {
		return _ospSchedulerEntry.getDescription();
	}

	/**
	* Returns the localized description of this osp scheduler entry in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this osp scheduler entry
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _ospSchedulerEntry.getDescription(languageId);
	}

	/**
	* Returns the localized description of this osp scheduler entry in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this osp scheduler entry
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _ospSchedulerEntry.getDescription(languageId, useDefault);
	}

	/**
	* Returns the localized description of this osp scheduler entry in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this osp scheduler entry
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _ospSchedulerEntry.getDescription(locale);
	}

	/**
	* Returns the localized description of this osp scheduler entry in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this osp scheduler entry. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _ospSchedulerEntry.getDescription(locale, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _ospSchedulerEntry.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _ospSchedulerEntry.getDescriptionCurrentValue();
	}

	/**
	* Returns the name of this osp scheduler entry.
	*
	* @return the name of this osp scheduler entry
	*/
	@Override
	public java.lang.String getName() {
		return _ospSchedulerEntry.getName();
	}

	/**
	* Returns the scheduler class of this osp scheduler entry.
	*
	* @return the scheduler class of this osp scheduler entry
	*/
	@Override
	public java.lang.String getSchedulerClass() {
		return _ospSchedulerEntry.getSchedulerClass();
	}

	/**
	* Returns the server ip of this osp scheduler entry.
	*
	* @return the server ip of this osp scheduler entry
	*/
	@Override
	public java.lang.String getServerIp() {
		return _ospSchedulerEntry.getServerIp();
	}

	/**
	* Returns the ssh port of this osp scheduler entry.
	*
	* @return the ssh port of this osp scheduler entry
	*/
	@Override
	public java.lang.String getSshPort() {
		return _ospSchedulerEntry.getSshPort();
	}

	/**
	* Returns the template dir of this osp scheduler entry.
	*
	* @return the template dir of this osp scheduler entry
	*/
	@Override
	public java.lang.String getTemplateDir() {
		return _ospSchedulerEntry.getTemplateDir();
	}

	/**
	* Returns the template real dir of this osp scheduler entry.
	*
	* @return the template real dir of this osp scheduler entry
	*/
	@Override
	public java.lang.String getTemplateRealDir() {
		return _ospSchedulerEntry.getTemplateRealDir();
	}

	/**
	* Returns the user uuid of this osp scheduler entry.
	*
	* @return the user uuid of this osp scheduler entry
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _ospSchedulerEntry.getUserUuid();
	}

	/**
	* Returns the uuid of this osp scheduler entry.
	*
	* @return the uuid of this osp scheduler entry
	*/
	@Override
	public java.lang.String getUuid() {
		return _ospSchedulerEntry.getUuid();
	}

	/**
	* Returns the version of this osp scheduler entry.
	*
	* @return the version of this osp scheduler entry
	*/
	@Override
	public java.lang.String getVersion() {
		return _ospSchedulerEntry.getVersion();
	}

	@Override
	public java.lang.String toString() {
		return _ospSchedulerEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ospSchedulerEntry.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _ospSchedulerEntry.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this osp scheduler entry.
	*
	* @return the create date of this osp scheduler entry
	*/
	@Override
	public Date getCreateDate() {
		return _ospSchedulerEntry.getCreateDate();
	}

	/**
	* Returns the modified date of this osp scheduler entry.
	*
	* @return the modified date of this osp scheduler entry
	*/
	@Override
	public Date getModifiedDate() {
		return _ospSchedulerEntry.getModifiedDate();
	}

	/**
	* Returns a map of the locales and localized descriptions of this osp scheduler entry.
	*
	* @return the locales and localized descriptions of this osp scheduler entry
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _ospSchedulerEntry.getDescriptionMap();
	}

	/**
	* Returns the company ID of this osp scheduler entry.
	*
	* @return the company ID of this osp scheduler entry
	*/
	@Override
	public long getCompanyId() {
		return _ospSchedulerEntry.getCompanyId();
	}

	/**
	* Returns the group ID of this osp scheduler entry.
	*
	* @return the group ID of this osp scheduler entry
	*/
	@Override
	public long getGroupId() {
		return _ospSchedulerEntry.getGroupId();
	}

	/**
	* Returns the primary key of this osp scheduler entry.
	*
	* @return the primary key of this osp scheduler entry
	*/
	@Override
	public long getPrimaryKey() {
		return _ospSchedulerEntry.getPrimaryKey();
	}

	/**
	* Returns the scheduler entry ID of this osp scheduler entry.
	*
	* @return the scheduler entry ID of this osp scheduler entry
	*/
	@Override
	public long getSchedulerEntryId() {
		return _ospSchedulerEntry.getSchedulerEntryId();
	}

	/**
	* Returns the user ID of this osp scheduler entry.
	*
	* @return the user ID of this osp scheduler entry
	*/
	@Override
	public long getUserId() {
		return _ospSchedulerEntry.getUserId();
	}

	@Override
	public void persist() {
		_ospSchedulerEntry.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_ospSchedulerEntry.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_ospSchedulerEntry.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	* Sets the access method of this osp scheduler entry.
	*
	* @param accessMethod the access method of this osp scheduler entry
	*/
	@Override
	public void setAccessMethod(java.lang.String accessMethod) {
		_ospSchedulerEntry.setAccessMethod(accessMethod);
	}

	/**
	* Sets the authorized password of this osp scheduler entry.
	*
	* @param authorizedPassword the authorized password of this osp scheduler entry
	*/
	@Override
	public void setAuthorizedPassword(java.lang.String authorizedPassword) {
		_ospSchedulerEntry.setAuthorizedPassword(authorizedPassword);
	}

	/**
	* Sets the authorized user of this osp scheduler entry.
	*
	* @param authorizedUser the authorized user of this osp scheduler entry
	*/
	@Override
	public void setAuthorizedUser(java.lang.String authorizedUser) {
		_ospSchedulerEntry.setAuthorizedUser(authorizedUser);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ospSchedulerEntry.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this osp scheduler entry.
	*
	* @param className the class name of this osp scheduler entry
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_ospSchedulerEntry.setClassName(className);
	}

	/**
	* Sets the company ID of this osp scheduler entry.
	*
	* @param companyId the company ID of this osp scheduler entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_ospSchedulerEntry.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this osp scheduler entry.
	*
	* @param createDate the create date of this osp scheduler entry
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_ospSchedulerEntry.setCreateDate(createDate);
	}

	/**
	* Sets the description of this osp scheduler entry.
	*
	* @param description the description of this osp scheduler entry
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_ospSchedulerEntry.setDescription(description);
	}

	/**
	* Sets the localized description of this osp scheduler entry in the language.
	*
	* @param description the localized description of this osp scheduler entry
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_ospSchedulerEntry.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this osp scheduler entry in the language, and sets the default locale.
	*
	* @param description the localized description of this osp scheduler entry
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_ospSchedulerEntry.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_ospSchedulerEntry.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this osp scheduler entry from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this osp scheduler entry
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap) {
		_ospSchedulerEntry.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this osp scheduler entry from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this osp scheduler entry
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_ospSchedulerEntry.setDescriptionMap(descriptionMap, defaultLocale);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ospSchedulerEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ospSchedulerEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ospSchedulerEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this osp scheduler entry.
	*
	* @param groupId the group ID of this osp scheduler entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_ospSchedulerEntry.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this osp scheduler entry.
	*
	* @param modifiedDate the modified date of this osp scheduler entry
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ospSchedulerEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this osp scheduler entry.
	*
	* @param name the name of this osp scheduler entry
	*/
	@Override
	public void setName(java.lang.String name) {
		_ospSchedulerEntry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_ospSchedulerEntry.setNew(n);
	}

	/**
	* Sets the primary key of this osp scheduler entry.
	*
	* @param primaryKey the primary key of this osp scheduler entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ospSchedulerEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ospSchedulerEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the scheduler class of this osp scheduler entry.
	*
	* @param schedulerClass the scheduler class of this osp scheduler entry
	*/
	@Override
	public void setSchedulerClass(java.lang.String schedulerClass) {
		_ospSchedulerEntry.setSchedulerClass(schedulerClass);
	}

	/**
	* Sets the scheduler entry ID of this osp scheduler entry.
	*
	* @param schedulerEntryId the scheduler entry ID of this osp scheduler entry
	*/
	@Override
	public void setSchedulerEntryId(long schedulerEntryId) {
		_ospSchedulerEntry.setSchedulerEntryId(schedulerEntryId);
	}

	/**
	* Sets the server ip of this osp scheduler entry.
	*
	* @param serverIp the server ip of this osp scheduler entry
	*/
	@Override
	public void setServerIp(java.lang.String serverIp) {
		_ospSchedulerEntry.setServerIp(serverIp);
	}

	/**
	* Sets the ssh port of this osp scheduler entry.
	*
	* @param sshPort the ssh port of this osp scheduler entry
	*/
	@Override
	public void setSshPort(java.lang.String sshPort) {
		_ospSchedulerEntry.setSshPort(sshPort);
	}

	/**
	* Sets the status of this osp scheduler entry.
	*
	* @param status the status of this osp scheduler entry
	*/
	@Override
	public void setStatus(int status) {
		_ospSchedulerEntry.setStatus(status);
	}

	/**
	* Sets the template dir of this osp scheduler entry.
	*
	* @param templateDir the template dir of this osp scheduler entry
	*/
	@Override
	public void setTemplateDir(java.lang.String templateDir) {
		_ospSchedulerEntry.setTemplateDir(templateDir);
	}

	/**
	* Sets the template real dir of this osp scheduler entry.
	*
	* @param templateRealDir the template real dir of this osp scheduler entry
	*/
	@Override
	public void setTemplateRealDir(java.lang.String templateRealDir) {
		_ospSchedulerEntry.setTemplateRealDir(templateRealDir);
	}

	/**
	* Sets the user ID of this osp scheduler entry.
	*
	* @param userId the user ID of this osp scheduler entry
	*/
	@Override
	public void setUserId(long userId) {
		_ospSchedulerEntry.setUserId(userId);
	}

	/**
	* Sets the user uuid of this osp scheduler entry.
	*
	* @param userUuid the user uuid of this osp scheduler entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_ospSchedulerEntry.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this osp scheduler entry.
	*
	* @param uuid the uuid of this osp scheduler entry
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_ospSchedulerEntry.setUuid(uuid);
	}

	/**
	* Sets the version of this osp scheduler entry.
	*
	* @param version the version of this osp scheduler entry
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_ospSchedulerEntry.setVersion(version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OSPSchedulerEntryWrapper)) {
			return false;
		}

		OSPSchedulerEntryWrapper ospSchedulerEntryWrapper = (OSPSchedulerEntryWrapper)obj;

		if (Objects.equals(_ospSchedulerEntry,
					ospSchedulerEntryWrapper._ospSchedulerEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _ospSchedulerEntry.getStagedModelType();
	}

	@Override
	public OSPSchedulerEntry getWrappedModel() {
		return _ospSchedulerEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ospSchedulerEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ospSchedulerEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ospSchedulerEntry.resetOriginalValues();
	}

	private final OSPSchedulerEntry _ospSchedulerEntry;
}