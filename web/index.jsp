<%--
  Created by IntelliJ IDEA.
  User: merih
  Date: 9/21/18
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Business Frontpage - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/css/css2/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/HMS-frontpage.css" rel="stylesheet">

</head>
<body>

<%@include file="WEB-INF/views/header.jsp" %>

<!-- Page Content -->
<div class="container">

    <div class="row">
        <div class="col-sm-8">
            <h2 class="mt-4">What We Do</h2>

            <p>To optimize the health and well-being of the people and communities we serve through patient-centered, high quality, and compassionate services.</p>
            <p>
                <a class="btn btn-primary btn-lg" href="clinicService"><strong>See More about our services</strong> &raquo;</a>
            </p>
        </div>
        <div class="col-sm-4">
            <h2 class="mt-4"><strong>Contact Us</strong></h2>
            <address>
                <strong>MsquareK</strong>
                <br>2000 N court st
                <br>FairField, IA
                <br>
            </address>
            <address>
                <abbr title="Phone">P:</abbr>
                (240) 838-1957
                <br>
                <abbr title="Email">E:</abbr>
                <a href="mailto:#">MsquareK@yahoo.com</a>
            </address>
        </div>
    </div>
    <!-- /.row -->

    <div class="row">
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="resources/img/dentist.jpg" alt="">
                <div class="card-body">
                    <h4 class="card-title"><strong>Dental Care</strong></h4>
                    <p class="card-text">Complete dental care for you and your family to bring out your best smile.</p>
                </div>

            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="resources/img/cardio.jpg" height="200" width="300" alt="">
                <div class="card-body">
                    <h4 class="card-title"><strong>Cardiology care</strong></h4>
                    <p class="card-text">  expert cardiologists in treating heart conditions, including those that are rare and complex with Successful treatment</p>
                </div>

            </div>
        </div>
        <div class="col-sm-4 my-4">
            <div class="card">
                <img class="card-img-top" src="resources/img/images.jpeg" alt="">
                <div class="card-body">
                    <h4 class="card-title"><strong>General Surgery</strong></h4>
                    <p class="card-text">Our primary goal is the health and happiness
                        of you and your family</p>
                </div>

            </div>
        </div>

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

<!-- Footer -->
<%@include file="WEB-INF/views/footer.jsp"%>

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>
