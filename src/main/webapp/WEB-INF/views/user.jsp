<<<<<<< HEAD
=======
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/6/2017
  Time: 9:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<<<<<<< HEAD

=======
<ul>
    <c:forEach var="user" items="${users}">
        <li>${user.firstName}${user.lastName}<a href="/deleteUser/${user.id}">Delete</a><a href="/updateUser/${user.id}">Update</a></li>
    </c:forEach>
</ul>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
</body>
</html>
