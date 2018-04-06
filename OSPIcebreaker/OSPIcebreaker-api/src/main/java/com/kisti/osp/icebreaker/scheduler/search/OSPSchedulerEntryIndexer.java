package com.kisti.osp.icebreaker.scheduler.search;

import java.util.Date;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalService;
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
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

@Component(
		immediate = true,
		service = Indexer.class
)
public class OSPSchedulerEntryIndexer extends BaseIndexer<OSPSchedulerEntry> {
	private static final Log _log = LogFactoryUtil.getLog(OSPSchedulerEntryIndexer.class);
	private String CLASS_NAME = OSPSchedulerEntry.class.getName();
	private OSPSchedulerEntryLocalService _OSPSchedulerEntryLocalService;

	public OSPSchedulerEntryIndexer() {
		System.out.println("OSPSchedulerEntryIndexer ---------------------");
		 super.setDefaultSelectedFieldNames(
				 Field.ASSET_CATEGORY_IDS,
				 Field.ASSET_TAG_NAMES, 
				 Field.COMPANY_ID, 
				 Field.NAME,
				 Field.TITLE,
				 Field.VERSION,
				 Field.CONTENT,
				 Field.ENTRY_CLASS_NAME, 
				 Field.ENTRY_CLASS_PK, 
				 Field.GROUP_ID,
				 Field.CREATE_DATE,
				 Field.MODIFIED_DATE, 
				 Field.UID);
		 super.setFilterSearch(true);
		 super.setPermissionAware(true);
	}
	
	@Override
	public String getClassName() {
		System.out.println("getClassName(): "+this.CLASS_NAME);
		return this.CLASS_NAME;
	}

	
	@Override
	protected void doDelete(OSPSchedulerEntry object) throws Exception {
		System.out.println("doDelete(): "+object.getPrimaryKey());
		super.deleteDocument(object.getCompanyId(), object.getPrimaryKey());
	}
	
	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, String entryClassName,
			long entryClassPK, String actionId) throws Exception {
		System.out.println("hasPermission(): "+entryClassPK);
		return true;
	}
	
	@Override
	public boolean isVisible(long classPK, int status) throws Exception {
		System.out.println("isVisible(): "+classPK);
		return true;
	}
	
	@Override
	public void postProcessContextBooleanFilter(
			BooleanFilter contextBooleanFilter, SearchContext searchContext)
					throws Exception {
		System.out.println("postProcessContextBooleanFilter(): ");
		super.addStatus(contextBooleanFilter, searchContext);
	}

	@Override
	protected Document doGetDocument(OSPSchedulerEntry object) throws Exception {
		System.out.println("doGetDocument(): ");
		Document document = getBaseModelDocument(this.CLASS_NAME, object);
		
		document.addText(Field.TITLE, HtmlUtil.extractText(object.getName()+"V."+object.getVersion()));
		document.addText(Field.CONTENT, HtmlUtil.extractText(object.getName()+"V."+object.getVersion()));
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		System.out.println("doGetSummary(): ");
		Summary summary = createSummary(document);
		
		summary.setMaxContentLength(200);
		
		return null;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		System.out.println("doReindex(className): "+classPK);
		OSPSchedulerEntry entry = this._OSPSchedulerEntryLocalService.getOSPSchedulerEntry(classPK);
		
		this.doReindex(entry);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
		System.out.println("doReindex(companyId): "+companyId);
		this.reindexEntries(companyId);
	}

	@Override
	protected void doReindex(OSPSchedulerEntry object) throws Exception {
		System.out.println("doReindex(object): ");
		Document document = getDocument(object);
		document.add(new Field(Field.GROUP_ID,Long.toString(object.getGroupId())));
		document.add(new Field(Field.SCOPE_GROUP_ID,Long.toString(object.getGroupId())));
		document.add(new Field(Field.STATUS,Long.toString(object.getStatus()))); 
		IndexWriterHelperUtil.updateDocument(
				super.getSearchEngineId(), 
				object.getCompanyId(), 
				document,
				super.isCommitImmediately());
	}
	
	protected void reindexEntries(long companyId) throws PortalException {
		final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
				this._OSPSchedulerEntryLocalService.getIndexableActionableDynamicQuery();
		
		indexableActionableDynamicQuery.setAddCriteriaMethod(
				new ActionableDynamicQuery.AddCriteriaMethod() {
					@Override
					public void addCriteria(DynamicQuery dynamicQuery) {
						System.out.println("addCriteria()");
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
				new ActionableDynamicQuery.PerformActionMethod<OSPSchedulerEntry>() {
		
					@Override
					public void performAction(OSPSchedulerEntry entry) {
						System.out.println("performAction(): "+ entry.getName());
						try {
							Document document = getDocument(entry);
		
							indexableActionableDynamicQuery.addDocuments(document);
						}
						catch (PortalException pe) {
							if (_log.isWarnEnabled()) {
								_log.warn(
										"Unable to index OSPSchedulerEntry " +
												entry.getSchedulerEntryId()+1,
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
	protected void setOSPSchedulerEntryLocalService(
			OSPSchedulerEntryLocalService ospSchedulerEntryLocalService) {
		this._OSPSchedulerEntryLocalService = ospSchedulerEntryLocalService;
	}
}
