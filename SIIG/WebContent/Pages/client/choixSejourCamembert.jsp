<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%-- <%@page import="com.sqli.echallenge.carnetvoyage.model.Utilisateur"%>
<%
Utilisateur user = (Utilisateur)request.getSession(false).getAttribute("user");

try
{
	if ( user == null)
	{ 	
		response.sendRedirect(response.encodeRedirectURL("./connexion.jsf")); 
	}
	
}
catch(Exception e){ } 

%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" src="../../js/js.js"></script>
<script type="text/javascript" src="../../js/calendrier.js"></script>
<title>S�jour</title>
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

								
								<fieldset>
									<LEGEND align=top>Choix de s�jour :</LEGEND>
									<h:form id="Form">
										<table>

											<tr>
												<td><label>Mes s�jours chez MGVC :</label>
												</td>
												<td>
													<h:selectOneMenu value="#{reportingController.selectedIdSejour}">
	                                                    <f:selectItems value="#{reportingController.selectItemsSejour}"/>
	                                                </h:selectOneMenu>
												</td>
													
											</tr>
										</table>
										<div style="width: 550px; margin: auto; margin-top: 10px;">

											<h:commandButton styleClass="classbouton" action="showCamembert"
												value="Camembert">
											</h:commandButton>
											<h:commandButton styleClass="classbouton" value="Annuler"
											style="margin-left:200px;" action="return"></h:commandButton>



										</div>
									</h:form>
								</fieldset>



							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="idfooter2">
				<p>
					MGVC club 16, Avenue Necola, N�5, Paris France <br>T�l.
					:(212)5 37 67 57 36 , Fax :(212)5 37 67 57 36 .
				</p>
			</div>
	</f:view>
</body>
</html>