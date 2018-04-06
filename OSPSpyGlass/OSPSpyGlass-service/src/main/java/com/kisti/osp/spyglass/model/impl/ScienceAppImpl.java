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

package com.kisti.osp.spyglass.model.impl;

import java.nio.file.Path;
import java.nio.file.Paths;

import aQute.bnd.annotation.ProviderType;

/**
 * The extended model implementation for the ScienceApp service. Represents a row in the &quot;spyglass_ScienceApp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.spyglass.model.ScienceApp} interface.
 * </p>
 *
 * @author Jerry H. Seo
 */
@ProviderType
public class ScienceAppImpl extends ScienceAppBaseImpl {
	public ScienceAppImpl() {
	}
	
	public String getAppBaseDir( String sysBaseDir ){
		return Paths.get(sysBaseDir).resolve(super.getName()).resolve(super.getVersion()).toString();
	}
	
	public String getBinDir( String sysBaseDir ){
		return Paths.get(sysBaseDir).resolve(super.getName()).resolve(super.getVersion()).resolve("bin").toString();
	}
	public String getSrcDir( String sysBaseDir ){
		return Paths.get(sysBaseDir).resolve(super.getName()).resolve(super.getVersion()).resolve("src").toString();
	}
	public String getDataDir( String sysBaseDir ){
		return Paths.get(sysBaseDir).resolve(super.getName()).resolve(super.getVersion()).resolve("data").toString();
	}
}