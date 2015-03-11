/**
 * A BankAccount is the root class of more specialist accounts, such as 
 * an Interest Account or Student Account.
 * The BankAccount class captures the essential property of all accounts:
 * it has a balance, and money can be deposited and withdrawn. 
 * 
 * @author la, lz
 */
public class BankAccount {

    //Fields
    private int balance; //balance in units of pence

    
    //Constructors
    /** Creates a BankAccount with zero balance. */
    public BankAccount() {
        balance = 0;
    }

    /** Creates a BankAccount with the given balance. 
     * @param balance The starting balance of this account. */
    public BankAccount(int balance) {
        this.balance = balance;
    }

    
    //Methods
    /** Put money into the account.
     * @param amount The amount to deposit in pence. */
    public void deposit(int amount) {
        balance = balance + amount;
    }

    /** Take money out of the account.
     * @param amount The amount to withdraw in pence. */
    public void withdraw(int amount) {
        balance = balance - amount;
    }

    /** Returns the account balance.
     * @return The balance in pence. */
    public int getBalance() {
        return balance;
    }

    /** Returns a textual representation of this bank account.
     * @return A textual representation of this account. */
    @Override
    public String toString() {
    	//Rather than hard-coding the name of the class, get it dynamically
    	//as subclasses will reuse this method
        return this.getClass().getName() + ":[balance=" + balance + "]";
    }
}
