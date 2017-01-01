<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<header>
			<div id="flag">
				<spring:url var="localeFr" value="">
					<spring:param name="locale" value="fr"/>
				</spring:url>
				<spring:url var="localeEn" value="">
					<spring:param name="locale" value="en"/>
				</spring:url>
				<a href="${localeEn}"><img src='<spring:url value="/images/english_1.png"/>'/></a>
				<a href="${localeFr}"><img src='<spring:url value="/images/french_1.png"/>'/></a>
			</div>
		</header>
		<div id="presentation">
			<h1>What is Arduino?</h1>
			<p>Arduino is an open-source electronics platform based on easy-to-use hardware and software.Arduino boards are able to read</p>
			<ul>
				<li>inputs light on a sensor</li>
				<li>a finger on a button</li>
				<li>A Twitter message</li>
				<li>Aictivating a motor</li>
				<li>Turning on an LED</li>
				<li>publishing something online</li>
			</ul>
			<p>Over the years Arduino has been the brain of thousands of projects, from everyday objects to complex scientific instruments.
			   A worldwide community of</p>
			<ul>
				<li>makers</li>
				<li>students,</li>
				<li>hobbyists,</li>
				<li>artists</li>
				<li>programmers,</li>
				<li>professionals</li>
			</ul>
			<p>has gathered around this open-source platform, their contributions have added up to an incredible amount of accessible knowledge that can be of great help to novices and experts alike.</p>
			<p>Arduino was born at the Ivrea Interaction Design Institute as an easy tool for fast prototyping, aimed at students without a background in electronics and programming. As soon as it reached a wider community, the Arduino board started changing to adapt to new needs and challenges, differentiating its offer from simple 8-bit boards to products for <span>IoT</span> applications, <span>wearable</span>, <span>3D printing</span>,<span>and embedded environments</span>. 
				All Arduino boards are completely open-source, empowering users to build them independently and eventually adapt them to their particular needs. The software, too, is open-source, and it is growing through the contributions of users worldwide.</p>

			<h1>Why Arduino?</h1>
			<p>Thanks to its simple and accessible user experience, Arduino has been used in thousands of different projects and applications. The Arduino software is easy-to-use for beginners, yet flexible enough for advanced users. It runs on Mac, Windows, and Linux.
				Teachers and students use it to build low cost scientific instruments, to prove chemistry and physics principles, or to get started with programming and robotics. Designers and architects build interactive prototypes, musicians and artists use it for installations and to experiment with new musical instruments. Makers, of course, use it to build many of the projects exhibited at the Maker Faire, for example.
				Arduino is a key tool to learn new things. Anyone - children, hobbyists, artists, programmers - can start tinkering just following the step by step instructions of a kit, or sharing ideas online with other members of the Arduino community.
			</p>
			<p>There are many other microcontrollers and microcontroller platforms available for physical computing. Parallax Basic Stamp, Netmedia's BX-24, Phidgets, MIT's Handyboard, and many others offer similar functionality. All of these tools take the messy details of microcontroller programming and wrap it up in an easy-to-use package. Arduino also simplifies the process of working with microcontrollers, but it offers some advantage for teachers, students, and interested amateurs over other systems:</p>
			<ul>
				<li><strong>Inexpensive</strong> - Arduino boards are relatively inexpensive compared to other microcontroller platforms.  The least expensive version of the Arduino module can be assembled by hand, and even the pre-assembled Arduino modules cost less than $50</li>
				<li><strong>Cross-platform</strong> - The Arduino Software (IDE) runs on Windows, Macintosh OSX, and Linux operating systems. Most microcontroller systems are limited to Windows.</li>
				<li><strong>Simple, clear programming environment</strong> - The Arduino Software (IDE) is easy-to-use for beginners, yet flexible enough for advanced users to take advantage of as well. For teachers, it's conveniently based on the Processing programming environment, so students learning to program in that environment will be familiar with how the Arduino IDE works.</li>
				<li><strong>Open source and extensible software</strong> - The Arduino software is published as open source tools, available for extension by experienced programmers.  The language can be expanded through C++ libraries, and people wanting to understand the technical details can make the leap from Arduino to the AVR C programming language on which it's based. Similarly, you can add AVR-C code directly into your Arduino programs if you want to.</li>
				<li><strong>Open source and extensible hardware</strong> - The plans of the Arduino boards are published under a Creative Commons license, so experienced circuit designers can make their own version of the module, extending it and improving it.  Even relatively inexperienced users can build the breadboard version of the module in order to understand how it works and save money.</li>
			</ul>
			<h1>How do I use Arduino?</h1>
			<p>See the getting started guide. If you are looking for inspiration you can find a great variety of Tutorials on Arduino Project Hub.</p>
			<p>The text of the Arduino getting started guide is licensed under a Creative Commons Attribution-ShareAlike 3.0 License.  Code samples in the guide are released into the public domain.</p>
		</div>
	</body>
</html>