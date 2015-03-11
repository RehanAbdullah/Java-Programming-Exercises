
public class FlexiEmployee extends Employee {


	//	Field

	private int flexiHours;

	//	Constructor

	public FlexiEmployee()
	{
		super();
		flexiHours = 0;
	}
	
	public FlexiEmployee(int hoursWorked, int hourlyRate,String fullName, int flexiHours)
	{
		super(hoursWorked, hourlyRate, fullName );
		this.flexiHours = flexiHours;
	}
	
	
	

	@Override
	public int calculatePay() {
		
		return ((getHoursWorked() + flexiHours) * getHourlyRate());
	}

}



//((hoursWorked + flexiHours) * hourlyRate)