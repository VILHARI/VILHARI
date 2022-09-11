<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.project.model.SearchedData"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<center>
		<form action="${pageContext.request.contextPath}/bookingServletUrl" method="post">

			<%
			String to = (String) session.getAttribute("destination");
			%>
			<h4># HiFly #</h4>
			<p>Trip to</p>
			<h2><%=to%></h2>

			<%
			String date = (String) session.getAttribute("journeydate");
			%>
			<p>
				Date:<%=date%></p>
			<table>
				<tr>
					<th>Flight No</th>
					<th>AirLine Name</th>
					<th>Source</th>
					<th>Destination</th>
					<th>Departure Time</th>
					<th>Arrival Time</th>
					<th>Price</th>
					<th>Class</th>
					<th>Action</th>

				</tr>

				<%-- <c:forEach 
        items="${searched}" var="searchedData">
    <tr>
        <td>
            <c:out value="${searchedData.airlinename}" />
        </td>
        <td>
            <c:out value="${searchedData.from}" />
        </td>
        <td>
            <c:out value="${searchedData.to}" />
        </td>
       
      
        <td>
            <c:out value="${searchedData.departuretime}" />
        </td>
          <td>
            <c:out value="${searchedData.arrivaltime}" />
        </td>
         <td>
            <c:out value="${searchedData.price}" />
        </td>
          <td>
            <c:out value="${searchedData.cabinclass}" />
        </td>
        
    </tr>
    </c:forEach> --%>

				<%
				ArrayList<SearchedData> posts = (ArrayList<SearchedData>) session.getAttribute("searched");
				for (SearchedData post : posts) {
				%>
				    <td>
				    <%=post.flightNo%><input type="hidden" name="flightno" value="<%=post.flightNo%>"/></td>
					<td><%=post.airlinename%></td>
					<td><%=post.from%></td>
					<td><%=post.to%></td>
					<td><%=post.departuretime%></td>
					<td><%=post.arrivaltime%></td>
					<td><%=post.price%><input type="hidden" name="price" value="<%=post.price%>"/></td>
					<td><%=post.cabinclass%></td>
					<td><button>Book</button></td>


				</tr>
				<%
				}
				%>

			</table>
	</center>
	</form>
</body>
</html>