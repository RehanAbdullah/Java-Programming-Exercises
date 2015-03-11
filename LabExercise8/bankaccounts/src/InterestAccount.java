/**
 * An InterestAccount is a more specialised version of BankAccount.
 * It has an interest rate associated with it and a method to add interest.
 * Also there should be a minimum balance in the account.
 * 
 * @author la, lz
 */
public class InterestAccount extends BankAccount {

	//Fields
    private int interestRate;   //e.g. 0 - 100, e.g. 5 represents a 5% annual interest
    private int minimumBalance; //pence

    
    //Constructors
    /** Creates an InterestAccount with zero interest rate
     * and minimum balance  of 100 pence, i.e. 1 pound. */
    public InterestAccount() {
        super();	//call the superclass constructor
        interestRate = 0;
        minimumBalance = 100;
    }

    /** Creates an InterestAccount with the given initial values.
     * @param balance The opening balance in pence.
     * @param interestRate  The interest rate for this account.
     * @param minimumBalance The amount below which the balance should not fall. */
    public InterestAccount(int balance, int interestRate, int minimumBalance) {
        super(balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    
    //Methods
    /** Increases the balance by this accounts annual interest rate. */
    public void addInterest() {
    	//e.g. 10% of 50 would be (10*50)/100 = 5
    	int amount = (super.getBalance() * interestRate) / 100;
    	super.deposit(amount); //could also have just called deposit(amount), super makes it more clear
    }

    /** Withdraw the given amount of money from the account. This succeeds only
     * if there are sufficient funds such that the resulting balance is
     * at least the minimum balance. This methods overrides the withdraw method
     * in BankAccount.
     * @param amount The amount to withdraw in pence. */
    @Override
    public void withdraw(int amount) {
        if (super.getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        }
    }

    /** Sets the interest rate.
     * @param interestRate The interest rate 0 - 100, 
     * e.g. 5 represents 5% annual interest. */
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    /** Return the annual interest rate.
     * @return The current annual interest rate. */
    public double getInterestRate() {
        return interestRate;
    }
    
    /** Sets the minimum balance.
     * @param minimumBalance The minimum balance. */
    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    /** Return the minimum balance.
     * @return The current minimum balance. */
    public int getMinimumBalance() {
        return minimumBalance;
    }
    
    /** Returns a textual representation of this interest account.
     *  @return A textual representation of this interest account. */
    @Override
    public String toString() {
    	//Firstly call superclass toString method, then add specialised field information
        return super.toString() + "[interestRate=" + interestRate + ", minimumBalance=" + minimumBalance + "]";
    }
}
