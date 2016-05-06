<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>reception</title>
</head>

<body>
<form:form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <table>

        <tr>
            <td><label form="firstName">firstName:</label></td>
            <td><input type="text" name="firstName" id="firstName"></td>
        </tr>
        <tr>
            <td><label form="lastName">lastName:</label></td>
            <td><input id="lastName" type="text" name="lastName"></td>
        </tr>
        <tr>
            <td><label form="birthDate">birthDate:</label></td>
            <td><input id="birthDate" type="date" name="birthDate"></td>
        </tr>
        <tr>
            <td><label form="gender">gender:</label></td>
            <td><input id="gender" type="radio" name="gender" value="1" checked> Male<br></td>
            <td><input type="radio" name="gender" value="2"> Female<br></td>
        </tr>
        <tr>
            <td><label form="phone">phone:</label></td>
            <td><input type="text" id="phone" name="phone"></td>
        </tr>
        <tr>
            <td><label form="address">address:</label></td>
            <td><input type="text" id="address"/></td>
        </tr>
        <tr>
            <td><label form="address">nationalId:</label></td>
            <td><input type="text" id="nationalId"/></td>
        </tr>
        <tr>
            <td><input type="submit" name="_eventId_reception"
                       value="save"/></td>
        </tr>
    </table>

</form:form>

</body>
</html>
