package Question2;
import java.time.LocalDate;
import Question2.Account;
import Question2.Transaction;
import Question2.InsufficientBalanceException;
public class Main {

	public static void main(String[] args) {
		
		try {
			Account acc = new Account(1,"arjun",1000);	
			Transaction t = new Transaction();
			System.out.println(acc.getBalance());
			System.out.println(t.deposit(acc,50));
			
			System.out.println(acc.getBalance());
			System.out.println(t.withdraw(acc,50));
		}
		catch(InsufficientBalanceException ie)
		{
			System.out.println(ie.getMessage());
		}
	}

}
