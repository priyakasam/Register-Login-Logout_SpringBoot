<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Login</title>
<link rel="stylesheet" href="css/style.css"/>
</head>

<body class="body_bg">

<h4> Login here </h4>



<c:if test="${not empty errormsg}">
	<h4 style="color:red"> ${errormsg}</h4>
</c:if>

<form action="loginForm" method="post">
   
    Email:<input type="text" name="email"/><br/><br/>
    password:<input type="password" name="password"/><br/><br/>
    
    <input type="submit" value="Login"/>
       

</form>
<br/><br/>
If not registered...<a href="regpage">Register</a>
</body>

</body>

</html>