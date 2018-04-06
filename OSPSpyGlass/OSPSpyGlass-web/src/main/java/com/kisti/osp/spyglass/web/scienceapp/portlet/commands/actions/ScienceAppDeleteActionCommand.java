package com.kisti.osp.spyglass.web.scienceapp.portlet.commands.actions;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+OSPSpyGlassWebPortletKeys.OSPScienceApp,
				"mvc.command.name=deleteScienceApp"
		},
		service = MVCActionCommand.class
	)
public class ScienceAppDeleteActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				ScienceApp.class.getName(), actionRequest);
		long scienceAppId = ParamUtil.getLong(actionRequest, "scienceAppId", 0);
		String name = null;
		String version = null;
		if( scienceAppId <= 0 ){
			name = ParamUtil.getString(actionRequest, "name");
			version = ParamUtil.getString(actionRequest, "version");
			ScienceAppLocalServiceUtil.removeScienceApp(name, version, serviceContext);
		}
		else{
			ScienceAppLocalServiceUtil.removeScienceApp(scienceAppId, serviceContext);
		}
	}

}
