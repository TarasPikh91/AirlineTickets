<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/6/2017
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="ticket" method="post">
    <form:input path="numberSeat"/>
    <form:input path="currency"/>
    <form:input path="price"/>
    <select name="planeId">
        <c:forEach var="plane" items="${planes}">
            <option value="${plane.id}">${plane.name}</option>
        </c:forEach>
    </select>
    <select name="cityId">
        <c:forEach var="city" items="${cities}">
            <option value="${city.id}">${city.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Save</button>
</form:form>
<ul>
    <c:forEach var="ticket" items="${tickets}">
        <li>${ticket.numberSeat}<a href="/deleteTicket/${ticket.id}">Delete</a><a href="/updateTicket/${ticket.id}">Update</a></li>
    </c:forEach>
</ul>
</body>
</html>
