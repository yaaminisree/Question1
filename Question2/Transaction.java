package Question2;
public class Transaction {
	Account account;
	double amount;
	public static double deposit(Account account , double amount)
    {
    	 account.setBalance(account.getBalance() + amount);
    	 return account.getBalance();
    }
    public   static double withdraw(Account account ,  double amount)throws InsufficientBalanceException
   {
      //if account object balance – amount is less than 5000 then Exception should be thrown.
    	if (account.getBalance() <=5000)
    	{
    		account.setBalance(account.getBalance() - amount);
    		return account.getBalance();
    	}
    	else
    		throw new InsufficientBalanceException();
    	
   }
}
