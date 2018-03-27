<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>springMVC注解</title>
    <script type="text/javascript">
        function addUser(){
            var from = document.forms[0];
            from.action = "/springMVC/user/addUser";
            from.method = "post";
            from.submit();
        }

        $(document).ready(function(){
            $("#add").click(function(){
                alert("fefefe ");
                var username = $("#userName").attr("value");
                var password = $("#passWord").attr("value");

                var user = {userName:userName,passWord:password};

                $.ajax({
                    url:"/springMVC/user/addUserJson",
                    type:"post",
                    date:user,
                    success:function(date){
                        alert("userName--------->" + date.userName + "passWord------>" + date.passWord);
                    }
                })

            })
        })
    </script>
</head>
<body>
<form action="/springMVC/user/addUser" method="post">
    <table>
        <tr>新建用户</tr>
        <tr>
            <td>用户名: <input id = "userName" type="text" name="userName" value="${user.userName}"></td>
            <td>密码:   <input id = "passWord" type="password" name="passWord" value="${user.passWord}"></td>
        </tr>
        <tr><input type="button" value="js提交" onclick="addUser()"></tr>
        <tr><input id = "add" type="button" value="json和ajax提交11" ></tr>
        <tr>
            <td><a href="/springMVC/message/query">信息列表</a></td>
        </tr>
    </table>
</form>
</body>
</html>