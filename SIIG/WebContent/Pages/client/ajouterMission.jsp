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


							<rich:tabPanel switchType="client" style="width: 300px;"
								headerAlignment="right" styleClass="richtabClass" headerClass="">

								<rich:tab label="Mission" style="width: 150px; height:200px;"
									styleClass="richtabClass">
									<h:form id="f">
										<table>
											<tr bordercolor="while">
												<td><label>Intitul� mission : </label></td>
												<td><h:inputText id="id1" value="#{missionBean.titre}"
														style="width: 258px;"></h:inputText></td>
											</tr>
											<tr>
												<td><label>Date debut :</label></td>
												<td><a4j:outputPanel id="calendar1" layout="block">
														<rich:calendar value="#{missionBean.debut }"
															locale="fr/FR" popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>
											</tr>

											<tr>
												<td><label>Date fin :</label></td>
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
											<tr>
												<td><label>Objet : </label></td>
												<td><h:inputText id="id3" value="#{missionBean.objet}"
														style="width: 258px;"></h:inputText></td>
											</tr>
											<tr>
												<td><label>Detail : </label></td>
												<td><h:inputText id="id4" value="#{missionBean.detail}"
														style="height: 80px; width: 258px;"></h:inputText></td>
											</tr>
										</table>

										<div style="width: 550px; margin: auto; margin-top: 20px;">

											<h:commandButton styleClass="classbouton" value="Ajouter"
												action="#{missionBean.ajouterMission}">
											</h:commandButton>
											<h:commandButton styleClass="classbouton" value="Annuler"
												style="margin-left:200px;" action="return"></h:commandButton>
										</div>
									</h:form>
								</rich:tab>
								<rich:tab label="Destination"
									style="width: 150px; height:200px;" styleClass="richtabClass">
									<h:form>
										<table>
											<tr>
												<td style="width: 160px"><label>Ville : </label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id5"
															value="#{destinationBean.idville}" style="width:200px">
															<f:selectItems value="#{villeBean.mesVilles}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>
											<tr>
												<td><label>Entit� : </label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id6"
															value="#{destinationBean.identite}" style="width:200px">
															<f:selectItems value="#{entiteBean.mesEntites}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>
											<tr>
												<td><label>Description : </label></td>
												<td><h:inputText value="#{destinationBean.description}"></h:inputText>
											</tr>
										</table>

										<div style="width: 550px; margin: auto; margin-top: 20px;">

											<h:commandButton styleClass="classbouton" value="Ajouter"
												action="#{destinationBean.ajouterDestination}">
											</h:commandButton>
											<h:commandButton styleClass="classbouton" value="Annuler"
												style="margin-left:200px;" action="return"></h:commandButton>
										</div>
									</h:form>
								</rich:tab>
								
								<rich:tab label="Membre d'equipe"
									style="width: 150px; height:200px;" styleClass="richtabClass">
									<h:form>
										<table>
											<tr>
												<td style="width: 160px"><label>Nom et Prenom :
												</label></td>
												<td><h:panelGrid>
														<h:selectOneMenu id="id7"
															value="#{membreequipeBean.idUser}" style="width:200px">
															<f:selectItems value="#{userBean.mesUsers}" />
														</h:selectOneMenu>
													</h:panelGrid></td>
											</tr>

											<tr>
												<td><label>Fonction : </label></td>
												<td><h:inputText value="#{membreequipeBean.fonction}"></h:inputText>
											</tr>

										</table>
										<div style="width: 550px; margin: auto; margin-top: 20px;">

											<h:commandButton styleClass="classbouton" value="Ajouter"
												action="#{membreequipeBean.ajouterMembre}">
											</h:commandButton>
											<h:commandButton styleClass="classbouton" value="Annuler"
												style="margin-left:200px;" action="return"></h:commandButton>
										</div>
									</h:form>
												
										<h:panelGrid rendered="#{membreequipeBean.afficheTable}">

											<label id="t1">liste des usrs:</label>
											<h:form id="Form3">
												<h:dataTable style="width:1000px"
													binding="#{membreequipeBean.userTable}"
													value="#{membreequipeBean.userList}" var="user"
													styleClass="mission-table"
													headerClass="mission-table-header"
													rowClasses="mission-table-odd-row , mission-table-even-row">
													<rich:column width="100px">
														<f:facet name="header">
															<h:outputText value="Nom" />
														</f:facet>
														<h:outputText value="#{user.nom}" />
													</rich:column>
													<rich:column width="100px">
														<f:facet name="header">
															<h:outputText value="Prenom" />
														</f:facet>
														<h:outputText value="#{user.prenom}" />
													</rich:column>
													<%-- <rich:column width="100px">
														<f:facet name="header">
															<h:outputText value="Fonction" />
														</f:facet>
														<h:outputText value="#{user.fonction}" />
													</rich:column> --%>
													<rich:column width="100px">
														<f:facet name="header">
															<h:outputText value="Action" />
														</f:facet>
														<h:form id="Form2">
															<h:commandButton value="Suppprimer"
																action="#{membreequipeBean.supprimerMission}"
																image="/img/delete.jpg" title="Supprimer"
																onclick="if (!confirm('Confirmer la suppression ?')) return false" />

														</h:form>
													</rich:column>
												</h:dataTable>
											</h:form>
										</h:panelGrid>								

								</rich:tab>
								
							</rich:tabPanel>
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