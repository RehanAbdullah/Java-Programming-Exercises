
public class OvertimeEmployee extends Employee {

//Fields
	
//	overtimeHours
	private int overtimeHours;
	private int overtimeRate;
	
//Constructors
	
	public OvertimeEmployee()
	{
		super();
		overtimeHours = 0;
		overtimeRate = 0;
	}
	
	public OvertimeEmployee(int hoursWorked, int hourlyRate,String fullName, int overtimeHours, int overtimeRate)
	{
		super(hoursWorked, hourlyRate, fullName );
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		
	}
	
	
	@Override
	public int calculatePay() {
		
		return ((((getHoursWorked()) - overtimeHours) * getHourlyRate()) + (overtimeHours * overtimeRate));
	}
	
}


//(((hoursWorked - overtimeHours) * hourlyRate) + (overtimeHours * overtimeRate))