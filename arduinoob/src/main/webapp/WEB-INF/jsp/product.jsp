<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
	<form:form  id="form"
				method="POST"
				action="/arduinoob/product/sendProduct"
				modelAttribute="productCartDisplayed">
	<table>
		<tr>
 			<td>
   				<form:label path="product.name">
				<spring:message code="name"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.name}</td>
		</tr>
		<tr>
 			<td>
   				<form:label path="product.microcontroller">
				<spring:message code="microcontroller"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.microcontroller}</td>
		</tr>
		<tr>
 			<td>
   				<form:label path="product.operatingvoltage">
				<spring:message code="operatingvoltage"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.operatingvoltage}V</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.inputvoltagerec">
				<spring:message code="inputvoltagerec"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.inputvoltagerec}V</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.inputvoltagemax">
				<spring:message code="inputvoltagemax"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.inputvoltagemax}V</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.nbdigitaliopin">
				<spring:message code="nbdigitaliopin"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.nbdigitaliopin}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.nbanaloginputpin">
				<spring:message code="nbanaloginputpin"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.nbanaloginputpin}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.nbpwmdigitaliopin">
				<spring:message code="nbpwmdigitaliopin"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.nbpwmdigitaliopin}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.dccurrentperiopin">
				<spring:message code="dccurrentperiopin"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.dccurrentperiopin}mA</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.flashmemory">
				<spring:message code="flashmemory"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.flashmemory}KB</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.sram">
				<spring:message code="sram"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.sram}KB</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.clockspeed">
				<spring:message code="clockspeed"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.clockspeed}MHz</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.ethernet">
				<spring:message code="ethernet"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.ethernet}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.wifi">
				<spring:message code="wifi"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.wifi}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.usboutput">
				<spring:message code="usboutput"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.usboutput}</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.lenght">
				<spring:message code="lenght"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.lenght}mm</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.width">
				<spring:message code="width"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.width}mm</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.weight">
				<spring:message code="weight"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.weight}g</td>
		</tr>	
		<tr>
 			<td>
   				<form:label path="product.priceu">
				<spring:message code="priceu"/>
				</form:label>
			</td>
			<td>${productCartDisplayed.product.priceu}€</td>
		</tr>
		<tr>
			<td>
				<form:label path="quantity">
					<spring:message code="quantity"/>
				</form:label>
			</td>
			<td>
				<form:input path="quantity" value="1" type="number" />
			</td>
		</tr>
	</table>
	<img class="pictureboard" src='<spring:url value="/images/${productCartDisplayed.namePicture}.jpg"/>'/>
	<form:hidden path="namePicture" value="${productCartDisplayed.namePicture}"/>
	<form:hidden path="discount" value="${productCartToDisplay.discount}"/>
	<form:hidden path="product.idproduct" value="${productCartDisplayed.product.idproduct}"/>
	<form:hidden path="product.name" value="${productCartDisplayed.product.name}"/>
	<form:hidden path="product.microcontroller" value="${productCartDisplayed.product.microcontroller}"/>
	<form:hidden path="product.operatingvoltage" value="${productCartDisplayed.product.operatingvoltage}"/>
	<form:hidden path="product.inputvoltagerec" value="${productCartDisplayed.product.inputvoltagerec}"/>
	<form:hidden path="product.inputvoltagemax" value="${productCartDisplayed.product.inputvoltagemax}"/>
	<form:hidden path="product.nbdigitaliopin" value="${productCartDisplayed.product.nbdigitaliopin}"/>
	<form:hidden path="product.nbanaloginputpin" value="${productCartDisplayed.product.nbanaloginputpin}"/>
	<form:hidden path="product.nbpwmdigitaliopin" value="${productCartDisplayed.product.nbpwmdigitaliopin}"/>
	<form:hidden path="product.dccurrentperiopin" value="${productCartDisplayed.product.dccurrentperiopin}"/>
	<form:hidden path="product.flashmemory" value="${productCartDisplayed.product.flashmemory}"/>
	<form:hidden path="product.sram" value="${productCartDisplayed.product.sram}"/>
	<form:hidden path="product.clockspeed" value="${productCartDisplayed.product.clockspeed}"/>
	<form:hidden path="product.ethernet" value="${productCartDisplayed.product.ethernet}"/>
	<form:hidden path="product.wifi" value="${productCartDisplayed.product.wifi}"/>
	<form:hidden path="product.usboutput" value="${productCartDisplayed.product.usboutput}"/>
	<form:hidden path="product.lenght" value="${productCartDisplayed.product.lenght}"/>
	<form:hidden path="product.width" value="${productCartDisplayed.product.width}"/>
	<form:hidden path="product.weight" value="${productCartDisplayed.product.weight}"/>
	<form:hidden path="product.priceu" value="${productCartDisplayed.product.priceu}"/>
	<form:hidden path="product.quantity" value="${productCartDisplayed.product.quantity}"/>
	<form:hidden path="product.idcateg" value="${productCartDisplayed.product.idcateg}"/>
	<form:button>
		<spring:message code="addToCart"/>
	</form:button>
	</form:form>
	</body>
	
</html>