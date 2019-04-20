<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>

<style type="text/css">
* {
	margin: 0;
	padding: 0;
} /*清除网页自带的边距*/
body {
	width: 100%;
	height: 100%;
	background-image: url(/Demo/img/bg.jpg);
}
iframe {
	width: 100%;
}
</style>

</head>
<body>

	<iframe src="/Demo/demo_login" name="demo_top" frameborder="0" height="45" scrolling="no"></iframe>
	<iframe src="/Demo/index" name="demo_bottom" frameborder="0" height="900" scrolling="no"></iframe>

</body>
</html>