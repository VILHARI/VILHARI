<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
                                <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>
	</head>

	<body>
	<center>
		<form action="${pageContext.request.contextPath}/loginServletUrl">

			Username 		
			<input type="email" name="un"/><br>	<br>	
		
			Password
			<input type="text" name="pw"/>
			<br>
			<br>
			<input type="submit" value="submit">			
		
		</form>
		</center>
	</body>
</html>