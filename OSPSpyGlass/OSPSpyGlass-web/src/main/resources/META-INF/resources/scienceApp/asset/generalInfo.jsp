<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.kisti.osp.spyglass.model.ScienceApp"%>
<%@ include file="../../init.jsp" %>

<portlet:actionURL name="updateScienceApp" var="updateGeneralInfoURL">
	<portlet:param name="cmd" value="UPDATE_GENERAL_INFO"/>
	<portlet:param name="returnJSP" value="/scienceApp/asset/edit.jsp"/>
</portlet:actionURL>
<aui:form action="<%=updateGeneralInfoURL.toString() %>" name="formGeneralInfo" method="POST" cssClass="container-fluid-1280">
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset collapsed="<%= false %>" collapsible="<%= true %>" label="description">
			<aui:input name="name" required="true" showRequiredLabel="true"></aui:input>
			<aui:input name="version" required="true"></aui:input>
			<aui:input name="title" required="true" model="<%= ScienceApp.class %>"></aui:input>
		</aui:fieldset>
	</aui:fieldset-group>
	<aui:button-row>
		<aui:button cssClass="btn-lg" id="save" value="save"/>
		<aui:button cssClass="btn-lg" href="<%= backURL %>" type="cancel" />
	</aui:button-row>
</aui:form>

