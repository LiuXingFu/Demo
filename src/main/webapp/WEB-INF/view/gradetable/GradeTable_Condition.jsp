<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成绩</title>
</head>
<body>
	<table align="center" border="1">
		<tr align="center">
			<th>学号</th>
			<th>姓名</th>
			<th>课程门数</th>
			<th>JavaEE高级编程</th>
			<th>JQuery应用开发</th>
			<th>大学生创新创业教育</th>
			<th>美术鉴赏</th>
			<th>企业项目开发(一)</th>
			<th>软件测试技术</th>
			<th>软件外包英语(一)</th>
			<th>文学鉴赏</th>
			<th>舞蹈鉴赏</th>
			<th>形式与政策(4)</th>
			<th>演讲与口才</th>
		</tr>
		<tr align="center">
			<td>${gradeTable.student_ID }</td>
			<td>${gradeTable.student_Name }</td>
			<td>${gradeTable.course_Quantity }</td>
			<td>${gradeTable.javaEE }</td>
			<td>${gradeTable.jquery }</td>
			<td>${gradeTable.undergraduate_innovate_education }</td>
			<td>${gradeTable.artAppreciation }</td>
			<td>${gradeTable.enterpriseProjectDevelopment }</td>
			<td>${gradeTable.softwareTestTechnology }</td>
			<td>${gradeTable.softwareOutsourcingEnglish }</td>
			<td>${gradeTable.literatureAppreciation }</td>
			<td>${gradeTable.danceAppreciation }</td>
			<td>${gradeTable.formAndPolicy }</td>
			<td>${gradeTable.speechAndEloquence }</td>
		</tr>
	</table>
</body>
</html>