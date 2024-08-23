class Person {
    String name;
    int age;
}

class Employee extends Person {
    String employeeId;
    String department;
    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 30;
        emp.employeeId = "E123";
        emp.department = "HR";
        emp.displayDetails();
    }
}
