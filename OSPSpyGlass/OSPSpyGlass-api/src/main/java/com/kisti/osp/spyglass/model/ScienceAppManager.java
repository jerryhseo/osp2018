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
 * The extended model interface for the ScienceAppManager service. Represents a row in the &quot;spyglass_ScienceAppManager&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jerry H. Seo
 * @see ScienceAppManagerModel
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppManagerImpl
 * @see com.kisti.osp.spyglass.model.impl.ScienceAppManagerModelImpl
 * @generated
 */
@ImplementationClassName("com.kisti.osp.spyglass.model.impl.ScienceAppManagerImpl")
@ProviderType
public interface ScienceAppManager extends ScienceAppManagerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.kisti.osp.spyglass.model.impl.ScienceAppManagerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ScienceAppManager, Long> SCIENCE_APP_MANAGER_ID_ACCESSOR =
		new Accessor<ScienceAppManager, Long>() {
			@Override
			public Long get(ScienceAppManager scienceAppManager) {
				return scienceAppManager.getScienceAppManagerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ScienceAppManager> getTypeClass() {
				return ScienceAppManager.class;
			}
		};
}