<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/Demo/css/index.css"/>

<title>Demo首页</title>

</head>
<body>
当前用户：<a href="/Demo/user/detail">${user.demo_Name }</a> &nbsp; ${error }
	<div class="con_box">
		<ul>
			<li><a href="/Demo/user/index"> <img alt="" src="/Demo/img/user_index.jpg">
					<p class="text">用户登录注册</p>
			</a></li>
			<li><a href="/Demo/gradeTableList"> <img alt=""
					src="/Demo/img/gradetable.jpg">
					<p class="text">1610成绩单</p>
			</a></li>
			<li><a href=""> <img alt="" src="/Demo/img/test.jpg">
					<p class="text">敬请期待...</p>
			</a></li>
			<li><a href=""> <img alt="" src="/Demo/img/test.jpg">
					<p class="text">敬请期待...</p>
			</a></li>
			<li><a href=""> <img alt="" src="/Demo/img/test.jpg">
					<p class="text">敬请期待...</p>
			</a></li>
			<li><a href=""> <img alt="" src="/Demo/img/test.jpg">
					<p class="text">敬请期待...</p>
			</a></li>

		</ul>
	</div>
</body>
</html>