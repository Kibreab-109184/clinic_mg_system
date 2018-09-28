<%--
  Created by IntelliJ IDEA.
  User: melathadgu
  Date: 9/22/18
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <title>Log In</title>
    <link href="${pageContext.request.contextPath}/resources/css/admincss/login.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/resources/js/admin_js/login.js" type="text/javascript" ></script>
</head>
<body>
<!-- Button to open the modal login form -->
<button  onclick="document.getElementById('id01').style.display='block'">Login</button>
<h1>Welcome to MsquareK Clinic</h1>
<h1>Admin Login Page</h1>
<!-- The Modal -->
<div id="id01" class="modal">
  <span onclick="document.getElementById('id01').style.display='none'"
        class="close" title="Close Modal">&times;</span>

    <!-- Modal Content -->
    <form class="modal-content animate" action="${pageContext.request.contextPath}/admin" method="post">
        <div class="imgcontainer">
            <img src="https://doctors-hospital.net/contentAsset/raw-data/257f1d0c-7a7d-4a0a-84d6-f1a7dff9ca76/fullColorLogo" alt="Avatar" class="avatar">
        </div>

        <div class="container">
            <label ><b>Username</b>
            <input type="text" placeholder="Enter Username" name="uname" required> </label> <br><br>

            <label><b>Password</b>
            <input type="password" placeholder="Enter Password" name="psw" required> </label> <br> <br>

            <button type="submit">Login</button> <br> <br>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
</div>


</body>
</html>
