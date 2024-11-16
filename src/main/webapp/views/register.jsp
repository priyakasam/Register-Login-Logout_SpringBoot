<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css"/>
</head>

<body class="body_bg">

<h4> Register here </h4>


<c:if test="${not empty successmsg}">
	<h4 style="color:green"> ${successmsg}</h4>
	
</c:if>
<c:if test="${not empty errormsg}">
	<h4 style="color:red"> ${errormsg}</h4>
</c:if>

<form action="regForm" method="post">
    Name:<input type="text" name="name"/><br/><br/>
    Email:<input type="text" name="email"/><br/><br/>
    password:<input type="password" name="password"/><br/><br/>
    phone no:<input type="text" name="phoneno"/><br/><br/>
    <input type="submit" value="Register"/>
       

</form>

If  registered...<a href="loginpage">Login</a>

</body>

</html>