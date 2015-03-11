
/**
 * A NewspaperAd is a type of advert.
 * The cost is based upon a rate per cm.
 */
public class NewspaperAd extends Advert {

	private int ratePerCm;
    private int columnCm;
    
    public NewspaperAd(){
        super();
        ratePerCm = 0;
        columnCm = 0;
    }
    
    public NewspaperAd(int fee, int ratePerCm, int columnCm) {
        super(fee);
        this.ratePerCm = ratePerCm;
        this.columnCm = columnCm;
    }
    
    @Override
    public int cost() {
        return super.getFee() + ratePerCm*columnCm;
    }
    
    @Override
    public String toString() {
        return super.toString()
        + "[ratePerCm=" + ratePerCm + ", columnCm=" + columnCm + "]";
    }
}
