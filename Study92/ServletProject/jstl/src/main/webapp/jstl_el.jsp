<%@ page import="com.linqxxy.ov.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/27
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>测试EL表达式</h1>
<p/>
<li>普通字符串测试</li><br>
strKey: <%=request.getAttribute("strKey")  %>  <br>
strKey1(EL): ${requestScope.strKey} <br>
strKey2(EL): ${strKey} <br>
strKey3(EL): ${pageScope.strKey} <br>

<li>结构测试</li><br>
userInfo(username/groupName):<br>
<%
    UserInfo userInfo = (UserInfo) request.getAttribute("userInfoKey");
%>

<%=userInfo.getUsername()%>
<%=userInfo.getGroup().getgName()%><br>
userInfo(username/groupName)[EL]:<br>
${requestScope.userInfoKey.username}
${requestScope.userInfoKey.group.gName}<br>

<li>字符数组测试</li><br>
strArr(EL)<br>
strArr[0] : ${strArrKey[0]}<br>
strArr[1] : ${strArrKey[1]}<br>
strArr[2] : ${strArrKey[2]}<br>
strArr[3] : ${strArrKey[3]}<br>

<li>自定义数组测试</li><br>
userInfosKey(EL)<br>
userInfosKey[0] : ${userInfosKey[0]}<br>
userInfosKey[1] : ${userInfosKey[1]}<br>
userInfosKey[2] : ${userInfosKey[2]}<br>
userInfosKey[3] : ${userInfosKey[3]}<br>
userInfosKey[4] : ${userInfosKey[4]}<br>
</body>
</html>
