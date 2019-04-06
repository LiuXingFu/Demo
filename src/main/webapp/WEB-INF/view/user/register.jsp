<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo__用户注册</title>

<script type="text/javascript">
	function validate() {
		var p1 = document.getElementById("password").value;
		var p2 = document.getElementById("testpassword").value;
		if (p1 != p2) {
			alert("输入的两次密码不一致！");
			return false;
		}
	}
</script>

</head>
<body>
	
	<form action="${pageContext.request.contextPath }/user_register" method="post">
		<table align="center" border="1">
			<tr>
				<th>输入用户名</th>
				<td><input type="text" name="demo_Name" /></td>
			</tr>
			<tr>
				<th>输入密码</th>
				<td><input type="password" id="password"/></td>
			</tr>
			<tr>
				<th>确定密码</th>
				<td><input type="password" name="demo_Password" id="testpassword" /></td>
			</tr>
			<tr>
				<th>性别</th>
				<td><input type="text" name="demo_Sex" /></td>
			</tr>
			<tr>
				<th>邮箱</th>
				<td><input type="text" name="demo_Email" /></td>
			</tr>
			<tr>
				<th>居住地址</th>
				<td><input type="text" name="demo_Address" /></td>
			</tr>
			<tr>
				<th>个人说明</th>
				<td><input type="text" name="demo_Explain" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="注册" onclick="return validate()" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>