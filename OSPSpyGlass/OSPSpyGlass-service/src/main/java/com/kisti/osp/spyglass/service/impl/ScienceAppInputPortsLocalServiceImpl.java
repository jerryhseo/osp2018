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

import com.kisti.osp.spyglass.model.ScienceAppInputPorts;
import com.kisti.osp.spyglass.service.base.ScienceAppInputPortsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * The implementation of the science app input ports local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.spyglass.service.ScienceAppInputPortsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppInputPortsLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.ScienceAppInputPortsLocalServiceUtil
 */
public class ScienceAppInputPortsLocalServiceImpl
	extends ScienceAppInputPortsLocalServiceBaseImpl {
	public ScienceAppInputPorts addInputPorts( long scienceAppId, String strPorts ){
		long portsId = super.counterLocalService.increment();
		ScienceAppInputPorts ports = super.createScienceAppInputPorts(portsId);
		ports.setInputPorts(strPorts);
		
		return super.addScienceAppInputPorts(ports);
	}
	
	public ScienceAppInputPorts updateInputPorts( long scienceAppId, String strPorts ) throws PortalException{
		ScienceAppInputPorts ports = super.getScienceAppInputPorts(scienceAppId);
		ports.setInputPorts(strPorts);
		return super.updateScienceAppInputPorts(ports);
	}
}