package entities;

public class BankAccount {
	
	private String holder;
	private int accountNumber;
	private double balance;
	
	public BankAccount(String holder, int accountNumber, double initialDeposite) {
		super();
		this.holder = holder;
		this.accountNumber = accountNumber;
		deposit(initialDeposite);
	}
	
	public BankAccount(String holder, int accountNumber) {
		super();
		this.holder = holder;
		this.accountNumber = accountNumber;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double depositValue) {
		balance += depositValue; 
	}
	
	public void withdraw(double withdrawValue) {
		withdrawValue += 5; // adiciona a tava de 5 no saque
		balance -= withdrawValue;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ "  + balance;
	}
}
