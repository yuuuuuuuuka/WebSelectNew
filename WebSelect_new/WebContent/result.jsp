<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// Servletのデータ受け取り,Servletから呼び出されるJsp
	request.setCharacterEncoding("UTF8");
	String strServlet = (String) request.getAttribute("fromServlet");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
数字：
	<%=strServlet%>
</body>
</html>