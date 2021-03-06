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
package com.kisti.osp.icebreaker.scheduler.manager.portlet;

import com.kisti.osp.icebreaker.scheduler.manager.constants.OSPSchedulerManagerPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderConstants;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
        "javax.portlet.name="+OSPSchedulerManagerPortletKeys.OSPSchedulerManager,
        "mvc.command.name=/html/full_content"
    },
    service = MVCRenderCommand.class
)
public class FullContentOSPSchedulerRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		_log.info("Rendering full_content.jsp");
	
		RequestDispatcher requestDispatcher =
            this.servletContext.getRequestDispatcher("/html/full_content.jsp");

        try {
            HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(renderRequest);
            HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(renderResponse);

            requestDispatcher.include(httpServletRequest, httpServletResponse);
        } catch (Exception e) {
            throw new PortletException
                ("Unable to include full_content.jsp", e);
        }

        return MVCRenderConstants.MVC_PATH_VALUE_SKIP_DISPATCH;
    }

    @Reference(target = "(osgi.web.symbolicname=com.kisti.osp.icebreaker.scheduler.manager)")
    protected ServletContext servletContext;

	private static final Log _log = LogFactoryUtil.getLog(
		FullContentOSPSchedulerRenderCommand.class);
}