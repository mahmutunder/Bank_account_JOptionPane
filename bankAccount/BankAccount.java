package bankAccount;
// open class
public class BankAccount {
	
	private double balance;
	
	
	// constructor the class no argumnets
	public BankAccount() {
		
		balance=0.0;
	}
	
	// constructor the start balance
	public BankAccount(double startBalance) {
		
		balance=startBalance;
	}
	
	// constructor string to double balance
	public BankAccount(String str) {
		balance=Double.parseDouble(str);
	}
	
	// open deposit method and add money
	public void deposit(double amount) {
		balance+=amount;
	}
	
	// open deposit method to turn string to double
	public void deposit(String str) {
		balance+=Double.parseDouble(str);
	}
	
	// with draw money alwas negetive
	public void withdraw(double amount) {
		
		balance-=amount;
		
	}
	
	// withdraw method turn double
	public void withdraw(String str) {
		
			
		balance -=Double.parseDouble(str);
		
	}
	
	// to seet balance to new balance
	public void setBalance(double b) {
		balance=b;
	}
	
	// to set the new balance to double 
	public void setBalance(String str) {
		balance=Double.parseDouble(str);
	}
	
	public double getBalance() {
		return balance;
	}
	

}
