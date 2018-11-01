<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>一舟远商城信息展示</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">

			<!-- 引入header.jsp -->
			<jsp:include page="/header.jsp"></jsp:include>

			<div class="container-fluid">
				<div class="main_con">
					<h2>商城设计</h2>
					<hr/>
					<div>
						<p>
							<font color="red">作品介绍</font>
						</p>
                        一舟远购物商城分为用户模块和管理员模块，商品的图片主要指自己从小米的官网里获取的资源
						<p><br>
						用户模块包括登录，注册，退出，购物车，查看订单等功能，用户可以购买不同的商品，并且支付，确认订单的前提是需要用户登录
						</p>
						<p>
						 管理员模块包括对订单的管理以及前台产品和商品分类的的更新操作等模块
						</p>
						<p>
						该商城是基于servlet的开发，利用了ajax等技术，为了巩固自己以前学习的一些知识点以及一些知识点的尝试，例如商品的种类栏用了Redis缓存技术，当然还写了ajax实现，以及直接后台提取数据等方法实现<br><br>该商城根据自己的一些理解还有知识点的更新，后期仍有相关的优化和修改
						</p>
					</div>
				</div>
			</div>
		</div>
		
		<!-- 引入footer.jsp -->
		<jsp:include page="/footer.jsp"></jsp:include>

	</body>

</html>