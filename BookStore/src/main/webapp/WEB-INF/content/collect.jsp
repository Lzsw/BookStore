<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd ">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>收藏</title>
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style5.css">
<link rel="stylesheet" href="css/responsive.css">
</head>
<body>
 <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="index">Home</a></li>
                        <li><a href="main">Book</a></li>
                        <li><a href="qinggan">情感类</a></li>
                        <li ><a href="encouragement">励志类</a></li>
                        <li><a href="reasoning">推理类</a></li>
                        <li><a href="novel">长篇小说类</a></li>
                        <li><a href="collect">收藏夹</a></li>
                        <li><a href="cart">购物车</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> 
    
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Collection</h2>
                    </div>
                </div>
            </div>
        </div>  
    </div> 
    
     <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">&nbsp;</th>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-name">Book</th>
                                            <th class="product-price">Price</th>
                                        </tr>
                                    </thead>
                <c:forEach items="${collect_list}" var="collect">
               	                                    <tbody>
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove"  href="removeCollect?book_id=${collect.book_id}&loginname=${sessionScope.user.loginname}">×</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <img  alt="书籍" class="shop_thumbnail" src="image/${collect.image}">
                                            </td>

                                            <td class="product-name">
                                                ${collect.name}
                                            </td>

                                            <td class="product-price">
                                                ${collect.price}
                                            </td>
                                        </tr>
                                       
                                    </tbody>
                            </c:forEach>
                                </table>
                            </form>
                     </div>
                </div>
            </div>
        </div>
    </div> 
</body>

