<%--
  Created by IntelliJ IDEA.
  User: moqil
  Date: 2022/7/24
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="${pageContext.request.contextPath}/user/quick14" method="post">
<%--            表明是第一个user对象的name age--%>
            <input type="text" name="userList[0].username"><br/>
            <input type="text" name="userList[0].age"><br/>
            <input type="text" name="userList[1].username"><br/>
            <input type="text" name="userList[1].age"><br/>
            <input type="submit" value="提交">
        </form>
</body>
</html>
