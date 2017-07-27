<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 ">
<title>『哑舍』书屋</title>
<link href="css/bootstrap1.min.css" rel="stylesheet">
<link href="css/style2.css" rel="stylesheet">
</head>
<body>
<div>
      
      <ul class="currencyBox">
                        <li id="header_currancy" class="currency"> <a class="mainCurrency" href="#">分类</a>
                          <div id="currancyBox" class="currency_detial"> <a href="qinggan">情感类</a> <a href="encouragement">励志类</a> <a href="reasoning">推理类</a> <a href="novel">长篇小说类</a> </div>
                        </li>
      </ul>
     
      <div class="container-fluid">
      <c:forEach items="${book_list}" var="book"  >     
		<div class="col-md-4">
		<img src="image/${book.image }" />
			<div class="para">
				<div class="para"><font><font>
					书名：<a href="bookdetail?id= ${book.id }">${book.name}</a>
				</font></font></div>	
			<div class="para">
				<div class="para"><font><font>
					作者：${book.author}
				</font></font></div>
			<div class="para">
			    <div class="para"><font><font>
					价格：${book.price}
			</font></font></div>
			</div>
			</div>
			</div>
		 </div>
	</c:forEach> 
  </div> 
</div>
<script src="js/bootstrap1.min.js"></script>
</body>
</html>