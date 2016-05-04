<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>

<h1> HI </h1>

<body>
<table border="1">
  <c:forEach items="${regionList}" var="region">
  <tr>
    <td>
      ${region.id}
    </td>
    <td>
        ${region.regionName}
    </td>
  </tr>
  </c:forEach>
</table>

</body>
</html>
