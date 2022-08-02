<%--
  Created by IntelliJ IDEA.
  User: moqil
  Date: 2022/7/24
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick23" method="post" enctype="multipart/form-data">
    <input type="text" name="username"><br/>
    <input type="file" name="uploadFile"><br/>
    <input type="file" name="uploadFile"><br/>

    <input type="submit" value="提交">
    </form>
</body>
</html>
