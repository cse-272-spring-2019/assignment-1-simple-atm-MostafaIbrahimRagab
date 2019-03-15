                                                                                                           
public class Account {

	private double balance;
	private int Cardnum;

	// cardnumber is 6667
	
	
	// Constructor .. Initializing balance to zero
	public Account() {
		balance = 0.00;
	}
	
	// Deposit Function
	
	public void deposit(int amount) {
		
		balance = balance + amount;
	}
	
	// Withdraw Function
	
	public void withdraw(int amount) {
		
		if (amount <= balance) {
			balance = balance - amount;
		}
		
		else {
			
			System.err.println("Error the amount you entered is not available");
			
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account num1 = new Account();
		Account num2 = new Account();
		Account num3 = new Account();
		
		
		num1.Cardnum = 12345;
		num2.Cardnum = 67891;
		num3.Cardnum = 23456;
		
		
		
	}

}
