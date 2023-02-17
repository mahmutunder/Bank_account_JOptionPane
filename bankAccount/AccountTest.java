package bankAccount;

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		
		input=JOptionPane.showInputDialog("What is your starting accounting balance");
		
		BankAccount account = new BankAccount(input);
		input=JOptionPane.showInputDialog("How much you were paid this month");
		
		account.deposit(input);
		
		JOptionPane.showMessageDialog(null,
				String.format("Your pay has been deposit \n" + "Your current balance is $%,.2f",account.getBalance()));
		
		
		input=JOptionPane.showInputDialog("How much would like to withdraw?");
		
		account.withdraw(input);
		
		JOptionPane.showMessageDialog(null,
				String.format("Your current balance is \n" + "%,.2f", account.getBalance()));

		
		System.exit(0);
	}

}
