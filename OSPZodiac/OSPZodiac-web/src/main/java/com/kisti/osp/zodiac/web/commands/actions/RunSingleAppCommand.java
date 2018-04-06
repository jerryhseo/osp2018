package com.kisti.osp.zodiac.web.commands.actions;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil;
import com.kisti.osp.zodiac.web.constants.OSPZodiacWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name="+OSPZodiacWebPortletKeys.OSPZodiacWeb,
	        "mvc.command.name=runSingleApp"
	    },
	    service = MVCActionCommand.class
	)
public class RunSingleAppCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long scienceAppId = ParamUtil.getLong(actionRequest, "scienceAppId");
		String appName = "hello";
		String appVersion = "1.0.0";
		
		String inputArgs = ParamUtil.getString(actionRequest, "inputArgs");
		int ncpus = ParamUtil.getInteger(actionRequest, "ncpus", 1);
		long simulationId = ParamUtil.getLong(actionRequest, "simulationId", 0L);
		long jobId = ParamUtil.getLong(actionRequest, "jobId", 0L);
		int nodes = ParamUtil.getInteger(actionRequest, "nodes");
		int ppn = ParamUtil.getInteger(actionRequest, "ppn");
		
		String defaultWorkDir = "";
		String workingDir = ParamUtil.getString(actionRequest, "workingDir", defaultWorkDir);

		ScienceApp app = ScienceAppLocalServiceUtil.getScienceApp(scienceAppId);
		
	}

}
