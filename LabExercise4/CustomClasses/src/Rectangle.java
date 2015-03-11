
public class Rectangle {
	//fields
	private int x;
	private int y;
	private int w;
	private int h;

	//constructors
	public Rectangle() {
		this(0,0,5,5);
	}

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y= y;
		this.w = w;
		this.h = h;
	}


	//methods
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public int getArea() {
		return w * h; 
	}

	public int getPerimeter() {
		return 2 * (w+h);
	}

	public void move(int dx, int dy) {
		x+=dx;
		y+=dy;
	}

	public void expand(double scaleW, double scaleH) {
		w = (int) Math.round(w*scaleW);
		h = (int) Math.round(h*scaleH);
	}

	public String toString() {
		return "Rectangle:[x=" + x + ", y=" + y + ", w=" + w + ", h=" + h + "]";
	}


	public void printRectangleGrid(char fill, int width, int height) {
		for (int i = 1; i <= width; i++) {

			for (int j = 1; j <= height; j++) {
				//PRINT GRID
				if (j == 1) {
					System.out.print(i + "\t");
				} else if (i == 1) {
					System.out.print(j + "\t");
				} else {

					//PRINT RECTANGLE
					if ((j >= x && j < (x+w)) && (i >= y && i < (y+h))) {
						System.out.print(fill + "\t");
					} else {
						System.out.print("\t");
					}

				}
			}

			System.out.println("\n");
		}
	}	

}
