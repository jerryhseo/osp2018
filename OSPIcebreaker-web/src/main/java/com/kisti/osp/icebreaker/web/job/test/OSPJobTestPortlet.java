/**
 * Copyright 2000-present Liferay, Inc.
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
package com.kisti.osp.icebreaker.web.job.test;

import javax.portlet.Portlet;
import org.osgi.service.component.annotations.Component;

import com.kisti.osp.icebreaker.web.constants.OSPIcebreakerWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.display-category=OSP Icebreaker",
			"com.liferay.portlet.instanceable=true",
			"com.liferay.portlet.add-default-resource=true",
			"com.liferay.portlet.css-class-wrapper=portlet-ospjobtest",
			"javax.portlet.display-name=OSP Job Test",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/Test/view.jsp",
			"javax.portlet.name=" + OSPIcebreakerWebPortletKeys.OSPJobTest,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
    },
    service = Portlet.class
)
public class OSPJobTestPortlet extends MVCPortlet {

}