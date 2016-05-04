<%--
  Created by IntelliJ IDEA.
  User: A.amouzesh
  Date: 14/12/15
  Time: 06:10 م
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<tiles:insertAttribute name="header"/>

<hr/>

<tiles:insertAttribute name="content"/>

<hr/>

<tiles:insertAttribute name="footer"/>

</body>
</html>
