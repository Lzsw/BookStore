<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>『哑舍』书屋</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style1.css" rel="stylesheet">
</head>
 <body>
    <div class="container-fluid">
	<div class="row">
			<div class="jumbotron">
				<h2>
					欢迎访问『 哑 舍 』书屋！
				</h2>
				<div>
					在这里，愿你找到一份宁静，一丝慰藉，一份温暖......
				</div>
				<div>
				当前在线人数：${applicationScope.count}
				</div>
				<p>
					<a class="btn btn-primary btn-large" href="main">进入书屋</a>
					<a class="btn btn-primary btn-large" href="changepwd">修改密码</a>
	            </p>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<h2>
				『哑舍』
			</h2>
			<p>
				<span>与书为伴，清净恬淡;以书为友，不见忧愁;和书相牵，美名相传。书乃圣洁之品，神秘之物，愿你好书把握在手，书写壮美人生！</span>
			</p>
					</div>
		<div class="col-md-4">
			<h2>
				『哑舍』
			</h2>
			<p>
				<span>读书好比隐居山林，避开世俗的纷争，避开凡尘的喧嚣，独享一份精神的愉悦自然;读书如同归隐田园，独享着书赐予的静之美，静之馨，静之醉读书时。</span>
			</p>
			<p>
						</p>
		</div>
		<div class="col-md-4">
			<h2>
				『哑舍』
			</h2>
			<p>
				<span>走进书籍就是走进思想的闪光圣殿，当你融入书中时，你会发现，你的思想已不再是别人的跑马场，而是思维积存下的精神百花园，那里繁花似锦、五彩缤纷。</span>
			</p>
			<p>
						</p>
		</div>
	</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  
  </body>
</html>