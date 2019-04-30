<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo_更新头像</title>
</head>
<body>
	<img alt="" src="/Demo/img/${sessionScope.user.demo_userImg }" style="width: 50px; height: 50px;">
	<form action="/Demo/updateImg" method="post" enctype="multipart/form-data">
		<input type="file" name="fileImg"/>
		<input type="submit" value="确定"/>
	</form>
</body>
</html>