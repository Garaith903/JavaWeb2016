<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
	<div id="demo">
		<h1>Tutoriel chenillard de led</h1>
		<h3>Votre premier projet avec Arduino</h3>
		<div>
			<p>Les catres arduino sont des cartes programmables
		       cela permet de faire une interface entre de la programmation et de l'électronique</p>
		    <p>Donc cela simplifie l'électronique car on ne doit plus manipuller des composants en fonction des actions que l'on veut réaliser
		       On décrit les actions que l'on veut faire avec du code, et la carte les executera</p>
		    <p>Exemple de réalisation:</p>
		    	<ul>
					<li>Commander des LED's</li>
					<li>Afficher des charactères sur un écrans LCD</li>
					<li>Faire des jeux affichables sur un écran</li>
					<li>Commander des moteurs</li>
					<li>Réaliser des manettes avec joysticks</li>
					<li>Faire des robots</li>
					<li>...</li>
				</ul>
				<p>bref la seul limite est votre imagination!</p>
		</div>
		<div>
			<p>Matériels nécessaires</p>
	    		<ul>
	    			<li>Une catre arduino</li>
					<li>Une <span title="Outil permettant de brancher les composants electroniques à un courrant sans faire de soudures">breadbord</span></li>
					<li>Fils pour bread board</li>
					<li>Des Led's</li>
					<li>Un set complet de <span title="C'est composant électronique ou électrique qui permet d'opposer résistance (mesurée en ohms) à la circulation du courant électrique et donc de diminuer le voltage entre la source et le composant.">résistances</span></li>
					<li>Un ordinateur</li>
				</ul>
		</div>
		<div>
			<p>Nous allons réaliser un petit exercice afin de vous faire entrer dans le monde merveilleux de l'Arduino</p>
			<p>Il s'agit d'un chenillard de leds</p>
			<p>Le principe est qu'il y a une chaine de 8 leds</p>
			<p>ces leds sont étteints.
			   On demande à l'Arduino d'allumer la première, puis d'allumer la seconde en étteignant la première, puis la troisième éteignat la précédente, etc</p>
		</div>
		<div>
			<p>rendez-vous sur 
				<a title="Télécharger l'IDE Arduino" href="https://www.arduino.cc/en/Main/Software">IDE Arduino</a>
				afin de télécharger et installer l'<span>IDE Arduino</span>
				Il s'agit de l'environnement de développement qui permet de rédiger le code et de le téléverser sur la carte
			</p>
			<p>Brancher la carte arduino sur votre ordinateur</p>
			<p>lancer le logiciel arduino</p>
		</div>
		<div>
			<p>Reproduisez ce shémas</p>
			<img id="schema_tp" src='<spring:url value="/images/schema_tp_1.png"/>'/>
		</div>
		<div>
			<p>Vous cliquez sur "Fichier" > "Nouveau"</p>
			<p>Une fenêtre s'ouvre avec deux choses écrites par défaut</p>
			<p>Les fonctions:</p>
				<ul>
					<li title="Executée une seule fois au tout début de l'execution du programme. Elle permet de configurer les pin's, initialisation d'autres variables ou objet utilisé dans le programme">setup</li>
					<li title="Exécuté en boucle, il s'agit du programme à proprement parler (Ce que la carte doit faire). Tout ce qui se trouve dans cette fonction sera executé sequentiellement.">loop</li>
				</ul>
				<p>Ce sont les deux fonctions obligatoires sur tout programme Arduino!</p>
		</div>
		<div>
			<p>Entrez ce code dans la fonction setup</p>
			<code>void setup()
				{
		   			<c:out value="for(int n = 2; n <= 9; n++)"/>
		   			{
		   				pinMode(n, OUTPUT);
		   			}
		 		}
		 	</code>
		 	<p>Cette boucle parcours les pins du numéro 2 aux numéro 9 (8 pins)
		 		A chaque passage de boucle, on appel la fonction "pinMode" qui prend deux arguments</p>
		 		<ul>
		 			<li>le numero du pin (ici représenté par la varriable "n")</li>
		 			<li>Une constante qi permet de dire si la carte reçoit du courent par ce pin (INPUT) ou si la carte envois du courent sur ce pin (OUTPUT)</li>
		 		</ul>
		 	<p>Entrez ce code dans la fonction loop</p>
			<code>void loop()
				{
				<c:out value="for(int n = 2; n <= 9; n++)"/>
		   			{
		   				digitalWrite(n, HIGH);
		   				delay(200);
		   				digitalWrite(n, LOW);
		   			}
		 		}
		 	</code>
		 	<p>Cette boucle parcours les pins du numéro 2 aux numéro 9 (8 pins)
		 		A chaque passage de boucle, on appel la fonction "digitalWrite" qui prend deux arguments</p>
		 		<ul>
		 			<li>le numero du pin (ici représenté par la varriable "n")</li>
		 			<li>Une constante qui permet de dire si la carte envois effectivement du courrent (HIGH) ou si la carte arrête d'envoyer du courrent (LOW)</li>
		 		</ul>
		 		<p>Ensuite on appel la fonction "delay" qui prend un entier comme argument.</p>
		 		<p>Cet entier permet de dire le temps en milliseconde que la carte doit attendre avant de continuer l'execution du programme</p>
		 		<p>Et enfin on appelle à nouveau la fonction "digitalWrite" mais cette fois ci le deuxième argument est la constant LOW</p>
		 </div>
		 <div>
		 	<p>Pour executer le programme</p>
		 	<p>Cliquez sur le logo "V"<p>
			<p>Un fois la vérification du code faite et qu'il n'y a pas eu d'erreurs, cliquez sur le symbole flèche "=>" afin de téléverser le programme sur la carte</p>
		 	<p>la carte se réinitialisera et commencera directement à executer le programme</p>
		 </div>
		 
		 <div>
		 	<p>Félicitation vous vennez de réaliser votre premier projet Arduino!</p>
		 	<p>J'espère vous avoir donné l'envie d'apprendre à manipuller ce formidable outil et que vous réaliserez de belles choses</p>
		 	<p>Voici un lien qui vous donnera accès à un cours gratuit afin d'apprendre plus en profondeur l'Arduino et sa programmation</p>
		 	<p><a title="Tuto gratuit Arduino" href="http://eskimon.fr/ebook-tutoriel-arduino">tuto eskimon</a></p>
		 </div>
	</div>
	</body>
</html>