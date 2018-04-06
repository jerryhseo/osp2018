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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the DataCollectionLayout service. Represents a row in the &quot;icecap_DataCollectionLayout&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jerry H. Seo
 * @see DataCollectionLayoutModel
 * @see OSPIcecap.model.impl.DataCollectionLayoutImpl
 * @see OSPIcecap.model.impl.DataCollectionLayoutModelImpl
 * @generated
 */
@ImplementationClassName("OSPIcecap.model.impl.DataCollectionLayoutImpl")
@ProviderType
public interface DataCollectionLayout extends DataCollectionLayoutModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link OSPIcecap.model.impl.DataCollectionLayoutImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DataCollectionLayout, Long> COLLECTION_ID_ACCESSOR =
		new Accessor<DataCollectionLayout, Long>() {
			@Override
			public Long get(DataCollectionLayout dataCollectionLayout) {
				return dataCollectionLayout.getCollectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DataCollectionLayout> getTypeClass() {
				return DataCollectionLayout.class;
			}
		};
}