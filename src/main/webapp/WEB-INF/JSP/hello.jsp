<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<%@ page session="false"%>
<html>
<head>
</head>
<body>
    <h3>Hello,how are you</h3>
    <spring:message code="hello"/>
    <spring:message code="name"/>
</body>
</html>
