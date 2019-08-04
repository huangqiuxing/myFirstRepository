<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎来到首页</h1>
	<hr>
	<form action="hello/myFormatter2">   <!-- 注意: hello前面不能带/ -->
		<input value="" id="username" name="username" placeholder="请输入姓名"> <br>
		<input value="" id="password" name="password" placeholder="请输入密码"> <br>
		<input value="" id="phoneNumberModel" name="phoneNumberModel" placeholder="请输入电话号码"> <br>
		<button type="submit">提交</button>
	</form>
</body>
</html>