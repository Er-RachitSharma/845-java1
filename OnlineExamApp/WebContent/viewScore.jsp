<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Score Card</title>
</head>
<body>
<h2> Your score is <%= session.getAttribute("score") %>.</h2> <br>
Thanks, come again!
</body>
</html>