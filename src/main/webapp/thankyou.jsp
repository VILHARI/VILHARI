<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>#HiFly#</h3>
<% String fname = (String) session.getAttribute("fname"); %>
<h2>Thank You <%=fname%>  for booking with us !!</h2>
</center>
</body>
</html>