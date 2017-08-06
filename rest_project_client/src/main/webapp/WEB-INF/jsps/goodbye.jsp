<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 
Author: Yashar Rahvar
goodbye JSP page 
This JSP is responsible to show the goodbye when user logsout.
-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>GoodBye Page</TITLE>
<link id="CSSLink" rel="STYLESHEET" href="resources/css/mainstyle.css"
	type="text/css">

</HEAD>
<BODY>
	<div id="header">
		<jsp:include page="/WEB-INF/jsps/header.jsp" flush="true" />
	</div>
	<div id="nav">
		<ul>
			<li><a href="EmployeeServlet">Home</a></li>
			<li><a href="https://github.com/YasharRahvar">GitHub</a></li>
		</ul>
	</div>
	<div id="mainDoc">
		<H3>
			Thank You For Using Our Application.<br> We Hope To See You
			Again Soon.
		</H3>
		<br>
	</div>
</BODY>
</HTML>