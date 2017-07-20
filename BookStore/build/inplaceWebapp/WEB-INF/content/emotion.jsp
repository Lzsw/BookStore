<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
<title>情感类</title>
<link href="css/bootstrap1.min.css" rel="stylesheet">
<link href="css/style2.css" rel="stylesheet">
</head>
<body>
<div>
      <div class="container-fluid">
      <c:forEach items="${requestScopebook_list}" var="book">     
		<div class="col-md-4">
		<img src="image/${book.image }" width=250px height=300px/>
			<div class="para">
				<div class="para"><font><font>
					书名：<a href="details">${book.name}</a>
				</font></font></div>	
			<div class="para">
				<div class="para"><font><font>
					作者：${book.author}
				</font></font></div>
			<div class="para">
				<div class="para"><font><font>
					编号：${book.book_sn}
				</font></font></div>
			<div class="para">
			    <div class="para"><font><font>
					价格：${book.price}
			</font></font></div>
			</div>
			</div>
			</div>
			</div>
		 </div>
	</c:forEach> 
  </div> 
</div>
<script src="js/jquery1.min.js"></script>
<script src="js/bootstrap1.min.js"></script>
<script src="js/scripts1.js"></script>
</body>
</html>