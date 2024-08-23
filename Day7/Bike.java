class Vehicle {
    String make;
    String model;
}

class Car extends Vehicle {
    int numberOfDoors;
    
    void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Bike extends Vehicle {
    String type;
    
    void displayBikeDetails() {
        System.out.println("Bike Make: " + make);
        System.out.println("Bike Model: " + model);
        System.out.println("Bike Type: " + type);
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.numberOfDoors = 4;
        car.displayCarDetails();
        
        Bike bike = new Bike();
        bike.make = "Yamaha";
        bike.model = "R1";
        bike.type = "Sport";
        bike.displayBikeDetails();
    }
}
