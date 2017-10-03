
public class BankAtm  {

	// initializing Integer atmId variable
	int atmId;

	// initializing String bankName variable
	String bankName;

	// initializing String location variable
	String location;

	// initializing double balance variable
	double balance=30000;

	// declaring parameterized constructor

	BankAtm(int atmId, String bankName, String location,double balance) {

		// assigning values for instance variables

		this.atmId = atmId;

		this.bankName = bankName;

		this.location = location;
		
		this.balance=balance;


	}

	void withdraw(double amt) {

		// checking amount and balance by certain condition
		if (this.balance-amt< 10000 || amt >this.balance ) {

			// throw Custom Defined Exception

			try {

				throw new BankATMException("Please maintain minimum balance of 10000. You don't have sufficiant balance");

			} catch (BankATMException e) {

				System.out.println(e);
				// prints Withdrawal is not allowed
			}

		} else {

			this.balance -= amt;
			System.out.println("Withdrawal Amount : " + amt +" ATM ID : " + this.atmId + "  Your Current Balance  : " + this.balance);

			// withdrawal from balance
		}
	}
	void deposit(double amt) {

		this.balance += amt;// adding amount in balance
		System.out.println("Deposit Amount : " + amt +" ATM ID : " + this.atmId + "  Your Current Balance  : " + this.balance);

	}
}