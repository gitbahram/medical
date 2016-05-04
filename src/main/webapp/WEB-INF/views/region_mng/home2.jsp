<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
${status}

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

<form method="post">
  <input name="regionName" />
  <input type="submit" name="_eventId" value="editEmployee"/>
</form>


