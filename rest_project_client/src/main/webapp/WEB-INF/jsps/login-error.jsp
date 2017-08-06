<!-- 
Author: Yashar Rahvar
login-error JSP page 
This JSP is responsible to show the login-error page when something goes wrong when user tries to login.
-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Welcome</TITLE>
<LINK REL=STYLESHEET HREF="resources/css/mainstyle.css" TYPE="text/css">
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
	<div id="#mainDoc">
		<CENTER>
			<h1>Unauthorized User</h1>
		</CENTER>
	</div>