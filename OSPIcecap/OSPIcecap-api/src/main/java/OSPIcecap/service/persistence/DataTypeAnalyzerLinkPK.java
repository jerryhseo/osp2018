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

package OSPIcecap.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Jerry H. Seo
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkPK implements Comparable<DataTypeAnalyzerLinkPK>,
	Serializable {
	public long linkId;
	public long analyzerId;

	public DataTypeAnalyzerLinkPK() {
	}

	public DataTypeAnalyzerLinkPK(long linkId, long analyzerId) {
		this.linkId = linkId;
		this.analyzerId = analyzerId;
	}

	public long getLinkId() {
		return linkId;
	}

	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}

	public long getAnalyzerId() {
		return analyzerId;
	}

	public void setAnalyzerId(long analyzerId) {
		this.analyzerId = analyzerId;
	}

	@Override
	public int compareTo(DataTypeAnalyzerLinkPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (linkId < pk.linkId) {
			value = -1;
		}
		else if (linkId > pk.linkId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (analyzerId < pk.analyzerId) {
			value = -1;
		}
		else if (analyzerId > pk.analyzerId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataTypeAnalyzerLinkPK)) {
			return false;
		}

		DataTypeAnalyzerLinkPK pk = (DataTypeAnalyzerLinkPK)obj;

		if ((linkId == pk.linkId) && (analyzerId == pk.analyzerId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, linkId);
		hashCode = HashUtil.hash(hashCode, analyzerId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("linkId");
		sb.append(StringPool.EQUAL);
		sb.append(linkId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("analyzerId");
		sb.append(StringPool.EQUAL);
		sb.append(analyzerId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}