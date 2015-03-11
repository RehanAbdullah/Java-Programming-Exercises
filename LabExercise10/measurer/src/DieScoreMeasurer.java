
public class DieScoreMeasurer implements Measurer {
	
	public int measure(Object o) {
		Die s = (Die) o;
		return s.getScore();
	}

}
