
public class BankAccount {
	
	private double balance; 
	private double interestPct;
	
	/**
	 * constructs a bank account with zero balance
	 * @param amount 
	 */

	
	//same name as the class itself
	public BankAccount(double amount,double intPct)
	{
		balance = amount;
		interestPct = intPct;
		
	}
	
	

	/**
	 * makes a deposit into this account.
	 * @param amount the amount of the deposit
	 */
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		
	}
	
	/** makes a withdrawal from this account or charges a penalty 
	 * if the funds are not available
	 */
	
	public void withdrawal(double amount)
	{
		balance = balance - amount;
		 double amount1 = 1000;
		double withdrawal = 250;
		if (amount1 > withdrawal) {System.out.println("amount > withdrawal");}
		else {System.out.println("Insufficient Funds to support withdrawal");}
	}
/** gets the current balance of this bank account
 */
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void calcInterest() {
		
		 balance = 300;
		double intPct = .05;
		
	balance = balance + (intPct*balance);
		
	}}
	
		
		
		

