<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gift Card Registration</title>
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<h3 align="center" style="color:blue">Gift Card Registration</h3>
<div align="center" >
<form action="insertUser">
      <input type="text" id="username" class="fadeIn second" name="username" placeholder="username"><br>
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="password"><br>
      <input type="text" id="confirmpassword" class="fadeIn second" name="confirmpassword" placeholder="retype password"><br>
      <input type="text" id="email" class="fadeIn third" name="email" placeholder="abx@xyz.com"><br>
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>
    </div>
</body>
</html>