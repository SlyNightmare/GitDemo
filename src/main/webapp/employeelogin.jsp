<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
<style>
.button {
  font: bold 15px Arial;
  text-decoration: none;
  background-color: silver;
  color: #333333;
  padding: 2px 6px 2px 6px;
  border-top: 1px solid #CCCCCC;
  border-right: 1px solid #333333;
  border-bottom: 1px solid #333333;
  border-left: 1px solid #CCCCCC;
		}
div {
  position: relative;
  top: 50%;
  display: inline-block;
	 }
fieldset {
  border: 4px solid gray;
  background-color: white;
		 }
body {
  text-align:center;
  background-image: url("mtnbg.jpeg");
  background-size:cover; 
	 }
</style>
</head>
<body>
<div>
<fieldset style="width:400px; height:300px">
Enter Login Information<br><br><br>
<img src="revaturelogo.png" style="width:100px; height:36.5px"><br><br>

<form id="loginfields" action="login" method="post">
Employee ID: <input type="text" name="username" style="width:200px"><br><br>
Password: <input type="password" name="password" style="width:200px"><br><br>
<input type="button" id="sub1" class="button" value="Login" onclick="location.href='employeehome.jsp';">
</form>

<br><br>
Wrong Place? <a href="managerlogin.jsp">Manager Login</a>
</fieldset>
</div>
</body>
</html>