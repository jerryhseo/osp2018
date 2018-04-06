package com.kisti.osp.spyglass.web.scienceappmanager.asset;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalService;
import com.kisti.osp.spyglass.web.scienceappmanager.constants.OSPScienceAppManagerPortletKeys;
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
	    property = {"javax.portlet.name=" + OSPScienceAppManagerPortletKeys.OSPScienceAppManager},
	    service = AssetRendererFactory.class
	)
public class OSPScienceAppAssetRendererFactory extends BaseAssetRendererFactory<ScienceApp> {
	public static final String TYPE = "ScienceApp";
	
	private ResourceBundleLoader _resourceBundleLoader;
	private ScienceAppLocalService _scienceAppLocalService;
	private ServletContext _servletContext;

	public OSPScienceAppAssetRendererFactory() {
		System.out.println("OSPScienceAppAssetRendererFactory ---------------------");
		super.setClassName(ScienceApp.class.getName());
		super.setCategorizable(true);
		super.setLinkable(true);
		super.setPortletId(OSPScienceAppManagerPortletKeys.OSPScienceAppManager);
		super.setSearchable(true);
		super.setSelectable(true);
	}
	
	@Reference(
			unbind = "-"
	)
	protected void setScienceAppLocalService(
	    ScienceAppLocalService scienceAppLocalService) {
		System.out.println("OSPScienceAppAssetRendererFactory: setScienceAppLocalService()");
		this._scienceAppLocalService = scienceAppLocalService;
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
	public AssetRenderer<ScienceApp> getAssetRenderer(long classPK, int type) throws PortalException {
		System.out.println("getAssetRenderer(): "+classPK + ", "+type);
		ScienceApp entry = this._scienceAppLocalService.getScienceApp(classPK);

	    OSPScienceAppAssetRenderer scienceAppAssetRenderer =
	        new OSPScienceAppAssetRenderer(entry, this._resourceBundleLoader);

	    scienceAppAssetRenderer.setAssetRendererType(type);
	    scienceAppAssetRenderer.setServletContext(this._servletContext);

	    return scienceAppAssetRenderer;
	}

	@Override
	public String getType() {
		System.out.println("getType(): "+TYPE);
	    return TYPE;
	}

	@Override
	public String getClassName() {
		System.out.println("getClassName(): "+ScienceApp.class.getName());
	    return ScienceApp.class.getName();
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
	        OSPScienceAppManagerPortletKeys.OSPScienceAppManager,
	        PortletRequest.RENDER_PHASE);

	    portletURL.setParameter("mvcRenderCommandName", "/html/edit_scienceApp");

	    return portletURL;
	}

	@Override
	public PortletURL getURLView(
	    LiferayPortletResponse liferayPortletResponse,
	    WindowState windowState) {
		System.out.println("getURLView(): ");

	    LiferayPortletURL liferayPortletURL =
	        liferayPortletResponse.createLiferayPortletURL(
	        		OSPScienceAppManagerPortletKeys.OSPScienceAppManager, PortletRequest.RENDER_PHASE);

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
