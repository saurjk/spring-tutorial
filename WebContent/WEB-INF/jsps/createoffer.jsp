<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Offer</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/docreate">
		<table class = "formtable" width = "0">
			<tr><td>Name:</td><td><input name="name" type="text"/></td></tr>
			<tr><td>Email:</td><td><input name="email" type="text"/></td></tr>
			<tr><td>Text:</td><td><textarea name="text" rows="10" cols="20"></textarea></td></tr>
			<tr><td>&nbsp;</td><td><input name="Create" type="submit"/></td></tr>
		</table>
	</form>
</body>
</html>