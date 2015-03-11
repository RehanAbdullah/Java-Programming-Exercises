
public class BonusEmployee extends Employee {
	
//	Fields
	
	private int BonusAmount;
	
	
//	Constructors
	
	public BonusEmployee()
	{
		super();
		BonusAmount = 0;
	}
	
	public BonusEmployee(int hoursWorked, int hourlyRate,String fullName, int BonusAmount)
	{
		super(hoursWorked, hourlyRate, fullName );
		this.BonusAmount = BonusAmount;
	}
	
	
	
	

	@Override
	public int calculatePay() {
		return ((getHoursWorked() * getHourlyRate()) + BonusAmount);
	}

}


//((hoursWorked * hourlyRate) + bonusAmount)