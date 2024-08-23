abstract class Vehicle {
    String make;
    String model;
}

abstract class FourWheeler extends Vehicle {
    int numberOfDoors;
}

abstract class TwoWheeler extends Vehicle {
    boolean hasCarrier;
}

class Car extends FourWheeler {
    
    void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends TwoWheeler {
    
    void displayBikeDetails() {
        System.out.println("Bike Make: " + make);
        System.out.println("Bike Model: " + model);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Create and display details of a Car
        Car car = new Car();
        car.make = "Honda";
        car.model = "Civic";
        car.numberOfDoors = 4;
        car.displayCarDetails();
        
        // Create and display details of a Bike
        Bike bike = new Bike();
        bike.make = "Suzuki";
        bike.model = "Hayabusa";
        bike.hasCarrier = false;
        bike.displayBikeDetails();
    }
}
