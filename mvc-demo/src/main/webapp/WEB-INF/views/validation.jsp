<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MVC Demo</title>
  </head>
  <body>

    <c:if test="${not empty validationMessages.messages}">
      <ul>
        <c:forEach var="message" items="${validationMessages.messages}">
          <li>${message}</li>
        </c:forEach>
      </ul>
    </c:if>

    <form action="${mvc.basePath}/validation" method="POST">

      Bitte geben Sie Ihren Namen ein:
      <input type="text" name="name"/>

      Bitte geben Sie Ihr Alter ein:
      <input type="text" name="age"/>

      <input type="submit" value="Absenden"/>

    </form>

  </body>
</html>
