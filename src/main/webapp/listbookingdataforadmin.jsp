<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.project.model.bookingDetails"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookingList</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
<center>

<h2>#HiFly#</h2>
<a href="changePassword.jsp" style="float: right;">Change Passward</a>

<h3>Booking details</h3></center>
<table>
<center>
				<tr>
					<th>Flight No</th>
					<th>Date</th>
					<th>Username </th>
					<th>Email</th>
					<th>Age</th>
					<th>Address</th>
					<th>Mobile</th>
					<th>Document</th>
					<th>Document Number</th>
					<th>AirLine Name</th>
					<th>Source</th>
					<th>Destination</th>
					<th>Departure Time</th>
					<th>Arrival Time</th>
					<th>Price</th>
					<th>Class</th>

				</tr>
				<%
				ArrayList<bookingDetails> posts = (ArrayList<bookingDetails>) session.getAttribute("bookingDetail");
				for (bookingDetails post : posts) {
				%>
				    <td><%=post.flight_no%></td>
					<td><%=post.traveldate%></td>
					<td><%=post.fullname%></td>
					<td><%=post.email_id%></td>
					<td><%=post.age%></td>
					<td><%=post.address%></td>
					<td><%=post.mobile%></td>
					<td><%=post.documentname%></td>
					 <td><%=post.docId%></td>
					<td><%=post.airline_name%></td>
					<td><%=post.source_city%></td>
					<td><%=post.destination_city%></td>
					<td><%=post.departureTime%></td>
					<td><%=post.arrivalTime%></td>
					<td><%=post.price%></td>
					<td><%=post.classtype%></td>


				</tr>
				<%
				}
				%>
				</center>
				</table>
</body>
</html>