<%--
  Created by IntelliJ IDEA.
  User: melathadgu
  Date: 9/23/18
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/admin_js/adminhome.js" type="text/javascript" ></script>
     <link href="resources/css/admincss/adminhome.css" type="text/css" rel="stylesheet">
</head>
<body>

<button id="doc" class="admin" value="doctors"> doctors</button>

<button id="ser" class="admin" value="services"> services</button>


    <a  id="logout" href="logout" class="admin" value="logout"> LogOut </a>



<table id="tbl_list" style="display: none;">
    <thead>
    <tr >
        <th id="idlist"><strong><u>Id</u></strong></th>
        <th><strong><u>First Name</u></strong></th>
        <th><strong><u>Last Name</u></strong> </th>
        <th><strong><u>E-mail</u></strong></th>
        <th><strong><u>Phone number</u></strong></th>
        <th ><strong><u>Action</u> </strong></th>
    </tr>
    </thead>
    <tbody  id="data_list">

    </tbody>
    <%
        String userName = null;
        Cookie[] cookies = request.getCookies();
        if(cookies !=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("user")) userName = cookie.getValue();
            }
        }
        if(userName == null) response.sendRedirect("admin");
    %>
</table>

<table id="serv_list" style="display: none;">
    <thead>
    <tr >
        <th><strong><u>ClinicserviceId</u></strong></th>
        <th><strong><u>ClinicService Name</u></strong></th>
        <th><strong><u>Description</u> </strong> </th>
        <th><strong><u>Action </u></strong></th>
    </tr>
    </thead>
    <tbody  id="data_ser_list">

    </tbody>
</table>
</body>
</html>
