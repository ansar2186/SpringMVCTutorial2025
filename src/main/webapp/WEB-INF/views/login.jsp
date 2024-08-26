<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1" isELIgnored="false"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Login page!!</h1>

	<p><font color="red">${errorMessage}</font></p>

	<form action="signUp">
		<span>User Name:</span> <input type="text" name="userName"
			id="userName"> <span>User Password:</span> <input
			type="password" name="password" id="password">

		<input type="submit"/>

	</form>
</body>
</html>