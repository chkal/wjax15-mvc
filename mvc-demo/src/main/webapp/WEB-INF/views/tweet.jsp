<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MVC Demo</title>
  </head>
  <body>

    <c:if test="${not empty message}">
      <h1>${message}</h1>
    </c:if>

    <form action="${mvc.basePath}/tweet" method="POST">

      <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}"/>

      Bitte geben Sie einen Text ein:
      <input type="text" name="status"/>

      <input type="submit" value="Absenden"/>

    </form>

  </body>
</html>
