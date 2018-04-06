package com.kisti.osp.spyglass.asset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kisti.osp.spyglass.constant.OSPSpyGlassWebPortletKeys;
import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.permission.ScienceAppPermission;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.asset.util.AssetUtil;

public class ScienceAppAssetRenderer extends BaseJSPAssetRenderer<ScienceApp>{
//public class ScienceAppAssetRenderer extends BaseJSPAssetRenderer<ScienceApp> implements TrashRenderer{

	private final ScienceApp _scienceApp;
//	private final ResourceBundleLoader _resourceBundleLoader;
	
//	public ScienceAppAssetRenderer ( ScienceApp scienceApp, ResourceBundleLoader resourceBundleLoader ){
	public ScienceAppAssetRenderer ( ScienceApp scienceApp ){
		this._scienceApp = scienceApp;
//		this._resourceBundleLoader = resourceBundleLoader;
	}
	
	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) throws PortalException {
		long scienceAppId = this._scienceApp.getScienceAppId();
		return ScienceAppPermission.contains(permissionChecker, scienceAppId, ActionKeys.VIEW);
	}

	@Override
	public ScienceApp getAssetObject() {
		return this._scienceApp;
	}

	@Override
	public long getGroupId() {
		return this._scienceApp.getGroupId();
	}

	@Override
	public long getUserId() {
		return this._scienceApp.getUserId();
	}

	@Override
	public String getUserName() {
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(this._scienceApp.getUserId());
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return user.getFullName();
	}

	@Override
	public String getUuid() {
		return this._scienceApp.getUuid();
	}
	
	@Override
	public String getClassName() {
		AssetRendererFactory<ScienceApp> assetRendererFactory = super.getAssetRendererFactory();
		System.out.println("assetRendererFactory.getClassName(): "+assetRendererFactory.getClassName() );
		return ScienceApp.class.getName();
//		return assetRendererFactory.getClassName();
	}

	@Override
	public long getClassPK() {
		return this._scienceApp.getPrimaryKey();
	}
	
	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		int abstractLength = AssetUtil.ASSET_ENTRY_ABSTRACT_LENGTH;

	    if (portletRequest != null) {
	        abstractLength = GetterUtil.getInteger(
	            portletRequest.getAttribute(
	                WebKeys.ASSET_ENTRY_ABSTRACT_LENGTH),
	            AssetUtil.ASSET_ENTRY_ABSTRACT_LENGTH);
	    }
	    
	    ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(WebKeys.THEME_DISPLAY);
	    Locale locale = themeDisplay.getLocale();
	    String title = this.getTitle(locale);
	    if( title.length() > abstractLength ){
	    	title = StringUtil.shorten(title, abstractLength);
	    }
	    
		return this._scienceApp.getName() + " v."+this._scienceApp.getVersion()+"\n"+title;
	}

	@Override
	public String getTitle(Locale locale) {
		return this._scienceApp.getTitle(locale);
	}
	
	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
		request.setAttribute("scienceApp", this._scienceApp);
		request.setAttribute("HtmlUtil", HtmlUtil.getHtml());
		request.setAttribute("StringUtil", new StringUtil());
		return super.include(request, response, template);
	}
	
	@Override
	public String getJspPath(HttpServletRequest request, String template) {

		if (template.equals(TEMPLATE_FULL_CONTENT) || 
				template.equals(TEMPLATE_ABSTRACT) ||
				template.equals(TEMPLATE_PREVIEW) ) {
			request.setAttribute("scienceApp", this._scienceApp);

			return "/scienceApp/asset/" + template + ".jsp";
		} else {
			return null;
		}
	}
	
	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse) throws Exception {
		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
		        getControlPanelPlid(liferayPortletRequest), OSPSpyGlassWebPortletKeys.OSPScienceApp,
		        PortletRequest.RENDER_PHASE);
		    portletURL.setParameter("mvcRenderCommandName", "/scienceApp/asset/edit");
		    portletURL.setParameter("scienceAppId", String.valueOf(this._scienceApp.getPrimaryKey()));

		    return portletURL;
	}

	@Override
	public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
		try {
			long plid = PortalUtil.getPlidFromPortletId(this._scienceApp.getGroupId(), OSPSpyGlassWebPortletKeys.OSPScienceApp);

			PortletURL portletURL;
			if (plid == LayoutConstants.DEFAULT_PLID) {
				portletURL = liferayPortletResponse.createLiferayPortletURL(
						getControlPanelPlid(liferayPortletRequest),
						OSPSpyGlassWebPortletKeys.OSPScienceApp, 
						PortletRequest.RENDER_PHASE);
			} else {
				portletURL = PortletURLFactoryUtil.create(
						liferayPortletRequest,
						OSPSpyGlassWebPortletKeys.OSPScienceApp,
						plid, 
						PortletRequest.RENDER_PHASE);
			}

			portletURL.setParameter("mvcRenderCommandName", "/scienceApp/asset/full_content");
			portletURL.setParameter("scienceAppId", String.valueOf(this._scienceApp.getScienceAppId()));

			String currentUrl = PortalUtil.getCurrentURL(liferayPortletRequest);
			portletURL.setParameter("redirect", currentUrl);
			return portletURL.toString();
		} catch (PortalException e) {
		} catch (SystemException e) {
		}

		return noSuchEntryRedirect;
	}
	
	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		AssetRendererFactory<ScienceApp> assetRendererFactory = getAssetRendererFactory();

		PortletURL portletURL = assetRendererFactory.getURLView(liferayPortletResponse, windowState);

		portletURL.setParameter("mvcRenderCommandName", "/scienceApp/asset/full_content");
		portletURL.setParameter("scienceAppId", String.valueOf(this._scienceApp.getScienceAppId()));
		portletURL.setWindowState(windowState);

		return portletURL.toString();
	}
	
	@Override
	public boolean isPrintable() {
		return true;
	}
	
	
/*
	@Override
	public String getPortletId() {
		AssetRendererFactory<ScienceApp> assetRendererFactory = super.getAssetRendererFactory();
		return assetRendererFactory.getPortletId();
	}
	
	@Override
	public String getType() {
		AssetRendererFactory<ScienceApp> assetRendererFactory = super.getAssetRendererFactory();
		System.out.println("Asset Type: "+assetRendererFactory.getType());
		return assetRendererFactory.getType();
	}
	
	@Override
	public int getStatus() {
		return this._scienceApp.getStatus();
	}
	
	@Override
	public String getDiscussionPath() {
		if (GetterUtil.getBoolean(PropsUtil.get("osp.spyglass.scienceapp.web.discussion.enable"))) {
			System.out.println("osp.spyglass.scienceapp.web.discussion.enable: "+PropsUtil.get("osp.spyglass.scienceapp.web.discussion.enable"));
			return "edit_entry_discussion";
		}
		else {
			return null;
		}
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) throws PortalException {
		long scienceAppId = this._scienceApp.getScienceAppId();
		return ScienceAppPermission.contains(permissionChecker, scienceAppId, ActionKeys.UPDATE);
	}
	
	public boolean hasDeletePermission(PermissionChecker permissionChecker) throws PortalException {
		long scienceAppId = this._scienceApp.getScienceAppId();
		return ScienceAppPermission.contains(permissionChecker, scienceAppId, ActionKeys.DELETE);
	}
*/
}
