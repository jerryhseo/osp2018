package com.kisti.osp.spyglass.web.scienceapp.portlet;

import com.kisti.osp.constant.OSPRepositoryTypes;
import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.FileEntryItemSelectorReturnType;
import com.liferay.item.selector.criteria.URLItemSelectorReturnType;
import com.liferay.item.selector.criteria.image.criterion.ImageItemSelectorCriterion;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author osp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.scopeable=true",
		"javax.portlet.display-name=OSP ScienceApp",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.portlet-title-based-navigation=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/scienceApp/view.jsp",
		"javax.portlet.name=" + OSPSpyGlassWebPortletKeys.OSPScienceApp,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator",
		"javax.portlet.supports.mime-type=text/html",
		"com.liferay.portlet.add-default-resource=true"
	},
	service = Portlet.class
)
public class OSPScienceAppPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		String repoType = "input";
		OSPRepositoryTypes type = OSPRepositoryTypes.valueOf(repoType.toUpperCase());
		System.out.println("OSPRepositoryTypes: "+type);
		System.out.println("OSPRepositoryTypes Comparison: "+ (type == OSPRepositoryTypes.INPUT) );
		
		super.doView(renderRequest, renderResponse);
	}
}