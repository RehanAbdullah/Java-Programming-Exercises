
/**
 * A Billboard is a type of advert.
 * The cost is based upon a daily rate.
 */
public class Billboard extends Advert {
    
    private int dailyRate;
    private int numOfDays;
    
    public Billboard(){
        super();
        dailyRate = 0;
        numOfDays = 0;
    }
    
    public Billboard(int fee, int dailyRate, int numOfDays) {
        super(fee);
        this.dailyRate = dailyRate;
        this.numOfDays = numOfDays;
    }
    
    @Override
    public int cost() {
        return super.getFee() + dailyRate*numOfDays;
    }
    
    @Override
    public String toString() {
        return super.toString()
        + "[dailyRate=" + dailyRate + ", numOfDays=" + numOfDays + "]";
    }
}

