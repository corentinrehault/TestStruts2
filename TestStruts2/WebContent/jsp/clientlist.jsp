<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Liste des clients</title>
<style type="text/css">@import url(css/styles.css);</style>
</head>
<body>
<!-- Message d'erreur -->
<s:if test="errors.size()>0">
<div id="message_erreur">
	<label>Les erreurs suivantes se sont produites : </label>
	<ul><s:fielderror/></ul>
</div>
</s:if>

<div id="enveloppe">									
	<h3>Ajouter un client</h3>
	<s:form method="post" action="Ajouter_Client">
		<s:textfield name="client.identifiant" id="client.identifiant" label="Identifiant" labelposition="top" cssClass="input"/>
		<s:textfield name="client.motdepasse" id="client.motdepasse" label="Mot de passe" labelposition="top" cssClass="input"/>
		<s:submit value="Ajouter un client"/>
	</s:form>
	
	<table border="0" id="tableau" cellpadding="0" cellspacing="0">
	<tr><td><b>ID</b></td><td><b>Identifiant</b></td><td><b>Mot de passe</b></td><td colspan="2" align="center"><b>Gestion</b></td></tr>
	<s:iterator value="clientList" status="ligne">
	<s:if test="#ligne.odd"><tr class="ligne1"></s:if>
	<s:if test="#ligne.even"><tr class="ligne2"></s:if>
    	<td><s:property value="num"/></td>
    	<td><s:property value="nom"/></td>
    	<td><s:property value="prenom"/></td>
    	<td align="center"><a href="Editer_Client.action?idClientEnCours=${idClient}"/><img src="images/editerclient.png" alt="Editer" title="Editer" border="0"/></a></td>
    	<td align="center"><a href="Supprimer_Client.action?idClientEnCours=${idClient}"/><img src="images/supprimerclient.png" alt="Supprimer" title="Supprimer" border="0"/></a></td>
  	</tr>
	</s:iterator>
	</table>	
</div>
</body>
</html>
<s:debug/>
