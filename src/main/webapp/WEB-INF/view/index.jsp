<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#d_1{
		width:400px;
		margin: 10% 0px 0px 35%;
	}
</style>
</head>
<body>
<div id= d_1>

<p align="center">${index }</p><br>
<img alt="" src="image/01.jpg">
<table align="center" border="1">
	<tr>
		<th>序号</th>
		<th>IP</th>
		<th>Time</th>
	</tr>
	<!-- 遍历数据 -->
	<c:forEach items="${record_list }" var="record" varStatus="varSta">
	<tr>
		<td>${varSta.count }</td>
		<td>${record.record_IP }</td>
		<td>${record.record_Time }</td>
	</tr>
	</c:forEach>
</table>

</div>
</body>
</html>