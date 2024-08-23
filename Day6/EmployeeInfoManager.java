public class EmployeeInfoManager {
    // Private attributes for employee's name and salary
    private String name;
    private double salary;

    // Constructor to initialize employee information
    public EmployeeInfoManager(String initialName, double initialSalary) {
        name = initialName;
        setSalary(initialSalary);
    }

    // Method to set the employee's name
    public void setName(String newName) {
        name = newName;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }

    // Method to set the employee's salary with validation
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Method to get the employee's salary
    public double getSalary() {
        return salary;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1: Valid Name Test
        EmployeeInfoManager employee1 = new EmployeeInfoManager("John Doe", 50000.0);
        System.out.println("Name after setting to 'John Doe': " + employee1.getName()); // Expected: John Doe

        // Test Case 2: Valid Salary Test
        System.out.println("Salary after setting to 50000.0: " + employee1.getSalary()); // Expected: 50000.0

        // Test Case 3: Invalid Negative Salary Test
        employee1.setSalary(-10000.0);
        System.out.println("Salary after attempting to set to -10000.0: " + employee1.getSalary()); // Expected: 50000.0 (unchanged)

        // Test Case 4: Edge Case Zero Salary Test
        employee1.setSalary(0.0);
        System.out.println("Salary after setting to 0.0: " + employee1.getSalary()); // Expected: 0.0

        // Test Case 5: Change Name Test
        employee1.setName("Jane Smith");
        System.out.println("Name after changing to 'Jane Smith': " + employee1.getName()); // Expected: Jane Smith
    }
}
