<%@ include file="../init.jsp" %>

<portlet:actionURL name="updateScienceApp" var="updateGeneralInfoURL">
	<portlet:param name="cmd" value="UPDATE_GENERAL_INFO"/>
	<portlet:param name="returnJSP" value="/scienceApp/edit_scienceApp.jsp"/>
</portlet:actionURL>
<aui:form action="<%=updateGeneralInfoURL.toString() %>" name="formGeneralInfo" method="POST">
	<aui:input name="name"></aui:input>
	<aui:input name="version"></aui:input>
	<aui:field-wrapper>
		<liferay-ui:input-localized name="title"  xml=""></liferay-ui:input-localized>
	</aui:field-wrapper>
</aui:form>
