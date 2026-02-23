<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>My Form</h2>

	<!-- <form action="submitForm" method="post">

		name:<input type="text" name="name1" /> <br><br>
	    Email Id:<input type="text" name="email1" /> <br> <br> 
		Phone No:<input type="text" name="phoneno1" /><br> <br> 
		
		<input type="submit" value="Submit Form" /> <br> <br>
	</form> -->
	
	<!-- for modelAttribute method we need to pass same name as varibale nam in user class -->
	<form action="submitForm" method="post">

		name:<input type="text" name="name" /> <br><br>
	    Email Id:<input type="text" name="email" /> <br> <br> 
		Phone No:<input type="text" name="phoneno" /><br> <br> 
		
		<input type="submit" value="Submit Form" /> <br> <br>
	</form>
</body>
</html>