import java.util.ArrayList;


public class IsaAccountTest {

	public static void main(String[] args) {

		IsaAccount m = new IsaAccount();   // test default constructor
		System.out.println(m.toString());  // test to toString
	
		
		IsaAccount s = new IsaAccount(100, 10, 10, 1000); // test default constructor
		System.out.println(s.toString());
		System.out.println();

		s.resetDepositRemaining();
		// System.out.println(s.toString());
		System.out.println("test depositRemaining Reset");
		System.out.println(s.resetDepositRemaining());
		System.out.println("should reset to 5000\n");

		System.out.println("Test get balance");
		System.out.println(s.getBalance());
		System.out.println("Display balance");

		System.out.println("test withdraw");
		s.withdraw(10);
		System.out.println(s.getBalance());
		System.out.println("Balance should have reduced by 10");
		
		
		System.out.println("Test get minimum balance");
		System.out.println(s.getMinimumBalance());
		System.out.println("Should display minimum balance");
		
		System.out.println("Now test that the deposit remaining actually works");
		s.deposit(4000);
		System.out.println(s.getDepositRemaining()+ "\t\tdeposited 4000, 1000 left");
		s.deposit(900);
		System.out.println(s.getDepositRemaining()+ "\t\tdeposited 900, 1000 left");

		System.out.println("deposited 1000,100 should be left, as it goes over DepositRemaining()" 
							+ "therefore the amount does not get deposited!");
		s.deposit(100);
		System.out.println(s.getDepositRemaining());


		System.out.println();
		System.out.println();
		
		ArrayList<IsaAccount> acc = new ArrayList<IsaAccount>();
		
		acc.add(new IsaAccount(100, 10, 10, 5000));
		acc.add(new IsaAccount(1000, 10, 25, 4000));
		acc.add(new IsaAccount(10, 10, 10, 5000));
		acc.add(new IsaAccount(2345, 10, 10, 2500));
		
		
		acc.add(new IsaAccount(25, 10, 10, 5000));
		
		for (IsaAccount a : acc) {
			System.out.println(a.toString());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		






	}

}
