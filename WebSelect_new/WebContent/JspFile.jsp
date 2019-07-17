<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a>選んでね！</a>

	<form action="<%=request.getContextPath()%>/JspServlet" method="post">
		<br />
			<select name="fromJsp">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			</select>
		<input type="submit" value="実行" />
	</form>


</body>
</html>