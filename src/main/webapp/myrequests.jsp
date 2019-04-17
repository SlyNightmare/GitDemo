<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Requests</title>
<link rel="stylesheet" type="text/css" href="employeeportal.css">
</head>
<body>
<nav class="navbar navbar">
	
	<ul class="nav navbar-nav">
		<li><a href="employeehome.html">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn active">Requests</a>
				<div class="dropdown-content">
				<a href="request.html">Submit a Request</a>
				<a href="myrequests.html">Pending Requests</a>
				<a href="requesthistory.html">Request History</a>
				</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">My Info</a>
				<div class="dropdown-content">
				<a href="myinfo.html">Employee Info</a>
				</div>
		</li>
		<li style="float:right"><a href="employeelogin.html">Logout</a></li>
	</ul>

</nav>
</body>
</html>