<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css" />
<script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" href="/Demo/css/public.css"/>
<title>Demo_指导老师</title>
<script>
	$(function() {
		$( "#accordion" ).accordion();
	});
</script>
<style type="text/css">
	* {
		margin:0;padding:0; /*去掉网页自带的边距*/
	}
	body {
		margin: 0px auto;
		width: 100%;
		height: 100%;
		background-color: ${sessionScope.user.demo_Color };
	}	
</style>
</head>
<body>
<div style="margin: 0px auto; width: 60%; margin-bottom: 10px; margin-top: 20px; background-color: #f2f3f5;">
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
</div>
<div style="margin: 0px auto; width: 60%; background-color: #f2f3f5;">
	<h3>指导老师</h3>
	<div id="accordion">
		<c:forEach items="${teachers_List }" var="teachers" varStatus="teac">
		<h3>${teachers.teachers_Name }</h3>	
			<div class="teachers">
				<table>
					<c:forEach items="${teachers.town_2016_List }" var="university" varStatus="teac_univer">
						<tr>
							<th style="width: 15%">&nbsp;${university.student_Name }</th>
							<th style="width: 40%">&nbsp;${university.theClass }</th>
							<th style="width: 25%">&nbsp;${university.account }</th>
							<th style="width: 20%">&nbsp;${university.student_Password }</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:forEach>
	</div>
</div>
</body>
</html>