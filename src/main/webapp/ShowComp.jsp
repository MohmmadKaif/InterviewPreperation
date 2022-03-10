<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Show Companies</title>

     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="ShowComp.css">
</head>
<body>
	



  <!-- This is our navigation bar.... -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">InterviewExperience</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
						<a class="nav-link " aria-current="page" href="home.html">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="">About Us</a>
					</li>
					<li class="nav-item">
						<a class="nav-link " href="">Contact Us</a>
					</li>
					<li class="nav-item ">
						<a class="nav-link right_shift active" href="ShareExp.html">Share Experience</a>
					</li>
					<li class="nav-item">
						<a class="nav-link active" href="showExp.jsp">Access Experience</a>
					</li>
					
					  <li class="nav-item">
              <a class="nav-link active" href="dispComp">Show Companies</a>
            </li>
				</ul>
				
			</div>
		</div>
	</nav>
  <!-- Navbar ends here... -->

   <!-- This is also our static part... -->

    <div class="msgCont">
    	<div class="msg">
    		All Listed Companies
    	</div>
    </div>
  
  <div class="main">
  <div class="comCont">
  <!-- This is our static part... -->	
    <div class="comRow">
    <div class="comCol"  style="border-right: 1px solid black;">Company Name</div>
    <div class="comCol">Company Id</div>
    </div>
     
     
   <c:forEach var="com" items="${comp}"  >  
   <div class="comRow">
    <div class="comCol"  style="border-right: 1px solid black;"> <c:out value="${com.getComName()}" ></c:out></div>
    <div class="comCol">  <c:out value="${com.getComId()}" ></c:out> </div>
    </div>
    </c:forEach> 
   
   




</div>
</div>


</body>
</html>