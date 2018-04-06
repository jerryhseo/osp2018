<%@page import="java.util.Set"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.service.persistence.PortletUtil"%>
<%@page import="com.liferay.portal.kernel.security.permission.ActionKeys"%>
<%@page import="com.kisti.osp.spyglass.service.permission.ScienceAppPermission"%>
<%@page import="com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="../init.jsp" %>

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	String currentURL = themeDisplay.getURLCurrent();
	Set<Locale> availLocales = LanguageUtil.getAvailableLocales();
	boolean multiLanguage = availLocales.size() > 1;
	
%>

<portlet:renderURL var="addURL">
	<portlet:param name="mvcRenderCommandName" value="/scienceApp/asset/create" />
	<portlet:param name="backURL" value="<%=currentURL %>" />
</portlet:renderURL>
<liferay-ui:icon image="add" message="add" url="<%= addURL.toString() %>" />

<liferay-ui:search-container 
			delta="5" 
			emptyResultsMessage="Sorry. There are no record to display." 
			iteratorURL="<%=iteratorURL %>">
	<liferay-ui:search-container-results>
		<%
			results = ScienceAppLocalServiceUtil.getScienceApps(searchContainer.getStart(), searchContainer.getEnd());
			total = ScienceAppLocalServiceUtil.getScienceAppsCount();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="com.kisti.osp.spyglass.model.ScienceApp" modelVar="scienceApp" keyProperty="scienceAppId" >
	
		<portlet:renderURL var="rowURL">
			<portlet:param name="backURL" value="<%=currentURL %>" />
			<portlet:param name="scienceAppId" value="<%=String.valueOf(scienceApp.getScienceAppId()) %>" />
			<portlet:param name="mvcRenderCommandName" value="/scienceApp/full-content"/>
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text property="name" name="name" href="<%=rowURL%>"/>
		<liferay-ui:search-container-column-text property="version" name="version" />
		<liferay-ui:search-container-column-text property="" name="version" />
		<liferay-ui:search-container-column-text name="actions" >
		<liferay-ui:icon-menu>
			<c:if test="<%= ScienceAppPermission.contains(permissionChecker, scienceApp.getScienceAppId(), ActionKeys.UPDATE) %>">
				<portlet:renderURL var="editURL">
					<portlet:param name="scienceAppId"
											value="<%= String.valueOf(scienceApp.getScienceAppId()) %>" />
					<portlet:param name="mvcRenderCommandName" value="/scienceApp/asset/edit" />
					<portlet:param name="backURL" value="<%=currentURL %>" />
				</portlet:renderURL>

				<liferay-ui:icon image="edit" message="edit"  url="<%= editURL.toString() %>" />
			</c:if>
			<c:if
					test="<%=ScienceAppPermission.contains(permissionChecker, scienceApp.getScienceAppId(), ActionKeys.DELETE) %>">
					<portlet:actionURL name="deleteScienceApp" var="deleteURL">
						<portlet:param name="scienceAppId"
												value="<%= String.valueOf(scienceApp.getScienceAppId()) %>" />
					</portlet:actionURL>
					<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
			</c:if>
		</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator />
</liferay-ui:search-container>