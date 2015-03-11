/**
 * Every Advert has a fixed fee to cover production and overheads.
 * Class Advert captures these common features.
 * It is the superclass of all adverts, but cannot be instantiated
 * as it is abstract. It also enforces that subclasses override the
 * cost method.
 */
public abstract class Advert {
    
    private int fee;

    public Advert() {
        fee = 0; 
    }
    
    public Advert(int fee) {
        this.fee = fee; 
    }
    
    public abstract int cost();

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ":[fee=" + fee + "]";
    }
}

