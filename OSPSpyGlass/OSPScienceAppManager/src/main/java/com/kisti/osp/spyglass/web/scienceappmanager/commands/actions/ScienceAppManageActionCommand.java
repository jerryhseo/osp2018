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
package com.kisti.osp.spyglass.web.scienceappmanager.commands.actions;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil;
import com.kisti.osp.spyglass.web.scienceappmanager.constants.OSPScienceAppManagerPortletKeys;
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
        "javax.portlet.name="+OSPScienceAppManagerPortletKeys.OSPScienceAppManager,
        "mvc.command.name=manageScienceApp"
    },
    service = MVCActionCommand.class
)
public class ScienceAppManageActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
					ScienceApp.class.getName(), actionRequest);

		String command = ParamUtil.getString(actionRequest, "cmd");
		long scienceAppId = ParamUtil.getLong(actionRequest, "scienceAppId");
		String name = ParamUtil.getString(actionRequest, "name");
		String version = ParamUtil.getString(actionRequest, "version");
		String title = ParamUtil.getString(actionRequest, "title");
		long descriptionId = ParamUtil.getLong(actionRequest, "descriptionId");
		long iconId = ParamUtil.getLong(actionRequest, "iconId");
		long manualId = ParamUtil.getLong(actionRequest, "manualId");
		String exeFileName = ParamUtil.getString(actionRequest, "exeFileName");
		String appType = ParamUtil.getString(actionRequest, "appType");
		String runType = ParamUtil.getString(actionRequest, "runType");
		String openStatus = ParamUtil.getString(actionRequest, "openStatus");
		int status = ParamUtil.getInteger(actionRequest, "status", 0);
		int maxCpus = ParamUtil.getInteger(actionRequest, "maxCpus");
		int defaultCpus = ParamUtil.getInteger(actionRequest, "defaultCpus");
		int openLevel = ParamUtil.getInteger(actionRequest, "openLevel");
		String license = ParamUtil.getString(actionRequest, "license");
		
		System.out.println("command: "+command);
		
		long[] permissionGroupIds = {};
		
		if( command.equalsIgnoreCase("ADD")){
			try {
				ScienceApp app = ScienceAppLocalServiceUtil.addScienceApp(name, version, serviceContext);
				
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
		ScienceAppManageActionCommand.class);
}