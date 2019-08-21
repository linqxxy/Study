<%--
  Created by IntelliJ IDEA.
  User: 王文汉
  Date: 2019/8/21
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="hello">
    <table>
        <tr>
            <td>
                <input type="text" name="1">
            </td>
        </tr>
    </table>
    <table width="100%" border="1">
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>姓名</th>
        </tr>
        <tr>
            <td>${accountKey.username}</td>
            <td>${accountKey.password}</td>
            <td>${accountKey.name}</td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="OK">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
