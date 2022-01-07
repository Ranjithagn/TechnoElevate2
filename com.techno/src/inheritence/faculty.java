package inheritence;

 class faculty {
		double salary=40000.0;
	}
class mathsfaculty extends faculty
{
	double bonous=3000.0;
}
class main
{
	public static void main(String[] args) {
		mathsfaculty F=new mathsfaculty();
		double total_salary=F.salary+F.bonous;
		System.out.println("total salary:"+total_salary);
		
	}
}
	


