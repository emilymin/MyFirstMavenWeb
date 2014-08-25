<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<html>
<head>
</head>
<body>
    <h1>orderConfirmed</h1>
    <c:out value="${pizza.species}" default="${pizza}" /></br>

    <form:form modelAttribute="pizza">
        <input type="submit" id="_eventId_returnToIndex" name="_eventId_returnToIndex" value="OK"/>
    </form:form>
</body>
</html>