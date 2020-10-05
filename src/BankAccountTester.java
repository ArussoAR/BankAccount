import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		//two ways 
		 //double newAmount = 1000;
		 //BankAccount myBankAccount = new BankAccount(newAmount;)
		// or BankAccount = new BankAccount(1000);
		
		
		Scanner input = new Scanner(System.in);
		
		//calculate interest percentage .05
		final double intPct = .05;
		System.out.print("Enter amount to start your account: ");
		
		double newAmount = input.nextDouble();
		
				
		//invokes BankAccount code lines 12-15
		BankAccount myBankAccount = new BankAccount(newAmount, intPct); 
		System.out.println("Created new account with "+newAmount +" balance");
		
		// runs BankAccount code lines 21-24
		// deposit $500
		myBankAccount.deposit(500);
	
	
		// runs BankAccount code lines 31-34
		// withdraw $250 
		myBankAccount.withdrawal(250);
		
		// print the balance
		System.out.println(myBankAccount.getBalance());
		

	}

}
