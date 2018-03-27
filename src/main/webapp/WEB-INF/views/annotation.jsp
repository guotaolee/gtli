<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>springMVC注解</title>
</head>
<body>
<form action="/springMVC/user/addUser" method="post">
    <h>springMVC注解1</h><br/>
    <div>
        ${result}
    </div>
    <input type="submit" value="post请求">
</form>
</body>
</html>