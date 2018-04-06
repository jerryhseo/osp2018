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
 * The extended model interface for the DataTypeAnalyzerLink service. Represents a row in the &quot;icecap_DataTypeAnalyzerLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLinkModel
 * @see OSPIcecap.model.impl.DataTypeAnalyzerLinkImpl
 * @see OSPIcecap.model.impl.DataTypeAnalyzerLinkModelImpl
 * @generated
 */
@ImplementationClassName("OSPIcecap.model.impl.DataTypeAnalyzerLinkImpl")
@ProviderType
public interface DataTypeAnalyzerLink extends DataTypeAnalyzerLinkModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link OSPIcecap.model.impl.DataTypeAnalyzerLinkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DataTypeAnalyzerLink, Long> LINK_ID_ACCESSOR = new Accessor<DataTypeAnalyzerLink, Long>() {
			@Override
			public Long get(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
				return dataTypeAnalyzerLink.getLinkId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DataTypeAnalyzerLink> getTypeClass() {
				return DataTypeAnalyzerLink.class;
			}
		};

	public static final Accessor<DataTypeAnalyzerLink, Long> ANALYZER_ID_ACCESSOR =
		new Accessor<DataTypeAnalyzerLink, Long>() {
			@Override
			public Long get(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
				return dataTypeAnalyzerLink.getAnalyzerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DataTypeAnalyzerLink> getTypeClass() {
				return DataTypeAnalyzerLink.class;
			}
		};
}