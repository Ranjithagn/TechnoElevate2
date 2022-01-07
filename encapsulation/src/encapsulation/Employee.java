package encapsulation;

public class Employee {
	  private int empId;          //we need to write get and set method within the same class where we private the values we can not use in other classes
	  private int age;
	 private String name;
	 private  static String designation;
	
	 
	 public  void setAge(int age) {   //set is used to change the value which is in private
		 if(age>0 && age<100) {
			 this.age=age;
		 }else{
			 System.out.println("FOOLISH GUY DONT TEST ME");
		 }
	 }
	 
	 public void getAge() {                 //get is used to see the values which is in private
		 System.out.println(age);
	 }
	 
	 public void setempId(int empId) {
		 this.empId=empId;
	 }
	 
	 public void getEmpId() {
		 System.out.println(empId);
	 }
	 
	 public void setName(String name) {
		 this.name=name;
		  }
	 
	 public void getName() {
		 System.out.println(name);
	 }
	 
	 public void setDesignation(String designation) {
		 this.designation=designation;
	 }
	 
	 public void getDesignation() {
		 System.out.println(designation);
	 }
	 }


