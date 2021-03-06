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
package com.kisti.osp.spyglass.web.scienceapp.portlet.commands.renders;

import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.FileEntryItemSelectorReturnType;
import com.liferay.item.selector.criteria.image.criterion.ImageItemSelectorCriterion;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderConstants;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
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
        "javax.portlet.name="+OSPSpyGlassWebPortletKeys.OSPScienceApp,
        "mvc.command.name=/scienceApp/asset/edit"
    },
    service = MVCRenderCommand.class
)
public class ScienceAppEditRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		System.out.println("ScienceAppEditRenderCommand");
		
		RequestBackedPortletURLFactory requestBackedPortletURLFactory =
			    RequestBackedPortletURLFactoryUtil.create(renderRequest);

		List<ItemSelectorReturnType> desiredItemSelectorReturnTypes = new ArrayList<>();
		desiredItemSelectorReturnTypes.add(new FileEntryItemSelectorReturnType());

		ImageItemSelectorCriterion imageItemSelectorCriterion =
		    new ImageItemSelectorCriterion();

		imageItemSelectorCriterion.setDesiredItemSelectorReturnTypes(
		    desiredItemSelectorReturnTypes);

		PortletURL itemSelectorURL = _itemSelector.getItemSelectorURL(
		    requestBackedPortletURLFactory, 
		    "imageItemSelected",
		    imageItemSelectorCriterion);
		
		renderRequest.setAttribute("itemSelectorURL", itemSelectorURL.toString());
		
		return "/scienceApp/asset/edit.jsp";
	}

	@Reference(target = "(osgi.web.symbolicname=com.kisti.osp.spyglass.web)")
	protected ServletContext servletContext;

	private static final Log _log = LogFactoryUtil.getLog(ScienceAppEditRenderCommand.class);
	
	@Reference
	private ItemSelector _itemSelector;
}