<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<h1><spring:message code="searchpage"/></h1>
			<form:form  id="form"
						method="POST"
						action="/arduinoob/searchproduct/sendCategory"
						modelAttribute="categoryForm">
				<table>
					<tr>
						<td>
							<form:label path="labelCategory">
								<spring:message code="selectcategory"/>
							</form:label>
						</td>
						<td>
							<form:select path="labelCategory">
								<form:options items="${categories}" itemValue="translationName" itemLabel="translationName"/>
							</form:select>
						<td>
					</td>
					<tr>
						<td>
							<form:button>
								<spring:message code="send"/>
							</form:button>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
		<div class="productscadre" >
			<c:if test="${empty listProducts}"><spring:message code="emptylist"/></c:if>	
			<c:if test="${not empty listProducts}">
				<table id=tableresult>
				<c:forEach items="${listProducts}" var="listValue">
					<tr>
						<td>
							<div class=cadreboard>
							<img class="pictureboard" src='<spring:url value="/images/${listValue.namePic}.jpg"/>'/>
							
								<a href="<c:url value="/searchproduct/selectedProduct?idselectedproduct=${listValue.idProduct}"/>"><spring:message code="buy"/></a>
									<ul>
										<li>${listValue.nameProduct}</li>
										<li>${listValue.priceProd} €</li>
									</ul>
							</div>
						</td>
					</tr>
				</c:forEach>
				</table>
			</c:if>
		</div>
	</body>
</html>