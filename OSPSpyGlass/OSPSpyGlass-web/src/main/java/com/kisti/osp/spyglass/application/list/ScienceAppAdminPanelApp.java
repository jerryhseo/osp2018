package com.kisti.osp.spyglass.application.list;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;

@Component(
		immediate = true,
		property = {
				"panel.app.order:Integer=300",
				"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
		},
		service = PanelApp.class
)
public class ScienceAppAdminPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return OSPSpyGlassWebPortletKeys.OSPScienceApp;
	}

	@Override
	@Reference(
			target = "(javax.portlet.name=" + OSPSpyGlassWebPortletKeys.OSPScienceApp + ")",
			unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}
}
