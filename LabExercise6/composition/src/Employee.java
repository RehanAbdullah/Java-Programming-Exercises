/**
 * An Employee has a name, date of employment, and salary.
 * This example shows how an Employee is a Composition of Name and Date objects.
 * 
 * @author la
 */
public class Employee {
    
	//Fields
    private Name name;
    private Date startDate;
    private double salary;
    
    
    //Constructors
    /** Creates a new instance of Employee, using default name and date values. 
     * The default annual salary is 10000. */
    public Employee() {
        name = new Name();
        startDate = new Date();
        salary = 10000;
    }
    
    /** Creates a new instance of Employee, with the given values. 
     * 
     * @param name the name of the employee
     * @param date the date employment starts/started
     * @param salary the annual salary 
     * */
    public Employee(Name name, Date startDate, double salary) {
        this.name = name;
        this.startDate = startDate;
        this.salary = salary;
    }
 
    
    //Methods
    public void setName(Name name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Name getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public double getSalary() {
        return salary;
    }
    
    /* NOTE - when writing a toString method where a field
     * is a reference type, rather than a primitive type if you use
     * the name of the variable, e.g. name or startDate as below,
     * it will automatically call their toString method so in the 
     * code below startDate evaluates as startDate.toString(). You
     * can of course explicitly write .toString() if you like.
     */
    public String toString() {
    	return "Employee:[name=" + name + ", startDate=" + startDate + ", salary="+ salary + "]";
    }
}
