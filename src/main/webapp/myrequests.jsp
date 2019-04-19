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
		<li><a href="employeehome.jsp">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn active">Requests</a>
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
<table>
	<thead>
		<tr>
			<th></th>
			<th>Request ID</th>
			<th>Employee ID</th>
			<th>Request Amount</th>
			<th>Request Note</th>
			<th>Request Status</th>
			<th>Request Manager</th>
		</tr>
	</thead>
	<tbody name="myopenrequestTable"></tbody>
</table>

<script src="./employee.js"></script>

</body>
</html>