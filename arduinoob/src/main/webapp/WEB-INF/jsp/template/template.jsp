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
			<header> 
				<img id="logo" src='<spring:url value="/images/logo_arduinoob_1.png"/>'/>
			</header> 
			<div id="flag">
				<spring:url var="localeFr" value="">
					<spring:param name="locale" value="fr"/>
				</spring:url>
				<spring:url var="localeEn" value="">
					<spring:param name="locale" value="en"/>
				</spring:url>
				<a href="English"><img src='<spring:url value="/images/english_1.png"/>'/></a>
				<a href="French"><img src='<spring:url value="/images/french_1.png"/>'/></a>
			</div>
		</div>
		<div id="nav">
			<div id="navLeft">
				<nav> 
					<a href="home">Accueil</a> 
					<a href="searchproduct">Catégories</a>
					<a href="demonstration">Démonstration</a>
				</nav>
			</div>
			<div id="navRight">
				<nav> 
					<a href="">Se connecter</a>
					<a href="inscription">Inscription </a> 
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
				<p>Copyright (c) Demoustier Julien, Schepmns Christophe 2016</p>
			</footer>
		</div>
	</body>
</html>