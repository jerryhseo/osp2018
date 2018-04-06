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

package com.kisti.osp.spyglass.model;

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
 * This class is a wrapper for {@link ScienceApp}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceApp
 * @generated
 */
@ProviderType
public class ScienceAppWrapper implements ScienceApp, ModelWrapper<ScienceApp> {
	public ScienceAppWrapper(ScienceApp scienceApp) {
		_scienceApp = scienceApp;
	}

	@Override
	public Class<?> getModelClass() {
		return ScienceApp.class;
	}

	@Override
	public String getModelClassName() {
		return ScienceApp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("version", getVersion());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("previousVersionId", getPreviousVersionId());
		attributes.put("iconId", getIconId());
		attributes.put("manual", getManual());
		attributes.put("exeFileName", getExeFileName());
		attributes.put("appType", getAppType());
		attributes.put("runType", getRunType());
		attributes.put("openStatus", getOpenStatus());
		attributes.put("status", getStatus());
		attributes.put("recentModifierId", getRecentModifierId());
		attributes.put("maxCpus", getMaxCpus());
		attributes.put("defaultCpus", getDefaultCpus());
		attributes.put("statusDate", getStatusDate());
		attributes.put("openLevel", getOpenLevel());
		attributes.put("license", getLicense());
		attributes.put("srcFileName", getSrcFileName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long previousVersionId = (Long)attributes.get("previousVersionId");

		if (previousVersionId != null) {
			setPreviousVersionId(previousVersionId);
		}

		Long iconId = (Long)attributes.get("iconId");

		if (iconId != null) {
			setIconId(iconId);
		}

		String manual = (String)attributes.get("manual");

		if (manual != null) {
			setManual(manual);
		}

		String exeFileName = (String)attributes.get("exeFileName");

		if (exeFileName != null) {
			setExeFileName(exeFileName);
		}

		String appType = (String)attributes.get("appType");

		if (appType != null) {
			setAppType(appType);
		}

		String runType = (String)attributes.get("runType");

		if (runType != null) {
			setRunType(runType);
		}

		String openStatus = (String)attributes.get("openStatus");

		if (openStatus != null) {
			setOpenStatus(openStatus);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long recentModifierId = (Long)attributes.get("recentModifierId");

		if (recentModifierId != null) {
			setRecentModifierId(recentModifierId);
		}

		Integer maxCpus = (Integer)attributes.get("maxCpus");

		if (maxCpus != null) {
			setMaxCpus(maxCpus);
		}

		Integer defaultCpus = (Integer)attributes.get("defaultCpus");

		if (defaultCpus != null) {
			setDefaultCpus(defaultCpus);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Integer openLevel = (Integer)attributes.get("openLevel");

		if (openLevel != null) {
			setOpenLevel(openLevel);
		}

		String license = (String)attributes.get("license");

		if (license != null) {
			setLicense(license);
		}

		String srcFileName = (String)attributes.get("srcFileName");

		if (srcFileName != null) {
			setSrcFileName(srcFileName);
		}
	}

	@Override
	public ScienceApp toEscapedModel() {
		return new ScienceAppWrapper(_scienceApp.toEscapedModel());
	}

	@Override
	public ScienceApp toUnescapedModel() {
		return new ScienceAppWrapper(_scienceApp.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _scienceApp.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _scienceApp.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _scienceApp.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _scienceApp.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ScienceApp> toCacheModel() {
		return _scienceApp.toCacheModel();
	}

	@Override
	public int compareTo(ScienceApp scienceApp) {
		return _scienceApp.compareTo(scienceApp);
	}

	/**
	* Returns the default cpus of this science app.
	*
	* @return the default cpus of this science app
	*/
	@Override
	public int getDefaultCpus() {
		return _scienceApp.getDefaultCpus();
	}

	/**
	* Returns the max cpus of this science app.
	*
	* @return the max cpus of this science app
	*/
	@Override
	public int getMaxCpus() {
		return _scienceApp.getMaxCpus();
	}

	/**
	* Returns the open level of this science app.
	*
	* @return the open level of this science app
	*/
	@Override
	public int getOpenLevel() {
		return _scienceApp.getOpenLevel();
	}

	/**
	* Returns the status of this science app.
	*
	* @return the status of this science app
	*/
	@Override
	public int getStatus() {
		return _scienceApp.getStatus();
	}

	@Override
	public int hashCode() {
		return _scienceApp.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scienceApp.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ScienceAppWrapper((ScienceApp)_scienceApp.clone());
	}

	@Override
	public java.lang.String getAppBaseDir(java.lang.String sysBaseDir) {
		return _scienceApp.getAppBaseDir(sysBaseDir);
	}

	/**
	* Returns the app type of this science app.
	*
	* @return the app type of this science app
	*/
	@Override
	public java.lang.String getAppType() {
		return _scienceApp.getAppType();
	}

	@Override
	public java.lang.String getBinDir(java.lang.String sysBaseDir) {
		return _scienceApp.getBinDir(sysBaseDir);
	}

	@Override
	public java.lang.String getDataDir(java.lang.String sysBaseDir) {
		return _scienceApp.getDataDir(sysBaseDir);
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _scienceApp.getDefaultLanguageId();
	}

	/**
	* Returns the description of this science app.
	*
	* @return the description of this science app
	*/
	@Override
	public java.lang.String getDescription() {
		return _scienceApp.getDescription();
	}

	/**
	* Returns the localized description of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this science app
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _scienceApp.getDescription(languageId);
	}

	/**
	* Returns the localized description of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this science app
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _scienceApp.getDescription(languageId, useDefault);
	}

	/**
	* Returns the localized description of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this science app
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _scienceApp.getDescription(locale);
	}

	/**
	* Returns the localized description of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this science app. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _scienceApp.getDescription(locale, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _scienceApp.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _scienceApp.getDescriptionCurrentValue();
	}

	/**
	* Returns the exe file name of this science app.
	*
	* @return the exe file name of this science app
	*/
	@Override
	public java.lang.String getExeFileName() {
		return _scienceApp.getExeFileName();
	}

	/**
	* Returns the license of this science app.
	*
	* @return the license of this science app
	*/
	@Override
	public java.lang.String getLicense() {
		return _scienceApp.getLicense();
	}

	/**
	* Returns the manual of this science app.
	*
	* @return the manual of this science app
	*/
	@Override
	public java.lang.String getManual() {
		return _scienceApp.getManual();
	}

	/**
	* Returns the localized manual of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized manual of this science app
	*/
	@Override
	public java.lang.String getManual(java.lang.String languageId) {
		return _scienceApp.getManual(languageId);
	}

	/**
	* Returns the localized manual of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized manual of this science app
	*/
	@Override
	public java.lang.String getManual(java.lang.String languageId,
		boolean useDefault) {
		return _scienceApp.getManual(languageId, useDefault);
	}

	/**
	* Returns the localized manual of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized manual of this science app
	*/
	@Override
	public java.lang.String getManual(java.util.Locale locale) {
		return _scienceApp.getManual(locale);
	}

	/**
	* Returns the localized manual of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized manual of this science app. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getManual(java.util.Locale locale,
		boolean useDefault) {
		return _scienceApp.getManual(locale, useDefault);
	}

	@Override
	public java.lang.String getManualCurrentLanguageId() {
		return _scienceApp.getManualCurrentLanguageId();
	}

	@Override
	public java.lang.String getManualCurrentValue() {
		return _scienceApp.getManualCurrentValue();
	}

	/**
	* Returns the name of this science app.
	*
	* @return the name of this science app
	*/
	@Override
	public java.lang.String getName() {
		return _scienceApp.getName();
	}

	/**
	* Returns the open status of this science app.
	*
	* @return the open status of this science app
	*/
	@Override
	public java.lang.String getOpenStatus() {
		return _scienceApp.getOpenStatus();
	}

	/**
	* Returns the run type of this science app.
	*
	* @return the run type of this science app
	*/
	@Override
	public java.lang.String getRunType() {
		return _scienceApp.getRunType();
	}

	@Override
	public java.lang.String getSrcDir(java.lang.String sysBaseDir) {
		return _scienceApp.getSrcDir(sysBaseDir);
	}

	/**
	* Returns the src file name of this science app.
	*
	* @return the src file name of this science app
	*/
	@Override
	public java.lang.String getSrcFileName() {
		return _scienceApp.getSrcFileName();
	}

	/**
	* Returns the title of this science app.
	*
	* @return the title of this science app
	*/
	@Override
	public java.lang.String getTitle() {
		return _scienceApp.getTitle();
	}

	/**
	* Returns the localized title of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this science app
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _scienceApp.getTitle(languageId);
	}

	/**
	* Returns the localized title of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this science app
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _scienceApp.getTitle(languageId, useDefault);
	}

	/**
	* Returns the localized title of this science app in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this science app
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _scienceApp.getTitle(locale);
	}

	/**
	* Returns the localized title of this science app in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this science app. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _scienceApp.getTitle(locale, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _scienceApp.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _scienceApp.getTitleCurrentValue();
	}

	/**
	* Returns the user uuid of this science app.
	*
	* @return the user uuid of this science app
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _scienceApp.getUserUuid();
	}

	/**
	* Returns the uuid of this science app.
	*
	* @return the uuid of this science app
	*/
	@Override
	public java.lang.String getUuid() {
		return _scienceApp.getUuid();
	}

	/**
	* Returns the version of this science app.
	*
	* @return the version of this science app
	*/
	@Override
	public java.lang.String getVersion() {
		return _scienceApp.getVersion();
	}

	@Override
	public java.lang.String toString() {
		return _scienceApp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _scienceApp.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _scienceApp.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this science app.
	*
	* @return the create date of this science app
	*/
	@Override
	public Date getCreateDate() {
		return _scienceApp.getCreateDate();
	}

	/**
	* Returns the modified date of this science app.
	*
	* @return the modified date of this science app
	*/
	@Override
	public Date getModifiedDate() {
		return _scienceApp.getModifiedDate();
	}

	/**
	* Returns the status date of this science app.
	*
	* @return the status date of this science app
	*/
	@Override
	public Date getStatusDate() {
		return _scienceApp.getStatusDate();
	}

	/**
	* Returns a map of the locales and localized descriptions of this science app.
	*
	* @return the locales and localized descriptions of this science app
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _scienceApp.getDescriptionMap();
	}

	/**
	* Returns a map of the locales and localized manuals of this science app.
	*
	* @return the locales and localized manuals of this science app
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getManualMap() {
		return _scienceApp.getManualMap();
	}

	/**
	* Returns a map of the locales and localized titles of this science app.
	*
	* @return the locales and localized titles of this science app
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _scienceApp.getTitleMap();
	}

	/**
	* Returns the company ID of this science app.
	*
	* @return the company ID of this science app
	*/
	@Override
	public long getCompanyId() {
		return _scienceApp.getCompanyId();
	}

	/**
	* Returns the group ID of this science app.
	*
	* @return the group ID of this science app
	*/
	@Override
	public long getGroupId() {
		return _scienceApp.getGroupId();
	}

	/**
	* Returns the icon ID of this science app.
	*
	* @return the icon ID of this science app
	*/
	@Override
	public long getIconId() {
		return _scienceApp.getIconId();
	}

	/**
	* Returns the previous version ID of this science app.
	*
	* @return the previous version ID of this science app
	*/
	@Override
	public long getPreviousVersionId() {
		return _scienceApp.getPreviousVersionId();
	}

	/**
	* Returns the primary key of this science app.
	*
	* @return the primary key of this science app
	*/
	@Override
	public long getPrimaryKey() {
		return _scienceApp.getPrimaryKey();
	}

	/**
	* Returns the recent modifier ID of this science app.
	*
	* @return the recent modifier ID of this science app
	*/
	@Override
	public long getRecentModifierId() {
		return _scienceApp.getRecentModifierId();
	}

	/**
	* Returns the science app ID of this science app.
	*
	* @return the science app ID of this science app
	*/
	@Override
	public long getScienceAppId() {
		return _scienceApp.getScienceAppId();
	}

	/**
	* Returns the user ID of this science app.
	*
	* @return the user ID of this science app
	*/
	@Override
	public long getUserId() {
		return _scienceApp.getUserId();
	}

	@Override
	public void persist() {
		_scienceApp.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_scienceApp.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_scienceApp.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	* Sets the app type of this science app.
	*
	* @param appType the app type of this science app
	*/
	@Override
	public void setAppType(java.lang.String appType) {
		_scienceApp.setAppType(appType);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_scienceApp.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this science app.
	*
	* @param companyId the company ID of this science app
	*/
	@Override
	public void setCompanyId(long companyId) {
		_scienceApp.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this science app.
	*
	* @param createDate the create date of this science app
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_scienceApp.setCreateDate(createDate);
	}

	/**
	* Sets the default cpus of this science app.
	*
	* @param defaultCpus the default cpus of this science app
	*/
	@Override
	public void setDefaultCpus(int defaultCpus) {
		_scienceApp.setDefaultCpus(defaultCpus);
	}

	/**
	* Sets the description of this science app.
	*
	* @param description the description of this science app
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_scienceApp.setDescription(description);
	}

	/**
	* Sets the localized description of this science app in the language.
	*
	* @param description the localized description of this science app
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_scienceApp.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this science app in the language, and sets the default locale.
	*
	* @param description the localized description of this science app
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_scienceApp.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_scienceApp.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this science app from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this science app
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap) {
		_scienceApp.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this science app from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this science app
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_scienceApp.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	* Sets the exe file name of this science app.
	*
	* @param exeFileName the exe file name of this science app
	*/
	@Override
	public void setExeFileName(java.lang.String exeFileName) {
		_scienceApp.setExeFileName(exeFileName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_scienceApp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_scienceApp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_scienceApp.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this science app.
	*
	* @param groupId the group ID of this science app
	*/
	@Override
	public void setGroupId(long groupId) {
		_scienceApp.setGroupId(groupId);
	}

	/**
	* Sets the icon ID of this science app.
	*
	* @param iconId the icon ID of this science app
	*/
	@Override
	public void setIconId(long iconId) {
		_scienceApp.setIconId(iconId);
	}

	/**
	* Sets the license of this science app.
	*
	* @param license the license of this science app
	*/
	@Override
	public void setLicense(java.lang.String license) {
		_scienceApp.setLicense(license);
	}

	/**
	* Sets the manual of this science app.
	*
	* @param manual the manual of this science app
	*/
	@Override
	public void setManual(java.lang.String manual) {
		_scienceApp.setManual(manual);
	}

	/**
	* Sets the localized manual of this science app in the language.
	*
	* @param manual the localized manual of this science app
	* @param locale the locale of the language
	*/
	@Override
	public void setManual(java.lang.String manual, java.util.Locale locale) {
		_scienceApp.setManual(manual, locale);
	}

	/**
	* Sets the localized manual of this science app in the language, and sets the default locale.
	*
	* @param manual the localized manual of this science app
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setManual(java.lang.String manual, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_scienceApp.setManual(manual, locale, defaultLocale);
	}

	@Override
	public void setManualCurrentLanguageId(java.lang.String languageId) {
		_scienceApp.setManualCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized manuals of this science app from the map of locales and localized manuals.
	*
	* @param manualMap the locales and localized manuals of this science app
	*/
	@Override
	public void setManualMap(Map<java.util.Locale, java.lang.String> manualMap) {
		_scienceApp.setManualMap(manualMap);
	}

	/**
	* Sets the localized manuals of this science app from the map of locales and localized manuals, and sets the default locale.
	*
	* @param manualMap the locales and localized manuals of this science app
	* @param defaultLocale the default locale
	*/
	@Override
	public void setManualMap(
		Map<java.util.Locale, java.lang.String> manualMap,
		java.util.Locale defaultLocale) {
		_scienceApp.setManualMap(manualMap, defaultLocale);
	}

	/**
	* Sets the max cpus of this science app.
	*
	* @param maxCpus the max cpus of this science app
	*/
	@Override
	public void setMaxCpus(int maxCpus) {
		_scienceApp.setMaxCpus(maxCpus);
	}

	/**
	* Sets the modified date of this science app.
	*
	* @param modifiedDate the modified date of this science app
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_scienceApp.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this science app.
	*
	* @param name the name of this science app
	*/
	@Override
	public void setName(java.lang.String name) {
		_scienceApp.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_scienceApp.setNew(n);
	}

	/**
	* Sets the open level of this science app.
	*
	* @param openLevel the open level of this science app
	*/
	@Override
	public void setOpenLevel(int openLevel) {
		_scienceApp.setOpenLevel(openLevel);
	}

	/**
	* Sets the open status of this science app.
	*
	* @param openStatus the open status of this science app
	*/
	@Override
	public void setOpenStatus(java.lang.String openStatus) {
		_scienceApp.setOpenStatus(openStatus);
	}

	/**
	* Sets the previous version ID of this science app.
	*
	* @param previousVersionId the previous version ID of this science app
	*/
	@Override
	public void setPreviousVersionId(long previousVersionId) {
		_scienceApp.setPreviousVersionId(previousVersionId);
	}

	/**
	* Sets the primary key of this science app.
	*
	* @param primaryKey the primary key of this science app
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_scienceApp.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_scienceApp.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the recent modifier ID of this science app.
	*
	* @param recentModifierId the recent modifier ID of this science app
	*/
	@Override
	public void setRecentModifierId(long recentModifierId) {
		_scienceApp.setRecentModifierId(recentModifierId);
	}

	/**
	* Sets the run type of this science app.
	*
	* @param runType the run type of this science app
	*/
	@Override
	public void setRunType(java.lang.String runType) {
		_scienceApp.setRunType(runType);
	}

	/**
	* Sets the science app ID of this science app.
	*
	* @param scienceAppId the science app ID of this science app
	*/
	@Override
	public void setScienceAppId(long scienceAppId) {
		_scienceApp.setScienceAppId(scienceAppId);
	}

	/**
	* Sets the src file name of this science app.
	*
	* @param srcFileName the src file name of this science app
	*/
	@Override
	public void setSrcFileName(java.lang.String srcFileName) {
		_scienceApp.setSrcFileName(srcFileName);
	}

	/**
	* Sets the status of this science app.
	*
	* @param status the status of this science app
	*/
	@Override
	public void setStatus(int status) {
		_scienceApp.setStatus(status);
	}

	/**
	* Sets the status date of this science app.
	*
	* @param statusDate the status date of this science app
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_scienceApp.setStatusDate(statusDate);
	}

	/**
	* Sets the title of this science app.
	*
	* @param title the title of this science app
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_scienceApp.setTitle(title);
	}

	/**
	* Sets the localized title of this science app in the language.
	*
	* @param title the localized title of this science app
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_scienceApp.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this science app in the language, and sets the default locale.
	*
	* @param title the localized title of this science app
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_scienceApp.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_scienceApp.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this science app from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this science app
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap) {
		_scienceApp.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this science app from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this science app
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_scienceApp.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Sets the user ID of this science app.
	*
	* @param userId the user ID of this science app
	*/
	@Override
	public void setUserId(long userId) {
		_scienceApp.setUserId(userId);
	}

	/**
	* Sets the user uuid of this science app.
	*
	* @param userUuid the user uuid of this science app
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_scienceApp.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this science app.
	*
	* @param uuid the uuid of this science app
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_scienceApp.setUuid(uuid);
	}

	/**
	* Sets the version of this science app.
	*
	* @param version the version of this science app
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_scienceApp.setVersion(version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScienceAppWrapper)) {
			return false;
		}

		ScienceAppWrapper scienceAppWrapper = (ScienceAppWrapper)obj;

		if (Objects.equals(_scienceApp, scienceAppWrapper._scienceApp)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _scienceApp.getStagedModelType();
	}

	@Override
	public ScienceApp getWrappedModel() {
		return _scienceApp;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _scienceApp.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _scienceApp.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_scienceApp.resetOriginalValues();
	}

	private final ScienceApp _scienceApp;
}