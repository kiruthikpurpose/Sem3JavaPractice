import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class CarDealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter car make: ");
            String make = scanner.nextLine();

            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car year: ");
            int year = scanner.nextInt();

            System.out.print("Enter car price: ");
            double price = scanner.nextDouble();

            Car car = new Car(make, model, year, price);
            car.displayDetails();
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}
