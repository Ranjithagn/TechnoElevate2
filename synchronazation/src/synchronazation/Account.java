package synchronazation;

public class Account {
int balance;

public Account(int balance) {
	super();
	this.balance = balance;
}
public void withdraw(int amount){
	if(balance<amount){
		System.out.println("Insufficient balance");
	}else{
		balance=balance-amount;
	}
}
public  void deposit(int amount){
	balance=balance+amount;
}
public void checkbalance(){
	System.out.println(balance);
}
}
