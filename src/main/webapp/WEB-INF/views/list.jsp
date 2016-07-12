<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
	<title>Bootstrap Case</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>

<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Book Log</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="add">Add Book</a></li>
      <li><a href="list">List Books</a></li>
      <li><a href="#">Sign out</a></li>
    </ul>
  </div>
</nav>

				

   <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>BookName</th>
        <th>Rate</th>
        <th>Category</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="listValue" items="${bookList}">
      <tr>
        <td>${listValue.getId()       } </td>
        <td>${listValue.getName()     } </td>
        <td>${listValue.getBookRate() } </td>
        <td>${listValue.getCategory() } </td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
   



</body>
</html>