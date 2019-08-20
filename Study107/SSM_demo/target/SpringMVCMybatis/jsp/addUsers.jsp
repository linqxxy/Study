<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/8/16
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <title>AddUser</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
</head>
<body>
    <form action="../addUserOperator.action" method="post">
        UserName    : &nbsp;<input type="text" name="userName"/><br>
        UserBirthday: &nbsp;&nbsp;<input type="text" name="userBirthday"/><br>
        UserSex     : &nbsp;<input type="text" name="userSex"/><br>
        UserAddress : &nbsp;&nbsp;<input type="text" name="userAddress"/><br>
        <input type="submit" name="AddUser">
        <input type="reset" name="Reset">
    </form>
</body>
</html>
