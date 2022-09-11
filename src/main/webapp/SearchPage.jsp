<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Member Login</title>
</head>
<body>
<center>Welcome to HiFly
<br>
<br>
<form action="${pageContext.request.contextPath}/SearchServletUrl" method="post">
    From:&nbsp;
    <select name="fromcity" placeholder="Start.......">
    <option value="" disabled selected>Source City</option>
    <option value="pune">Pune</option>
        <option value="mumbai">Mumbai</option>
    
        <option value="kolkata">Kolkata</option>
    
        <option value="bengaluru">Bengaluru</option>
    
        <option value="kochi">Kochi</option>
    
    </select>
    &nbsp;
        To:&nbsp;
    
     <select name="tocity" placeholder="Start.......">
    <option value="" disabled selected>Destination City</option>
     <option value="pune">Pune</option>
        <option value="mumbai">Mumbai</option>
    
        <option value="kolkata">Kolkata</option>
    
        <option value="bengaluru">Bengaluru</option>
    
        <option value="kochi">Kochi</option>
    
    </select>
    &nbsp;
    Date of Journey:
    <input type="date" id="journey" name="journeyDate" >
    <br/><br/>
    &nbsp;
    No of Person:
    <input type="number" id="personNo" name="personNo" value="1" min="1">
    choose a class:
    <input type="radio" id="busiclass" name="busiclass" value="Business Class">Business 
    <input type="radio" id="econclass" name="busiclass" value = "economy class">Economy 
    <br>
    <br>
    <input type="submit" value="Search" />
</form>
</center>
</body>
</html>