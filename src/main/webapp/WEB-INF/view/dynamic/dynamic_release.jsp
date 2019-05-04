<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic_release</title>
<style type="text/css">
	* {
		margin: 0px;
		padding: 0px;
	}
	#demo_div {
		width: 50%;
		margin: 0px auto;
		/* border: 1px solid red; */
		background-color: #f2f3f5;
	}
	#user_div {
		width: 50%;
		margin: 0px auto;
		margin-bottom: 20px;
		margin-top: 20px;
	}
	#release_div {
		width: 50%;
		margin: 0px auto;
	}
</style>
</head>
<body>
<div id="demo_div">
	<div id="user_div">
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
	<div id="release_div">
		每日yi态
		<form action="/Demo/dynamic_release" method="post">
			<input type="hidden" name="demo_User" value="${user.demo_User }"/>
			<textarea type="text" name="demo_Dynamic" rows="6" cols="50px"></textarea>
			<br>
			<input  type="submit" value="发布"/>
		</form>
	</div>
</div>
	<hr width="70%" align="center"/>
	<div style="width: 70%; margin: 0px auto;" align="center">
		<a href="/Demo/index">Demo_首页</a>&nbsp; | &nbsp;
		<a href="/Demo/register">Demo_注册</a>&nbsp; | &nbsp;
		<a href="/Demo/login">Demo_登录</a>&nbsp; | &nbsp;
		<a href="https://github.com/LiuXingFu/Demo">Demo_源码</a>
		<p></p>
		<p>@2019 LiuXingFu Demo演示</p>
	</div>
</body>
</html>