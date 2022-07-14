<%--
  Created by IntelliJ IDEA.
  User: theportableone
  Date: 7/13/22
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
    <form action="login.jsp" method="post">
        <label for="username">Username: </label>
        <input type="text" name="username" id="username">
        <label for="password">Password: </label>
        <input type="password" name="password" id="password">
        <input type="submit">
    </form>
<c:if test='${param.username != null || param.password != null}'>
    <c:choose>
        <c:when test='${param.username.equals("admin") && param.password.equals("password")}'>
            <% response.sendRedirect("/profile.jsp"); %>
        </c:when>
        <c:otherwise>
            <% response.sendRedirect("/login.jsp"); %>
        </c:otherwise>
    </c:choose>
</c:if>
</body>
</html>
