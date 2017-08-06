<!-- 
Author: Yashar Rahvar
dataTable JSP page 
This JSP is responsible to show the all employees in a table using displayTag API.
-->
<style>
.odd{
background-color: white;
}
</style>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<display:table name="employees" id="m" sort="list"
	defaultorder="descending" pagesize="10"
	decorator="rest_project.presentationUtil.TimeDecorator">
	<display:setProperty name="paging.banner.placement" value="bottom" />
	<display:column property="id" title="ID" />
	<display:column property="firstName" sortable="true" title="First Name" />
	<display:column property="lastName" title="Last Name" />
	<display:column property="dob" title="DOB" sortable="true" />
</display:table>
