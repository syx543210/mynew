<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>工资 </td>
			<td>所在部门</td>
		</tr>
		
		<c:forEach var="emp" items="${employeeList }">
			<tr>
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.salary }</td>
				<td>${emp.dept.deptName }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>