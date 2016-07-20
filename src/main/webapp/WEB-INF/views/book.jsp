<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>${name}</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
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
      <li><a href="out">Sign out</a></li>
    </ul>
  </div>
</nav>

	<table>
    <tbody>
    
       <tr>
        <td>id </td>
        <td>${id}</td>  
      </tr>
     
       <tr>
        <td>isbn </td>
        <td>${isbn}</td>  
      </tr>
     
      <tr>
        <td>name: </td>
        <td>${name}</td>  
      </tr>
     
        
       
       <tr>
        <td>Author's first Name: </td>
        <td>${fname}</td>  
      </tr>
      
      
      
       <tr>
        <td>Author's last  Name: </td>
        <td>${lname}<br> </td>  
      </tr>
      
      
 
      
      <tr>
         <td>Category </td>
         <td>${cat} <br>   </td>  
      </tr>
      
      
      
      <tr>
        <td>Medie Type </td>
        <td>${media}<br></td>  
      </tr>
    </tbody>
  </table>     
     
     <br>
    
 <p>Description</p>    
 <textarea rows="4" cols="50" readonly>
  ${desc}  
 </textarea> 
     
    <br>
    <br> 
 
  <p>Lesson</p>    
 <textarea rows="4" cols="50" readonly>
  ${lesson}  
 </textarea>      
    
     
  

</body>
</html>