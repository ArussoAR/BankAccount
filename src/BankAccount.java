
public class BankAccount {
	
	private double balance;
	
	/**
	 * constructs a bank account with zero balance
	 * @param amount 
	 */

	
	//same name as the class itself
	public BankAccount(double amount)
	{
		balance = amount;
		
	}
	
	/**
	 * makes a deposit into this account.
	 * @param amount the amount of the deposit
	 */
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		
	}
	
	/** makes a withdrawal from this account or charges a penaily 
	 * if the funds are not available
	 */
	
	public void withdrawal(double amount)
	{
		balance = balance - amount;
		
	}

	public double getBalance() {
		return balance;
	}
		
}