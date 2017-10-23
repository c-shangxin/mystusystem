<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h2>修改员工</h2>
<s:form method="post" action="empAction_doupdateEmp">
<s:hidden name="emp.eno"/>
	员工性别:<s:textfield name="emp.ename" /><br/>
	员工年龄:<s:textfield name="emp.eage"/><br/>
	员工性别:<s:radio list="{'男','女'}"  name="emp.esex" /><br>
	所在部门:<s:select list="#request.deptList" name="emp.dept.dno" listKey="dno" listValue="dname" headerKey="" />
	<s:submit value="修改" />
</s:form>
</body>
</html>