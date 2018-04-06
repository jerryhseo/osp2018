package com.kisti.osp.icebreaker.job.search;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import com.kisti.osp.icebreaker.model.Job;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Summary;

public class OSPJobEntryIndexer extends BaseIndexer<Job> {

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doDelete(Job object) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Document doGetDocument(Job object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(Job object) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
