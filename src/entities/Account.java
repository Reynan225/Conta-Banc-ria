package entities;

public class Account {
	
	public static final double TAX = 5.0;
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
	public void deposit(double amount) {
		balance += amount;	
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", number, holder, balance);
	}
}