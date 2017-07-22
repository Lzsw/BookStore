<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
</head>
<body>
</head>
<body>
<br>
<table >
	<tr>  
		<th>封面</th><th>书名</th><th>价格</th><th>数量</th><th>增加数量</th><th>减少数量</th><th>删除</th><th>购买</th>
	
	<c:forEach items="${requestScope.shop_list }" var="shop">
                <c:forEach items="${shop.book }" var="book">
			<tr>
				<td><img src="image/${book.image}"></td>
				<td>${book.name}</td>
				<td>${book.price}</td>
				<td>${shop.count }</td>
		    <td>
			<a  href="reduce?book_id=${book.id}" ><font size=5>-</font></a>
		    </td>
		    <td>
			<a  href="increase?book_id=${book.id}" ><font size=5>+</font></a>
		    </td>
		    <td>
			<a  href="remove?book_id=${book.id}" >删除</a>
		    </td>
		    <td>
			<a  href="" >立即购买</a>
		    </td>
		  </tr>
		          </c:forEach>  
	
		</c:forEach>
</tr>
</table>		
</body>
</html>