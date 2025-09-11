package javaclass;

public class Item {
	 int itemCode = 101;
	    String itemName = "Pen Drive";
	    double price = 850.00;

	    public void displayDetails(int quantity) {
	        double totalCost = price * quantity;
	        System.out.println("Item Code: " + itemCode);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Cost: " + totalCost);
	    }

	    public static void main(String[] args) {
	        Item item = new Item();
	        item.displayDetails(3);
	    }
	
}
