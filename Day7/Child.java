// Save this file as Main.java

interface AbstractInterface {
    void display(); // Abstract method to be implemented by classes
}

class Parent {
    String name;
    
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent implements AbstractInterface {
    
    Child(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        Child child = new Child("Charlie");
        child.display();
    }
}
