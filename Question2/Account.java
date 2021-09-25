package Question2;

import java.time. LocalDate;

public class Account {
	private int accountNumber;
    private String accountHolderName;
    LocalDate openedDate;
    private double balance;
   
    public Account() {
    }
	public Account(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.openedDate = LocalDate.now();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public LocalDate getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance =balance;
	}
    /*private double validateBalance(double balance)
    {
    	if (balance>=5000)
    		return (balance);
    	else
    		return (balance=5000);
    }*/
}
