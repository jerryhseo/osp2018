<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="../init.jsp" %>

<style>
.portlet-ospjobtest {
}
</style>

<%
	long scienceAppId = ParamUtil.getLong(request, "scienceAppId", 0L);

	String appName = "hello";
	String appVersion = "1.0.0";
%>

<portlet:actionURL var="runScienceAppURL" name="runScienceApp">
</portlet:actionURL>

<liferay-ui:panel-container>
	<liferay-ui:panel collapsible="true" title="run-a-app">
		<aui:form action="<%=runScienceAppURL.toString()%>" method="post" name="fm">
			<aui:fieldset-group markupView="lexicon">
			</aui:fieldset-group>
			<aui:fieldset collapsed="<%= true %>" collapsible="<%= true %>" >
				<aui:row>
					<aui:col span="6">
						<aui:input label="app-name" name="appName" value="<%=appName %>" disabled="true"></aui:input>
					</aui:col>
					<aui:col span="6">
						<aui:input label="app-version" name="appVersion" value="<%=appVersion %>" disabled="true"></aui:input>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col span="6">
						<aui:input label="repeat-count" name="repeatCount"  value="10"></aui:input>
					</aui:col>
				</aui:row>
			</aui:fieldset>
			<aui:button-row>
				<aui:button type="submit" value="submit"></aui:button>
			</aui:button-row>
		</aui:form>
	</liferay-ui:panel>
</liferay-ui:panel-container>