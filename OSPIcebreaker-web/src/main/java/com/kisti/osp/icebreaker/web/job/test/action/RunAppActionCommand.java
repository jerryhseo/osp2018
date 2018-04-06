package com.kisti.osp.icebreaker.web.job.test.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.kisti.osp.icebreaker.web.constants.OSPIcebreakerWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+OSPIcebreakerWebPortletKeys.OSPJobTest,
				"mvc.command.name=runScienceApp"
	    },
	    service = MVCActionCommand.class
)
public class RunAppActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		String appName = ParamUtil.getString(actionRequest, "appName", "hello");
		String appVersion = ParamUtil.getString(actionRequest, "appVersion", "1.0.0");
		int repeatCount = ParamUtil.getInteger(actionRequest, "repeatCount", 1);

		String appBinDir = "";
		
		System.out.println("appBinDir: "+appBinDir);
		System.out.println("Repeat Count: "+repeatCount);
	}

}
