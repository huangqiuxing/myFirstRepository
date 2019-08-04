<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 导入spring和form标签 -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- phoneNumber:<spring:bind path="model">${status.value}</spring:bind><br/> --%>
	<!-- eval格式化 -->
	<%-- phoneNumber:<spring:eval expression="model"></spring:eval><br/>  --%>
	<%-- phoneNumber:<spring:eval expression="user.phoneNumberModel"></spring:eval><br/> --%>
	<!-- commandName值是已存域中的K值 -->
	<form:form commandName="user">
		<!-- path值是已存域中的实体类的属性 -->
		<form:input path="username" />
		<br />
		<form:input path="password" />
		<br />
		<form:input path="phoneNumberModel" />
		<br />
		<!-- 错误提示标签 -->
		<%-- <form:errors path="*" cssStyle="color:red"></form:errors> --%>
	</form:form>
</body>
</html>