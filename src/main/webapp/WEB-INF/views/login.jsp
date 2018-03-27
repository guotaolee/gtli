<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    欢迎~~~
    <form action="/springMVC/user/addUser" method="post">
        用户名: <input type="text" name="userName" value="${username}"></br>
        密码:   <input type="password" name="password" value="${password}">
        <img src="../img/a.jpg" alt="图片">
        <button type="submit">登录</button>
    </form>
</body>
</html>