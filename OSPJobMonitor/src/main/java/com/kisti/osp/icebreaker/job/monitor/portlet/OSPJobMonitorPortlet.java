package com.kisti.osp.icebreaker.job.monitor.portlet;

import com.kisti.osp.icebreaker.job.monitor.constants.OSPJobMonitorPortletKeys;
import com.kisti.osp.icebreaker.model.OSPScheduler;
import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author osp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=OSP Icebreaker",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.add-default-resource=true",
		"javax.portlet.display-name=OSP Job Monitor",
		"javax.portlet.init-param.template-path=/html/",
		"javax.portlet.init-param.view-template=/html/view.jsp",
		"javax.portlet.name=" + OSPJobMonitorPortletKeys.OSPJobMonitor,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OSPJobMonitorPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		/*
		try {
			OSPSchedulerEntry schedulerEntry = OSPSchedulerEntryLocalServiceUtil.getOSPSchedulerEntry(32705);
			System.out.println("Scheduler Class Name: "+schedulerEntry.getSchedulerClass());
			
			OSPScheduler scheduler = OSPSchedulerEntryLocalServiceUtil.getOSPScheduler(schedulerEntry.getSchedulerEntryId());
			scheduler.submitJob();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		HttpServletRequest request = PortalUtil.getHttpServletRequest(renderRequest);
		System.out.println("Context Path: "+request.getContextPath());
		
		InputStream inStream = new java.io.BufferedInputStream(this.getClass().getClassLoader().getResourceAsStream("/content/Language.properties"));
		byte[] b = new byte[1024];
		inStream.read(b);
		System.out.println("Content: "+new String(b) );
		
		super.doView(renderRequest, renderResponse);
	}
	
}