<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<p>Login:</p>
			<form:form  id="form"
						method="POST"
						action="/childgift/login/sendlogin"
						modelAttribute="loginForm">
				<form:label path="pseudo">Login :</form:label>
				<form:input path="pseudo"/>
				<form:label path="password">Mot de passe :</form:label>
				<form:password path="password"/>
				<form:button>Send</form:button>
			</form:form>
		</div>
	</body>
</html>