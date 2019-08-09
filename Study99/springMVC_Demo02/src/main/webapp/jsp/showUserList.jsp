<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>ShowUserListPage</title>
</head>
<body>
<table border="1" align="center" width="100%">
    <tr>
        <th>userID</th>
        <th>userNAME</th>
        <th>userADDR</th>
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
