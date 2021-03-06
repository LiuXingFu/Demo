<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/Demo/css/index.css"/>
<link rel="stylesheet" type="text/css" href="/Demo/css/public.css"/>
<title>Demo_首页</title>
<style type="text/css">
	body {
		width: 100%;
		height: 100%;
		background-color: ${sessionScope.user.demo_Color };
	}
	#demo_div {
		margin: 0px auto;
		width: 60%;
		/*border: 1px solid red;*/
		background-color: #f2f3f5;
	}
	#user_div {
		margin: 2% 0 0 5%;
	}
</style>
</head>
<body>
<div id="demo_div">
	<div id="user_div">
		&nbsp;&nbsp;
		<a href="/Demo/index">首页</a>
		<c:if test="${user.demo_Name == null }">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="/Demo/register" target="demo_bottom">注册</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="/Demo/login" target="demo_bottom">登录</a>
		</c:if>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<c:if test="${user.demo_Name != null }">
			当前用户：
			<img alt="" src="/Demo/img/${user.demo_userImg }" style="width: 20px; height: 20px;">
			<a href="/Demo/user/detail" target="demo_bottom">${user.demo_Name }</a> 
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="/Demo/exit" target="demo_top">退出登录</a>
		</c:if>
		&nbsp; ${error }
	</div>
	<div class="con_box">
		<ul>
			<li><a href="/Demo/dynamic_index"> <img alt="" src="/Demo/img/Demo_release.jpg">
					<p class="text">Demo_动态</p>
			</a></li>
			<li><a href="/Demo/gradeTableList"> <img alt=""
					src="/Demo/img/gradetable.jpg">
					<p class="text">1610_成绩单</p>
			</a></li>
			<li><a href="/Demo/teachers"> <img alt="" src="/Demo/img/mybatis.jpg">
					<p class="text">MyBatis一对多</p>
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
</div>
</body>
</html>
