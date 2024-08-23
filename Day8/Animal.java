public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        
        myAnimal.makeSound();  // Output: Animal makes a sound
        myDog.makeSound();     // Output: Dog barks
    }
}
