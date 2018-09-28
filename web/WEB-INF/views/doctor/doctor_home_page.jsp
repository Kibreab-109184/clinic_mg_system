<%--
  Created by IntelliJ IDEA.
  User: Habte
  Date: 9/24/2018
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Doctor's Hope page</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/css2/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/doctor/welcome_doc.js" type="text/javascript" ></script>
    <script type = "text/javascript" >
        function disableBackButton()
        {
            window.history.forward();
        }
        setTimeout("disableBackButton()", 0);
    </script>
</head>
<body onload="disableBackButton()">
<%
   // response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate" );
  //  response.setHeader("Pragma","no-cache");
   // response.setHeader("Expires", "0");
  //  response.setDateHeader("Expires",-1);

    if(session.getAttribute("username")==null){
        response.sendRedirect("doctor.jsp");
    }
%>
<%@include file="../doctor_home_page.jsp" %>

<h1>Welcome Doctor </h1>

<button id="pat_view"> please click to view today's patients </button>

<table id="tbl_list" style="display: none;">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name </th>
        <th>E-mail</th>
        <th>Phone number</th>

    </tr>
    </thead>
    <tbody  id="data_list">

    </tbody>
</table>

<div class="list-group" style="display: none;">

    <a href="#" class="list-group-item list-group-item-action flex-column align-items-start active">
        <div class="d-flex w-100 justify-content-between">
            <h5 class="mb-1">List group item heading</h5>
            <small>3 days ago</small>
        </div>
        <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
        <small>Donec id elit non mi porta.</small>
    </a>
    <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
        <div class="d-flex w-100 justify-content-between">
            <h5 class="mb-1">List group item heading</h5>
            <small class="text-muted">3 days ago</small>
        </div>
        <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
        <small class="text-muted">Donec id elit non mi porta.</small>
    </a>
    <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
        <div class="d-flex w-100 justify-content-between">
            <h5 class="mb-1">List group item heading</h5>
            <small class="text-muted">3 days ago</small>
        </div>
        <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
        <small class="text-muted">Donec id elit non mi porta.</small>
    </a>
</div>

</body>
</html>
