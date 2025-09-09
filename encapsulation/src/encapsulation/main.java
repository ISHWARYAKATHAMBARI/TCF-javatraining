package encapsulation;

public class main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", "Ash", 5000);

        account.displayAccountInfo();

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(10000);

        account.displayAccountInfo();
    }


		// TODO Auto-generated method stub

	}


