<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	&nbsp;&nbsp;
	<a href="/Demo/index" target="demo_bottom">首页</a>
<c:if test="${user.demo_Name == null }">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/Demo/register" target="demo_bottom">注册</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/Demo/login" target="demo_bottom">登录</a>
</c:if>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${user.demo_Name != null }">
	当前用户：<a href="/Demo/user/detail" target="demo_bottom">${user.demo_Name }</a> 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/Demo/exit" target="demo_top">退出登录</a>
</c:if>
	&nbsp; ${error }
</body>
</html>