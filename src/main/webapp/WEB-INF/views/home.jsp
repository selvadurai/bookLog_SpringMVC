<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<title>Bootstrap Case</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

      <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">


</head>
<body class="w3-container">
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Book Log</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="add">Add Book</a></li>
      <li><a href="list">List Books</a></li>
      <li><a href="out">Sign out</a></li>
    </ul>
  </div>
</nav>
  
 <h1>Book Data Report</h1>

 <p>Number of books Read: ${booksRead}</p>
<br>

<p>  ${booksRead}/2500 </p>
<br>
<p> Your ${totalPrecent} from your goal of reading 2500 books </p> 

<div class="w3-progress-container">
  <div id="myBar" class="w3-progressbar" style="width:${totalPrecent}"></div>
</div>


	
</body>
</html>
