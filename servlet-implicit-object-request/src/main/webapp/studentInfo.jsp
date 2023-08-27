<%@page import="com.ty.Student"%>
<%@ page import="com.ty.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  Student s=(Student) session.getAttribute("student");
 String name=(String) session.getAttribute("name");

%>
<h1>name <%=s.getName()%></h1>
<h1>Email <%=s.getEmail() %></h1>
<h1>name <%=name %></h1>
</body>
</html>