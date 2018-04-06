/**
 * Copyright 2018-present Jerry H. Seo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kisti.osp.icebreaker.web.scheduler.manager.portlet;

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil;
import com.kisti.osp.icebreaker.web.constants.OSPIcebreakerWebPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
        "javax.portlet.name="+OSPIcebreakerWebPortletKeys.OSPSchedulerManager,
        "mvc.command.name=addOSPScheduler"
    },
    service = MVCActionCommand.class
)
public class AddOSPSchedulerActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
					OSPSchedulerEntry.class.getName(), actionRequest);

		String command = ParamUtil.getString(actionRequest, "command");
		long schedulerId = ParamUtil.getLong(actionRequest, "schedulerId");
		String name = ParamUtil.getString(actionRequest, "name");
		String version = ParamUtil.getString(actionRequest, "version");
		String serverIp = ParamUtil.getString(actionRequest, "serverIp");
		String sshPort = ParamUtil.getString(actionRequest, "sshPort");
		String authorizedUser = ParamUtil.getString(actionRequest, "authorizedUser");
		String authorizedPassword = ParamUtil.getString(actionRequest, "authorizedPassword");
		String templateDir = ParamUtil.getString(actionRequest, "templateDir");
		String templateRealDir = actionRequest.getPortletSession().getPortletContext().getRealPath(templateDir);
		int status = ParamUtil.getInteger(actionRequest, "status", 0);
		
		System.out.println("command: "+command);
		
		long[] permissionGroupIds = {};
		
		if( command.equalsIgnoreCase("ADD")){
			try {
				OSPSchedulerEntryLocalServiceUtil.addScheduler(
						name, 
						version, 
						serverIp, 
						sshPort,
						"com.kisti.osp.icebreaker.scheduler.torque.Torque",
						"", //accessMethod
						authorizedUser, 
						authorizedPassword, 
						"", 
						templateDir, 
						templateRealDir, 
						permissionGroupIds,
						serviceContext);
				SessionMessages.add(actionRequest, "scheduler Added");
			}
			catch (Exception e) {
				SessionErrors.add(actionRequest, e.getClass().getName());
				actionResponse.setRenderParameter("mvcPath", "/SchedulerManager/view.jsp");
				e.printStackTrace();
			}
		}
		else if( command.equalsIgnoreCase("UPDATE")){
			try {
				OSPSchedulerEntryLocalServiceUtil.updateScheduler(
						schedulerId, 
						name, 
						version, 
						serverIp, 
						sshPort, 
						"com.kisti.osp.icebreaker.scheduler.torque.Torque",
						"",
						authorizedUser,
						authorizedPassword,
						"",
						templateDir, 
						templateRealDir, 
						null,
						status,
						serviceContext);
			}
			catch (Exception e) {
				SessionErrors.add(actionRequest, e.getClass().getName());
				actionResponse.setRenderParameter("mvcPath", "/SchedulerManager/view.jsp");
				e.printStackTrace();
			}
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		AddOSPSchedulerActionCommand.class);
}