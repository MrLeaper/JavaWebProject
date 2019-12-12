<%--
  Created by IntelliJ IDEA.
  User: leaper
  Date: 2019-11-20
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Login Page</title>
</head>
<body>
<hr><br>Welcome to this <font color="green">Login Page</font>!<br>
<form action="login" method="post">
    <br>
    <h1>Please input your message:</h1><br>
    用户名:&nbsp;&nbsp;<input type="text" name="name"><br>
    密&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input type="password" name="password"><br>
    <br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登陆">&nbsp;
    <a href="registered.jsp" color=blue>注册用户</a>

</form>

</body>
</html>
