<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AJAX</title>
<script src="/Demo/js/demo_AJAX.js"></script>
<script type="text/javascript">
	//文档加载完成后立马加载
	window.onload = function() {
		//得到but元素
		var but = document.getElementById("but");
		//给but注册事件监听器
		but.onclick = function() {
			/** 得到服务器响应把内容显示到页面 **/
	
			//得到异步对象
			var xmlHttp = createXMLHttpRequest();
			//打开域服务器的链接：1.请求方式  ， 2.请求URL地址 ， 3.是否为异步请求
			xmlHttp.open("GET" , "http://localhost/Demo/demo_AJAX" , true);
			//发送请求：GET请求没有实体，但也要给null，不然FireFox可能不会发送
			xmlHttp.send(null);
			
			/** 给异步对象的onreadystachange事件注册监听器 **/
			xmlHttp.onreadystatechange = function() { //当xmlHttp的状态发生改变时执行
				//双重判断：4，响应结束 ， 200，响应成功
				if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
					//获取服务器响应结束
					var text = xmlHttp.responseText;
					alert(text);
					var num = eval("("+text+")");
					alert(num);
					
				    var table = document.getElementById("table");
					alert("124");
				    for(var i=0 ; i<num.length ; i++){
				        var row = table.insertRow(table.rows.length);
				        var c1 = row.insertCell(0);
				        c1.innerHTML = num[i].student_ID;
				        var c2 = row.insertCell(1);
				        c2.innerHTML = num[i].student_Name;
				        var c3 = row.insertCell(2);
				        c3.innerHTML = num[i].course_Quantity; 
				        var c4 = row.insertCell(3);
				        c4.innerHTML = num[i].javaEE;
				        var c5 = row.insertCell(4);
				        c5.innerHTML = num[i].jquery;
				        var c6 = row.insertCell(5);
				        c6.innerHTML = num[i].undergraduate_innovate_education;
				        var c7 = row.insertCell(6);
				        c7.innerHTML = num[i].artAppreciation;
				        var c8 = row.insertCell(7);
				        c8.innerHTML = num[i].enterpriseProjectDevelopment;
				        var c9 = row.insertCell(8);
				        c9.innerHTML = num[i].softwareTestTechnology;
				        var c10 = row.insertCell(9);
				        c10.innerHTML = num[i].softwareOutsourcingEnglish;
				        var c11 = row.insertCell(10);
				        c11.innerHTML = num[i].literatureAppreciation;
				        var c12 = row.insertCell(11);
				        c12.innerHTML = num[i].danceAppreciation;
				        var c13 = row.insertCell(12);
				        c13.innerHTML = num[i].formAndPolicy;
				        var c14 = row.insertCell(13);
				        c14.innerHTML = num[i].speechAndEloquence;
				    }
				}				
			};
		};
	};
</script>
</head>
<body>
<button id="but">wode</button>
	<table>
		<tr>
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
	</table>
</body>
</html>