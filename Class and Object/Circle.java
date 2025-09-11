package javaclass;

public class Circle {
	 double radius = 7.0;

	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + calculateArea());
	        System.out.println("Circumference: " + calculateCircumference());
	    }

	    public static void main(String[] args) {
	        Circle circle = new Circle();
	        circle.display();
	    }
	}

