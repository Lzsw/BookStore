<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<title>Home</title> 
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<!--Google Fonts-->
<body>
<div class="login">
<form action="regist" method="post">
	<h2>注册页面</h2>
	<div class="login-top">
		<h1>Register Form</h1>
		<form>
			<input type="text" id="loginname" name="loginname" value="loginname" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'loginname';}" >
			<input type="password" id="password" name="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}" >
	        <input type="text" id="username" name="username" value="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}" >
	        <input type="text" id="phone" name="phone" value="phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'phone';}" >
	        <input type="text" id="address" name="address" value="address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'address';}" >
	        <input type="text" id="mail" name="mail" value="mail" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mail';}" >
	    </form>
	    <div class="forgot">
	    	<input type="submit" value="注册" >
	    </div>
	</div>
</div>	
</body>
</html>