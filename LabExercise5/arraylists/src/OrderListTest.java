import java.util.ArrayList;


public class OrderListTest {

	public static void main(String[] args) {

		
		ArrayList<OrderLine> orders = new ArrayList<OrderLine>();	
		
		orders.add(new OrderLine("Milk",100,30));
		orders.add(new OrderLine("Bread",150,45));
		orders.add(new OrderLine("Chocolate",50,150));
		orders.add(new OrderLine("Cereal",200,15));
		
		double total = 0;
		double average = 0;
		
		for (OrderLine ol : orders) {
		System.out.println("Orderline item\n=============");
		System.out.println("Name: " + ol.getId());
		System.out.println("Unit Price: " + ol.getUnitPrice());
		System.out.println("Quantity: " + ol.getQuantity());
		System.out.println("Cost: " + ol.getCost() + "\n");
		
		total = total + ol.getCost();
	}

	System.out.println(String.format("Total cost of order is: £%.2f\n", (total/100)));
	System.out.println(String.format("Average cost of order is: £%.2f\n", ((total/100)/orders.size())));
	System.out.println("Total number of orders is : " + orders.size());
	}

}
