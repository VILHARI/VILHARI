<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fail</title>
<script type="text/javascript">
function redirect(elem){
    elem.setAttribute("action","changePassword.jsp");
    elem.submit();
}
</script>
</head>
<body>
<form action=""  name="form"
	onsubmit="redirect(this);"	>
<center>
          
			
            Fail to change the password!.
            <br>
            <br>
<input type="submit" name="Submit" value="Retry">         </center>
         </form>
</body>
</html>