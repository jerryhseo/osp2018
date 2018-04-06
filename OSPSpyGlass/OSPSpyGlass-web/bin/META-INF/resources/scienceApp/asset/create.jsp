<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.kisti.osp.spyglass.model.ScienceApp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="../../init.jsp" %>
<%
String backURL = ParamUtil.getString(request, "backURL");
String itemSelectorURL = GetterUtil.getString( request.getAttribute( "itemSelectorURL" ) );
%>

<h3>New ScienceApp</h3>

<%@ include file="generalInfo.jsp" %>
