package javaclass;

public class MobilePhone {
	    String brand = "Samsung";
	    String model = "Galaxy S21";
	    double price = 69999.99;

	    public void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        MobilePhone phone = new MobilePhone();
	        phone.displayDetails();
	    }
	}

