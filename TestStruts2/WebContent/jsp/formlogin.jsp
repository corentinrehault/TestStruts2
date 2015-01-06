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

	<s:form method="post" action="doLogin">
		<s:textfield type="text" name="login" value="" placeholder="Login"
			size="20"></s:textfield>
		<s:textfield type="password" name="password" value=""
			placeholder="Password" size="20"></s:textfield>
		<s:submit method="doLogin" value="login"></s:submit>
	</s:form>
	<!-- 	<form action="doLogin" method="post"> -->
	<!-- 		<table> -->
	<!-- 			<tr> -->
	<!-- 				<td><input type="text" name="login" value="" -->
	<!-- 					placeholder="Login" size="20" maxlength="20"></input></td> -->
	<!-- 			</tr> -->
	<!-- 			<tr> -->
	<!-- 				<td><input type="password" name="password" value="" -->
	<!-- 					placeholder="Password" size="20" maxlength="20"></input></td> -->
	<!-- 			</tr> -->
	<!-- 			<tr> -->
	<!-- 				<td><input type="submit" name="Login" value="xfg"></input></td> -->

	<!-- 			</tr> -->
	<!-- 		</table> -->
	<!-- 	</form> -->
</body>
</html>