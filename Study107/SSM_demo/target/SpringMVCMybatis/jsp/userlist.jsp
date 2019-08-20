<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>UserList</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">

    <script type="text/javascript">
        function chooseUser(row, obj) {
            row = parseInt(row);
        }

        function operate(param) {
            var selUser = document.getElementsByName("selUser");
            var index = 0;
            for (var i = 0; i < selUser.length; i++) {
                if (selUser[i].checked) {
                    index++;
                }
            }
            if (index == 0) {
                alert("请选择要操作的对象数据");
            } else if (index == 1 && param == 'checkboxUpdate') {
                userinforForm.action = 'modifyUserInfo.action';
                userinforForm.submit();
            } else if (index >= 1 && param == 'deleteUser') {
                userinforForm.action = 'deleteByIds.action';
                userinforForm.submit();
            } else if(index >= 1 && param == 'checkboxUpdateUsers') {
                userinforForm.action = 'modifyUsersInfo.action';
                userinforForm.submit();
            } else {
                alert(param + "最多选择一条数据");
            }
        }

        function checkAll() {
            var selUser = document.getElementsByName("selUser");
            var chooseAll = document.getElementsByName("chooseAll")[0].checked;
            for (var i = 0; i < selUser.length; i++) {
                selUser[i].checked = chooseAll;
            }
        }
    </script>
</head>
<body>
<form action="queryUser.action" name="userinforForm" method="post">
    <table border="0" align="right">
        <tr>
            <td>
                <input type="button" name="addbtn" value="新增" onclick="window.location.href='./jsp/addUsers.jsp'"
                       class="btn"/>
                <input type="button" name="modbtn" value="修改" onclick="operate('checkboxUpdate')" class="btn"/>
                <input type="button" name="delbtn" value="删除" onclick="operate('deleteUser')" class="btn"/>
                <input type="button" name="selbtn" value="查询" onclick="window.location.href='queryUser.action'"
                       class="btn"/>
                <input type="button" name="modsbtn" value="批量修改" onclick="operate('checkboxUpdateUsers')" class="btn">
            </td>
        </tr>
    </table>
    用户列表
    <table width="100%" border="1">
        <tr>
            <td>
                查询条件
                <input type="text" name="userEx.username"/>
                <input type="submit" value="名称查询"/>
            </td>
        </tr>
    </table>
    <table width="100%" border="1">
        <tr>
            <td><input type="checkbox" name="chooseAll" onclick="checkAll()"/></td>
            <td>UserName</td>
            <td>UserSex</td>
            <td>Birthday</td>
            <td>UserAddress</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${userListKey}" var="user">
            <tr>
                <td><input type="checkbox" name="selUser" value="${user.id}"></td>
                <td>${user.username}</td>
                <td>${user.sex}</td>
                <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                <td>${user.address}</td>
                <td>
                    <a href="deleteById.action?id=${user.id}">删除</a>
                    <a href="modifyUserInfo.action?id=${user.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>

</html>