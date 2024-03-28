<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="details">
<%-- <s:textfield name="student.studentName" label="StudentName"></s:textfield> --%>
<s:textfield name="student.studentName" label="StudentName"></s:textfield>
<s:textfield name="student.studentId"  label="StudentId"></s:textfield>
<s:textfield name="student.department" label="department"></s:textfield>
<s:textfield name="student.email" label="email"></s:textfield>
<s:submit  value="submit"></s:submit>
</form>
</body>
</html>