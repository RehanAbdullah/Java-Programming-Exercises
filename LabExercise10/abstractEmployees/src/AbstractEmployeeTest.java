import java.util.ArrayList;
import java.util.List;


public class AbstractEmployeeTest {

	public static void main(String[] args) {

		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new OvertimeEmployee(65, 7,"Rehan", 14, 12));
		employees.add(new FlexiEmployee(65, 7,"Rehan" ,-5));
		employees.add(new BonusEmployee(65, 7, "Rehan" ,50));
		
		for(Employee e: employees){
			System.out.println(e.getfullName() + "\t" + e.calculatePay());
		}
		
		
		
	}

}
