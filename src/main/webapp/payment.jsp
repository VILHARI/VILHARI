<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.project.model.PassengerDetails"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/thankyouurl" method="post">
<center>
<%
PassengerDetails pd = (PassengerDetails) session.getAttribute("personalDetails");%>
<%
			String price = (String) session.getAttribute("price");
			%>
<p>Full name : <%=pd.fullname%></p>
<p>Address : <%=pd.address %></p>
<p>Age : <%=pd.age %></p>
<p>Mobile : <%=pd.mobileno %></p>
<p>Email : <%=pd.emailId %></p>
<p>Document : <%=pd.doc %></p>
<p>Document Number : <%=pd.docNumber %></p>
<p>Amount : <%=price %></p>
<button>Pay</button></center>
</form>
</body>
</html>