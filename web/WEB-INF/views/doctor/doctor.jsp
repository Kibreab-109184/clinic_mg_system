<%--
  Created by IntelliJ IDEA.
  User: Habte
  Date: 9/23/2018
  Time: 1:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Doctors Log in page</title>
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/img/favicon.ico"/>
    <link href="${pageContext.request.contextPath}/resources/css/css_login/main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/css_login/util.css.css" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
</head>
<body>

<%@include file="../header.jsp" %>
<jsp:useBean id="obj" class="controller.ActButton" scope="request"/>
<%--<%@include file="doctorHeader.jsp"%>--%>
<div class="login-page">
    <div class="form">
<div id="login_position">
    <form action="doctor" class="login-form" method="post"> <br><br>
        User name: <input type="text" placeholder="username" name="uname"/><br><br>
        Password:  <input type="password" placeholder="password" name="pass"/><br><br>
        <button>login</button> <br/>
    </form>
</div>

        <div id="error">
            <%--<c:out var="error" items="${doct_Error}">--%>
            <%--<p>${doct_Error.action}</p>--%>
        </div>
    </div>
</div>


<%@include file="../footer.jsp"%>

<%--<script src="resources/js/js_login/main.js"></script>--%>
</body>
</html>
