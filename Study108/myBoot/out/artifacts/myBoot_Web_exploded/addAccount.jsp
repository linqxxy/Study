<%--
  Created by IntelliJ IDEA.
  User: 王文汉
  Date: 2019/8/21
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addAccount.action">
    <table width="100%" border="1">
        <tr>
            <th>用户名</th>
            <th>用户密码</th>
            <th>姓名</th>
        </tr>
        <tr>
            <td><input type="text" name="username"></td>
            <td><input type="text" name="password"></td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
