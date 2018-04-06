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
 * The extended model interface for the ScienceAppLayout service. Represents a row in the &quot;spyglass_ScienceAppLayout&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayoutModel
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppLayoutImpl
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppLayoutModelImpl
 * @generated
 */
@ImplementationClassName("com.kisti.osp.spyglass.model.impl.ScienceAppLayoutImpl")
@ProviderType
public interface ScienceAppLayout extends ScienceAppLayoutModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.kisti.osp.spyglass.model.impl.ScienceAppLayoutImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ScienceAppLayout, Long> SCIENCE_APP_ID_ACCESSOR =
		new Accessor<ScienceAppLayout, Long>() {
			@Override
			public Long get(ScienceAppLayout scienceAppLayout) {
				return scienceAppLayout.getScienceAppId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ScienceAppLayout> getTypeClass() {
				return ScienceAppLayout.class;
			}
		};
}