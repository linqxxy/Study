<%--
  Created by IntelliJ IDEA.
  User: 王文汉
  Date: 2019/8/21
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>showAllAccounts</title>
</head>
<body>
<form action="hello">
    <table width="100%" border="1">
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>姓名</th>
        </tr>
        <c:forEach items="${accountListKey}" var="account">
            <tr>
                <td>${account.username}</td>
                <td>${account.password}</td>
                <td>${account.name}</td>
            </tr>
        </c:forEach>
        <tr>
            <td><input type="submit" value="OK"></td>
        </tr>
    </table>
</form>
</body>
</html>
