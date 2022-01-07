package encapsulation;

public class Admin {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setempId(1);
		employee1.setName("Akshay");
		employee1.setAge(19);
		employee1.setDesignation("software engineer");
		/*Employee employee2=new Employee();
		employee2.setempId(2);
		employee2.setName("Bhagyashree");
		employee2.setAge(16);
		employee2.setDesignation("Tech led");*/
		employee1.getEmpId();
		employee1.getName();
		employee1.getAge();
		employee1.getDesignation();
	/*	employee2.getEmpId();
		employee2.getName();
		employee2.getAge();
		employee2.getDesignation();
		System.out.println("-------------");
		*/
	}

}
