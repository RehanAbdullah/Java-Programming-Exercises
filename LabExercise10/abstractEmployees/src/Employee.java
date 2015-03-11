public abstract class Employee {


	//	Fields

	private int hoursWorked;
	private int	hourlyRate;
	private String fullName; 

	//	Constructors

	public Employee() {
		hoursWorked = 8;
		hourlyRate = 10;
		fullName = "Rehan";
	}
	public Employee(int hoursWorked, int hourlyRate,String fullName ) {
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		this.fullName = fullName;	
	}

	//	Methods
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int i) {
		hoursWorked = i;
	}

	//  Abstract Method calculatePay()
	public abstract int calculatePay();

	//	get methods
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int r) {
		hourlyRate =r;
	}

	public String getfullName() {
		return fullName;
	}

	//	set methods
	public void setfullName(String fullName) {
		this.fullName = fullName;
	}

	// toString
	public String toString() {
		return "Employee: fullName = " + fullName +", hourlyRate =" + hourlyRate +", hoursWorked=" + hoursWorked +"\n" ;

	}

}
