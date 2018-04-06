<%@page import="com.liferay.portal.kernel.util.Validator"%>
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

<div><a href="<%=backURL%>">&lt&lt back</a></div>
<c:if test="<%=Validator.isNotNull(scienceApp)%>">
	<h3><%=scienceApp.getName() + " v." + scienceApp.getVersion()%></h3>
</c:if>

<liferay-ui:tabs 
		names="general-info, execute-info, define-ports, define-layout, request-public" 
		refresh="false">
	<liferay-ui:section>
		<%@ include file="generalInfo.jsp" %>
	</liferay-ui:section>
	<liferay-ui:section>
		executeInfo
	</liferay-ui:section>
	<liferay-ui:section>
		defineInfo
	</liferay-ui:section>
	<liferay-ui:section>
		defineLayout
	</liferay-ui:section>
	<liferay-ui:section>
		requestPublic
	</liferay-ui:section>
</liferay-ui:tabs>