
public class IsaAccount extends InterestAccount {
	
	//fields
	private int depositRemaining;
	
	//constructors

	public IsaAccount(){
		super();
		depositRemaining = 5000;
	}
	
	public IsaAccount(int depositRemaining){
		super();
		this.depositRemaining = depositRemaining;
	}
	
	//methods
	
	@Override
	public void deposit(int amount)
	{
		while((depositRemaining - amount) >= 0 )
		{
			depositRemaining = depositRemaining - amount;
			super.deposit(amount);
		}
	}
	
	public int getDepositRemaining(){
		return depositRemaining;
	}
	
	public void resetDepositRemaining() {
		depositRemaining = 5000;
	}
	
	public String toString(){
		return super.toString()+ "[ Deposit Remaining = " +depositRemaining+ " ]";
	}

}
