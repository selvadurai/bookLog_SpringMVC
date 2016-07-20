<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
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
      <li><a href="out">Sign Out</a></li>
    </ul>
  </div>
  
<div class="container">
  
<form action="add" method="POST"  role="form" > 
         
         <fieldset class="form-group row"> 
          	<div class="col-sm-3">
             	 	<label "col-sm-1 form-control-label" for="usr">Book Name </label>
             		<input type="text" name="bookname" class="form-control" id="usr"/>
             </div>
         </fieldset>
         
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="isbn">ISBN</label>
     		    <input type="text" name="isbn"  class="form-control" id="isbn"/>
              </div>
     	 </fieldset>
                
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="afname">Author's First Name: </label>
     		    <input type="text" name="afname"  class="form-control" id="afname"/>
              </div>
     	 </fieldset>
     	 
     	  <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="alname">Author's Last Name: </label>
     		    <input type="text" name="alname"  class="form-control" id="alname"/>
              </div>
     	 </fieldset>
     	 
     	  
     	 
     	 <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="desc">Book Description </label>
     		    <textarea  type="text" name="desc"  class="form-control" id="desc"> </textarea>
              </div>
     	 </fieldset>
          
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="lesson">Lesson Learned</label>
     		    <textarea  type="text" name="lesson"  class="form-control" id="lesson"> </textarea>
              </div>
     	 </fieldset>          
                
      <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="category">category</label>
     		    <select  type="text" name="category"  class="form-control" id="category"> 
     		        <option value="wealth">Wealth</option>
   				    <option value="health">Health</option>
  				    <option value="love">love</option>
   					<option value="tech">tech</option>
   					<option value="classic/history">classic/history</option>
   					<option value="other">other</option>
     		    </select>
              </div>
     	 </fieldset>   
               
                         
      <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="media">Media Type</label>
     		    <select  type="text" name="media"  class="form-control" id="media"> 
     		        <option value="book">book</option>
   				    <option value="audio">audio</option>
  				    <option value="video">video</option>
     		    </select>
              </div>
     	 </fieldset>  
               
         <fieldset class="form-group row">
             <div class="col-sm-3">
     		   <label "col-sm-1 form-control-label" for="rate">Book Rating out of 10</label>
     		    <input  type="text" name="rate"  class="form-control" id="rate"/>
              </div>
     	 </fieldset>         
                
                
          <fieldset class="form-group row">
          <div class="col-sm-3">
               <input type="submit" value="Submit" class="form-control" class="btn btn-lg btn-primary btn-block" />
          </div>
          </fieldset>   
  </form>
 



</div>

</body>
</html>