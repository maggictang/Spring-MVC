<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC表单处理</title>
</head>
<body>
	<h2>Student Information</h2>
	<form action="/02_FormHandling/addStudent" method="post">
		<table>
			<tr>
				<td>名字：</td>
				<td><input type="text" id="name" name="name"/></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" id="age" name="age"/></td>
			</tr>
			<tr>
				<td>编号：</td>
				<td><input type="text" id="id" name="id" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交表单" /></td>
			</tr>
		</table>
	</form>
</body>
</html>