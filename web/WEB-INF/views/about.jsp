<%--
  Created by IntelliJ IDEA.
  User: melathadgu
  Date: 9/22/18
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>about us</title>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/cssabout/one-page-wonder.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">



</head>
<body>

<header class="business-header">
    <%@include file="header.jsp"%>
</header>
<section>
    <div class="container">
        <div class="row align-items-center">
            <h1 class="display-4">About us</h1>
            <p><strong>Our clinic is fully equipped with the highest standards of technology.
                Our primary and specialty care is provided by experts from all medical specialties, attracting patients from different states.
                We offer our care in convenient, comfortable settings, using the most advanced approaches and with the best outcomes as our goal.
                Our friendly and service minds are comfortable bright setting endeavors to make your visit with us a wonderful and pleasant one.
            </strong></p>
            <div class="col-lg-6 order-lg-2">
                <div class="p-5">

                    <img class="img-fluid rounded-circle" src="resources/img/imgabout/smile.jpg" alt="">
                </div>
            </div>
            <div class="col-lg-6 order-lg-1">
                <div class="p-5">
                    <h2 class="display-4">Dental service</h2>
                    <p>If you are not happy with your smile, or have any other problems with your teeth, take a moment and consider, that our fees are well below those in your home country.</p>
                </div>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="p-5">
                    <img class="img-fluid rounded-circle" src="resources/img/imgabout/skin.jpg" alt="">
                </div>
            </div>
            <div class="col-lg-6">
                <div class="p-5">
                    <h2 class="display-4">Dermatology</h2>
                    <p><strong>At The Iowa Clinic our dermatology providers specialize in treating a full range of skin concerns for patients of all ages.
                        We offer some of the latest innovations in the treatment of skin cancer as well as the most effective approaches to treating other common skin concerns.
                        We want to help you maintain healthy skin for life.</strong>
                    </p>
                </div>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6 order-lg-2">
                <div class="p-5">
                    <img class="img-fluid rounded-circle" src="resources/img/imgabout/cardio.jpg" alt="">
                </div>
            </div>
            <div class="col-lg-6 order-lg-1">
                <div class="p-5">
                    <h2 class="display-4">Cardiology </h2>
                    <p><strong>our cardiovascular services include heart care, heart surgery, and treatment for all types of heart disease.
                        Our specialties are cardiology, cardiothoracic surgery, vascular surgery, and many others.
                        We focus our treatment around the patient with customized plans to fit your needs.</strong></p>
                </div>
            </div>
        </div>
    </div>
</section>

    <%@include file="footer.jsp"%>

</body>
</html>