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

import OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link OSPIcecap.service.http.DataTypeAnalyzerLinkServiceSoap}.
 *
 * @author Jerry H. Seo
 * @see OSPIcecap.service.http.DataTypeAnalyzerLinkServiceSoap
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkSoap implements Serializable {
	public static DataTypeAnalyzerLinkSoap toSoapModel(
		DataTypeAnalyzerLink model) {
		DataTypeAnalyzerLinkSoap soapModel = new DataTypeAnalyzerLinkSoap();

		soapModel.setLinkId(model.getLinkId());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setAnalyzerId(model.getAnalyzerId());

		return soapModel;
	}

	public static DataTypeAnalyzerLinkSoap[] toSoapModels(
		DataTypeAnalyzerLink[] models) {
		DataTypeAnalyzerLinkSoap[] soapModels = new DataTypeAnalyzerLinkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DataTypeAnalyzerLinkSoap[][] toSoapModels(
		DataTypeAnalyzerLink[][] models) {
		DataTypeAnalyzerLinkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DataTypeAnalyzerLinkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DataTypeAnalyzerLinkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DataTypeAnalyzerLinkSoap[] toSoapModels(
		List<DataTypeAnalyzerLink> models) {
		List<DataTypeAnalyzerLinkSoap> soapModels = new ArrayList<DataTypeAnalyzerLinkSoap>(models.size());

		for (DataTypeAnalyzerLink model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DataTypeAnalyzerLinkSoap[soapModels.size()]);
	}

	public DataTypeAnalyzerLinkSoap() {
	}

	public DataTypeAnalyzerLinkPK getPrimaryKey() {
		return new DataTypeAnalyzerLinkPK(_linkId, _analyzerId);
	}

	public void setPrimaryKey(DataTypeAnalyzerLinkPK pk) {
		setLinkId(pk.linkId);
		setAnalyzerId(pk.analyzerId);
	}

	public long getLinkId() {
		return _linkId;
	}

	public void setLinkId(long linkId) {
		_linkId = linkId;
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public long getAnalyzerId() {
		return _analyzerId;
	}

	public void setAnalyzerId(long analyzerId) {
		_analyzerId = analyzerId;
	}

	private long _linkId;
	private long _typeId;
	private long _analyzerId;
}