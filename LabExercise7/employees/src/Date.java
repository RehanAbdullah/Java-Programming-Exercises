import java.text.DecimalFormat; //imports DecimalFormat class

/**
 * A simple date record with day, month, year number values.
 * There is no validation in this class.
 * 
 * @author la, lz
 */
public class Date {
	
    //Fields
	private int day;    //1..31
    private int month;  //1..12
    private int year;
    
    
    //Constructors
    /** Creates a new instance of Date with date 01/01/2001 */
    public Date() {
        day = 1;
        month = 1;
        year = 2001;
    }
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    //Methods
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /** Returns a formatted date string.
     * @return A date in the format dd/mm/yyyy
     */
    public String getDateString() {
        DecimalFormat f = new DecimalFormat("00"); //used to ensure 1 outputs as 01
        return f.format(day) + "/" + f.format(month) + "/" + year;
    }
        
    public String toString() {
        return "Date:[day=" + day + ", month=" + month + ", year=" + year + "]";
    }
}
