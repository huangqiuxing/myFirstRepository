<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入form标签 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form commandName="user">
		<form:errors path="username" cssStyle="color:red">用户名不能为空</form:errors><br>
		<form:errors path="password" cssStyle="color:red">密码不能为空</form:errors><br>
		<form:errors path="phoneNumberModel" cssStyle="color:red">电话号码不能为空</form:errors>
	</form:form>
</body>
</html>