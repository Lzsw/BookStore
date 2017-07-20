<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>当前在线人数</title>
</head>
<body>
session.setMaxInactiveInterval(60*30);
当前在线人数：<%out.println(application.getAttribute("count")); %>
</body>
</html>