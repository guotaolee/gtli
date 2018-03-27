<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form action="/springMVC/message/query" method="post">
        <fieldset>
            <div>
                演示字段1<input type="text" />
            </div>
            <div>
                演示字段2<input type="text" />
            </div>
        </fieldset>
        <fieldset>
            <legend>内容列表</legend>
            <table>
                <thead>
                    <tr>
                        <td><input type="checkbox" id = "all" onclick="#" /></td>
                        <td>序号</td>
                        <td>演示字段1</td>
                        <td>演示字段2</td>
                        <td>演示字段3</td>
                        <td>操作</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="message" items="${messageList}" varStatus="status">
                        <c:if test="${status.index % 2 != 0}"></c:if>
                        <tr <c:if test="${status.index % 2 != 0}">style="background-color: #ECF6EE"</c:if>>
                            <td><input type="checkbox" /></td>
                            <td>${status.index + 1}</td>
                            <td>${message.command}</td>
                            <td>${message.description}</td>
                            <td>${message.content}</td>
                            <td>
                                <a href="#">修改</a>
                                <a href="#">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </fieldset>
    </form>
</body>
</html>
