<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="wrapper fadeInDown">
  <div id="formContent" align="center">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first" >
      <h3 style="color:blue">Gift  Card Login Page</h3>
    </div>

    <!-- Login Form -->
    <form action="validateUser">
      <input type="text" id="login" class="fadeIn second" name="username" placeholder="username"><br>
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="password"><br>
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="addNewUser">New User? Register Here!</a>
    </div>

  </div>
</div>
    </body>
</html>
