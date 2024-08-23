public class Student {
    private String name;
    private String id;  // Field for student ID

    // Constructor to initialize student name and ID
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to get student's name
    public String getName() {
        return name;
    }

    // Method to set student's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get student's ID
    public String getId() {
        return id;
    }

    // Method to set student's ID
    public void setId(String id) {
        this.id = id;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Test Case 1: Create and display student details
        Student student1 = new Student("Alice", "S001");
        System.out.println("Name: " + student1.getName());  // Expected: Alice
        System.out.println("ID: " + student1.getId());      // Expected: S001

        // Test Case 2: Update and display student details
        student1.setName("Bob");
        student1.setId("S002");
        System.out.println("Name: " + student1.getName());  // Expected: Bob
        System.out.println("ID: " + student1.getId());      // Expected: S002

        // Test Case 3: Create another student and display details
        Student student2 = new Student("Charlie", "S003");
        System.out.println("Name: " + student2.getName());  // Expected: Charlie
        System.out.println("ID: " + student2.getId());      // Expected: S003

        // Test Case 4: Create a student with empty details
        Student student3 = new Student("", "");
        System.out.println("Name: " + student3.getName());  // Expected: (empty)
        System.out.println("ID: " + student3.getId());      // Expected: (empty)

        // Test Case 5: Update details of an existing student
        student2.setName("Dave");
        student2.setId("S004");
        System.out.println("Name: " + student2.getName());  // Expected: Dave
        System.out.println("ID: " + student2.getId());      // Expected: S004
    }
}
