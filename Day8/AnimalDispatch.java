public class AnimalDispatch {
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    static void printSound(Animal a) {
        a.makeSound();  // Calls the appropriate makeSound method
    }
    
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        
        printSound(myAnimal);  // Output: Animal makes a sound
        printSound(myDog);     // Output: Dog barks
    }
}
