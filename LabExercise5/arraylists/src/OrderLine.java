/**
 * A line on an order has a product id, unit cost, and a quantity ordered, e.g.
 * Baked Beans, 55p, quantity 7. The total price of the order line is calculated 
 * by the getCost() method, which multiplies unit price by quantity.
 * 
 * @author lz, la
 */
public class OrderLine {
	//Fields
	private String id; // the identifier for the item ordered
	private int unitPrice; // price of one item in pence
	private int quantity; // the number of items ordered

	
	//Constructors
	/**
	 * Default constructor. Sets the id to an empty string. Price and quantity
	 * are zero.
	 */
	public OrderLine() {
		this.id = "";
		this.unitPrice = 0;
		this.quantity = 0;
	}

	/**
	 * Constructs an OrderLine with the given id for the item ordered. 
	 * Price and quantity are zero.
	 * 
	 * @param id the name of the product.
	 */
	public OrderLine(String id) {
		this.id = id;
		this.unitPrice = 0;
		this.quantity = 0;
	}

	/**
	 * Constructs an OrderLine with the given values for id, unit price and
	 * quantity ordered.
	 * 
	 * @param id the name of the product.
	 * @param unitPrice the price of a single product.
	 * @param quantity the quantity of the product to be ordered.
	 */
	public OrderLine(String id, int unitPrice, int quantity) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	
	//Methods
	/** Sets the item id to the given value. 
	 * 
	 * @param id the name of the product.
	 * */
	public void setId(String id) {
		this.id = id;
	}

	/** Sets the unit price to the given value. 
	 * 
	 * @param unitPrice the price of a single product.
	 * */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	/** Sets the quantity ordered to the given value. 
	 * 
	 * @param quantity the quantity of the product to be ordered.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/** Returns the identifier for the items ordered. 
	 * 
	 * @return the identifier for the items ordered.
	 */
	public String getId() {
		return id;
	}

	/** Returns the price of one item. 
	 * 
	 * @return the price of a single product.
	 */
	public int getUnitPrice() {
		return unitPrice;
	}

	/** Returns the number of items ordered. 
	 * 
	 * @return the number of items ordered.
	 */
	public int getQuantity() {
		return quantity;
	}

	/** Calculates and returns the cost of the OrderLine. 
	 * Cost is unit price * quantity ordered.
	 * 
	 * @return the total cost of the order line.
	 */
	public int getCost() {
		return unitPrice * quantity;
	}

	/** Returns a textual representation of the order line. 
	 * 
	 * @return a textual representation of the order line.
	 */
	public String toString() {
		return "OrderLine:[id=" + id + ", unit price=" + unitPrice 
				+ ", quantity=" + quantity + "]";
	}
}
