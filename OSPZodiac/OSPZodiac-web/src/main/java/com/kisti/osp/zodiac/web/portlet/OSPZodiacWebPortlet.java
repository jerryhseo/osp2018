package com.kisti.osp.zodiac.web.portlet;

import com.kisti.osp.zodiac.web.constants.OSPZodiacWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author osp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=OSP Zodiac",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=portlet-ospconfig",
		"javax.portlet.display-name=OSP Zodiac Web Portlet",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.portlet-title-based-navigation=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + OSPZodiacWebPortletKeys.OSPZodiacWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OSPZodiacWebPortlet extends MVCPortlet {
}