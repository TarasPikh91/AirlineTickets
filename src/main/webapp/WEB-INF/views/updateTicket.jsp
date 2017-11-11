<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/10/2017
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="ticketToUpdate" method="post">
    <form:input path="numberSeat"/>
    <form:input path="price"/>
    <form:input path="currency"/>
    <select name="planeId">
        <option value="${ticketToUpdate.plane.id}">${ticketToUpdate.plane.name}</option>
        <c:forEach var="plane" items="${planes}">
            <option value="${plane.id}">${plane.name}</option>
        </c:forEach>
    </select>

    <select name="cityId">
        <option value="${ticketToUpdate.city.id}">${ticketToUpdate.city.name}</option>
        <c:forEach var="city" items="${cities}">
            <option value="${city.id}">${city.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Update</button>
</form:form>
</body>
</html>
