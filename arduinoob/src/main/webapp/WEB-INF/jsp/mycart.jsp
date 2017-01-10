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
								
							<table>
								<c:forEach items="${productcartform.cart}" var="entry" varStatus="pStatus">
									<tr>
										<td>	
											<form:hidden path="cart[${entry.key}].product.idproduct" value="${entry.value.product.idproduct}"/>
											<div class=cadreboard>
											<table>
												<tr>
													<td>
														<img class="pictureboard" src='<spring:url value="/images/${entry.value.namePicture}.jpg"/>'/>
													</td>
													<td>
														<spring:message code="nameproduct"/>
													</td>
													<td>
														${entry.value.product.name}
													</td>
												</tr>
												<tr>
													<td>
														<spring:message code="priceproduct"/>
													</td>
													<td>
														<fmt:formatNumber value="${entry.value.product.priceu}"/>€
													</td>
												</tr>
												<tr>
													<td>
														<spring:message code="quantityproduct"/>
													</td>
													<td>
														<form:input path="cart[${entry.key}].quantity" value="${entry.value.quantity}"/>
													</td>
													<td>
														<form:button>
															<spring:message code="updateCartProduct"/>
														</form:button>
													</td>
												</tr>
												<tr>
													<td>
														<spring:message code="firstamount"/>
													</td>
													<td>
														<fmt:formatNumber value="${entry.value.amount}"/>€
													</td>
												</tr>
												<tr>
													<td>
														<spring:message code="discountproduct"/>
													</td>
													<td>
														<fmt:formatNumber value="${entry.value.amountWithDiscount}"/>€
													</td>
												</tr>
												<tr>
													<td>
														<spring:message code="secondamount"/>
													</td>
													<td>
														<fmt:formatNumber value="${entry.value.totalOfProduct}"/>€
													</td>
												</tr>
												<tr>
													<td>
														<a href="<c:url value="/cart/CartRemoveProduct?idproducttoremove=${entry.value.product.idproduct}"/>"><spring:message code="delete"/></a>
													</td>
												</tr>
											</table>
											</div>
										</td>
									</tr>
								</c:forEach>

									<tr>
										<td>
											<spring:message code="generalamount"/><fmt:formatNumber value="${productcartform.amountTotal}"/>€
										</td>
									</tr>
							</table>
					</form:form>
					<form:form  id="form"
								method="POST"
								action="/arduinoob/cart/ConfirmCart"
								modelAttribute="productcartform">
								<form:hidden path="userId" value="${productcartform.userId}"/>
								<c:forEach items="${productcartform.cart}" var="entry" varStatus="pStatus">
									<form:hidden path="cart[${entry.key}].quantity" value="${entry.value.quantity}"/>
									<form:hidden path="cart[${entry.key}].namePicture" value="${entry.value.namePicture}"/>
									<form:hidden path="cart[${entry.key}].discount" value="${entry.value.discount}"/>
									<form:hidden path="cart[${entry.key}].product.idproduct" value="${entry.value.product.idproduct}"/>
								</c:forEach>
								<form:button>
										<spring:message code="validatecart"/>
								</form:button>
					</form:form>
				</c:if>
			</div>
		</div>
	</body>
</html>