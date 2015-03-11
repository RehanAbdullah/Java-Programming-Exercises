import java.util.ArrayList;

/* Aggregation of Employees */
public class EmployeeRegister {
	
	//Fields
	private ArrayList<Employee> list;
	private String department;
	
	//Constructors
	public EmployeeRegister() {
		list = new ArrayList<Employee>();
		department = "Unspecified";
	}
	
	public EmployeeRegister(String department) {
		list = new ArrayList<Employee>();
		this.department = department;
	}
	
	//Methods
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void addEmployee(Employee e) {
		list.add(e);
	}
	
	public void removeEmployee(int pos) {
		list.remove(pos);
	}
	
	public Employee getEmployee(int pos) {
		return list.get(pos);
	}
	
	public int size() {
		return list.size();
	}
	
	public void clearRegister() {
		list.clear();
	}
	
	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}
	
	public double getTotalSalary() {
		//using for-each loop
		double total=0;
		for (Employee e : list) {
			total+=e.getSalary();
		}
		return total;
		
		//using Java 8 streams
		//return list.stream().mapToDouble(e -> e.getSalary()).sum();
	}
	
	public double getAverageSalary() {
		
		return (size() != 0) ? this.getTotalSalary() / this.size() : 0;
	}
	
	public String toString() {
		return "EmployeeRegister:[department=" + department + ", list=" + list + "]";
	}
}
