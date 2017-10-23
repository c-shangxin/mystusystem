<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="650">
	<tr>
	<td>编号</td><td>部门名称</td>
	<td>员工姓名</td><td>年龄</td>
	<td>性别</td><td>管理</td>
	</tr>
	<s:iterator value="#request.empList" var="em" status="ids">
	<tr>
	<td>${ids.count }</td><td>${em[1].dname}</td>
	<td>${em[0].ename }</td><td>${em[0].eage}</td>
	<td>${em[0].esex }</td><td><a href="empAction_toupdateEmp?emp.eno=${em[0].eno }">修改</a>|
								<a href="empAction_dodeleteEmp?emp.eno=${em[0].eno }">删除</a></td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>







