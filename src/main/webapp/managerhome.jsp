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
				<a href="pendingrequests.html">View Open Requests</a>
				<a href="pastrequests.html">Request History</a>
				</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Employees</a>
				<div class="dropdown-content">
				<a href="employeelist.html">Active Employees</a>
				<a href="requestbyemployee.html">Requests by Employee</a>
				</div>
		</li>
		<li style="float:right"><a href="managerlogin.html">Logout</a></li>
	</ul>

</nav>
</body>
</html>