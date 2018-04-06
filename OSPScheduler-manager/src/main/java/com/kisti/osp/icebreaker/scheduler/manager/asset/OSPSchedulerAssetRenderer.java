package com.kisti.osp.icebreaker.scheduler.manager.asset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.scheduler.manager.constants.OSPSchedulerManagerPortletKeys;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.asset.util.AssetUtil;

public class OSPSchedulerAssetRenderer extends BaseJSPAssetRenderer<OSPSchedulerEntry> implements TrashRenderer{
	private final OSPSchedulerEntry _schedulerEntry;
	private final ResourceBundleLoader _resourceBundleLoader;
	
	public OSPSchedulerAssetRenderer( OSPSchedulerEntry scheduler, ResourceBundleLoader bundleLoader ){
		System.out.println("OSPSchedulerAssetRenderer ---------------------");
		this._schedulerEntry = scheduler;
		this._resourceBundleLoader = bundleLoader;
	}

	@Override
	public OSPSchedulerEntry getAssetObject() {
		System.out.println("getAssetObject()");
		return this._schedulerEntry;
	}

	@Override
	public long getGroupId() {
		System.out.println("getGroupId(): "+this._schedulerEntry.getGroupId());
		return this._schedulerEntry.getGroupId();
	}

	@Override
	public long getUserId() {
		System.out.println("getUserId(): "+this._schedulerEntry.getUserId());
		return this._schedulerEntry.getUserId();
	}

	@Override
	public String getUserName() {
		System.out.println("getUserName(): "+this._schedulerEntry.getAuthorizedUser());
		return this._schedulerEntry.getAuthorizedUser();
	}

	@Override
	public String getUuid() {
		System.out.println("getUuid(): "+this._schedulerEntry.getUuid());
		return this._schedulerEntry.getUuid();
	}

	@Override
	public String getClassName() {
		System.out.println("getClassName(): "+OSPSchedulerEntry.class.getName());
		return OSPSchedulerEntry.class.getName();
	}

	@Override
	public long getClassPK() {
		System.out.println("getClassPK(): "+this._schedulerEntry.getPrimaryKey());
		return this._schedulerEntry.getPrimaryKey();
	}

	
	@Override
	public int getStatus() {
		System.out.println("getStatus(): "+this._schedulerEntry.getStatus());
		return this._schedulerEntry.getStatus();
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

	    String summary = this._schedulerEntry.getName() + " V."+this._schedulerEntry.getVersion();
	    System.out.println("getSummary(): "+summary);
	    return summary;
	}

	@Override
	public String getTitle(Locale locale) {
		System.out.println("getTitle(): "+this._schedulerEntry.getName() + " V."+this._schedulerEntry.getVersion());
		return this._schedulerEntry.getName() + " V."+this._schedulerEntry.getVersion();
	}

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
	    AssetRendererFactory<OSPSchedulerEntry> assetRendererFactory =
	        super.getAssetRendererFactory();
	    System.out.println("getPortletId(): "+assetRendererFactory.getPortletId());
	    return assetRendererFactory.getPortletId();
	}

	@Override
	public String getType() {
		AssetRendererFactory<OSPSchedulerEntry> assetRendererFactory =
		        super.getAssetRendererFactory();
		System.out.println("getType(): "+assetRendererFactory.getType());
		return assetRendererFactory.getType();
	}

	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
		System.out.println("include(): "+template);
		request.setAttribute("schedulerId", this._schedulerEntry.getPrimaryKey());
		return super.include(request, response, template);
	}

	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse) throws Exception {
		System.out.println("getURLEdit(): ");
		Group group = GroupLocalServiceUtil.fetchGroup(this._schedulerEntry.getGroupId());

		PortletURL portletURL = PortalUtil.getControlPanelPortletURL(
				liferayPortletRequest, group, OSPSchedulerManagerPortletKeys.OSPSchedulerManager, 0, 0,
				PortletRequest.RENDER_PHASE);

	    portletURL.setParameter("mvcRenderCommandName", "/html/edit_scheduler");
	    portletURL.setParameter("schedulerId", String.valueOf(this._schedulerEntry.getSchedulerEntryId()));

	    return portletURL;
	}

	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		AssetRendererFactory<OSPSchedulerEntry> assetRendererFactory =
		        getAssetRendererFactory();
		System.out.println("getURLView(): ");
	    PortletURL portletURL = assetRendererFactory.getURLView(
		        liferayPortletResponse, windowState);

	    portletURL.setParameter("mvcRenderCommandName", "/html/full_content");
	    portletURL.setParameter("schedulerId", String.valueOf(this._schedulerEntry.getSchedulerEntryId()));
	    portletURL.setWindowState(windowState);

	    return portletURL.toString();
	}

	@Override
	public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
		System.out.println("getURLViewInContext(): ");
		return super.getURLViewInContext(
		        liferayPortletRequest, noSuchEntryRedirect, "/html/full_content",
		        "schedulerId", this._schedulerEntry.getSchedulerEntryId());
	}
	

	public boolean hasDeletePermission(PermissionChecker permissionChecker) {
		System.out.println("hasDeletePermission(): ");
		return permissionChecker.hasPermission(
				this._schedulerEntry.getGroupId(), 
				OSPSchedulerEntry.class.getName(), 
				this._schedulerEntry.getPrimaryKey(), 
				ActionKeys.DELETE);
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) {
		System.out.println("hasEditPermission(): ");
		System.out.println("hasDeletePermission(): ");
		return permissionChecker.hasPermission(
				this._schedulerEntry.getGroupId(), 
				OSPSchedulerEntry.class.getName(), 
				this._schedulerEntry.getPrimaryKey(), 
				ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) {
		System.out.println("hasViewPermission(): ");
		return permissionChecker.hasPermission(
				this._schedulerEntry.getGroupId(), 
				OSPSchedulerEntry.class.getName(), 
				this._schedulerEntry.getPrimaryKey(), 
				ActionKeys.VIEW);
	}
}
