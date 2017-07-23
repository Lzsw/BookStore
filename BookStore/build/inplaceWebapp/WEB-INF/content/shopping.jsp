<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>购物车</title>
    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">
</head>
 <body>
            <tr>
			<th >图片</th>
			<th >书名</th>
			<th >价格</th>
			<th >数量</th>
			<th >减少数量</th>
			<th >增加数量</th>
			<th >删除</th>
		    </tr>
	  
           <c:forEach items="${requestScope.shop_list }" var="shop">
                <c:forEach items="${shop.book }" var="book">
			<tr>
				<td><img src="image/${book.picture}"></td>
				<td>${book.name}</td>
				<td>${book.price}</td>
				<td>${shop.count }</td>
			<td>
			<a  href="" >Check out</a>
		    </td>
		    <td>
			<a  href="reduce?book_id=${book.id}" ><font size=5>-</font></a>
		    </td>
		    <td>
			<a  href="increase?book_id=${book.id}" ><font size=5>+</font></a>
		    </td>
		    <td>
			<a  href="remove?book_id=${book.id}" >删除</a>
		    </td>
		  </tr>
		          </c:forEach>  
		</c:forEach>		
</body>
</html>