
public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day = 4;
		String dayString;
		
		switch (day) {
			
			case 1: dayString = "monday";
			break;
			case 2: dayString = "tuesday";
			break;
			case 3: dayString = "wednesday";
			break;
			case 4: dayString = "thursday";
			break;
			case 5: dayString = "friday";
			break;
			case 6: dayString = "saturday";
			break;
			case 7: dayString = "sunday";
			break;
			default: dayString = "Invalid day";
			break;
		}
		
		System.out.println(dayString);
		
	}

}
