<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/6/2017
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="city" method="post">
    <form:input path="name"/>
    <select name="countryId">
        <c:forEach var="country" items="${countries}">
            <option value="${country.id}">${country.name}</option>
        </c:forEach>
    </select>
    <button>Save</button>
</form:form>

<ul>
    <c:forEach var="city" items="${cities}">
        <li>${city.name}<a href="/deleteCity/${city.id}">Delete</a><a href="/updateCity/${city.id}">Update</a></li>
    </c:forEach>
</ul>
</body>
</html>
