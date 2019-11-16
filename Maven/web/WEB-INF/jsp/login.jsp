<%--
  Created by IntelliJ IDEA.
  User: haya
  Date: 2019/9/27
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="account"><br>
    <input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
