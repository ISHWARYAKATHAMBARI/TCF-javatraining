package encapsulation;

public class BankAccount {
	
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        if (balance >= 0) {
	            this.balance = balance;
	        } else {
	            this.balance = 0;
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	        }
	    }

	    // Getters and Setters
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be greater than 0.");
	        }
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdraw amount or insufficient balance.");
	        }
	    }

	    // Display account info
	    public void displayAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	    }
	}



