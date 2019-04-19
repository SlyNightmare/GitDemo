<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Home</title>
<link rel="stylesheet" type="text/css" href="employeeportal.css">
</head>
<body>
<nav class="navbar navbar">
	
	<ul class="nav navbar-nav">
		<li class="active"><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Requests</a>
				<div class="dropdown-content">
				<a href="pendingrequests.jsp">View Open Requests</a>
				<a href="pastrequests.jsp">Request History</a>
				</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Employees</a>
				<div class="dropdown-content">
				<a href="employeelist.jsp">Active Employees</a>
				<a href="requestbyemployee.jsp">Requests by Employee</a>
				</div>
		</li>
		<li style="float:right"><a href="managerlogin.jsp">Logout</a></li>
	</ul>

<fieldset>
<legend>Requests</legend>
<a href="pendingrequests.jsp">View All Open Requests</a><br>
<a href="pastrequests.jsp">View All Past Requests</a> 
</fieldset>

<fieldset>
<legend>Employees</legend>
<a href="employeelist.jsp">View All Employees</a><br>
<a href="requestbyemployee.jsp">View Requests By Employee ID</a>"
</fieldset>
</nav>
</body>
</html>