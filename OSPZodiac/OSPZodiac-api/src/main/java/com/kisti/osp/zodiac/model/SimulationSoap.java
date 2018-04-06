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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.kisti.osp.zodiac.service.http.SimulationServiceSoap}.
 *
 * @author Jerry H. Seo
 * @see com.kisti.osp.zodiac.service.http.SimulationServiceSoap
 * @generated
 */
@ProviderType
public class SimulationSoap implements Serializable {
	public static SimulationSoap toSoapModel(Simulation model) {
		SimulationSoap soapModel = new SimulationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSimulationId(model.getSimulationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setWebContentId(model.getWebContentId());
		soapModel.setIconId(model.getIconId());
		soapModel.setSimulationStatus(model.getSimulationStatus());
		soapModel.setStatus(model.getStatus());
		soapModel.setTasks(model.getTasks());

		return soapModel;
	}

	public static SimulationSoap[] toSoapModels(Simulation[] models) {
		SimulationSoap[] soapModels = new SimulationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SimulationSoap[][] toSoapModels(Simulation[][] models) {
		SimulationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SimulationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SimulationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SimulationSoap[] toSoapModels(List<Simulation> models) {
		List<SimulationSoap> soapModels = new ArrayList<SimulationSoap>(models.size());

		for (Simulation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SimulationSoap[soapModels.size()]);
	}

	public SimulationSoap() {
	}

	public long getPrimaryKey() {
		return _simulationId;
	}

	public void setPrimaryKey(long pk) {
		setSimulationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSimulationId() {
		return _simulationId;
	}

	public void setSimulationId(long simulationId) {
		_simulationId = simulationId;
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

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public long getWebContentId() {
		return _webContentId;
	}

	public void setWebContentId(long webContentId) {
		_webContentId = webContentId;
	}

	public long getIconId() {
		return _iconId;
	}

	public void setIconId(long iconId) {
		_iconId = iconId;
	}

	public String getSimulationStatus() {
		return _simulationStatus;
	}

	public void setSimulationStatus(String simulationStatus) {
		_simulationStatus = simulationStatus;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getTasks() {
		return _tasks;
	}

	public void setTasks(String tasks) {
		_tasks = tasks;
	}

	private String _uuid;
	private long _simulationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private long _webContentId;
	private long _iconId;
	private String _simulationStatus;
	private int _status;
	private String _tasks;
}