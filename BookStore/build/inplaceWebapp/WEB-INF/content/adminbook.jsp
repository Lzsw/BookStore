<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品管理</title>
</head>
<link href="css/adminloginstyle.css" rel="stylesheet" type="text/css" media="all"/>
<body>
<div class="geshi">
<form action="addBook" enctype="multipart/form-data" method="post">
	
	<br>
	<br>
	<a>书名</a><input type="text" name="name"  >
	<br>
	<br>
	<a>作者</a><input type="text" name="author"  >
	<br>
	<br>
	<a>价格</a><input type="text" name="price"  >
	<br>
	<br>
	<a>书评</a><input type="text" name="remark"  >
	<br>
	<br>
	<a>出版社</a><input type="text" name="publication"  >
	<br>
	<br>
	<a>出版日期</a><input type="date" name="publicationdate" >
	<br>
	<br>
	<a>书本编号</a><input type="text" name="book_sn"  >
	<br>
	<br>
	<a>种类编号</a><input type="text" name="category_sn"  >
	<br>
	<br>
	<a>主图</a><input type="file" name="image1" >
	<br>
	<br>
	<a>附图</a><input type="file" name="picture1"  >
	<br>
	<br>
	
	<input type="submit"  value="添加" id="addBook_button">
</form>
</div>
</body>
</html>