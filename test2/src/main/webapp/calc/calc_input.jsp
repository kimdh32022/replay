<%--
  Created by IntelliJ IDEA.
  User: kimdh
  Date: 25. 4. 3.
  Time: 오후 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--action은 서버에 전달할 경로를 말함.--%>
<form action="calc_result.jsp" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <button type="submit">전송</button>
</form>
</body>
</html>
