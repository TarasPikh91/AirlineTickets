<<<<<<< HEAD
=======
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/6/2017
  Time: 8:50 PM
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
<form:form modelAttribute="plane" method="post">
    <form:input path="name" placeholder="Plane Name"/>
    <form:input path="type" placeholder="Type"/>
    <form:input path="seat" placeholder="Number of seats"/>
    <select name="companyId">
        <c:forEach var="company" items="${companies}">
            <option value="${company.id}">${company.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Save</button>
</form:form>
<ul>
<c:forEach var="plane" items="${planes}">
  <li>${plane.name}<a href="/deletePlane/${plane.id}">Delete</a><a href="/updatePlane/${plane.id}">Update</a></li>
</c:forEach>
</ul>
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
</body>
</html>
