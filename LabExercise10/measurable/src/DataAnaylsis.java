import java.util.ArrayList;


public class DataAnaylsis {

	public static int sum (ArrayList<Measurable>objects) {
		int total = 0;
		for (Measurable obj : objects) {
			total = total + obj.getMeasure();
		}
		return total;
	}

	public static int avg (ArrayList<Measurable>objects) {

		int sum = 0, count=0;
		for (Measurable obj : objects) {
			sum = sum + obj.getMeasure();
			count++;
		}
		return sum/count;
	}



}
