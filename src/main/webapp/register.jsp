<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>personal details</title>
</head>
<body>
<center>
<h3>Personal Details : .........</h3>

<form action="${pageContext.request.contextPath}/RegisterUrl" method="post">  
Full Name :
<input type="text" name="fname" /><br/>  <br>
Address : 
<input type="text" name="address" /><br/> <br> 
Age :
<input type="number" name="age"   min="0" /><br/>  <br>
Mobile :
<input type="text" name="mobile" /><br/>  <br>
Email Id :
<input type="email" name="emailid"/><br/>  <br>
Document : 
<select name="doc">
<option  value="" disabled selected>select Document</option>
<option value="adhar">Aadhar Card</option>
<option value="ssn">SSN</option>
<option value="passport">Passport</option>
<option value="voterid">Voter Id</option>
<option value="drivingLic">Driving license</option>
</select><br><br>
Documenent Number :
<input type="text" name="docNumber"/><br><br>
<input type="submit" value="register"/>  
</form>  
</center>
</body>
</html>