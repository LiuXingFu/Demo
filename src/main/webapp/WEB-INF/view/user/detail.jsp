<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<th colspan="2">${sessionScope.user.demo_Name }的详情</th>
		</tr>
		<tr>
			<th>账号</th>
			<td>
				${sessionScope.user.demo_User }
			</td>
		</tr>
		<tr>
			<th>用户名</th>
			<td>
				<input type="text" name="" value="${sessionScope.user.demo_Name }"/>
			</td>
		</tr>
		<tr>
			<th>性别</th>
			<td>
				${sessionScope.user.demo_Sex }
			</td>
		</tr>
		<tr>
			<th>邮箱</th>
			<td>
				${sessionScope.user.demo_Email }
			</td>
		</tr>
		<tr>
			<th>所在地</th>
			<td>
				${sessionScope.user.demo_Address }
			</td>
		</tr>
		<tr>
			<th>个性签名</th>
			<td>
				${sessionScope.user.demo_Explain }
			</td>
		</tr>
		<tr>
			<th>界面颜色</th>
			<td><input type="color" value="${sessionScope.user.demo_Color }"/></td>
		</tr>
	</table>
</body>
</html>