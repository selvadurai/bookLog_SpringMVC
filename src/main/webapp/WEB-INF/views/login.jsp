<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Login Page</title>
     
     <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
</head>
<body>
   
  
<div class="container">


<h2 class="form-signin-heading">Welcome to Book Log</h2>

<form action="login" method="POST"  role="form" > 
         <fieldset class="form-group row">
          <div class="col-sm-3">
              <label "col-sm-1 form-control-label" for="usr">Name: </label>
             <input type="text" name="username" class="form-control" id="usr"/>
              </div>
         </fieldset>
         
         
         <fieldset class="form-group row">
          <div class="col-sm-3">
     		<label "col-sm-1 form-control-label" for="pswd">Password: </label>
     		<input type="password" name="password"  class="form-control" id="pswd"/>
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


