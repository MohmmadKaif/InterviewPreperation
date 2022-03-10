<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AcessExperience</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="showExp.css">


</head>
<body>

 <!-- Navbar starts here... -->
   
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
              <a class="nav-link right_shift active" href="ShareExp.html" target="">Share Experience</a>
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
   
       <!--Navbar ends here....-->
  
    <div class="srchRow">
         <form  action="dispExp"  method="post" class="srchCont"  >
           <input type="text" name="comId" class="textStyle">
           <input type="submit" class="btnStyle" value="search">
         </form>
    </div>

 
      

<div class="cominfo">

<div  class="infoholder">  

<div class="comname">
Company-Name: <c:out value="${' '}${comname}"> </c:out>
</div>
<div class="comid">
      Comapny ID: <c:out value="${' '}${coid}"> </c:out>   
</div>
</div>
</div>


<div class="main">
<div class="holder">


<c:forEach var="candidate" items="${cands}">
<div class="cont">
    <div class="intro">
      Name:<c:out value="${candidate.getfName()} ${ ' ' } ${candidate.getmName()}${ ' ' } ${ candidate.getlName() } " ></c:out>
      <br>
      <br>
      Visit Date:<c:out value="${candidate.getVisDay()} ${ ' ' } ${candidate.getVisMonth()} ${ ' ' } ${ candidate.getVisYear() }"></c:out>
      <br>
      CTC:<c:out value="${candidate.getCTC()}"></c:out>
      <br>
      No Of Rounds:<c:out value="${candidate.getNoRounds()}"></c:out>
      <br>
      Posted On: <c:out value="${candidate.getPostDay()} ${ ' ' } ${candidate.getPostMonth()} ${ ' ' } ${ candidate.getPostYear() }"></c:out>
      <br>
</div>
    <c:set var="Exp" value="${candidate.getExp()}" scope="application"></c:set>
    <div class="exp">
   <p>
   <%-- <c:forEach var="i" begin="0"  end="${Exp.length()-1}" >
        <c:choose>
        <c:when test="${Exp.charAt(i)==126}">
        <br><br>
        </c:when>
        <c:otherwise>
         ${Exp.charAt(i)}      
        </c:otherwise>
        </c:choose>
    </c:forEach> --%>
    <c:out value=" ${Exp} "></c:out>
    
    
  </p>
    </div>

</div>
</c:forEach>  
  
</div>
</div>






</body>
</html>