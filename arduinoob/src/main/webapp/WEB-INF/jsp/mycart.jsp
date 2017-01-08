<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<div>
			<h1><spring:message code="cart"/></h1>
			
			<div class="productscadre" >
				<c:if test="${empty productcartform or empty productcartform.cart}"><spring:message code="emptycart"/></c:if>
				<c:if test="${not empty productcartform}">
				
					<form:form  id="form"
								method="POST"
								action="/arduinoob/cart/updatequatity"
								modelAttribute="productcartform">
						<table id=tableresult>
						<c:forEach items="${productcartform.cart}" var="entry" varStatus="pStatus">
							<tr>
							<td>
								<img class="pictureboard" src='<spring:url value="/images/${entry.value.namePicture}.jpg"/>'/>
							</td>
							</tr>
								<tr>
									<td>
										<p>Nom: </p>
									</td>
									<td>
										<p>${entry.value.product.name}</p>
									</td>
								</tr>
								<tr>
									<td>
										<p>prix: </p>
									</td>
									<td>
										<p><fmt:formatNumber value="${entry.value.product.priceu}" type="currency"/></p>
									</td>
								</tr>
								<tr>
									<td>
										<p>Quantité: </p>
									</td>
									<td>
										<p><form:input path="cart[${entry.key}].quantity" value="${entry.value.quantity}"/></p>
									</td>
								</tr>
								
								<tr>
									<td>
										<p>Sous total: </p>
									</td>
									<td>
										<p><fmt:formatNumber value="${entry.value.amount}" type="currency"/></p>
									</td>
								</tr>
								
								<tr>
									<td>
										<a href="<c:url value="/cart/CartRemoveProduct?idproducttoremove=${entry.value.product.idproduct}"/>">Delete</a>
									</td>
									<td>
										<form:button>
											<spring:message code="updateCartProduct"/>
										</form:button>
									</td>
								</tr>
							</c:forEach>
							
							<tr>
									<td>
										<p>total: </p>
									</td>
									<td>
										<p><fmt:formatNumber value="${productcartform.amountTotal}" type="currency"/></p>
									</td>
								</tr>
							
							<tr>
								<td>
									<a href="<c:url value="/cart"/>"><spring:message code="cart"/><img src='<spring:url value="/images/validatecart.png"/>'/></a>
								</td>
							</tr>
						</table>		
					</form:form>	
				</c:if>
			</div>
		</div>
	</body>
</html>