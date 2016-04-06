
public class TestTwo {

	private double balance;
	
	public TestTwo() {
		balance = 0.0;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	}