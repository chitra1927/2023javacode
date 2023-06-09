package Asssignments;

public class bankAccount {
	
	private String accountNumber;
	
	private double balance;
	
	private String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double p) {
	    balance = p + balance;
		return balance;
	}
	
	public double withDraw(double w) {
		balance =  balance - w;
		return balance;
		
	}
	
	public void printStatement() {
		
		
	}

}
