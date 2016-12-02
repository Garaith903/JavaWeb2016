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
						modelAttribute="loginForm">
				<form:label path="pseudo">pseudo:</form:label>
				<form:input path="pseudo"/>
				<form:label path="password">Mot de passe :</form:label>
				<form:password path="password"/>
				<form:label path="password">verification mot de passe :</form:label>
				<form:password path="password"/>
				<form:label path="firstName">Nom :</form:label>
				<form:password path="firstName"/>
				<form:label path="lastName">Prénom :</form:label>
				<form:password path="lastName"/>
				<form:label path="lastName">Adresse :</form:label>
				<form:password path="lastName"/>
				<form:label path="birthDate" >Birthday (mm/dd/yyyy):</form:label>
                <form:input path="birthDate" />
                <form:radiobutton path="sex" value="true"/>Homme
				<form:radiobutton path="sex" value="false"/>Femme
				<form:label path="nationalite">nationalite</form:label>
						<form:select path="nationalite">
							<form:options items="${nationalities}" itemValue="name" itemLabel="name"/>
						</form:select>
				<form:label path="age">Age :</form:label>
				<form:input path="age"/>
				<form:errors path="age"/>
				<form:label path="email">Email:  :</form:label>
				<form:input path="email"/>
				<form:errors path="email"/>
				<form:label path="mobileNumber">mobile :</form:label>
				<form:input path="mobileNumber"/>
				<form:errors path="mobileNumber"/>
				<form:label path="fixNumber">numéro telephone fix:</form:label>
				<form:input path="fixNumber"/>
				<form:errors path="fixNumber"/>
				<form:button>Send</form:button>
			</form:form>
		</div>
	</body>
</html>