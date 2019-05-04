<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/Demo/css/public.css"/>
<title>Demo_用户信息更改</title>
<style type="text/css">
	body {
		width: 100%;
		height: 100%;
		background-color: ${sessionScope.user.demo_Color };
	}
	#demo_div {
		width: 50%;
		margin: 0px auto;
		border: 1px solid red;
		background-color: #f2f3f5;
	}
	#user_div {
		width: 50%;
		margin: 0px auto;
		margin-top: 20px;
	}
</style>
</head>
<body>
<div id="demo_div">
	<div id="user_div">
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
		<p></p>
		<form action="${pageContext.request.contextPath }/updateUser" method="post">
			<input type="hidden" name="demo_ID" value="${sessionScope.user.demo_ID }"/>
			<input type="hidden" name="demo_Password" value="${sessionScope.user.demo_Password }"/>
			<input type="hidden" name="demo_userImg" value="${sessionScope.user.demo_userImg }"/>	
			<table border="1">				
				<tr>
					<th colspan="2">
						<a href="/Demo/user_Img">
							<img alt="" src="/Demo/img/${sessionScope.user.demo_userImg }" style="width: 50px; height: 50px;">
						</a>
						<br/>
						${sessionScope.user.demo_Name }
						的详情
					</th>
				</tr>
				<tr>
					<th>账号</th>
					<td>
						<input type="text" name="demo_User" value="${sessionScope.user.demo_User }" readonly="readonly"/>
					</td>
				</tr>
				<tr>
					<th>用户名</th>
					<td>
						<input type="text" name="demo_Name" value="${sessionScope.user.demo_Name }"/>
					</td>
				</tr>
				<tr>
					<th>性别</th>
					<td>
						<input type="radio" name="demo_Sex" value="男" ${sessionScope.user.demo_Sex=="男"?"checked":""}/>男
						&nbsp;
						<input type="radio" name="demo_Sex" value="女" ${sessionScope.user.demo_Sex=="女"?"checked":""}/>女
					</td>
				</tr>
				<tr>
					<th>生日</th>
					<td><input type="date" name="demo_Date" value="${sessionScope.user.demo_Date }" /></td>
				</tr>
				<tr>
					<th>邮箱</th>
					<td>
						<input type="email" name="demo_Email" value="${sessionScope.user.demo_Email }"/>
					</td>
				</tr>
				<tr>
					<th>所在地</th>
					<td>
						<input type="text" name="demo_Address" value="${sessionScope.user.demo_Address }"/>
					</td>
				</tr>
				<tr>
					<th>个性签名</th>
					<td>
						<input type="text" name="demo_Explain" value="${sessionScope.user.demo_Explain }"/>
					</td>
				</tr>
				<tr>
					<th>界面颜色</th>
					<td><input type="color" name="demo_Color" value="${sessionScope.user.demo_Color }"/></td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="submit" value="修改"/>
						&nbsp;&nbsp;
						<a href="/Demo/index">返回</a>
					</th>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>