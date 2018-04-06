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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.kisti.osp.spyglass.service.http.ScienceAppServiceSoap}.
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.spyglass.service.http.ScienceAppServiceSoap
 * @generated
 */
@ProviderType
public class ScienceAppSoap implements Serializable {
	public static ScienceAppSoap toSoapModel(ScienceApp model) {
		ScienceAppSoap soapModel = new ScienceAppSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setScienceAppId(model.getScienceAppId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setVersion(model.getVersion());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setPreviousVersionId(model.getPreviousVersionId());
		soapModel.setIconId(model.getIconId());
		soapModel.setManual(model.getManual());
		soapModel.setExeFileName(model.getExeFileName());
		soapModel.setAppType(model.getAppType());
		soapModel.setRunType(model.getRunType());
		soapModel.setOpenStatus(model.getOpenStatus());
		soapModel.setStatus(model.getStatus());
		soapModel.setRecentModifierId(model.getRecentModifierId());
		soapModel.setMaxCpus(model.getMaxCpus());
		soapModel.setDefaultCpus(model.getDefaultCpus());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setOpenLevel(model.getOpenLevel());
		soapModel.setLicense(model.getLicense());
		soapModel.setSrcFileName(model.getSrcFileName());

		return soapModel;
	}

	public static ScienceAppSoap[] toSoapModels(ScienceApp[] models) {
		ScienceAppSoap[] soapModels = new ScienceAppSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppSoap[][] toSoapModels(ScienceApp[][] models) {
		ScienceAppSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ScienceAppSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ScienceAppSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppSoap[] toSoapModels(List<ScienceApp> models) {
		List<ScienceAppSoap> soapModels = new ArrayList<ScienceAppSoap>(models.size());

		for (ScienceApp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ScienceAppSoap[soapModels.size()]);
	}

	public ScienceAppSoap() {
	}

	public long getPrimaryKey() {
		return _scienceAppId;
	}

	public void setPrimaryKey(long pk) {
		setScienceAppId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getScienceAppId() {
		return _scienceAppId;
	}

	public void setScienceAppId(long scienceAppId) {
		_scienceAppId = scienceAppId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getPreviousVersionId() {
		return _previousVersionId;
	}

	public void setPreviousVersionId(long previousVersionId) {
		_previousVersionId = previousVersionId;
	}

	public long getIconId() {
		return _iconId;
	}

	public void setIconId(long iconId) {
		_iconId = iconId;
	}

	public String getManual() {
		return _manual;
	}

	public void setManual(String manual) {
		_manual = manual;
	}

	public String getExeFileName() {
		return _exeFileName;
	}

	public void setExeFileName(String exeFileName) {
		_exeFileName = exeFileName;
	}

	public String getAppType() {
		return _appType;
	}

	public void setAppType(String appType) {
		_appType = appType;
	}

	public String getRunType() {
		return _runType;
	}

	public void setRunType(String runType) {
		_runType = runType;
	}

	public String getOpenStatus() {
		return _openStatus;
	}

	public void setOpenStatus(String openStatus) {
		_openStatus = openStatus;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getRecentModifierId() {
		return _recentModifierId;
	}

	public void setRecentModifierId(long recentModifierId) {
		_recentModifierId = recentModifierId;
	}

	public int getMaxCpus() {
		return _maxCpus;
	}

	public void setMaxCpus(int maxCpus) {
		_maxCpus = maxCpus;
	}

	public int getDefaultCpus() {
		return _defaultCpus;
	}

	public void setDefaultCpus(int defaultCpus) {
		_defaultCpus = defaultCpus;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public int getOpenLevel() {
		return _openLevel;
	}

	public void setOpenLevel(int openLevel) {
		_openLevel = openLevel;
	}

	public String getLicense() {
		return _license;
	}

	public void setLicense(String license) {
		_license = license;
	}

	public String getSrcFileName() {
		return _srcFileName;
	}

	public void setSrcFileName(String srcFileName) {
		_srcFileName = srcFileName;
	}

	private String _uuid;
	private long _scienceAppId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _version;
	private String _title;
	private String _description;
	private long _previousVersionId;
	private long _iconId;
	private String _manual;
	private String _exeFileName;
	private String _appType;
	private String _runType;
	private String _openStatus;
	private int _status;
	private long _recentModifierId;
	private int _maxCpus;
	private int _defaultCpus;
	private Date _statusDate;
	private int _openLevel;
	private String _license;
	private String _srcFileName;
}