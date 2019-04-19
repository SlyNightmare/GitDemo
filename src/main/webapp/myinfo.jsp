<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Info</title>
<link rel="stylesheet" type="text/css" href="employeeportal.css">
</head>
<body>
<nav class="navbar navbar">
	
	<ul class="nav navbar-nav">
		<li><a href="employeehome.jsp">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Requests</a>
				<div class="dropdown-content">
				<a href="request.jsp">Submit a Request</a>
				<a href="myrequests.jsp">Pending Requests</a>
				<a href="requesthistory.jsp">Request History</a>
				</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn active">My Info</a>
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
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Username</th>
			<th>Password</th>
			<th>Position</th>
		</tr>
	</thead>
	<tbody name="myinfoTable"></tbody>
</table>
<br><br><br><br><br>
<form name="updatemyinfo">
First Name<br> <input type="text"><br>
Last Name<br> <input type="text"><br>
Username<br> <input type="text"><br>
Password<br> <input type="text"><br>
Position<br> <input type="text"><br>
<br>
<button type="button" name="submitinfo">Submit</button>
</form>
</body>
</html>