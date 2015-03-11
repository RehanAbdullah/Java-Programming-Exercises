
public class RectangleTest {

	public static void main(String[] args) {
				
		Rectangle r = new Rectangle(3,3, 2, 3);
		System.out.println(r.toString());
		System.out.println("Area? " + r.getArea());
		System.out.println("Perimeter? " + r.getPerimeter());
		
		System.out.println("Moving (2,2)");
		r.move(2, 2);
		System.out.println(r.toString());
		
		System.out.println("Expanding (2,2)");
		r.expand(2, 2);
		System.out.println(r.toString());
		
		r.printRectangleGrid('^', 12, 12);
		
		System.out.println("Expanding (0.5,1)");
		r.expand(0.5, 1);
		
		r.printRectangleGrid('*', 15, 15);
		
		System.out.println("Moving (-2,4)");
		r.move(-2, 4);
		
		r.printRectangleGrid('%', 20, 20);
		
		
		
		
	}

}
