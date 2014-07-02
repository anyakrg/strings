<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<fmt:bundle basename="i18n.messages">
    <head>
        <title><fmt:message key="title"/> </title>
    </head>
    <body>
    <fmt:message key="main.input.text"/>

    <form action="${pageContext.request.contextPath}/controller" method="post">

        <p><textarea name="text" rows="30" cols="100">
            <%@include file="WEB-INF/input.txt" %>
        </textarea></p>

        <input type="submit" value="Отправить"/>
    </form>
    </body>
</fmt:bundle>
</html>
