<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="0" bgcolor="#DCDCDC">
		<tr>
			<th>指导老师编号</th>
			<th>指导老师姓名</th>
			<th>所管理的学生</th>
		</tr>
	<c:forEach items="${teachers_List }" var="teachers" varStatus="teac">
		<tr>
			<td>${teachers.teachers_ID }</td>
			<td>${teachers.teachers_Name }</td>
				<td>
					<select>
						<c:forEach items="${teachers.town_2016_List }" var="university" varStatus="teac_univer">
							<option>姓名&nbsp;${university.student_Name } &nbsp; 班级&nbsp;${university.theClass } &nbsp;
									 账号&nbsp;${university.account } &nbsp; 密码&nbsp;${university.student_Password }
							</option>
						</c:forEach>
					</select>
				</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>