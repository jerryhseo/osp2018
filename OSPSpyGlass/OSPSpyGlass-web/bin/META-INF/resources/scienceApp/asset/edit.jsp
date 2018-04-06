<%@page import="com.kisti.osp.spyglass.constant.OSPScienceAppActionKeys"%>
<%@page import="java.util.Set"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.kisti.osp.spyglass.model.ScienceApp"%>
<%@page import="com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="../../init.jsp" %>

<%
	long scienceAppId = ParamUtil.getLong(request, "scienceAppId", 0);
	ScienceApp scienceApp = null;
	if( scienceAppId > 0 ){
		scienceApp = ScienceAppLocalServiceUtil.getScienceApp(scienceAppId);
	}
	String backURL = ParamUtil.getString(request, "backURL");
%>

<portlet:renderURL var="createURL">
	<portlet:param name="mvcRenderCommandName" value="/scienceApp/asset/create" />
	<portlet:param name="cmd" value="<%= OSPScienceAppActionKeys.CREATE.toString() %>" />
	<portlet:param name="backURL" value="<%= backURL %>"/>
</portlet:renderURL>
<portlet:renderURL var="updateURL">
	<portlet:param name="mvcRenderCommandName" value="/scienceApp/asset/update" />
	<portlet:param name="cmd" value="<%= OSPScienceAppActionKeys.UPDATE.toString() %>" />
	<portlet:param name="scienceAppId" value="<%= String.valueOf(scienceAppId) %>" />
	<portlet:param name="backURL" value="<%= backURL %>"/>
</portlet:renderURL>

<div><a href="<%=backURL%>">&lt&lt back</a></div>

<liferay-ui:asset-categories-error></liferay-ui:asset-categories-error>
<liferay-ui:asset-tags-error></liferay-ui:asset-tags-error>

<c:choose>
	<c:when test="<%= Validator.isNotNull(scienceApp) %>">
		<c:redirect url = "<%= updateURL.toString() %>"/>
	</c:when>
	<c:otherwise>
		<span><%= createURL.toString() %></span>
		<c:redirect url = "<%= createURL.toString() %>"/>
	</c:otherwise>
</c:choose>
