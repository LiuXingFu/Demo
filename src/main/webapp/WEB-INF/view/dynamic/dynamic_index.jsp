<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo_dynamic_index</title>
<style type="text/css">
			* {
				margin: 0;
				padding: 0;
			}
			#demo_1 {
				margin: 0 auto;
				width: 60%;
				/* border: 1px solid greenyellow; */
				background-color: #f2f3f5;
			}
			#demo_2 {
				width: 70%;
				margin: 0 auto;
				margin-top: 20px;
			}
</style>
<script type="text/javascript">
	/* 判断用户是否登录,进入发动态的页面 */
	function demo_release(demo_release) {
		if(demo_release == null){
			window.location.href="#";
		} else {
			window.location.href="/Demo/release";
		}
	}
</script>
	</head>
	<body>
		<div id="demo_1">
			<div style="width: 100%; height: 200px; background-image: url(img/9.jpg);">
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
		
			<div style="margin-top: 17%; height: 20px; margin-left: 90%;">
				<a href="#" onclick="demo_release(${user.demo_User});">发动态</a>
			</div>
		
			</div>
			<hr />
			<c:forEach items="${dynamic_Users }" var="dynamic">
				<div id="demo_2">
					<p>
						<img src="/Demo/img/${dynamic.demo_userImg }" style="width: 30px; height: 30px;"/>  
						${dynamic.demo_Name }
						<br />
						<hr />
							<p style="margin-left: 30px;">
								${dynamic.demo_Dynamic }
							</p>
						<hr />
							<p style="margin-left: 50%;">赞(${dynamic.demo_Praise })</p>
						<hr />
					</p>
				</div>
			</c:forEach>
	<hr width="100%" align="center"/>
	<div style="width: 100%; margin: 0px auto;" align="center">
		<a href="/Demo/index">Demo_首页</a>&nbsp; | &nbsp;
		<a href="/Demo/register">Demo_注册</a>&nbsp; | &nbsp;
		<a href="/Demo/login">Demo_登录</a>&nbsp; | &nbsp;
		<a href="https://github.com/LiuXingFu/Demo">Demo_源码</a>
		<p></p>
		<p>@2019 LiuXingFu Demo演示</p>
	</div>
		</div>
	</body>
</html>
