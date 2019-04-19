<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pending Requests</title>
<link rel="stylesheet" type="text/css" href="employeeportal.css">
</head>
<body>
<nav class="navbar navbar">
	
	<ul class="nav navbar-nav">
		<li><a href="managerhome.jsp">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn active">Requests</a>
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
	<tbody id="allopenrequests"></tbody>
</table>
</body>
</html>