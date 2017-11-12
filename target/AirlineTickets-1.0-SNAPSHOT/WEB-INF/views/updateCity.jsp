<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/10/2017
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="cityToUpdate" method="post">
    <form:input path="name"/>
    <select name="countryId">
        <option value="${cityToUpdate.country.id}">${cityToUpdate.country.name}</option>
        <c:forEach var="country" items="${cityCountries}">
            <option value="${country.id}">${country.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Update</button>
</form:form>
</body>
</html>
