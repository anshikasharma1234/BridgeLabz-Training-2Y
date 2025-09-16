package java_OOPS;

public class CARRENTAL {
	    String customerName;
	    String carModel;
	    int rentalDays;
	    double costPerDay;
	    
	    CARRENTAL() {
	        customerName = "Unknown";
	        carModel = "Not Assigned";
	        rentalDays = 0;
	        costPerDay = 1000;  // default rate per day
	    }
	    CARRENTAL(String customerName, String carModel, int rentalDays, double costPerDay) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        this.costPerDay = costPerDay;
	    }
	    CARRENTAL(CARRENTAL rental) {
	        this.customerName = rental.customerName;
	        this.carModel = rental.carModel;
	        this.rentalDays = rental.rentalDays;
	        this.costPerDay = rental.costPerDay;
	    }
	    double calculateTotalCost() {
	        return rentalDays * costPerDay;
	    }
	    
	    void displayDetails() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Rental Days: " + rentalDays);
	        System.out.println("Cost per Day: " + costPerDay);
	        System.out.println("Total Cost: " + calculateTotalCost());
	        System.out.println("-----------------------------");
	    }
	    
	    public static void main(String[] args) {
	    	CARRENTAL rental1 = new CARRENTAL();
	        rental1.displayDetails();
	        
	        CARRENTAL rental2 = new CARRENTAL("Rahul Sharma", "Toyota Innova", 5, 1500);
	        rental2.displayDetails();
	        
	        CARRENTAL rental3 = new CARRENTAL(rental2);
	        rental3.displayDetails();
	    }
	}

