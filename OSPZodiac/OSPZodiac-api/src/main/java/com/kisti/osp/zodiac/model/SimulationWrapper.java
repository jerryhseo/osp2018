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

package com.kisti.osp.zodiac.model;

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
 * This class is a wrapper for {@link Simulation}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see Simulation
 * @generated
 */
@ProviderType
public class SimulationWrapper implements Simulation, ModelWrapper<Simulation> {
	public SimulationWrapper(Simulation simulation) {
		_simulation = simulation;
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

	@Override
	public Simulation toEscapedModel() {
		return new SimulationWrapper(_simulation.toEscapedModel());
	}

	@Override
	public Simulation toUnescapedModel() {
		return new SimulationWrapper(_simulation.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _simulation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _simulation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _simulation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _simulation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Simulation> toCacheModel() {
		return _simulation.toCacheModel();
	}

	@Override
	public int compareTo(Simulation simulation) {
		return _simulation.compareTo(simulation);
	}

	/**
	* Returns the status of this simulation.
	*
	* @return the status of this simulation
	*/
	@Override
	public int getStatus() {
		return _simulation.getStatus();
	}

	@Override
	public int hashCode() {
		return _simulation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _simulation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SimulationWrapper((Simulation)_simulation.clone());
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _simulation.getDefaultLanguageId();
	}

	/**
	* Returns the simulation status of this simulation.
	*
	* @return the simulation status of this simulation
	*/
	@Override
	public java.lang.String getSimulationStatus() {
		return _simulation.getSimulationStatus();
	}

	/**
	* Returns the tasks of this simulation.
	*
	* @return the tasks of this simulation
	*/
	@Override
	public java.lang.String getTasks() {
		return _simulation.getTasks();
	}

	/**
	* Returns the title of this simulation.
	*
	* @return the title of this simulation
	*/
	@Override
	public java.lang.String getTitle() {
		return _simulation.getTitle();
	}

	/**
	* Returns the localized title of this simulation in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this simulation
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _simulation.getTitle(languageId);
	}

	/**
	* Returns the localized title of this simulation in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this simulation
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _simulation.getTitle(languageId, useDefault);
	}

	/**
	* Returns the localized title of this simulation in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this simulation
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _simulation.getTitle(locale);
	}

	/**
	* Returns the localized title of this simulation in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this simulation. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _simulation.getTitle(locale, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _simulation.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _simulation.getTitleCurrentValue();
	}

	/**
	* Returns the user uuid of this simulation.
	*
	* @return the user uuid of this simulation
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _simulation.getUserUuid();
	}

	/**
	* Returns the uuid of this simulation.
	*
	* @return the uuid of this simulation
	*/
	@Override
	public java.lang.String getUuid() {
		return _simulation.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _simulation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _simulation.toXmlString();
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _simulation.getAvailableLanguageIds();
	}

	/**
	* Returns the create date of this simulation.
	*
	* @return the create date of this simulation
	*/
	@Override
	public Date getCreateDate() {
		return _simulation.getCreateDate();
	}

	/**
	* Returns the modified date of this simulation.
	*
	* @return the modified date of this simulation
	*/
	@Override
	public Date getModifiedDate() {
		return _simulation.getModifiedDate();
	}

	/**
	* Returns a map of the locales and localized titles of this simulation.
	*
	* @return the locales and localized titles of this simulation
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _simulation.getTitleMap();
	}

	/**
	* Returns the company ID of this simulation.
	*
	* @return the company ID of this simulation
	*/
	@Override
	public long getCompanyId() {
		return _simulation.getCompanyId();
	}

	/**
	* Returns the group ID of this simulation.
	*
	* @return the group ID of this simulation
	*/
	@Override
	public long getGroupId() {
		return _simulation.getGroupId();
	}

	/**
	* Returns the icon ID of this simulation.
	*
	* @return the icon ID of this simulation
	*/
	@Override
	public long getIconId() {
		return _simulation.getIconId();
	}

	/**
	* Returns the primary key of this simulation.
	*
	* @return the primary key of this simulation
	*/
	@Override
	public long getPrimaryKey() {
		return _simulation.getPrimaryKey();
	}

	/**
	* Returns the simulation ID of this simulation.
	*
	* @return the simulation ID of this simulation
	*/
	@Override
	public long getSimulationId() {
		return _simulation.getSimulationId();
	}

	/**
	* Returns the user ID of this simulation.
	*
	* @return the user ID of this simulation
	*/
	@Override
	public long getUserId() {
		return _simulation.getUserId();
	}

	/**
	* Returns the web content ID of this simulation.
	*
	* @return the web content ID of this simulation
	*/
	@Override
	public long getWebContentId() {
		return _simulation.getWebContentId();
	}

	@Override
	public void persist() {
		_simulation.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_simulation.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_simulation.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_simulation.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this simulation.
	*
	* @param companyId the company ID of this simulation
	*/
	@Override
	public void setCompanyId(long companyId) {
		_simulation.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this simulation.
	*
	* @param createDate the create date of this simulation
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_simulation.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_simulation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_simulation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_simulation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this simulation.
	*
	* @param groupId the group ID of this simulation
	*/
	@Override
	public void setGroupId(long groupId) {
		_simulation.setGroupId(groupId);
	}

	/**
	* Sets the icon ID of this simulation.
	*
	* @param iconId the icon ID of this simulation
	*/
	@Override
	public void setIconId(long iconId) {
		_simulation.setIconId(iconId);
	}

	/**
	* Sets the modified date of this simulation.
	*
	* @param modifiedDate the modified date of this simulation
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_simulation.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_simulation.setNew(n);
	}

	/**
	* Sets the primary key of this simulation.
	*
	* @param primaryKey the primary key of this simulation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_simulation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_simulation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the simulation ID of this simulation.
	*
	* @param simulationId the simulation ID of this simulation
	*/
	@Override
	public void setSimulationId(long simulationId) {
		_simulation.setSimulationId(simulationId);
	}

	/**
	* Sets the simulation status of this simulation.
	*
	* @param simulationStatus the simulation status of this simulation
	*/
	@Override
	public void setSimulationStatus(java.lang.String simulationStatus) {
		_simulation.setSimulationStatus(simulationStatus);
	}

	/**
	* Sets the status of this simulation.
	*
	* @param status the status of this simulation
	*/
	@Override
	public void setStatus(int status) {
		_simulation.setStatus(status);
	}

	/**
	* Sets the tasks of this simulation.
	*
	* @param tasks the tasks of this simulation
	*/
	@Override
	public void setTasks(java.lang.String tasks) {
		_simulation.setTasks(tasks);
	}

	/**
	* Sets the title of this simulation.
	*
	* @param title the title of this simulation
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_simulation.setTitle(title);
	}

	/**
	* Sets the localized title of this simulation in the language.
	*
	* @param title the localized title of this simulation
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_simulation.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this simulation in the language, and sets the default locale.
	*
	* @param title the localized title of this simulation
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_simulation.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_simulation.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this simulation from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this simulation
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap) {
		_simulation.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this simulation from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this simulation
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_simulation.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Sets the user ID of this simulation.
	*
	* @param userId the user ID of this simulation
	*/
	@Override
	public void setUserId(long userId) {
		_simulation.setUserId(userId);
	}

	/**
	* Sets the user uuid of this simulation.
	*
	* @param userUuid the user uuid of this simulation
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_simulation.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this simulation.
	*
	* @param uuid the uuid of this simulation
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_simulation.setUuid(uuid);
	}

	/**
	* Sets the web content ID of this simulation.
	*
	* @param webContentId the web content ID of this simulation
	*/
	@Override
	public void setWebContentId(long webContentId) {
		_simulation.setWebContentId(webContentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SimulationWrapper)) {
			return false;
		}

		SimulationWrapper simulationWrapper = (SimulationWrapper)obj;

		if (Objects.equals(_simulation, simulationWrapper._simulation)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _simulation.getStagedModelType();
	}

	@Override
	public Simulation getWrappedModel() {
		return _simulation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _simulation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _simulation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_simulation.resetOriginalValues();
	}

	private final Simulation _simulation;
}