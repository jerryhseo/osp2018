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

package com.kisti.osp.meridian.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.kisti.osp.meridian.service.http.LabServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.kisti.osp.meridian.service.http.LabServiceSoap
 * @generated
 */
@ProviderType
public class LabSoap implements Serializable {
	public static LabSoap toSoapModel(Lab model) {
		LabSoap soapModel = new LabSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLabId(model.getLabId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static LabSoap[] toSoapModels(Lab[] models) {
		LabSoap[] soapModels = new LabSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LabSoap[][] toSoapModels(Lab[][] models) {
		LabSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LabSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LabSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LabSoap[] toSoapModels(List<Lab> models) {
		List<LabSoap> soapModels = new ArrayList<LabSoap>(models.size());

		for (Lab model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LabSoap[soapModels.size()]);
	}

	public LabSoap() {
	}

	public long getPrimaryKey() {
		return _labId;
	}

	public void setPrimaryKey(long pk) {
		setLabId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLabId() {
		return _labId;
	}

	public void setLabId(long labId) {
		_labId = labId;
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

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	private String _uuid;
	private long _labId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}