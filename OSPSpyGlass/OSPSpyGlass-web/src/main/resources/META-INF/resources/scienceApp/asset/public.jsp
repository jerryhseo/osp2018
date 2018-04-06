<%@ include file="../init.jsp" %>

<portlet:actionURL name="updatePublicInfo" var="updatePublicInfoURL">
</portlet:actionURL>

<aui:form action="<%=updatePublicInfoURL.toString() %>" name="formPublic" method="POST">
	<aui:button name="chooseImage" value="Select a file" />
	<aui:input name="iconId" type="hidden"></aui:input>
	<aui:field-wrapper label="description" required="true">
		<liferay-ui:input-localized type="editor" xml="" name="desc"></liferay-ui:input-localized>
	</aui:field-wrapper>
	<aui:input name="iconFileName" inlineField="true" maxlength="512"></aui:input>

	<aui:fieldset collapsed="<%= true %>" collapsible="<%= true %>" label="categorization">
		<aui:input name="categories" type="assetCategories"/>
		<aui:input name="tags" type="assetTags" />
	</aui:fieldset>
</aui:form>

<aui:script use="liferay-item-selector-dialog">
AUI.$('#<portlet:namespace />chooseImage').on(
        'click', 
        function(event) {
            var itemSelectorDialog = new A.LiferayItemSelectorDialog(  
                {
                    eventName: 'imageItemSelected',
                    on: {
                            selectedItemChange: function(event) {
                                var selectedItem = event.newVal;

                                if (selectedItem) {
                                   console.log( selectedItem );
                                    var itemValue = JSON.parse(selectedItem.value);
                                    AUI.$('#<portlet:namespace/>iconId').val(itemValue.fileEntryId);
                                    AUI.$('#<portlet:namespace/>iconFileName').val(itemValue.title);
                                }
                            }
                    },
                    title: '<liferay-ui:message key="select-icon" />',
                    url: '<%= itemSelectorURL.toString() %>'
                }
            );
            itemSelectorDialog.open();
        }
);

var editor = CKEDITOR;

AUI.$('#<portlet:namespace/>save').on('click', function(){
	console.log(AUI.$('#<portlet:namespace/>descriptionEditor').val());
});
</aui:script>