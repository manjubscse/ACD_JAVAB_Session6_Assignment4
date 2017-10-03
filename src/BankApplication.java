
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating 3 objects in BankAtm class

		BankAtm application1 = new BankAtm(1, "SBI", "Bangalore",30000);

		BankAtm application2 = new BankAtm(2, "SBI", "Mysore",9000);

		BankAtm application3 = new BankAtm(3, "SBI", "Shivamogga",20000);


		application1.withdraw(20000);// calling withdraw method for object 1

		application1.withdraw(10000);// calling withdraw method for object 1

		application1.deposit(10000);// calling deposit method for object 1


		System.out.println();
		application2.withdraw(20000);
		// prints session6.BankATMException: Withdrawal is not allowed

		application2.deposit(10000);// calling deposit method for object 2


		System.out.println();

		application3.withdraw(20000);// calling withdraw method for object 3

		application3.withdraw(10000);
		// prints session6.BankATMException: Withdrawal is not allowed


		application3.deposit(10000);// calling deposit method for object 3


		
	}

}
