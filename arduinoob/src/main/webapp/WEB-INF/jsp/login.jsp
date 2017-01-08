<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<h1><spring:message code="connexion"/></h1>
			<form:form  id="form"
						method="POST"
						action="/arduinoob/login/sendlogin"
						modelAttribute="loginForm">
						
				<c:if test="${not empty allreadyloggedin}">${allreadyloggedin}</c:if>
				<c:if test="${not empty justregistered}">${justregistered}</c:if>
				<table>
					<tr>
						<td>
							<form:label path="pseudo">
								<spring:message code="pseudo"/>
							</form:label>
						</td>
						<td>
							<form:input path="pseudo"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="password">
								<spring:message code="password"/>
							</form:label>
						</td>
						<td>
							<form:password path="password"/>
						</td>
					</tr>
					<tr>
						<td>
						<form:button><spring:message code="send"/></form:button>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
	</body>
</html>