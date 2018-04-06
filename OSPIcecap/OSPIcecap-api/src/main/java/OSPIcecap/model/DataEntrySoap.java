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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link OSPIcecap.service.http.DataEntryServiceSoap}.
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.http.DataEntryServiceSoap
 * @generated
 */
@ProviderType
public class DataEntrySoap implements Serializable {
	public static DataEntrySoap toSoapModel(DataEntry model) {
		DataEntrySoap soapModel = new DataEntrySoap();

		soapModel.setEntryId(model.getEntryId());
		soapModel.setCollectionId(model.getCollectionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setComments(model.getComments());

		return soapModel;
	}

	public static DataEntrySoap[] toSoapModels(DataEntry[] models) {
		DataEntrySoap[] soapModels = new DataEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DataEntrySoap[][] toSoapModels(DataEntry[][] models) {
		DataEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DataEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DataEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DataEntrySoap[] toSoapModels(List<DataEntry> models) {
		List<DataEntrySoap> soapModels = new ArrayList<DataEntrySoap>(models.size());

		for (DataEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DataEntrySoap[soapModels.size()]);
	}

	public DataEntrySoap() {
	}

	public long getPrimaryKey() {
		return _entryId;
	}

	public void setPrimaryKey(long pk) {
		setEntryId(pk);
	}

	public long getEntryId() {
		return _entryId;
	}

	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	public long getCollectionId() {
		return _collectionId;
	}

	public void setCollectionId(long collectionId) {
		_collectionId = collectionId;
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

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	private long _entryId;
	private long _collectionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private String _comments;
}