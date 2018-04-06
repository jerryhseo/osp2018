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

import com.kisti.osp.spyglass.model.ScienceAppOutputPorts;
import com.kisti.osp.spyglass.service.base.ScienceAppOutputPortsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * The implementation of the science app output ports local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.spyglass.service.ScienceAppOutputPortsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPortsLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.ScienceAppOutputPortsLocalServiceUtil
 */
public class ScienceAppOutputPortsLocalServiceImpl
	extends ScienceAppOutputPortsLocalServiceBaseImpl {
	public ScienceAppOutputPorts addOutputPorts( long scienceAppId, String strPorts ){
		long portsId = super.counterLocalService.increment();
		ScienceAppOutputPorts ports = super.createScienceAppOutputPorts(portsId);
		ports.setOutputPorts(strPorts);
		
		return super.addScienceAppOutputPorts(ports);
	}
	
	public ScienceAppOutputPorts updateOutputPorts( long scienceAppId, String strPorts ) throws PortalException{
		ScienceAppOutputPorts ports = super.getScienceAppOutputPorts(scienceAppId);
		ports.setOutputPorts(strPorts);
		return super.updateScienceAppOutputPorts(ports);
	}
}