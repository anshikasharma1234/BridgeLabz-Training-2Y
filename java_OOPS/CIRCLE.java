package java_OOPS;

public class CIRCLE {
	    private double radius;

	    public CIRCLE() {
	        this(1.0); 
	    }

	    public CIRCLE(double radius) {
	        this.radius = radius;
	    }
	    public double getRadius() {
	        return radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + getArea());
	        System.out.println("Circumference: " + getCircumference());
	    }

	    public static void main(String[] args) {
	        CIRCLE c1 = new CIRCLE();     
	        CIRCLE c2 = new CIRCLE(5.0); 

	        System.out.println("Default Circle:");
	        c1.display();

	        System.out.println("\nCircle with radius 5.0:");
	        c2.display();
	    }
	
}
