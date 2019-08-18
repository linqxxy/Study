<%--
  Created by IntelliJ IDEA.
  User: 王文汉
  Date: 2019/8/8
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>showusers</title>
</head>
<body>
<table border="1px" align="center" width="100%">
    <tr>
        <th>userId</th>
        <th>userName</th>
        <th>userAddr</th>
    </tr>
    <c:forEach items="${userListKey}" var="uservar">
        <tr>
            <td>${uservar.userId}</td>
            <td>${uservar.userName}</td>
            <td>${uservar.userAddr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
