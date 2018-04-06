package com.kisti.osp.spyglass.indexer;

import java.util.Date;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalService;
import com.kisti.osp.spyglass.service.permission.ScienceAppPermission;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelperUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

@Component(
		immediate = true,
		service = Indexer.class
)
public class ScienceAppIndexer extends BaseIndexer<ScienceApp> {
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppIndexer.class);
	private String CLASS_NAME = ScienceApp.class.getName();
	private ScienceAppLocalService _ScienceAppLocalService;
	
	public ScienceAppIndexer(){
		super.setDefaultSelectedFieldNames(
				Field.COMPANY_ID, 
				Field.ENTRY_CLASS_NAME, 
				Field.ENTRY_CLASS_PK,
				Field.UID, 
				Field.SCOPE_GROUP_ID, 
				Field.GROUP_ID,
				Field.NAME,
				Field.VERSION
				);
		super.setDefaultSelectedLocalizedFieldNames(
				Field.TITLE 
				);
		
		super.setFilterSearch(true);
		super.setPermissionAware(true);
	}
	
	@Override
	public String getClassName() {
		return this.CLASS_NAME;
	}
	
	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, 
			String entryClassName,
			long entryClassPK, 
			String actionId) throws Exception {

		return ScienceAppPermission.contains(
            permissionChecker, entryClassPK, ActionKeys.VIEW);
    }

	@Override
	protected void doDelete(ScienceApp object) throws Exception {
		super.deleteDocument(object.getCompanyId(), object.getPrimaryKey());
	}

	@Override
	protected Document doGetDocument(ScienceApp object) throws Exception {
		Document document = getBaseModelDocument(this.CLASS_NAME, object);
		
		document.addText(Field.TITLE, HtmlUtil.extractText(object.getName()+"V."+object.getVersion()));
		document.addText(Field.CONTENT, HtmlUtil.extractText(object.getName()+"V."+object.getVersion()));
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		
		return summary;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		ScienceApp scienceApp = this._ScienceAppLocalService.getScienceApp(classPK);
		this.doReindex(scienceApp);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
		this.reindexEntries(companyId);
	}

	@Override
	protected void doReindex(ScienceApp scienceApp) throws Exception {
		Document document = getDocument(scienceApp);
		document.add(new Field(Field.GROUP_ID,Long.toString(scienceApp.getGroupId())));
		document.add(new Field(Field.SCOPE_GROUP_ID,Long.toString(scienceApp.getGroupId())));
		document.add(new Field(Field.STATUS,Long.toString(scienceApp.getStatus()))); 
		IndexWriterHelperUtil.updateDocument(
				super.getSearchEngineId(), 
				scienceApp.getCompanyId(), 
				document,
				super.isCommitImmediately());
	}

	protected void reindexEntries(long companyId) throws PortalException {
		final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
				this._ScienceAppLocalService.getIndexableActionableDynamicQuery();
		
		indexableActionableDynamicQuery.setAddCriteriaMethod(
				new ActionableDynamicQuery.AddCriteriaMethod() {
					@Override
					public void addCriteria(DynamicQuery dynamicQuery) {
						Property createDateProperty = PropertyFactoryUtil.forName("createDate");
		
						dynamicQuery.add(createDateProperty.lt(new Date()));
		
						Property statusProperty = PropertyFactoryUtil.forName("status");
		
						Integer[] statuses = {
								WorkflowConstants.STATUS_APPROVED,
								WorkflowConstants.STATUS_IN_TRASH
						};
		
						dynamicQuery.add(statusProperty.in(statuses));
					}
		
				}
		);
		
		indexableActionableDynamicQuery.setCompanyId(companyId);
		indexableActionableDynamicQuery.setPerformActionMethod(
				new ActionableDynamicQuery.PerformActionMethod<ScienceApp>() {
		
					@Override
					public void performAction(ScienceApp entry) {
						System.out.println("performAction(): "+ entry.getName());
						try {
							Document document = getDocument(entry);
		
							indexableActionableDynamicQuery.addDocuments(document);
						}
						catch (PortalException pe) {
							if (_log.isWarnEnabled()) {
								_log.warn(
										"Unable to index ScienceApp " +
												entry.getScienceAppId()+1,
												pe);
							}
						}
					}
		
				}
		);
		
		indexableActionableDynamicQuery.setSearchEngineId(super.getSearchEngineId());
		
		indexableActionableDynamicQuery.performActions();
	}

	@Reference(unbind = "-")
	protected void setScienceAppLocalService(
			ScienceAppLocalService scienceAppLocalService) {
		this._ScienceAppLocalService = scienceAppLocalService;
	}
}
