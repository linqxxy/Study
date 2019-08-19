<%--
  Created by IntelliJ IDEA.
  User: 比特科技
  Date: 2019/6/26
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>EditPage</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>
<body>
<form action="${pageContext.request.contextPath}/editSubmits.action" method="post">
    <%--@elvariable id="userVOKey" type="com.liu.po.UserVO"--%>
    <c:forEach items="${itemsCustomsKey}" var="items" varStatus="status">
    <table border="1" align="center" width="100%">
        <tr>
            <td>name</td>
            <td>
                <input type="text" name="userExList[${status.index}].name" value="${items.name}"/>
            </td>
        </tr>
        <tr>
            <td>createtime</td>
            <td>
                <input type="text" name="userExList[${status.index}].createtime"
                       value="<fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> ">
            </td>
        </tr>
        <tr>
            <td>price</td>
            <td>
                <input type="text" name="userExList[${status.index}].price" value="${items.price}"/>
            </td>
        </tr>
        <tr>
            <td>detatl</td>
            <td>
                <input type="text" name="userExList[${status.index}].detail" value="${items.detail}"/>
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
