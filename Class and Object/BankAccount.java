package javaclass;

public class BankAccount {
	 String accountHolder = "Rahul Sharma";
	    String accountNumber = "1234567890";
	    double balance = 10000;

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount();
	        account.deposit(5000);
	        account.withdraw(3000);
	        account.displayBalance();
	    }
	
}
