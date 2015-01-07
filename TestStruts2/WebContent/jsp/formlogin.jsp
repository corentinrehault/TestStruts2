<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<s:head />
<meta charset="UTF-8">
<title>formlogin</title>
</head>
<body>

	<!-- Message d'erreur -->
	<s:if test="errors.size()>0">
		<div id="message_erreur">
			<label>Les erreurs suivantes se sont produites : </label>
			<ul>
				<s:fielderror />
			</ul>
		</div>
	</s:if>

	<s:form method="post" action="checklogin">
		<s:textfield type="text" name="login" value="" placeholder="Login"
			size="20"></s:textfield>
		<s:textfield type="password" name="password" value=""
			placeholder="Password" size="20"></s:textfield>
		<s:submit method="doLogin" value="login"></s:submit>
	</s:form>

</body>
</html>