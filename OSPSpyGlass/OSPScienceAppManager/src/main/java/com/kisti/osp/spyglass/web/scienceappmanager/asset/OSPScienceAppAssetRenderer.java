package com.kisti.osp.spyglass.web.scienceappmanager.asset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.web.scienceappmanager.constants.OSPScienceAppManagerPortletKeys;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.asset.util.AssetUtil;

public class OSPScienceAppAssetRenderer extends BaseJSPAssetRenderer<ScienceApp> implements TrashRenderer{
	private final ScienceApp _scienceApp;
	private final ResourceBundleLoader _resourceBundleLoader;
	
	public OSPScienceAppAssetRenderer( ScienceApp scienceApp, ResourceBundleLoader bundleLoader ){
		System.out.println("OSPSchedulerAssetRenderer ---------------------");
		this._scienceApp = scienceApp;
		this._resourceBundleLoader = bundleLoader;
	}

	@Override
	public ScienceApp getAssetObject() {
		System.out.println("OSPScienceAppAssetRenderer: getAssetObject()");
		return this._scienceApp;
	}

	@Override
	public long getGroupId() {
		System.out.println("getGroupId(): "+this._scienceApp.getGroupId());
		return this._scienceApp.getGroupId();
	}

	@Override
	public long getUserId() {
		System.out.println("getUserId(): "+this._scienceApp.getUserId());
		return this._scienceApp.getUserId();
	}

	@Override
	public String getUserName() {
		long userId = this._scienceApp.getUserId();
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user.getFullName();
	}

	@Override
	public String getUuid() {
		System.out.println("getUuid(): "+this._scienceApp.getUuid());
		return this._scienceApp.getUuid();
	}

	@Override
	public String getClassName() {
		System.out.println("getClassName(): "+ScienceApp.class.getName());
		return ScienceApp.class.getName();
	}

	@Override
	public long getClassPK() {
		System.out.println("getClassPK(): "+this._scienceApp.getPrimaryKey());
		return this._scienceApp.getPrimaryKey();
	}

	
	@Override
	public int getStatus() {
		System.out.println("getStatus(): "+this._scienceApp.getStatus());
		return this._scienceApp.getStatus();
	}
	
	@Override
	public String getDiscussionPath() {
		System.out.println("getDiscussionPath(): "+super.getDiscussionPath());
		return super.getDiscussionPath();
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

	    String summary = this._scienceApp.getName() + " V."+this._scienceApp.getVersion();
	    System.out.println("getSummary(): "+summary);
	    return summary;
	}

	@Override
	public String getTitle(Locale locale) {
		System.out.println("getTitle(): "+this._scienceApp.getName() + " V."+this._scienceApp.getVersion());
		return this._scienceApp.getName() + " V."+this._scienceApp.getVersion();
	}
	
	/*
	@Override
	public String getUrlTitle() {
		String title = this._scienceApp.getName() + " v."+this._scienceApp.getVersion();
		title = FriendlyURLNormalizerUtil.normalize(title);
		return ModelHintsUtil.trimString(ScienceApp.class.getName(), "urlTitle", title);
	}
	*/
	
	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		System.out.println("getJspPath(): "+template);
		if (template.equals(BaseJSPAssetRenderer.TEMPLATE_ABSTRACT) || 
			template.equals(BaseJSPAssetRenderer.TEMPLATE_FULL_CONTENT)) {
			return "/html/" + template + ".jsp";
		}
		else {
			return null;
		}
	}
	
	@Override
	public String getPortletId() {
	    AssetRendererFactory<ScienceApp> assetRendererFactory =
	        super.getAssetRendererFactory();
	    System.out.println("getPortletId(): "+assetRendererFactory.getPortletId());
	    return assetRendererFactory.getPortletId();
	}

	@Override
	public String getType() {
		AssetRendererFactory<ScienceApp> assetRendererFactory =
		        super.getAssetRendererFactory();
		System.out.println("getType(): "+assetRendererFactory.getType());
		return assetRendererFactory.getType();
	}

	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
		System.out.println("include(): "+template);
		request.setAttribute("scienceApp", this._scienceApp);
		return super.include(request, response, template);
	}

	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse) throws Exception {
		System.out.println("getURLEdit(): ");
		Group group = GroupLocalServiceUtil.fetchGroup(this._scienceApp.getGroupId());

		PortletURL portletURL = PortalUtil.getControlPanelPortletURL(
				liferayPortletRequest, group, OSPScienceAppManagerPortletKeys.OSPScienceAppManager, 0, 0,
				PortletRequest.RENDER_PHASE);

	    portletURL.setParameter("mvcRenderCommandName", "/edit_scienceapp");
	    portletURL.setParameter("scienceAppId", String.valueOf(this._scienceApp.getScienceAppId()));

	    return portletURL;
	}

	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		AssetRendererFactory<ScienceApp> assetRendererFactory =
		        getAssetRendererFactory();
		System.out.println("getURLView(): ");
	    PortletURL portletURL = assetRendererFactory.getURLView(
		        liferayPortletResponse, windowState);

	    portletURL.setParameter("mvcRenderCommandName", "/full_content");
	    portletURL.setParameter("scienceAppId", String.valueOf(this._scienceApp.getScienceAppId()));
	    portletURL.setWindowState(windowState);

	    return portletURL.toString();
	}

	@Override
	public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
		System.out.println("getURLViewInContext(): ");
		return super.getURLViewInContext(
		        liferayPortletRequest, noSuchEntryRedirect, "/full_content",
		        "scienceAppId", this._scienceApp.getScienceAppId());
	}
	

	public boolean hasDeletePermission(PermissionChecker permissionChecker) {
		System.out.println("hasDeletePermission(): ");
		return permissionChecker.hasPermission(
				this._scienceApp.getGroupId(), 
				ScienceApp.class.getName(), 
				this._scienceApp.getPrimaryKey(), 
				ActionKeys.DELETE);
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) {
		System.out.println("hasEditPermission(): ");
		System.out.println("hasDeletePermission(): ");
		return permissionChecker.hasPermission(
				this._scienceApp.getGroupId(), 
				ScienceApp.class.getName(), 
				this._scienceApp.getPrimaryKey(), 
				ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) {
		System.out.println("hasViewPermission(): ");
		return permissionChecker.hasPermission(
				this._scienceApp.getGroupId(), 
				ScienceApp.class.getName(), 
				this._scienceApp.getPrimaryKey(), 
				ActionKeys.VIEW);
	}
}
