<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/updateUser" method="post">
		<input type="hidden" name="demo_ID" value="${sessionScope.user.demo_ID }"/>
		<input type="hidden" name="demo_Password" value="${sessionScope.user.demo_Password }"/>		
		<table align="center" border="1">				
			<tr>
				<th colspan="2">
					${sessionScope.user.demo_Name }
				的详情</th>
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
				<th colspan="2"><input type="submit" value="修改"/></th>
			</tr>
		</table>
	</form>
</body>
</html>