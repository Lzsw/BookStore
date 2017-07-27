<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" contentType="text/html; charset=UTF-8"/>
<title>详情</title>
<link href="css/bootstrap1.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.mins.js" ></script>
<!-- Custom Theme files -->
<link href="css/style6.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
<script src="js/jquery.details.js"></script>
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="top-header">
			<div class="container">
				<div class="header-left">
					<p>欢迎访问哑舍书屋！</p>
				</div>
			</div>
		</div>
		<div class="bottom-header">
			<div class="container">
				<div class="logo">
					<a href="index"><h1>哑舍书屋</h1></a>
				</div>
				<div class="header_bottom_right">
					<div class="h_menu4">	
						<ul class="nav">
							<li ><a href="index">首页</a></li>
							<li><a href="main" >书本</a></li>
							<li><a href="qinggan">情感类</a></li>
							<li><a href="encouragement">励志类</a></li>
							<li><a href="reasonning">推理类</a></li>
							<li><a href="novel">长篇小说类</a></li>
							<li><a href="cart">购物车</a></li>
							<li><a href="collect">收藏夹</a></li>
						</ul>						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="dreamcrub">
		<div class="container">
			   	 <ul class="breadcrumbs">
					<li>首页</li>&nbsp;<span>&gt;</span>
					<li>书本</li>&nbsp;<span>&gt;</span>
					<li>${book.name }</li>
                 </ul>
                <ul class="previous">
                	<li><a href="index">返回首页</a></li>
                </ul>
                <div class="clearfix"></div>
		</div>
	</div>
	<!-- start content -->
	<div class="women_main">
		<div class="container">
			<div class="row single">
				<div class="col-md-9 span-single">
					<div class="single_left">
						<div class="grid images_3_of_2">
							<ul id="etalage">
								<li>	
									<img class="etalage_thumb_image" src="image/${book.image}" class="img-responsive" />
									<img class="etalage_source_image" src="image/${book.image }" class="img-responsive" />								
								</li>
								<li>
									<img class="etalage_thumb_image" src="image/${book.picture }" class="img-responsive" />
									<img class="etalage_source_image" src="image/${book.picture }" class="img-responsive" />
								</li>
							</ul>
							<div class="clearfix"></div>		
						</div>
						<div class="desc1 span_3_of_2">
							<h3>${book.name }</h3>
							<p>¥ ${book.price }<a href="#"></a></p>
							<div class="det_nav">
								<h4>作者:${book.author}</h4>
								<h4>出版社 :${book.publication }</h4>
								<h4>书本编号 :${book.book_sn }</h4>
								<h4>种类编号 :${book.category_sn }</h4>
							</div>
							<div class="btn_form">
									<a href="save?book_id=${book.id}" role="button">加入购物车</a> 
									<a href="saveCollect?book_id=${book.id}&name=${book.name}&loginname=${user.loginname}&image=${book.image}&price=${book.price}" role="button">加入收藏</a><br/><br/>
							</div>											
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="single-bottom1">
					<h6>书本简介</h6>
					<p class="prod-desc">${book.remark }</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- content end -->		
</body>
</html>