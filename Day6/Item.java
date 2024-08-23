public class Item {
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    private double price;

    // Constructor
    public Item(double price) {
        this.price = price;
    }

    // Method to sell item
    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += quantity * price;
    }

    // Static methods to get totals
    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1: Basic Sale
        Item laptop = new Item(1000.0);
        laptop.sell(2);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  // Expected: 2
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());      // Expected: 2000.0

        // Test Case 2: Multiple Item Sale
        Item smartphone = new Item(500.0);
        smartphone.sell(5);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  // Expected: 7
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());      // Expected: 3500.0

        // Test Case 3: No Sales
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  // Expected: 7
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());      // Expected: 3500.0

        // Test Case 4: Mixed Item Sale
        Item mixedLaptop = new Item(1000.0);
        Item mixedSmartphone = new Item(500.0);
        mixedLaptop.sell(1);
        mixedSmartphone.sell(4);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  // Expected: 12
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());      // Expected: 5500.0

        // Test Case 5: Large Quantity Sale
        Item largeLaptop = new Item(1000.0);
        largeLaptop.sell(100);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());  // Expected: 112
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());      // Expected: 150500.0
    }
}
