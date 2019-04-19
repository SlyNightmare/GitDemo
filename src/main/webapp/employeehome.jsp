<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home</title>
<link rel="stylesheet" type="text/css" href="employeeportal.css">
</head>
<body>
<nav class="navbar navbar">
	
	<ul class="nav navbar-nav">
		<li class="active"><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Requests</a>
				<div class="dropdown-content">
				<a href="request.jsp">Submit a Request</a>
				<a href="myrequests.jsp">Pending Requests</a>
				<a href="requesthistory.jsp">Request History</a>
				</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">My Info</a>
				<div class="dropdown-content">
				<a href="myinfo.jsp">Employee Info</a>
				</div>
		</li>
		<li style="float:right"><a href="employeelogin.jsp">Logout</a></li>
	</ul>
</nav>
<fieldset>
<legend>Requests</legend>
<a href="request.jsp">Create a New Reimbursement Request</a><br>
<a href="myrequests.jsp">View My Open Requests</a><br>
<a href="requesthistory.jsp">View My Resolved Requests</a>
</fieldset>
<fieldset>
<legend>My Information</legend>
<a href="myinfo.jsp">View/Edit My Information</a>
</fieldset>
</body>
</html>