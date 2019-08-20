<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>

<body>
<form action="editUsersSubmit.action" method="post">
    <%--@elvariable id="userVOKey" type="com.linqxxy.po.UserVO"--%>
    <c:forEach items="${userExListKey}" var="userEx" varStatus="status">
    <table border="1" align="center" width="100%">
        <tr>
            <td>UserId</td>
            <td>
                <input type="text" name="userExList[${status.index}].id" value="${userEx.id}" readonly="readonly"/>
            </td>
        </tr>
        <tr>
            <td>UserName</td>
            <td>
                <input type="text" name="userExList[${status.index}].username" value="${userEx.username}"/>
            </td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td>
                <input type="text" name="userExList[${status.index}].birthday"
                       value="<fmt:formatDate value="${userEx.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/> ">
            </td>
        </tr>
        <tr>
            <td>Sex</td>
            <td>
                <input type="text" name="userExList[${status.index}].sex" value="${userEx.sex}"/>
            </td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                <input type="text" name="userExList[${status.index}].address" value="${userEx.address}"/>
            </td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
