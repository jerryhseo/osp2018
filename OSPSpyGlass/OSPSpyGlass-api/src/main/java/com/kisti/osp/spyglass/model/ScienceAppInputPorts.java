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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ScienceAppInputPorts service. Represents a row in the &quot;spyglass_ScienceAppInputPorts&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jerry H. Seo
 * @see ScienceAppInputPortsModel
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsImpl
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsModelImpl
 * @generated
 */
@ImplementationClassName("com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsImpl")
@ProviderType
public interface ScienceAppInputPorts extends ScienceAppInputPortsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ScienceAppInputPorts, Long> SCIENCE_APP_ID_ACCESSOR =
		new Accessor<ScienceAppInputPorts, Long>() {
			@Override
			public Long get(ScienceAppInputPorts scienceAppInputPorts) {
				return scienceAppInputPorts.getScienceAppId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ScienceAppInputPorts> getTypeClass() {
				return ScienceAppInputPorts.class;
			}
		};
}