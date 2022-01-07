package streamapi;

public class Employee {
int EmployeeId;
String EmployeeName;
String designation;
int age;

public Employee(int employeeId, String employeeName, String designation, int age) {
	super();
	EmployeeId = employeeId;
	EmployeeName = employeeName;
	this.designation = designation;
	this.age = age;
}

public int getEmployeeId() {
	return EmployeeId;
}

public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}

public String getEmployeeName() {
	return EmployeeName;
}

public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", designation=" + designation
			+ ", age=" + age + "]";
}
}
	
