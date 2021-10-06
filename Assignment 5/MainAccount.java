class MainAccount
{
	public static void main(String[] args)
	{
		Account a = new Account(102,"Saving","john",5678);
		System.out.println(a.getAccountNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getAccountHolderName());
		System.out.println(a.getAccountBalance());
	}
}