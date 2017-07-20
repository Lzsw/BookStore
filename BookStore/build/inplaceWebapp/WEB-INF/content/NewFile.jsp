<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>书本详情</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/orange.css">
<link rel="stylesheet" href="css/skeleton.css">
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/ddsmoothmenu.css"/>
<link rel="stylesheet" href="css/elastislide.css"/>
<link rel="stylesheet" href="css/home_flexslider.css"/>
<link rel="stylesheet" href="css/light_box.css"/>
</head>
<body>
<div class="mainContainer sixteen container">
<!--Header Block-->
<div class="header-wrapper">
              <header class="container">
                <div class="head-right">
                    <ul class="currencyBox">
                        <li id="header_currancy" class="currency"> <a class="mainCurrency" href="#">Category</a>
                          <div id="currancyBox" class="currency_detial"> <a href="qinggan">情感类</a> <a href="encouragement">励志类</a> <a href="reasoning">推理类</a> <a href="novel">长篇小说</a></div>
                        </li>
                    </ul>
				</div>
</div>
<!--Content Block-->
<section class="content-wrapper">
	<div class="content-container container">
		<div class="main">
			<div class="product-info-box">
				<div class="product-essential">
					<div class="product-img-box">
						<p class="product-image-zoom">
							<img src="image/a1.jpg"  alt="Image" title="Image" />
						</p>
						<p>
							Click on above image to view full picture
						</p>
						<div class="img-slider">
							<ul id="moreView">
								<li><a class="ajax" href="image/a1.jpg"><img src="image/smalla1.jpg" alt="" title="" /></a></li>
                                <li><a class="ajax" href="image/a2.jpg"><img src="image/smalla2.jpg" alt="" title="" /></a></li>
		                        <li><a class="ajax" href="image/view_img.png"><img src="image/small_img.png" alt="" title="" /></a></li>				
							</ul>
						</div>
					</div>
					<div class="product-shop">
						<h3 class="product-name">《愿有人陪你颠沛流离》</h3>
						<div class="price-box">
						<br><span class="price">作者：卢思浩</span></br>
						<br><span class="price">价格：35.8元</span></br>	
                		<br><span class="price">出版社：湖南文艺出版社</span></br>
						<br><span class="price">出版时间：2010-07-01</span></br>
				        </div>
						<div class="model-block">
							<p>
								<span>书本编号： </span>1001
							</p>
							<p>
								<span>种类编号： </span>20170701
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
                           
							<button class="form-button" title="Add to Cart"><span>Add to Cart</span></button>
							<ul class="add-to-box">
								<li><a href="#" title="Add to Wishlist" class="add-wishlist">Add to Wishlist</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
    </session>
			<section  class="product-collateral">
            	
				<ul class="tab-block">
					<li><a href="#pro-detail" title="Description" class="active">Remark</a></li>
					
				</ul>
				<div id="pro-detail" class="pro-detail commonContent">
					
					<p>
						
我们没能实现的梦想，在最无助难过的时候开出花来；没能珍惜的青春和回忆，在经历了成长的阵痛之后能在心底认真而平静的告别。						
					</p>
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