window.onload = () => {
	getAllEmployees();
}

const getAllEmployees = () => {
	const xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = () => {
		if(xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			populateEmployeeTable(JSON.parse(json));
		}
	};
	
	xhr.open("GET", "http://localhost:8088/reimbursement-final/employeelist");
	
	xhr.send();
}



const populateEmployeeTable = (listOfEmployees) => {
	for (let employee of listOfEmployees){
		const tdId = document.createElement("td");
		const tdFname = document.createElement("td");
		const tdLname = document.createElement("td");
		const tdUsername = document.createElement("td");
		const tdPassword = document.createElement("td");
		const tdPosition = document.createElement("td");


		
		tdId.textContent = employee.id;
		tdFname.textContent = employee.fname;
		tdLname.textContent = employee.lname;
		tdUsername.textContent = employee.username;
		tdPassword.textContent = employee.password;
		tdPosition.textContent = employee.position;


		
		const row = document.createElement("tr");
		
		row.appendChild(tdId);
		row.appendChild(tdFname);
		row.appendChild(tdLname);
		row.appendChild(tdUsername);
		row.appendChild(tdPassword);
		row.appendChild(tdPosition);


		
		document.getElementById("employeeTable").appendChild(row);
		
	}

}


const createEmployee = () =>{
	const xhr = new XMLHttpRequest();
	
	const formData = parseForm();
	
	xhr.onreadystatechange = () =>{
		if(xhr.status === 200 && xhr.readyState ===4){
			const json = xhr.responseText();
			
			console.log(json);
		}
	}
	
	xhr.open("POST", "http://localhost:8088/reimbursement-final/employeelist");
	
	xhr.send(JSON.stringify(formData));
}

const parseForm = () => {
	const idText = document.getElementById("id").value;
	const fnameText = document.getElementById("fname").value;
	const lnameText = document.getElementById("lname").value;
	const usernameText = document.getElementById("username").value;
	const passwordText = document.getElementById("password").value;
	const positionText = document.getElementById("position").value;

	return {
		id: idText,
		fname: fnameText,
		lname: lnameText,
		username: usernameText,
		password: passwordText,
		position: positionText
	}
}