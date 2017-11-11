<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 11/11/2017
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="userToUpdate">
    <label>First Name</label>
    <form:input path="firstName"/>

    <label>Last Name</label>
    <form:input path="lastName"/>

    <label>Email</label>
    <form:input path="email"/>

    <label>Password</label>
    <form:input path="password"/>

    <label>Phone Number</label>
    <form:input path="numberPhone"/>

    <button>Save</button>
</form:form>
</body>
</html>
