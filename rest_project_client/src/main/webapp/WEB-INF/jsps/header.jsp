<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 
Author: Yashar Rahvar
header JSP page 
This JSP is responsible to show the header of all pages.
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/mainstyle.css"
	type="text/css">

<script type="text/javascript" src="resources/js/changeCSS.js"></script>

<title>Header JSP</title>
</head>
<body>
	<div id="justLeft">
		<a href="#" onclick="changeCSS('resources/css/mainstyle1.css', 0);">
			<img class="resizeWeather" src="resources/images/sun.png" alt="sun">
		</a> <a href="#" onclick="changeCSS('resources/css/mainstyle.css', 0);">
			<img class="resizeWeather" src="resources/images/moon.png" alt="moon">
		</a>
		<jsp:useBean id="date" class="java.util.Date" />
		<h3 align="left">
			<fmt:formatDate value="${date}" pattern="HH:mm z" />
		</h3>
	</div>
	<img class="resize" alt="YRlogo" src="./resources/images/yr-image.png" />
</body>
</html>