<%--
  Created by IntelliJ IDEA.
  User: Xiaotong
  Date: 2/13/2017
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home test page</title>
</head>
<body>
    This is a test page.
    <ul>
        <c:forEach var="name" items="${names}">
            <li>${name}</li>
        </c:forEach>
    </ul>

</body>
</html>
