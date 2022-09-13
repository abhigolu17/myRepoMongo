<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<H1>Hello This is my first Dynamic Page!</H1>

	<form action="regAction" method="Post">
		<input type="text" name="uname" value="Name..." onclick="this.value=''" /><br /> 
		<input type="text" name="ugmail" value="Email ID..." onclick="this.value=''" /><br /> 	
		<input type="password" name="pass" value="Password..." onclick="this.value=''" /><br />
	    <input type="submit" value="register" />
	</form>

</body>
</html>