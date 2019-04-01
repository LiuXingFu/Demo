<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo__用户登录</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user_login" method="post">
		<table align="center" border="1">
			<tr>
				<th>用户名</th>
				<td>
					<input type="text" name="demo_Name"/>
				</td>
			</tr>
			<tr>
				<th>密码</th>
				<td>
					<input type="password" name="demo_Password"/>
				</td>
			</tr>
			<tr>
				<th>验证码<img src="http://localhost/Demo/imgCode" /></th>
				<td>
					<input type="text" name="code"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="登录"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>