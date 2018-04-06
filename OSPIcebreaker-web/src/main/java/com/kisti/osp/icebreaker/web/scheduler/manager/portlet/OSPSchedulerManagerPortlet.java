package com.kisti.osp.icebreaker.web.scheduler.manager.portlet;

import java.io.IOException;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.kisti.osp.icebreaker.web.constants.OSPIcebreakerWebPortletKeys;
import com.kisti.osp.icebreaker.web.scheduler.manager.configuration.OSPSchedulerManagerPortletConfiguration;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

/**
 * @author Jerry H. Seo
 */
@Component(
		configurationPid = "com.kisti.osp.icebreaker.web.scheduler.manager.configuration.OSPSchedulerManagerConfiguration",
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=OSP Icebreaker",
			"com.liferay.portlet.instanceable=false",
			"com.liferay.portlet.add-default-resource=true",
			"javax.portlet.display-name=OSPScheduler Manager",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/SchedulerManager/view.jsp",
			"javax.portlet.init-param.config-template=/SchedulerManager/configuration.jsp",
			"javax.portlet.name=" + OSPIcebreakerWebPortletKeys.OSPSchedulerManager,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
)
public class OSPSchedulerManagerPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println("OSPSchedulerManagerPortlet: doView()");
		renderRequest.setAttribute(
				OSPSchedulerManagerPortletConfiguration.class.getName(),
                this._configuration);
		super.doView(renderRequest, renderResponse);
	}
	
	public String getBackgroundColor(Map labels){
		System.out.println("OSPSchedulerManagerPortlet: getBackgroundColor()");
		return (String) labels.get(this._configuration.backgroundColor());
	}
	
	@Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
		System.out.println("OSPSchedulerManagerPortlet: activate()");
            this._configuration = ConfigurableUtil.createConfigurable(
            		OSPSchedulerManagerPortletConfiguration.class, properties);
    }

    private volatile OSPSchedulerManagerPortletConfiguration _configuration;
}