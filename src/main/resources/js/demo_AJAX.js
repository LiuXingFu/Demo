function createXMLHttpRequest() {
	/* 创建异步请求对象 */
	try {
		return new XMLHttpRequest(); //大多数浏览器
	} catch (e) {
		try {
			return ActiveXObject("Msxml2.XMLHTTP"); //IE6.0
		} catch (e) {
			try {
				return ActiveXObject("Microsoft.XMLHTTP"); //IE5.0之前的版本
			} catch (e) {
				alert("哇，你这是什么浏览器呀");
				throw e;
			}
		}
	}
}