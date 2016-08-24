<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.faces.context.FacesContext"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />

<script type="text/javascript" src="../../js/calendrier.js"></script>
<title>Chercher des Missions</title>
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
								<LEGEND align=top>Chercher une mission</LEGEND>
								<h:form id="Form1">
									<fieldset>
										<LEGEND align=top>Mission :</LEGEND>
										<table>

											<tr>
												<td><label>Titre </label></td>
												<td><h:inputText id="id1" value="#{missionBean.titre}"
														style="width: 258px; "></h:inputText></td>
											</tr>
											<tr>
												<td><label>Date Debut :</label></td>
												<td><a4j:outputPanel id="calendar1" layout="block">
														<rich:calendar value="#{missionBean.debut }"
															locale="fr/FR" popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>

											</tr>

											<tr>
												<td><label>Date Fin :</label></td>
												<td><a4j:outputPanel id="calendar2" layout="block">
														<rich:calendar value="#{missionBean.fin }" locale="fr/FR"
															popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>

											</tr>
											<tr>
												<td><label>Type de mission : </label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id2" value="#{missionBean.idType}"
															style="width: 258px;">
															<f:selectItems value="#{typemissionBean.mesTypes}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>

										</table>
									</fieldset>
									<fieldset>
										<LEGEND>Destination :</LEGEND>
										<table>
											<tr>
												<td style="width: 160px"><label>Ville : </label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id3"
															value="#{destinationBean.idville}" style="width:200px">
															<f:selectItems value="#{villeBean.mesVilles}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>
											<tr>
												<td><label>Entit� : </label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id4"
															value="#{destinationBean.identite}" style="width:200px">
															<f:selectItems value="#{entiteBean.mesEntites}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>

										</table>

									</fieldset>

									<div style="width: 550px; margin: auto; margin-top: 10px;">

										<h:commandButton styleClass="classbouton"
											action="#{missionBean.chercherMission}" value="Chercher">
										</h:commandButton>
										<h:commandButton styleClass="classbouton" value="Annuler"
											style="margin-left:200px;" action="return"></h:commandButton>
									</div>

								</h:form>
							</fieldset>

							<br /> <br />

							<h:panelGrid rendered="#{missionBean.isStarsearch}">

								<label id="t1">Resultat</label>
								<form action="ajouterMission.jsp">
									<h:commandButton style="float:right;" title="Ajouter"
										image="/img/add2.png" />
								</form>
								<h:panelGrid rendered="#{missionBean.isEmpty}">
									<h:outputText style="color:red;font-size: 20px"
										value="#{missionBean.missionVide}" />
								</h:panelGrid>
								<h:panelGrid rendered="#{!missionBean.isEmpty}">
									<h:dataTable style="width:1000px"
										value="#{missionBean.missionList}" var="mission" styleClass=""
										headerClass="" rowClasses=""
										binding="#{missionBean.missionTable}">
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="titre" />
											</f:facet>
											<h:outputText value="#{mission.titre}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Date debut" />
											</f:facet>
											<h:outputText value="#{mission.debut}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Date fin" />
											</f:facet>
											<h:outputText value="#{mission.fin}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Objet" />
											</f:facet>
											<h:outputText value="#{mission.objet}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="etat" />
											</f:facet>
											<h:outputText value="#{mission.etat}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="action" />
											</f:facet>
											<h:form id="Form2">
												<h:commandButton title="Consulter" value="Consulter"
													action="#{missionBean.consulterMission}"
													image="/img/consulter.png" />
												<h:commandButton title="Editer" value="Editer"
													action="#{missionBean.chargerMission}"
													image="/img/editer.png" />
												<h:commandButton title="Supprimer" value="Supprimer"
													action="#{missionBean.supprimerMission}"
													image="/img/delete.png"
													onclick="if (!confirm('Confirmer la suppression ?')) return false" />
											</h:form>
											<a4j:keepAlive beanName="missionBean" />
										</rich:column>
									</h:dataTable>
								</h:panelGrid>
							</h:panelGrid>


						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="idfooter2">
			<p></p>
		</div>
	</f:view>
</body>
</html>