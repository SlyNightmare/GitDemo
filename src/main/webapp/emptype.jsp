<head>
<style>
.button {
  font: bold 30px Arial;
  text-decoration: none;
  background-color: silver;
  color: #333333;
  padding: 2px 6px 2px 6px;
  border-top: 1px solid #CCCCCC;
  border-right: 1px solid #333333;
  border-bottom: 1px solid #333333;
  border-left: 1px solid #CCCCCC;
		}
body {
  text-align:center;
  background-image: url("mtnbg.jpeg");
  background-size:cover; 
	 }
div {
  position: relative;
  top: 50%;
  transform: translateY(-50%);
  display: inline-block;
	 }
fieldset {
  border: 4px solid gray;
  background-color: orange;
		 }
</style>
</head>

<body>
<div>
<fieldset style="width:400px; height:300px">
Select Portal<br><br><br><br>
<a href="managerlogin.jsp" class="button">Manager Login</a><br><br><br><br><br>
<a href="employeelogin.jsp" class="button">Employee Login</a>
</fieldset>
</div>

</body>