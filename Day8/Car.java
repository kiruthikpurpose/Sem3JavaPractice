public final class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    public final String getModel() {
        return model;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");
        System.out.println("Car model: " + myCar.getModel());  // Output: Car model: Tesla Model S
    }
}
