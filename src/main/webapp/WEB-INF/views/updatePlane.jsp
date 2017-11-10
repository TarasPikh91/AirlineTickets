<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/10/2017
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="planeToUpdate" method="post">
    <label>Name</label>
    <form:input path="name"/>
    <label>Seat</label>
    <form:input path="seat"/>
    <form:input path="type"/>
    <select name="companyId">
            <option value="${planeToUpdate.company.id}">${planeToUpdate.company.name}</option>
        <c:forEach var="company" items="${companies}">
            <option value="${company.id}">${company.name}</option>
        </c:forEach>
    </select>
    <button>Update</button>
</form:form>
</body>
</html>
