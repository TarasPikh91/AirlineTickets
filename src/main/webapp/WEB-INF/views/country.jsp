<<<<<<< HEAD
=======
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/6/2017
  Time: 8:46 PM
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
<form:form modelAttribute="country" method="post">
    <form:input path="name"/>
    <button type="submit">Save</button>
</form:form>

<ul>
    <c:forEach var="country" items="${countries}">
        <li>${country.name}<a href="/deleteCountry/${country.id}">Delete</a><a href="/updateCountry/${country.id}">Update</a></li>
    </c:forEach>
</ul>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
</body>
</html>
