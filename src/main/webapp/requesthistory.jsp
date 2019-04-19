<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request History</title>
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
			<th>Request ID</th>
			<th>Request Date</th>
			<th>Request Amount</th>
			<th>Request Reason</th>
			<th>Request Approval</th>
		</tr>
	</thead>
	<tbody id="myclosedrequestTable"></tbody>
</table>
</body>
</html>