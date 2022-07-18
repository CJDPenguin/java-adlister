<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: theportableone
  Date: 7/18/22
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products Page</title>
</head>
<body>
<h1>Viewing All Products</h1>
<jsp:useBean id="ads" scope="request" type="java.util.List"/>
<c:forEach var="ad" items="${ads}">
    <h2>${ad.getTitle()}</h2>
    <p>Description: ${ad.getDescription()}</p>
</c:forEach>
</body>
</html>
