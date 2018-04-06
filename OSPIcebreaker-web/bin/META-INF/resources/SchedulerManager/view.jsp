<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.kisti.osp.icebreaker.web.scheduler.manager.configuration.OSPSchedulerManagerPortletConfiguration"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.kisti.osp.icebreaker.permission.SchedulerPermission"%>
<%@page import="com.liferay.portal.kernel.security.permission.ActionKeys"%>
<%@page import="com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ include file="../init_config.jsp" %>

	<%
		System.out.println("noConfig: "+noConfig);
	%>
<c:choose>
    <c:when test="<%= noConfig %>">
        <p>
            Please select use the portlet configuration to select a favorite color.
        </p>
    </c:when>
    <c:otherwise>
        <p style="color: <%= backgroundColor %>">
            Background Color: <%= backgroundColor %>!
        </p>
    </c:otherwise>
</c:choose>

<portlet:renderURL var="addURL">
	<portlet:param name="mvcRenderCommandName" value="/SchedulerManager/edit_scheduler" />
	<portlet:param name="command" value="ADD" />
	<portlet:param name="backURL" value="/SchedulerManager/view.jsp" />
</portlet:renderURL>
<aui:button-row>
    <aui:button onClick="<%=addURL%>" value="add-ospscheduler"></aui:button>
</aui:button-row>

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
%>

<liferay-ui:search-container 
			delta="5" 
			emptyResultsMessage="Sorry. There are no record to display." 
			iteratorURL="<%=iteratorURL %>">
	<liferay-ui:search-container-results>
		<%
			results = OSPSchedulerEntryLocalServiceUtil.getSchedulers(searchContainer.getStart(), searchContainer.getEnd());
			total = OSPSchedulerEntryLocalServiceUtil.countSchedulers();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>>

	<liferay-ui:search-container-row className="com.kisti.osp.icebreaker.model.OSPSchedulerEntry" modelVar="scheduler" keyProperty="schedulerEntryId" >
	
		<portlet:renderURL var="rowURL">
			<portlet:param name="backURL" value="<%=currentURL %>" />
			<portlet:param name="schedulerId" value="<%=String.valueOf(scheduler.getSchedulerEntryId()) %>" />
			<portlet:param name="mvcRenderCommandName" value="/SchedulerManager/full_content"/>
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text property="name" name="Scheduler Name" href="<%=rowURL%>"/>
		<liferay-ui:search-container-column-text property="version" name="Version" />
		<liferay-ui:search-container-column-text name="Actions" >
		<liferay-ui:icon-menu>
			<c:if test="<%= SchedulerPermission.contains(permissionChecker, scheduler.getSchedulerEntryId(), ActionKeys.UPDATE) %>">
				<portlet:renderURL var="editURL">
					<portlet:param name="schedulerId"
											value="<%= String.valueOf(scheduler.getSchedulerEntryId()) %>" />
					<portlet:param name="mvcRenderCommandName" value="/SchedulerManager/edit_scheduler" />
					<portlet:param name="backURL" value="<%=currentURL %>" />
					<portlet:param name="command" value="UPDATE" />
				</portlet:renderURL>

				<liferay-ui:icon image="edit" message="Edit"  url="<%= editURL.toString() %>" />
			</c:if>
			<c:if
					test="<%=SchedulerPermission.contains(permissionChecker, scheduler.getSchedulerEntryId(), ActionKeys.DELETE) %>">
					<portlet:actionURL name="deleteOSPScheduler" var="deleteURL">
						<portlet:param name="schedulerId"
												value="<%= String.valueOf(scheduler.getSchedulerEntryId()) %>" />
					</portlet:actionURL>
					<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
			</c:if>
		</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

