package com.kisti.osp.spyglass.asset;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalService;
import com.kisti.osp.spyglass.service.permission.ScienceAppPermission;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
		immediate = true, 
		property = {
				"javax.portlet.name=" + OSPSpyGlassWebPortletKeys.OSPScienceApp
				}, 
		service = AssetRendererFactory.class
)
public class ScienceAppAssetRendererFactory extends BaseAssetRendererFactory<ScienceApp> {

	private ScienceAppLocalService _scienceAppLocalService;
	private ResourceBundleLoader _resourceBundleLoader;
	private static final boolean _LINKABLE = true;
	private static final boolean _SEARCHABLE = true;
	private static final boolean _SELECTABLE = true;
	public static final String CLASS_NAME = ScienceApp.class.getName();
	public static final String TYPE = "ScienceApp";
	private ServletContext _servletContext;
	
	public ScienceAppAssetRendererFactory() {
		setClassName(CLASS_NAME);
		setLinkable(_LINKABLE);
		setPortletId(OSPSpyGlassWebPortletKeys.OSPScienceApp);
		setSearchable(_SEARCHABLE);
		setSelectable(_SELECTABLE);
	}
	
	@Override
	public AssetRenderer<ScienceApp> getAssetRenderer(long scienceAppId, int type) 
	throws PortalException {
		ScienceApp scienceApp = this._scienceAppLocalService.getScienceApp(scienceAppId);
		ScienceAppAssetRenderer scienceAppAssetRenderer = new ScienceAppAssetRenderer( scienceApp );
//				new ScienceAppAssetRenderer(scienceApp, this._resourceBundleLoader);
	
		scienceAppAssetRenderer.setAssetRendererType(type);
		scienceAppAssetRenderer.setServletContext(this._servletContext);
	
		return scienceAppAssetRenderer;
	}
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, 
			long scienceAppId, 
			String actionId) throws Exception {
		ScienceApp scienceApp = this._scienceAppLocalService.getScienceApp(scienceAppId);
		return ScienceAppPermission.contains(permissionChecker, scienceApp, actionId);
	}
	
	@Override
	public PortletURL getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState)
			throws PortalException {
		LiferayPortletURL liferayPortletURL =
		        liferayPortletResponse.createLiferayPortletURL(
		            OSPSpyGlassWebPortletKeys.OSPScienceApp, PortletRequest.RENDER_PHASE);

		try {
			liferayPortletURL.setWindowState(windowState);
		}
		catch (WindowStateException wse) {
		}

		return liferayPortletURL;
	}

	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}

	@Override
	public String getIconCssClass() {
		return "science-apps";
	}

/*	
	@Override
	public boolean hasAddPermission(
	        PermissionChecker permissionChecker, long groupId, long classTypeId) throws Exception {

		return ScienceAppPermission.contains(
				permissionChecker, groupId, ActionKeys.ADD_ENTRY);
	}
	
	
	@Override
	public PortletURL getURLAdd(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, 
			long classTypeId) {
		PortletURL portletURL = null;

//		portletURL = PortalUtil.getControlPanelPortletURL(
//		        liferayPortletRequest, 
//		        OSPSpyGlassWebPortletKeys.OSPScienceApp, 
//		        PortletRequest.RENDER_PHASE);

		ThemeDisplay themeDisplay = (ThemeDisplay) liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		portletURL = PortalUtil.getControlPanelPortletURL(
		        liferayPortletRequest, 
		        themeDisplay.getScopeGroup(),
		        OSPSpyGlassWebPortletKeys.OSPScienceApp, 0, 0, PortletRequest.RENDER_PHASE);
		
		portletURL.setParameter("mvcRenderCommandName", "/scienceApp/asset/edit");
			
		return portletURL;
	}
*/	



	@Reference(
			target ="(osgi.web.symbolicname=com.kisti.osp.spyglass.web)",
			unbind = "-")
	public void setServletContext(ServletContext servletContext) {
		this._servletContext = servletContext;
	}

	@Reference(unbind = "-")
	protected void setScienceAppLocalService(ScienceAppLocalService scienceAppLocalService) {
		this._scienceAppLocalService = scienceAppLocalService; 
	}

/*
	@Reference(
			target = "(osgi.web.symbolicname=com.kisti.osp.spyglass.web)", 
			unbind = "-"
	)
	public void setResourceBundleLoader( ResourceBundleLoader resourceBundleLoader) {
		this._resourceBundleLoader = resourceBundleLoader;
	}
*/
}
