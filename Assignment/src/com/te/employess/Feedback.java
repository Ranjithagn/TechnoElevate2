package com.te.employess;
	public class Feedback {

		public static void main(String[] args) {
		    Extract extract  = new Extract();
			Intern intern = new Intern("Bhushan","intern",100000);
			SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Gaurav","intern",90000);
			Mannual mannual = new Mannual ("Anurag","Manual tester",50000);
			Automation automation = new Automation("Waseem","Automation tester",60000);
			Hr 	hr = new Hr("Manikanta","HR",150000);
			extract.get(intern);
			System.out.println("================================");
			extract.get(mannual);
			System.out.println("================================");
			extract.get(seniorDeveloper);
			System.out.println("================================");
			extract.get(automation);
			System.out.println("================================");
			extract.get(hr);
			System.out.println("================================");
			Employee employee = new Employee();
			
		}

}


