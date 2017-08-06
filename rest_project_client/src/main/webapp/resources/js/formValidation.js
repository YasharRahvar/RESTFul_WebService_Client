/**
 * 
 */

function submitIt(employeeForm) {
	employeeIDReg = /[A][0][0-9]{7}/
	errMsg = ""
	if (!employeeIDReg.test(employeeForm.employeeID.value)) {
		errMsg = "Invalid Employee ID. Correct Format is A0xxxxxxx\n"
	}
	if (employeeForm.employeeFirstName.value == "") {
		errMsg = errMsg + "Please fill in your First Name\n"
	}
	if (employeeForm.employeeLastName.value == "") {
		errMsg = errMsg + "Please fill in your Last Name\n"
	}

	if (employeeForm.employeeDOB.value == "") {
		errMsg = errMsg + "Please fill in your date of birth\n"
	}

	if (errMsg != "") {
		alert(errMsg)
		employeeForm.focus()
		return false
	}
	return true
}
