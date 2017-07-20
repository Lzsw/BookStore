<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
        request.setCharacterEncoding("utf-8");  
        UserMapperImpl user = new UserMapperImpl();  
        String loginname = request.getParameter("loginname");  
        String password = request.getParameter("password");  
        String remember = request.getParameter("passcookies");  
        if (!user.loginCheck(loginname, password)) {  
            out.println("<script>alert('error');</script>");  
        } else {  
            if (remember != null) {  
                Cookie c1 = new Cookie("loginname", loginname);  
                Cookie c2 = new Cookie("password", password);  
                c1.setMaxAge(1000);  
                c2.setMaxAge(1000);//这里设置保存这条Cookie的时间  
                response.addCookie(c1);//添加Cookie  
                response.addCookie(c2);  
                out.println("<script>alert('success and remember this loginname&password');</script>");  
            } else {  
                out.println("<script>alert('success but not remember this loginname&password');</script>");  
            }  
        }  
    %>  
</body>
</html>