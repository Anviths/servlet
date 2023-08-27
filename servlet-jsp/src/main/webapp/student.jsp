<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int i=10;
    public int add(int a,int b){
    	return a+b;
    }
%>
<%
int a=20;
int b=47;


%>
 <h1>i value is <%=1 %> <%= add(10,20) %></h1> 
 <h1>i value is <%=1 %> <%= add(a,b) %></h1> 
</body>
</html>