abstract class Person {
    String name;
    int age;
}

abstract class Employee {
    String employeeId;
    double salary;
}

public class Manager extends Person {
    String employeeId;
    double salary;
    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 45;
        mgr.employeeId = "M456";
        mgr.salary = 95000.00;
        mgr.displayDetails();
    }
}
