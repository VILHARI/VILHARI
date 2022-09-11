<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<script>
function validpass(){
	alert("in");
if (document.form.current.value == ""){
alert ( "Please enter current password ." );
return false;
}
if (document.form.new.value == ""){
alert ( "Please enter new  password." );
return false;
}
if (document.form.confirm.value == ""){
	alert ( "Please enter confirm  password." );
	return false;
	}
	if(document.form.new.value != document.form.confirm.value){
		alert("password mismatched!");
	}
//alert ( "Welcome User" );
//return true;
}
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/ChangePasswordAdmin"  name="form"
		>
		<table>
			<tr>
				<td>Current Password</td>
				<td><input type="password" name="current"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="new"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirm"></td>
			</tr>
			<td><input type="submit" name="Submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>