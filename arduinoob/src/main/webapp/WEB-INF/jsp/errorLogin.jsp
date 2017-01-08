<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<c:if test="${not empty allreadyloggedin}">${allreadyloggedin}</c:if>
		<c:if test="${not empty errorloginorpassword}">${errorloginorpassword}</c:if>
	</body>
</html>