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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Jerry H. Seo
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowSoap implements Serializable {
	public static ScienceAppWorkflowSoap toSoapModel(ScienceAppWorkflow model) {
		ScienceAppWorkflowSoap soapModel = new ScienceAppWorkflowSoap();

		soapModel.setScienceAppId(model.getScienceAppId());
		soapModel.setDefinition(model.getDefinition());

		return soapModel;
	}

	public static ScienceAppWorkflowSoap[] toSoapModels(
		ScienceAppWorkflow[] models) {
		ScienceAppWorkflowSoap[] soapModels = new ScienceAppWorkflowSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppWorkflowSoap[][] toSoapModels(
		ScienceAppWorkflow[][] models) {
		ScienceAppWorkflowSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ScienceAppWorkflowSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ScienceAppWorkflowSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppWorkflowSoap[] toSoapModels(
		List<ScienceAppWorkflow> models) {
		List<ScienceAppWorkflowSoap> soapModels = new ArrayList<ScienceAppWorkflowSoap>(models.size());

		for (ScienceAppWorkflow model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ScienceAppWorkflowSoap[soapModels.size()]);
	}

	public ScienceAppWorkflowSoap() {
	}

	public long getPrimaryKey() {
		return _scienceAppId;
	}

	public void setPrimaryKey(long pk) {
		setScienceAppId(pk);
	}

	public long getScienceAppId() {
		return _scienceAppId;
	}

	public void setScienceAppId(long scienceAppId) {
		_scienceAppId = scienceAppId;
	}

	public String getDefinition() {
		return _definition;
	}

	public void setDefinition(String definition) {
		_definition = definition;
	}

	private long _scienceAppId;
	private String _definition;
}