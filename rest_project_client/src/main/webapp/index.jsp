<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript" src="resources/js/changeCSS.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link id="CSSLink" rel="STYLESHEET" href="resources/css/mainstyle.css"
	type="text/css">
<title>Home Page</title>
</head>
<body>
	<div class="container">
		<div id="header">

			<jsp:include page="WEB-INF/jsps/header.jsp" flush="true" />
		</div>
		<div id="nav">
			<ul>
				<li><a href="EmployeeServlet">Home</a></li>
				<li><a href="https://github.com/YasharRahvar">GitHub</a></li>
			</ul>			
		</div>
		<div id="mainDoc">
			<div id="left">
				<div class="boxed">
					<p>
						<strong>Employee List</strong>
					</p>
				</div>
				<jsp:include page="WEB-INF/jsps/tableJSPs/newDataTable.jsp" />
				<jsp:include page="WEB-INF/jsps/tableJSPs/logout.jsp" />
			</div>
			<div id="right">
				<c:if test="${pageContext.request.isUserInRole('admin')}">
					<jsp:include flush="true"
						page="WEB-INF/jsps/tableJSPs/addEmployees.jsp" />
					<jsp:include flush="true"
						page="WEB-INF/jsps/tableJSPs/deleteEmployees.jsp" />
				</c:if>
				<jsp:include flush="true"
					page="WEB-INF/jsps/tableJSPs/findEmployees.jsp" />
			</div>
		</div>

	</div>
</body>
</html>