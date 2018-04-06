package com.kisti.osp.icebreaker.web.job.monitor.portlet;

import com.kisti.osp.icebreaker.model.OSPScheduler;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil;
import com.kisti.osp.icebreaker.web.constants.OSPIcebreakerWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/JobMonitor/view.jsp",
		"javax.portlet.name=" + OSPIcebreakerWebPortletKeys.OSPJobMonitor,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OSPJobMonitorPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		//long schedulerEntryId = 32705;
		OSPScheduler scheduler = OSPSchedulerEntryLocalServiceUtil.createOSPScheduler(
					"com.kisti.osp.icebreaker.scheduler.torque.Torque", "osp", "osp2017!!", "192.168.56.102", "22");
		String appBinDir = "/osp/solvers/hello/1.0.0/bin";
		/*
		try {
			System.out.println("App Dir: "+OSP.getAppBinDir("hello", "1.0.0"));
			scheduler.createExeScript(
					appBinDir, 
					"hello",
					"SEQUENTIAL",
					"-st 10", 
					"/home/osp/workingDir", 
					"hello.log", 
					"test run", 
					"1", 
					"1", 
					"batch", 
					"1:0:0");
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		/*
		HttpServletRequest request = PortalUtil.getHttpServletRequest(renderRequest);
		System.out.println("Context Path: "+request.getContextPath());
		
		InputStream inStream = new BufferedInputStream(this.getClass().getClassLoader().getResourceAsStream("/content/Language.properties"));
		byte[] b = new byte[1024];
		inStream.read(b);
		System.out.println("Content: "+new String(b) );
		
		URL url = this.getClass().getClassLoader().getResource("/content/Language.properties");
		InputStream inStream = url.openStream();
		byte[] b = new byte[1024];
		inStream.read(b);
		System.out.println("Content: "+new String(b) );
		 */
		
		super.doView(renderRequest, renderResponse);
	}
	
}