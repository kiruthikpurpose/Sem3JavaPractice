class Animal {
    String speciesName;
}

class Mammal extends Animal {
    boolean hasFur;
}

public class Dog extends Mammal {
    String breed;
    
    void displayDetails() {
        System.out.println("Species: " + speciesName);
        System.out.println("Has Fur: " + hasFur);
        System.out.println("Breed: " + breed);
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speciesName = "Canine";
        dog.hasFur = true;
        dog.breed = "Golden Retriever";
        dog.displayDetails();
    }
}
