<%@page import="java.util.List"%>
<%@page import="servlets_basics.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h3>Employee Details</h3>
	<%
	List<Employee> list = (List<Employee>) request.getAttribute("objects");
	%>
	<table border="2px solid ">

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mail</th>
			<th>Password</th>
			<th>Dob</th>
			<th>Gender</th>
			<th>Remove</th>
			<th>Update</th>
		</tr>
		<%
		for (Employee e1 : list) {
		%>
		<tr>
			<td><%=e1.getId()%></td>
			<td><%=e1.getName()%></td>
			<td><%=e1.getMail()%></td>
			<td><%=e1.getPassword()%></td>
			<td><%=e1.getDob()%></td>
			<td><%=e1.getGender()%></td>
			<td><a href="def?primarykey=<%=e1.getId()%>">Remove</a>
			<td><a href="update.jsp?id=<%=e1.getId()%>&&name=<%=e1.getName()%>&&mail=<%=e1.getMail()%>&&pwd=<%=e1.getPassword()%>&&dob=<%=e1.getDob()%>&&gender=<%=e1.getGender()%>">Edit</a>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>