package com.kisti.osp.icebreaker.scheduler.manager.asset;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.scheduler.manager.constants.OSPSchedulerManagerPortletKeys;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalService;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;

@Component(
	    immediate = true,
	    property = {"javax.portlet.name=" + OSPSchedulerManagerPortletKeys.OSPSchedulerManager},
	    service = AssetRendererFactory.class
	)
public class OSPSchedulerAssetRendererFactory extends BaseAssetRendererFactory<OSPSchedulerEntry> {
	public static final String TYPE = "OSPScheduler";
	
	private ResourceBundleLoader _resourceBundleLoader;
	private OSPSchedulerEntryLocalService _ospSchedulerEntryLocalService;
	private ServletContext _servletContext;

	public OSPSchedulerAssetRendererFactory() {
		System.out.println("OSPSchedulerAssetRendererFactory ---------------------");
		super.setClassName(OSPSchedulerEntry.class.getName());
		super.setCategorizable(true);
		super.setLinkable(true);
		super.setPortletId(OSPSchedulerManagerPortletKeys.OSPSchedulerManager);
		super.setSearchable(true);
		super.setSelectable(true);
	}
	
	@Reference(
			unbind = "-"
	)
	protected void setOSPSchedulerEntryLocalService(
	    OSPSchedulerEntryLocalService ospSchedulerEntryLocalService) {
		System.out.println("setOSPSchedulerEntryLocalService()");
		this._ospSchedulerEntryLocalService = ospSchedulerEntryLocalService;
	}

	
	@Reference(
			unbind = "-"
	)
	public void setResourceBundleLoader(
	    ResourceBundleLoader resourceBundleLoader) {
		System.out.println("setResourceBundleLoader()");
	    this._resourceBundleLoader = resourceBundleLoader;
	}
	
	@Reference(
		unbind = "-"
	)
	public void setServletContext(ServletContext servletContext) {
		System.out.println("setServletContext()");
		this._servletContext = servletContext;
	}

	@Override
	public AssetRenderer<OSPSchedulerEntry> getAssetRenderer(long classPK, int type) throws PortalException {
		System.out.println("getAssetRenderer(): "+classPK + ", "+type);
		OSPSchedulerEntry entry = this._ospSchedulerEntryLocalService.getOSPSchedulerEntry(classPK);

	    OSPSchedulerAssetRenderer ospSchedulerAssetRenderer =
	        new OSPSchedulerAssetRenderer(entry, this._resourceBundleLoader);

	    ospSchedulerAssetRenderer.setAssetRendererType(type);
	    ospSchedulerAssetRenderer.setServletContext(this._servletContext);

	    return ospSchedulerAssetRenderer;
	}

	@Override
	public String getType() {
		System.out.println("getType(): "+TYPE);
	    return TYPE;
	}

	@Override
	public String getClassName() {
		System.out.println("getClassName(): "+OSPSchedulerEntry.class.getName());
	    return OSPSchedulerEntry.class.getName();
	}

	@Override
	public String getIconCssClass() {
		System.out.println("getIconCssClass(): add-cell");
	    return "add-cell";
	}
	
	
	@Override
	public PortletURL getURLAdd(
	    LiferayPortletRequest liferayPortletRequest,
	    LiferayPortletResponse liferayPortletResponse, long classTypeId) {

		System.out.println("getURLAdd(): "+classTypeId);
	    PortletURL portletURL = PortalUtil.getControlPanelPortletURL(
	        liferayPortletRequest, 
	        OSPSchedulerManagerPortletKeys.OSPSchedulerManager,
	        PortletRequest.RENDER_PHASE);

	    portletURL.setParameter("mvcRenderCommandName", "/html/edit_scheduler");

	    return portletURL;
	}

	@Override
	public PortletURL getURLView(
	    LiferayPortletResponse liferayPortletResponse,
	    WindowState windowState) {
		System.out.println("getURLView(): ");

	    LiferayPortletURL liferayPortletURL =
	        liferayPortletResponse.createLiferayPortletURL(
	        		OSPSchedulerManagerPortletKeys.OSPSchedulerManager, PortletRequest.RENDER_PHASE);

	    try {
	        liferayPortletURL.setWindowState(windowState);
	    }
	    catch (WindowStateException wse) {
	    }

	    return liferayPortletURL;
	}
	
	@Override
	public boolean hasAddPermission(
	        PermissionChecker permissionChecker, long groupId, long classTypeId)
	    throws Exception {

	    return super.hasAddPermission(permissionChecker, groupId, classTypeId);
	}
	
	
	
	@Override
	public boolean hasPermission(
	        PermissionChecker permissionChecker, long classPK, String actionId)
	    throws Exception {
		
	    return super.hasPermission(permissionChecker, classPK, actionId);
	}
}
