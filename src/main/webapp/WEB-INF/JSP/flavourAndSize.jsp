<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8" %>
<html>
<head>
</head>
<body>
    <h1>flavourAndSize</h1>
    <h2>Choose your flavour</h2>
    <form>
        <select>
              <option value ="Mockba">Mockba</option>
              <option value ="Cheese">Cheese</option>
              <option value="Neapolitan">Neapolitan</option>
              <option value ="BAKEWARE">BAKEWARE</option>
              <option value ="Hawaiian">Hawaiian</option>
              <option value ="Meatza">Meatza</option>
        </select></br>
    </form>
    <h2>Choose your size</h2></br>
    <form>
        <select>
                  <option value ="19">19</option>
                  <option value ="23">23</option>
                  <option value="29">29</option>
                  </select></br>
        <a href="${flowExecutionUrl}&_eventId=submit">Submit</a>
    </form>
</body>
</html>