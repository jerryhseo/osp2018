package com.kisti.osp.spyglass.web.scienceappmanager.portlet;

import com.kisti.osp.spyglass.web.scienceappmanager.constants.OSPScienceAppManagerPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author osp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=OSP SpyGlass",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.add-default-resource=true",
		"javax.portlet.display-name=ScienceApp Manager",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/scienceapp-manager-view.jsp",
		"javax.portlet.name=" + OSPScienceAppManagerPortletKeys.OSPScienceAppManager,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OSPScienceAppManagerPortlet extends MVCPortlet {
}