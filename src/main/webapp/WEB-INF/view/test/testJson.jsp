<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var JSONObject = uesr_List;
	document.getElementById("id").innerHTML = JSONObject.demo_ID;
</script>
</head>
<body>
ID<span id="id"></span><br>
账号<span id="user"></span><br>
密码<span id="password"></span><br>
用户名<span id="name"></span><br>
性别<span id="sex"></span><br>
邮箱<span id="email"></span><br>
地址<span id="address"></span><br>
说明<span id="explain"></span><br>


private Integer demo_ID; //ID
	private Integer demo_User; //账号
	private String demo_Password; //密码
	private String demo_Name; //用户名
	private String demo_Sex; //性别
	private String demo_Email; //邮箱
	private String demo_Address; //地址
	private String demo_Explain; //说明

</body>
</html>