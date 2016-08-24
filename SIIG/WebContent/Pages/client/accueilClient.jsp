<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%-- <%@page import="com.sqli.echallenge.carnetvoyage.model.Utilisateur"%>
<%
	Utilisateur user = (Utilisateur) request.getSession(false)
			.getAttribute("user");

	try {
		if (user == null) {
			response.sendRedirect(response
					.encodeRedirectURL("./connexion.jsf"));
		}

	} catch (Exception e) {
	}
%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" async="" src="../../js/ga.js"></script>
<title>Acceuil</title>
</head>
<body style="background: #D8CEF6;">
	<f:view>


		<div id="accueil">

			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>

		<div style="margin: auto; width: 1000px;">
			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div>


		<div id="idprincipal2"
			style="margin-top: -25px; padding-top: 20px; background: white;">




			<div id="idconteneur">
				<div id="idcontenu">

					<jsp:include page="menuSiteV.jsp"></jsp:include>

					<div id="idcontenudroite1">
						<div id="idcontenudroite2">

							<label style="text-align: center"><h2>Bienvenue dans
									le site du club MGVC</h2>
							</label>
							<p style="text-align: center">
								<br> <img style="width: 110px; height: 150px;"
									src="../../img/ASTURIE.jpg" alt="voyage new york"> <img
									style="width: 110px; height: 150px;"
									src="../../img/icone-argentine.jpg" alt="voyage costa rica">
								<img height="150" border="0" width="110"
									src="../../img/icone-barcelone.jpg" alt=""> <img
									height="150" border="0" width="110"
									src="../../img/ICONE-MARRAKECH.jpg" alt=""> <img
									height="150" border="0" width="110"
									src="../../img/ICONE-MEXIQUE.jpg" alt=""> <img
									height="150" border="0" width="110"
									src="../../img/voyage-costa-rica.jpg" alt=""> <img
									height="150" border="0" width="110"
									src="../../img/index-turin-milan-.jpg" alt="Colysée de Rome">
								<img
									style="border-width: 0pt; border-style: solid; height: 150px; width: 110px;"
									src="../../img/index-crete.jpg" alt=""> <img height="150"
									border="0" width="110" src="../../img/index-guadeloupe.jpg"
									alt=""> <img height="150" border="0" width="110"
									src="../../img/rome-INDEX.jpg" alt=""> &nbsp;<img
									height="150" border="0" width="110"
									src="../../img/index-lyon.jpg" alt=""> &nbsp;<img
									height="150" border="0" width="110"
									src="../../img/index-munich.jpg"
									alt="Icone du site de Chrissand pour le voyage en Asturies">


							</p>




						</div>
					</div>

				</div>
			</div>
		</div>

		<div id="idfooter2">
			<p>
				MGVC club 16, Avenue Necola, N&deg;5, Paris France <br>T&eacute;l.
				:(212)5 37 67 57 36 , Fax :(212)5 37 67 57 36 .
			</p>
		</div>

	</f:view>
</body>
</html>


