<%@page import="java.util.List"%>
<%@page import="Springmvc_basics.dto.MvcDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% MvcDto d = (MvcDto)request.getAttribute("object"); %>

	<table border="2px solid">
		<tr>

			<th>Id</th>
			<th>Name</th>

		</tr>

		<tr>

			<td><%=d.getId()%></td>
			<td><%=d.getName()%></td>

		</tr>
		

	</table>

</body>
</html>