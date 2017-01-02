<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<p>Inscription page</p>
			<form:form  id="form"
						method="POST"
						action="/arduinoob/inscription/sendInscription"
						modelAttribute="currentUser">
				<table>
					<tr>
						<td>
							<form:label path="pseudo">
								<spring:message code="pseudo"/>
							</form:label>
						</td>
						<td>
							<form:input path="pseudo"/>
							<form:errors path="pseudo"/>
							<c:if test="${not empty wrongpseudo}">${wrongpseudo}</c:if>
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
							<form:errors path="password"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="passwordCheck">
								<spring:message code="passwordCheck"/>
							</form:label>
						</td>
						<td>
							<form:password path="passwordCheck"/>
							<form:errors path="passwordCheck"/>
							<c:if test="${not empty wrongcheckpassword}">${wrongcheckpassword}</c:if>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="firstName">
								<spring:message code="firstName"/>
							</form:label>
						</td>
						<td>
							<form:input path="firstName"/>
							<form:errors path="firstName"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="lastName">
								<spring:message code="lastName"/>
							</form:label>
						</td>
						<td>
							<form:input path="lastName"/>
							<form:errors path="lastName"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="address">
								<spring:message code="address"/>
							</form:label>
						</td>
						<td>
							<form:input path="address"/>
							<form:errors path="address"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="birthdate" >
								<spring:message code="birthdate"/>
							</form:label>
						</td>
						<td>
                			
                			<form:input type="date" path="birthdate"/>
                			<form:errors path="birthdate"/>
                		</td>
                	</tr>
                	<tr>
                		<td>
                			<form:label path="sex" >
								<spring:message code="sex"/>
							</form:label>
                		</td>
                		<td>
                			<form:radiobutton path="sex" value="h"/><spring:message code="sex1"/>
							<form:radiobutton path="sex" value="f"/><spring:message code="sex2"/>
							<form:errors path="sex"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="count">
			    				<spring:message code="nationality"/>
			    			</form:label>
			    		</td>
			    		<td>
							<form:select path="count">
								<form:options items="${listcountries}" itemValue="idnationality" itemLabel="translation" />
							</form:select>
							<form:errors path="count"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="email">
								<spring:message code="email"/>
							</form:label>
						</td>
						<td>
							<form:input path="email"/>
							<form:errors path="email"/>
							<c:if test="${not empty wrongemail}">${wrongemail}</c:if>
						</td>
					</tr>
					<tr>
						<td>
							<form:label path="mobileNumber">
								<spring:message code="mobileNumber"/>
							</form:label>
						</td>
						<td>
							<form:input path="mobileNumber"/>
							<form:errors path="mobileNumber"/>
						</td>
					</tr>
					<tr>
						<td>
							<form:button>
								<spring:message code="send"/>
							</form:button>
						</td>
					</tr>
				</table>
				<c:if test="${not empty inscriptionInfo}">${inscriptionInfo}</c:if>
			</form:form>
		</div>
	</body>
</html>