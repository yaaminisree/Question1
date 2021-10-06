class Account
{
	private int accountNumber;
	private String accountType;
	private String accountHolderName;
	private double accountBalance;
	public Account()
	{

	}
	public Account(int accountNumber,String accountType,String accountHolderName,double accountBalance)
	{
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountBalance=accountBalance;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance=validateBalance(accountBalance);
	}
	private double validateBalance(double accountBalance)
	{

		return (accountBalance > 5000)?accountBalance:5000;
	}
	public double getAccountBalance()
	{
		return accountBalance;	
	}
/*	public String toString()
	{
		return accountNumber+" "+accountType+" "+accountHolderName+" "+accountBalance;	
	}
*/
}
