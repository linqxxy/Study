<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>
<body>
<form action="editSubmit.action?id=${userKey.id}" method="post">
    <table border="1" align="center" width="100%">
        <tr>
            <td>UserName</td>
            <td>
                <input type="text" name="username" value="${userKey.username}" />
            </td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td>
                <input type="text" name="birthday" value="<fmt:formatDate value="${userKey.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/> ">
            </td>
        </tr>
        <tr>
            <td>Sex</td>
            <td>
                <input type="text" name="sex" value="${userKey.sex}" />
            </td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                <input type="text" name="address" value="${userKey.address}" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
