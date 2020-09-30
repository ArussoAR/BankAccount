
public class BankAccountTester {

	public static void main(String[] args) {
		
		//invokes BankAccount code lines 12-15
		BankAccount myBankAccount = new BankAccount(1000); 
		
		// runs BankAccount code lines 21-24
		myBankAccount.deposit(1500);
		
		// runs BankAccount code lines 31-34
		myBankAccount.withdrawal(500);
		System.out.println(myBankAccount.getBalance());
		

	}

}
