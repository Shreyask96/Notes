<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
		Enter id <input type="number" name="id" disabled="disabled" value="<%=request.getParameter("id") %>"><br><br>
		Enter name<input type="text" name="name" value="<%=request.getParameter("name") %> "><br><br>
		Enter password <input type="password" name="pwd" value="<%=request.getParameter("pwd")%>"> <br><br>
		Enter mail <input type="email" name="mail" value="<%=request.getParameter("mail")%>"><br><br>
		Date of Birth <input type="date" name="dob" value="<%=request.getParameter("dob")%>"> <br><br>
		<button type="submit">Submit</button>
		<button type="reset">Cancel</button>

	</form>


</body>
</html>