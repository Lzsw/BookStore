<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>书本详情</title>
<link rel="stylesheet" href="css/style3.css">
<link rel="stylesheet" href="css/orange.css">
<link rel="stylesheet" href="css/skeleton.css">
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/ddsmoothmenu.css"/>
<link rel="stylesheet" href="css/elastislide.css"/>
<link rel="stylesheet" href="css/home_flexslider.css"/>
<link rel="stylesheet" href="css/light_box.css"/>
<link rel="stylesheet" href="css/style2.css" >
</head>
<body>
<div class="mainContainer sixteen container">
<!--Header Block-->
<div >
<a href="index">主页</a> <a href="main">首页</a> <a href="qinggan">情感类</a> <a href="encouragement">励志类</a> <a href="reasoning">推理类</a> <a href="novel">长篇小说类</a> <a href="wishlist">收藏夹</a> <a href="cart ">购物车</a>           
</div>
<!--Content Block-->
<section class="content-wrapper">
	<div class="content-container container">
		<div class="main">
			<div class="product-info-box">
				<div class="product-essential">
					<div class="product-img-box">
						<p class="product-image-zoom">
							<img src="image/${book.image}"  alt="Image" title="Image" />
						</p>
						<div >
							<ul >
								<li><img src="image/${book.picture}" />
							</ul>
						</div>
					</div>
					<div class="product-shop">
						<h3 class="product-name">${book.name}</h3>
						<div class="price-box">
						
						<span class="price">作者：${book.author}</span>
						<br>
						<span class="price">价格：${book.price}</span>
						<br>
                		<span class="price">出版社：${book.publication}</span>
                		<br>
						
						</div>
						<div class="model-block">
							<p>
								<span>书本编号： </span>${book.book_sn}
							</p>
							<p>
								<span>种类编号： </span>${book.category_sn}
							</p>
						</div>
						<div class="first-review">
							This is a good book！
						</div>
						<div class="add-to-cart-box">
							<span class="qty-box">
								<label for="qty">数量:</label>
								<input type="text" value="1"  id="qty" class="input-text qty" name="qty">
							</span>
                            
	                            <div class="form-button">
	                            <p><a href="save?book_id=${book.id}"  role="button"> 加入购物车</a></p>
	                            <p><a href="saveCollect?book_id=${book.id}&loginname=${user.loginname}&image=${book.image}&name=${book.name}&price=${book.price}"  role="button"> 加入收藏夹</a></p>
                                </div>	
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
    </session>
 
			<section class="product-collateral">
            	
				<ul class="tab-block">
					<li><a href="#pro-detail" title="Description" class="active">Remark</a></li>
					
				</ul>
				<div id="pro-detail" class="pro-detail commonContent">
					
					<p>${book.remark}</p>
				</div>
			</section>
</div>
<script src="js/jquery-1.8.3.min.js" type="text/JavaScript"></script>
<script src="js/jquery-1.8.2.min.js"></script>
<script src="js/common.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/ddsmoothmenu.js"></script>
<script src="js/jquery.flexslider.js"></script>
<script src="js/jquery.elastislide.js"></script>
<script src="js/jquery.jcarousel.min.js"></script>
<script src="js/jquery.accordion.js"></script>
<script src="js/light_box.js"></script>	
<script src="js/html5.js"></script>			
</body>
</html>