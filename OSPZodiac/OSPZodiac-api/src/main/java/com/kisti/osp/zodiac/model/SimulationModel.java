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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the Simulation service. Represents a row in the &quot;zodiac_Simulation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.osp.zodiac.model.impl.SimulationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.osp.zodiac.model.impl.SimulationImpl}.
 * </p>
 *
 * @author Jerry H. Seo
 * @see Simulation
 * @see com.kisti.osp.zodiac.model.impl.SimulationImpl
 * @see com.kisti.osp.zodiac.model.impl.SimulationModelImpl
 * @generated
 */
@ProviderType
public interface SimulationModel extends BaseModel<Simulation>, LocalizedModel,
	ShardedModel, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a simulation model instance should use the {@link Simulation} interface instead.
	 */

	/**
	 * Returns the primary key of this simulation.
	 *
	 * @return the primary key of this simulation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this simulation.
	 *
	 * @param primaryKey the primary key of this simulation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this simulation.
	 *
	 * @return the uuid of this simulation
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this simulation.
	 *
	 * @param uuid the uuid of this simulation
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the simulation ID of this simulation.
	 *
	 * @return the simulation ID of this simulation
	 */
	public long getSimulationId();

	/**
	 * Sets the simulation ID of this simulation.
	 *
	 * @param simulationId the simulation ID of this simulation
	 */
	public void setSimulationId(long simulationId);

	/**
	 * Returns the group ID of this simulation.
	 *
	 * @return the group ID of this simulation
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this simulation.
	 *
	 * @param groupId the group ID of this simulation
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this simulation.
	 *
	 * @return the company ID of this simulation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this simulation.
	 *
	 * @param companyId the company ID of this simulation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this simulation.
	 *
	 * @return the user ID of this simulation
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this simulation.
	 *
	 * @param userId the user ID of this simulation
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this simulation.
	 *
	 * @return the user uuid of this simulation
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this simulation.
	 *
	 * @param userUuid the user uuid of this simulation
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this simulation.
	 *
	 * @return the create date of this simulation
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this simulation.
	 *
	 * @param createDate the create date of this simulation
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this simulation.
	 *
	 * @return the modified date of this simulation
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this simulation.
	 *
	 * @param modifiedDate the modified date of this simulation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this simulation.
	 *
	 * @return the title of this simulation
	 */
	public String getTitle();

	/**
	 * Returns the localized title of this simulation in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this simulation
	 */
	@AutoEscape
	public String getTitle(Locale locale);

	/**
	 * Returns the localized title of this simulation in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this simulation. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Returns the localized title of this simulation in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this simulation
	 */
	@AutoEscape
	public String getTitle(String languageId);

	/**
	 * Returns the localized title of this simulation in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this simulation
	 */
	@AutoEscape
	public String getTitle(String languageId, boolean useDefault);

	@AutoEscape
	public String getTitleCurrentLanguageId();

	@AutoEscape
	public String getTitleCurrentValue();

	/**
	 * Returns a map of the locales and localized titles of this simulation.
	 *
	 * @return the locales and localized titles of this simulation
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this simulation.
	 *
	 * @param title the title of this simulation
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this simulation in the language.
	 *
	 * @param title the localized title of this simulation
	 * @param locale the locale of the language
	 */
	public void setTitle(String title, Locale locale);

	/**
	 * Sets the localized title of this simulation in the language, and sets the default locale.
	 *
	 * @param title the localized title of this simulation
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitle(String title, Locale locale, Locale defaultLocale);

	public void setTitleCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titles of this simulation from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this simulation
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Sets the localized titles of this simulation from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this simulation
	 * @param defaultLocale the default locale
	 */
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Returns the web content ID of this simulation.
	 *
	 * @return the web content ID of this simulation
	 */
	public long getWebContentId();

	/**
	 * Sets the web content ID of this simulation.
	 *
	 * @param webContentId the web content ID of this simulation
	 */
	public void setWebContentId(long webContentId);

	/**
	 * Returns the icon ID of this simulation.
	 *
	 * @return the icon ID of this simulation
	 */
	public long getIconId();

	/**
	 * Sets the icon ID of this simulation.
	 *
	 * @param iconId the icon ID of this simulation
	 */
	public void setIconId(long iconId);

	/**
	 * Returns the simulation status of this simulation.
	 *
	 * @return the simulation status of this simulation
	 */
	@AutoEscape
	public String getSimulationStatus();

	/**
	 * Sets the simulation status of this simulation.
	 *
	 * @param simulationStatus the simulation status of this simulation
	 */
	public void setSimulationStatus(String simulationStatus);

	/**
	 * Returns the status of this simulation.
	 *
	 * @return the status of this simulation
	 */
	public int getStatus();

	/**
	 * Sets the status of this simulation.
	 *
	 * @param status the status of this simulation
	 */
	public void setStatus(int status);

	/**
	 * Returns the tasks of this simulation.
	 *
	 * @return the tasks of this simulation
	 */
	@AutoEscape
	public String getTasks();

	/**
	 * Sets the tasks of this simulation.
	 *
	 * @param tasks the tasks of this simulation
	 */
	public void setTasks(String tasks);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(Simulation simulation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Simulation> toCacheModel();

	@Override
	public Simulation toEscapedModel();

	@Override
	public Simulation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}