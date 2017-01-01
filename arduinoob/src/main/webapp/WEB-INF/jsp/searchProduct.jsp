<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<p>search:</p>
			<form:form  id="form"
						method="POST"
						action="/arduinoob/searchproduct/sendCategory"
						modelAttribute="categoryForm">
						
				<form:label path="labelCategory">Selection categorie</form:label>
						<form:select path="labelCategory">
							<form:options items="${categories}" itemValue="idTranslationCategory" itemLabel="translationName"/>
						</form:select>
				<form:button>
					<spring:message code="send"/>
				</form:button>
			</form:form>
		</div>
	</body>
</html>