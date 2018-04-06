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

package com.kisti.osp.spyglass.service.impl;

import com.kisti.osp.spyglass.model.ScienceAppLayout;
import com.kisti.osp.spyglass.service.base.ScienceAppLayoutLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * The implementation of the science app layout local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.spyglass.service.ScienceAppLayoutLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayoutLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.ScienceAppLayoutLocalServiceUtil
 */
public class ScienceAppLayoutLocalServiceImpl
	extends ScienceAppLayoutLocalServiceBaseImpl {
	
	public ScienceAppLayout addLayout( long scienceAppId, String strLayout ){
		long layoutId = super.counterLocalService.increment();
		ScienceAppLayout layout = super.createScienceAppLayout(layoutId);
		layout.setLayout(strLayout);
		
		return super.addScienceAppLayout(layout);
	}
	
	public ScienceAppLayout updateLayout( long scienceAppId, String strLayout ) throws PortalException{
		ScienceAppLayout layout = super.getScienceAppLayout(scienceAppId);
		layout.setLayout(strLayout);
		return super.updateScienceAppLayout(layout);
	}
}