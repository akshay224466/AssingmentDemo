<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
		    <Html>  
		<head>   
		<title>  
		Registration Page  
		</title>  
		</head>  
		
		 
		
		<form action="/regis" method="POST" >  
		  
		<label> username </label>         
		<input type="text" name="username" size="15"  placeholder="Username"
        required/> <br> <br>  
		
		<label>password</label>      
		  <input type="password" placeholder="Password"  name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/> <br>   
		<br> 
		<br>  
		<label> email </label>      
		<input type="email"  name="email" pattern="[^ @]*@[^ @]*" placeholder="Enter your email"required/> <br>    
		<br> <br>  
		  
		<label>   
		city :  
		</label>   
		<select>  
		<option value="Pune">Pune</option>  
		<option value="Mumbai">Mumbai</option>  
		<option value="Indore">Indore</option>  
		<option value="Delhi">Delhi</option>  
		</select>  
		  
		<br> <br>  
		  
		<label>  contact :  </label>  
	 
		<input type="text" name="contact" size="10" placeholder="Contact"/>  <br> <br> 
		 
		<label>  zipcode :  </label>    
		 
		<input type="text" name="zipcode" size="6"  placeholder="zipcode" required/>  
		  
		<br> <br>  
	 
		<input type="submit"  />
		</form>  
		
		</body>  
		</html>  