<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除书本</title>
</head>
<body>

<br>
<table>
	<tr>
		<th>书名</th><th>作者</th><th>价格</th><th>删除</th>
	</tr>
	<c:forEach items="${book_list }" var="book">
		<tr>
			<td>${book.name }</td>
			<td>${book.author }</td>
			<td>${book.price }</td>
			<td> <a title="Remove this item"   href="removeBook?id=${book.id}">×</a> </td>
		</tr>
	</c:forEach>
</table>

</body>
</html>