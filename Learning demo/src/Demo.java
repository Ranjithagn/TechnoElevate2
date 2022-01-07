
public class Demo {
	String name;
	double salary;
	int age;
	
	
	public Demo(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Demo [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		Demo demo = new Demo("RANJU",32322, 12);
		System.out.println(demo.toString());
		
	   Demo	demo1=new Demo("hai", 1111, 12);
	   System.out.println(demo1.toString());
		
	}
}