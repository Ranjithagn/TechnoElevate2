package encapsulation;

public class Account {
private double balance=10000;

public double getBalance() {
	return balance;
}

public void setBalance(double amount) {
	this.balance = this.balance-amount;
}

}
