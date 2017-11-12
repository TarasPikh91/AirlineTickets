<<<<<<< HEAD
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<!DOCTYPE html>--%>
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- <!DOCTYPE html> --%>
<<<<<<< HEAD
>>>>>>> 6311f77949f252e04de72368bb477a4eaf417faf
=======
>>>>>>> origin/prince
>>>>>>> TarasBranches
<html>
<head>
  <title>SkyFlow</title>
  <meta content=".png">
  <link rel="apple-touch-icon-precomposed" href=".png">
  <link rel="shortcut icon" href="favicon.ico">
  <link rel="icon" type="image/x-icon" href=".ico">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- <link rel="stylesheet" href="../libraries/css/bootstrap.css"> -->
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/font-awesome.min.css">
<<<<<<< HEAD
</head>
<body>
 <div class="wrapper">
  <div class="header">
=======
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g=" crossorigin="anonymous"></script>
</head>
<body>
 <div class="wrapper">
  <div class="header" id="header">
<<<<<<< HEAD
>>>>>>> 6311f77949f252e04de72368bb477a4eaf417faf
=======
>>>>>>> origin/prince
>>>>>>> TarasBranches
   <div class="logo">
     <img src="../css/images/logoSkyFlow.png" alt="logo" id="logo">
   </div>
   <div class="menu">
    <ul>
<<<<<<< HEAD
     <li><a href="#">Flights</a></li>
     <li><a href="#">News</a></li>
     <li><a href="#">About</a></li>
    </ul>
   </div>
   <p><a href="#" id="SignInSignUp">SignIn/SignUp</a></p>
=======

     <li><a href="#">Flights</a></li>
     <li><a href="#">News</a></li>
     <li><a href="#">About</a></li>
     <sec:authorize access="isAuthenticated()">
      <li><a href="/city">City</a></li>
      <li><a href="/company">Company</a></li>
      <li><a href="/country">Country</a></li>
      <li><a href="/plane">Plane</a></li>
      <li><a href="/ticket">Tickets</a></li>
      <li><a href="/user">User</a></li>
     </sec:authorize>
    </ul>
   </div>
   <p><a href="/registrationAndLogIn" id="SignInSignUp">SignIn/SignUp</a></p>
   <sec:authorize access="isAuthenticated()">
    <form:form action="logout" method="post"><button class="btn btn-default">Log Out</button></form:form>
   </sec:authorize>
<<<<<<< HEAD
>>>>>>> 6311f77949f252e04de72368bb477a4eaf417faf
=======
>>>>>>> origin/prince
>>>>>>> TarasBranches
  </div>
  <div class="content">
    <div class="fustTickets">
     <a href="#" id="roundTrip">Rount-Trip</a>
     <a href="#" id="oneWay">One-Way</a>
     <form action="" method="post">
      <div class="formCity">
<<<<<<< HEAD
       <input type="text" list="cityfrom" id="fromCity" placeholder="From">
       <label for="fromCity" id="label1"><i class="fa fa-map-marker" aria-hidden="true"></i></label>
       <datalist id="cityfrom">
        <option value="New York"></option>
        <option value="Barcelona"></option>
        <option value="Lviv"></option>
       </datalist>
=======
       <%--<input type="text" list="cityfrom" id="fromCity" placeholder="From">--%>
       <label for="fromCity" id="label1"><i class="fa fa-map-marker" aria-hidden="true"></i></label>
       <%--<datalist id="cityfrom">--%>
        <select type="text" list="cityfrom" id="fromCity" placeholder="From">
         <c:forEach var="city" items="${cities}">
          <option value="${city.id}">${city.name}</option>
         </c:forEach>
        </select>
       <%--</datalist>--%>
<<<<<<< HEAD
>>>>>>> 6311f77949f252e04de72368bb477a4eaf417faf
=======
>>>>>>> origin/prince
>>>>>>> TarasBranches
      </div>
      <div class="tocity">
       <input type="text" list="cityto" id="toCity" placeholder="To">
       <label for="toCity" id="label2"><i class="fa fa-thumb-tack" aria-hidden="true"></i></label>
       <datalist id="cityto">
        <option value="Tel-Aviv"></option>
        <option value="Los Angeles"></option>
        <option value="Paris"></option>
       </datalist>
      </div>
      <div class="blockPass">
        <input type="text" placeholder="Passenger" class="passenger" id="passenger" disabled>
        <label for="passenger" id="label3"><i class="fa fa-users" aria-hidden="true"></i></label>
        <div class="psm">
         <div class="passengerMore">
         <p>Adults<p>(16+)</p></p>
         <p>-</p><p>+</p>
         <p>Youths<p>(12-15)</p></p>
         <p>-</p><p>+</p>
         <p>Children<p>(2-11)</p></p>
         <p>-</p><p>+</p>
         <p>Infants<p>(On lap)</p></p>
         <p>-</p><p>+</p>
        </div>
        </div>
      </div>
      <div class="blockPromotion">
       <input type="text" id="promotion" placeholder="Promotion Code">
       <label for="promotion" id="label4"><i class="fa fa-star-o" aria-hidden="true"></i></label>
      </div>
      <div class="calendars">
       <div class="blockDepart">
        <input type="text" id="depart" placeholder="Depart">
        <label for="depart" id="label5"><i class="fa fa-calendar" aria-hidden="true"></i></label>
        <div class="departCalendar">
        </div>
       </div>
       <div class="blockReturn">
        <input type="text" id="return" placeholder="Return">
        <label for="return" id="label6"><i class="fa fa-calendar" aria-hidden="true"></i></label>
        <div class="returnCalendar">
        </div>
       </div>
      </div>
      <p id="searchTickets"><a href="#">Search</a></p>
     </form>
    </div>
     <!-- <img src="../images/barcelona.png" id="backgroundHeader"/> -->
   <h2>Barcelona</h2>
   <hr>
   <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
     Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
      Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
      Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. <a href="#">more...</a></p>
   <div class="buytickets">
    <p>Buy Tickets</p>
   </div>
  </div>
  <div class="content2">
    <h1 id="AboutSkyFlow">About SkyFlow</h1>
    <p id="p1">Lorem ipsum dolor sit amet, consectetur adipisicing elit, laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    <img src="../css/images/specialoffer.png" alt="specialoffer" id="specialOffer">
    <p id="p2">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex.</p>
    <p id="buttonSpecialOffer"><a href="#">-50%</a></p>
  </div>
  <div class="content3">
   <div class="block1">
    <div class="image1">
     <div class="grayBlock">
      <h1><a href="#">News</a></h1>
     </div>
    </div>
    <p>Lorem ipsum dolor sit consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    <p id="more1">more...</p>
   </div>
   <div class="block2">
    <div class="image2">
     <div class="grayBlock2">
      <h1><a href="#">Flights</a></h1>
     </div>
    </div>
    <p>Lorem ipsum dolor sit consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    <p id="more2">more...</p>
   </div>
   <div class="block3">
    <div class="image3">
     <div class="grayBlock3">
      <h1><a href="#">About</a></h1>
     </div>
    </div>
    <p>Lorem ipsum dolor sit consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    <p id="more3">more...</p>
   </div>
  </div>
  </div>
  <div class="footer">
   <div class="footerBl1">
    <h1><a href="#">FaQ</a></h1>
    <hr>
    <p><a href="#">What is it SkyFlow?</a></p>
    <p><a href="#">How this do?</a></p>
    <p><a href="#">How buy tickets?</a></p>
    <p><a href="#">How SingIn this site?</a></p>
    <p><a href="#">Who programmer?</a></p>
    <p><a href="#">How time do this site?</a></p>
    <p><a href="#">What it?</a></p>
    <p><a href="#">How pay?</a></p>
   </div>
   <div class="footerBl2">
    <h1><a href="#">FaQ</a></h1>
    <hr>
    <p><a href="#">What is it SkyFlow?</a></p>
    <p><a href="#">How this do?</a></p>
    <p><a href="#">How buy tickets?</a></p>
    <p><a href="#">How SingIn this site?</a></p>
    <p><a href="#">Who programmer?</a></p>
    <p><a href="#">How time do this site?</a></p>
    <p><a href="#">What it?</a></p>
    <p><a href="#">How pay?</a></p>
   </div>
   <div class="footerBl3">
    <h1><a href="#">FaQ</a></h1>
    <hr>
    <p><a href="#">What is it SkyFlow?</a></p>
    <p><a href="#">How this do?</a></p>
    <p><a href="#">How buy tickets?</a></p>
    <p><a href="#">How SingIn this site?</a></p>
    <p><a href="#">Who programmer?</a></p>
    <p><a href="#">How time do this site?</a></p>
    <p><a href="#">What it?</a></p>
    <p><a href="#">How pay?</a></p>
   </div>
   <div class="socialIcons">
    <p><a href="#" id="icon1"><i class="fa fa-instagram" aria-hidden="true"></i></a></p>
    <p><a href="#"id="icon2"><i class="fa fa-facebook-square" aria-hidden="true"></i></a></p>
    <p><a href="#"id="icon3"><i class="fa fa-twitter-square" aria-hidden="true"></i></a></p>
    <p><a href="#"id="icon4"><i class="fa fa-google-plus-square" aria-hidden="true"></i></a></p>
   </div>
  </div>
 </div>
  <!-- <nav class="nav navbar-default navbar-fixed-top">
   <div class="container-fluid">
     <div class="navbar-header">
       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-main">
         <span class=sr-only>Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
       </button>
       <img src="../images/logoSkyFlow.png" class="navbar-brand container" id="logo">
     </div>
     <div class="collapse navbar-collapse" id="navbar-main">
       <ul id="menu">
         <li><a href="#">Flights</a></li>
         <li><a href="#">News</a></li>
         <li><a href="#">About</a></li>
       </ul>
     </div>
   </div>
  </nav> -->
  <!-- <script type="text/javascript" src="../libraries/js/bootstrap.min.js"></script> -->
<<<<<<< HEAD
  <script type="text/javascript" src="../js/script.js"></script>
  <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
=======
 <script src="../js/script.js"></script>
<<<<<<< HEAD
>>>>>>> 6311f77949f252e04de72368bb477a4eaf417faf
=======
>>>>>>> origin/prince
>>>>>>> TarasBranches
</body>
</html>
