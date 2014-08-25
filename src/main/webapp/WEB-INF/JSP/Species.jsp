<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<html>
<head>
        <script>
            var speciesValue = document.getElementByNames("speciesList").value;
        </script>
</head>
<body>
    <h1>species</h1>
    <form:form modelAttribute="pizza">
        <form:select path="species">
              <form:option value ="bakeware" label="BAKEWARE"/>
              <form:option value ="thick" label="THICK"/>
              <form:option value ="crisp" label="CRISP"/>
        </form:select>
        <input type="submit" id="confirm" name="_eventId_confirm" value="Confirm"/>
    </form:form>
</body>
</html>