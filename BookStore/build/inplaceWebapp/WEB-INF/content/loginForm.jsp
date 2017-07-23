<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<body>
<div class="login">
<form action="login" method="post" >
	<h2>Login Form</h2>
	<div class="login-top">
		<h2>loginname</h2>
			<input type="text" id="loginname" name="loginname" >
			<h2>password</h2>
			<input type="password" id="password" name="password" >
	    <div class="forgot">
	    	<a href="forgetpwd">forget Password</a>
	    	<input type="submit"  value="登录" >
	    </div>
	    
	<input type="checkbox" id="remember" name="remember"/> 记住密码 
    </div>
	<div class="login-bottom">
		<h3><a href="registerForm">Register</a></h3>
	</div>
</form>
</div>
</body>
</html>