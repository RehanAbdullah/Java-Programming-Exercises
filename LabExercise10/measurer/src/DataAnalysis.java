import java.util.ArrayList;


public class DataAnalysis {

	public static int sum (ArrayList<Measurable> objects) {
		int total = 0;
		for (Measurable obj : objects) {
			total = total + obj.getMeasure();
		}
		return total;
	}

	public static int avg (ArrayList<Measurable> objects) {

		int sum = 0, count=0;
		for (Measurable obj : objects) {
			sum = sum + obj.getMeasure();
			count++;
		}
		return sum/count;
	}


	public static int sum (ArrayList<Object> objects, Measurer meas)
	{
		int total = 0;
		for (Object obj : objects) {
			total = total + meas.measure(obj);
		}
		return total;
	}




}
