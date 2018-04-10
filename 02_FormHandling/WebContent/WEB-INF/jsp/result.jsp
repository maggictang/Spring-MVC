<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC表单处理</title>
</head>
<body>
	<h2>提交的学生信息如下</h2>
	<table>
		<tr>
			<td>名称：</td>
			<td>${requestScope.name }</td>
			<!-- 是EL表达式中的一个隐含对象，类似request，如${requestScope.username }表示从request域中获取username属性对应的值，相当于request.getAttribute(“username”) -->
		</tr>
		<tr>
			<td>年龄：</td>
			<td>${requestScope.age }</td>
		</tr>
		<tr>
			<td>编号：</td>
			<td>${requestScope.id }</td>
		</tr>

	</table>
</body>
</html>