<%@ include file="/init.jsp" %>

<portlet:actionURL name="runSingleApp" var="runSingleAppURL">
</portlet:actionURL>
<aui:form action="<%= runSingleAppURL.toString() %>" name="fm" useNamespace="true">
	<aui:button-row>
		<aui:button name="run" type="button" value="run"></aui:button>
	</aui:button-row>
</aui:form>
