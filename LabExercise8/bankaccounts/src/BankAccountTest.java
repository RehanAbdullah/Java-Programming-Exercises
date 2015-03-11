import java.util.ArrayList;

public class BankAccountTest {

    public static void main(String[] args) {
        /* Testing BankAccount */
    	BankAccount acc = new BankAccount(100);
        System.out.println(acc.toString());
        acc.deposit(50);
        acc.withdraw(40);
        System.out.println(acc.getBalance()); //balance = 110
        acc.withdraw(150);
        System.out.println(acc.getBalance()); //balance = -40

        
        /* Testing InterestAccount */
        InterestAccount intacc = new InterestAccount(3000, 5, 1000);
        System.out.println("\n" + intacc.toString());
        intacc.withdraw(1800);
        System.out.println(intacc.getBalance()); //balance = 1200
        intacc.addInterest();
        System.out.println(intacc.getBalance()); //balance = 1260
        intacc.withdraw(500);
        System.out.println(intacc.getBalance()); //balance = 1260 - no change

        
        /* Notice how an instance of a sub-class can be assigned
         * to a variable of super-class type. Dynamic method lookup
         * ensures the overridden InterestAccount withdraw(...) method
         * is invoked. However, if you try to invoke the addInterest()
         * method it will not work as BankAccount does not implement it. */
        BankAccount myacc = new InterestAccount(1500, 2, 1000);
        System.out.println("\n" + myacc.toString()); //displays InterestAccount even though stored in BankAccount variable
        System.out.println(myacc.getBalance()); //balance = 1500
        myacc.withdraw(600);
        System.out.println(myacc.getBalance()); //balance = 1500 - no change
        //myacc.addInterest(); // <--- try removing this comment, will give syntax error
        
        
        /* TEST StudentAccount here... */
        
        
        
        /* TEST IsaAccount here... */
        
        
        
        /* Create ArrayList to hold different types of bank account. */
        ArrayList<BankAccount> banks = new ArrayList<BankAccount>();
        //Objects of type BankAccount or any of its subclasses can be added
        banks.add(new BankAccount(3000));  
        banks.add(new InterestAccount(2500, 3, 1000));
        banks.add(new InterestAccount(6000, 5, 5000));
        banks.add(new BankAccount(1200));
        /* ADD objects of type StudentAccount and IsaAccount once implemented */
        
        System.out.println("\nProcessing bank accounts in list...");
        //different type of object can be processed uniformly, this is known as polymorphism 
        for (BankAccount b : banks) {
        	//subclass instances will either invoke inherited or overridden methods
        	System.out.println("=====\n" + b.toString());
        	System.out.println("Balance = " + b.getBalance());
        	b.deposit(300);
        	System.out.println("Balance = " + b.getBalance());
        	b.withdraw(1500);
        	System.out.println("Balance = " + b.getBalance());
        }
        
        
    }
}

