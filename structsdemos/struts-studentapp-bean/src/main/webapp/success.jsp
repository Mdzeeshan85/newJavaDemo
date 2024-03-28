<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Students  Details</h2>
<s:property value="student.studentName"/>
<s:property value="student.studentId"/>
<s:property value="student.department"/>
<s:property  value="student.email"/>


</body>
</html>