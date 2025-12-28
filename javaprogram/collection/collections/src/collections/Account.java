package collections;

public class Account {
	private double balance;
	private String name;
	private int account_number;
	public Account( String name, int account_number,double balance) {
		super();
		this.balance = balance;
		this.name = name;
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	
	
}
