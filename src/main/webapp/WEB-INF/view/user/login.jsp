<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/Demo/css/public.css"/>
<title>Demo__用户登录</title>
<style type="text/css">
	body {
		width: 100%;
		height: 100%;
		background-color: ${sessionScope.user.demo_Color };
	}
	table {
		width: 100%;
	}
</style>
</head>
<body>
<div style="width: 30%; margin-left: 30%;">
	<a href="/Demo/index" target="demo_bottom">首页</a>
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
	<form action="${pageContext.request.contextPath }/user_login" method="post">
		<table align="left" border="1">
			<tr>
				<th>用户名</th>
				<td>
					<input type="text" name="demo_User"/>
				</td>
			</tr>
			<tr>
				<th>密码</th>
				<td>
					<input type="password" name="demo_Password"/>
				</td>
			</tr>
			<tr>
				<th>验证码<img src="${pageContext.request.contextPath }/imgCode" /></th>
				<td>
					<input type="text" name="code"/>
				</td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="登录"/>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>