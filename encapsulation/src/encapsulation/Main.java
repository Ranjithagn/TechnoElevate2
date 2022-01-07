package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account = new Account();
System.out.println(account.getBalance());
account.setBalance(1999);
System.out.println(account.getBalance());
	}

}
