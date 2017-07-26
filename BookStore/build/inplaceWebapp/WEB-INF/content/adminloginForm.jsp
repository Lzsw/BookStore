<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<link href="css/adminloginstyle.css" rel="stylesheet" type="text/css" media="all"/>
<body>
<form action="adminlogin" method="post" >
<div class="geshi">
	<h2>loginname</h2>
			<input type="text" id="loginname" name="loginname" >
	<h2>password</h2>
			<input type="password" id="password" name="password" >
	<br>
	<br>
	<input type="submit"  value="登录" >
</div>
</form>			
</body>
</html>