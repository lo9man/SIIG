<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="/pages/css/feuilleStyle.css" />
<script type="text/javascript" src="../js/js.js"></script>
<title>~MGVC club - Connexion~</title>
</head>
<body>
	<f:view>

		<div id="conexion">
			<img src="../images/imageBanner.jpg" />
		</div>
		<%%>
		<div id="idprincipal">

			<div id="idconteneur">
				<div id="idcontenuf">
					<div id="idcontenudroite1index">
						<div id="idcontenudroite2index">
							<h2>Connexion</h2>
							<div id="idrecherchecompetences1">
								<div id="idrecherchecompetences2">
									<div id="idrecherchecompetences4">
										<div id="idcontenuformulaire">
											<h:form>
												<table>
													<tr>
														<td><label>Login : </label></td>
														<td><h:inputText
																value="#{authentificationBean.login}"></h:inputText></td>
													</tr>
													<tr>
														<td><label>Mot de passe : </label></td>
														<td><h:inputSecret id="idpass"
																value="#{authentificationBean.password}"></h:inputSecret>
															<h:commandButton styleClass="classbouton"
																value="CONNEXION"
																action="#{authentificationBean.Authentifier}"></h:commandButton>
														</td>
													</tr>

												</table>
											</h:form>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

	</f:view>
</body>
</html>
