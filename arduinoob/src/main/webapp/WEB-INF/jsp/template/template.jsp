<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="type-text/html; charset=utf-8">
		<link type="text/css" href="<spring:url value='/css/home.css' />"
			  rel="Stylesheet">
	</head>
	<body>
		<div id="banner">
			<div id="bannerLeft">
				<header> 
					<img id="logo" src='<spring:url value="/images/logo_arduinoob_1.png"/>'/>
				</header>
			</div>
			<div id="bannerRight">
				<a href="<c:url value="/cart"/>"><spring:message code="cart"/><img src='<spring:url value="/images/cart1.png"/>'/></a>
			</div>
		</div>
		<div id="nav">
			<div id="navLeft">
				<nav> 
					<a href="<c:url value="/home"/>"><spring:message code="home"/></a>
					<a href="<c:url value="/searchproduct"/>"><spring:message code="search"/></a>
					<a href="<c:url value="/demonstration"/>"><spring:message code="demo"/></a>
				</nav>
			</div>
			<div id="navRight">
				<nav> 
					<a href="<c:url value="/login"/>"><spring:message code="signin"/></a>
					<a href="<c:url value="/login/disconnect"/>"><spring:message code="disconnect"/></a>
					<a href="<c:url value="/inscription"/>"><spring:message code="inscription"/></a> 
				</nav>
			</div>
		</div>
		<div id="Accueil"> 
			<div id="mainContent">
				<tiles:insertAttribute name="main-content"/>
			</div>
		</div> 
		<div id="footer">
			<footer>
				<p>Copyright (c) Demoustier Julien, Schepmans Christophe 2016</p>
			</footer>
		</div>
	</body>
</html>