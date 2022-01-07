package methodoverloading;

public class Methodoverloadingwithnumberdifferentargs {
	public void login(String username,String password) {
System.out.println("Your username is "+username);
System.out.println("Your password "+password);
}
	public void login(String password,long phoneNumber) {
		System.out.println("Your password "+password);
		System.out.println("Your phone number is "+phoneNumber);
		
	}
	public static void main(String[]args) {
		Methodoverloadingwithnumberdifferentargs obj=new Methodoverloadingwithnumberdifferentargs();
		obj.login("ranjitha", "ranju@111");  //for string it should be in doubleqotes
		obj.login("ranju@111", 8088888888l);
		
	}
}
