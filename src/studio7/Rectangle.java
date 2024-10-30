package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
	
    public double perimeter() {
        return 2 * (length + width);
    }

   
    public boolean isSmallerThan(Rectangle other) {
        return this.area() < other.area();
    }

   
    public boolean isSquare() {
        return length == width;
    }

   
    public void draw(double x, double y) {
        StdDraw.rectangle(x, y, width / 2, length / 2);
    }

    
    public static void main(String[] args) {
        double x1 = Math.random();
        double x2 = Math.random();
        double y1 = Math.random();
        double y2 = Math.random();
        Rectangle rect1 = new Rectangle(x1, y1);
        Rectangle rect2 = new Rectangle(x2, y2);
        
        System.out.println("Rectangle 1 Area: " + rect1.area());
        System.out.println("Rectangle 1 Perimeter: " + rect1.perimeter());
        System.out.println("Is Rectangle 1 smaller than Rectangle 2? " + rect1.isSmallerThan(rect2));
        System.out.println("Is Rectangle 1 a square? " + rect1.isSquare());

      
        StdDraw.setScale(-3, 3);
        rect1.draw(2, 2);
        rect2.draw(-2,-2 );
    }
}
 
		
	


