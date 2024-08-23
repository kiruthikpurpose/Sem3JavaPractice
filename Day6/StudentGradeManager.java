public class StudentGradeManager {
    // Private attribute to store the student's grade
    private int grade;

    // Constructor to initialize the grade
    public StudentGradeManager(int initialGrade) {
        setGrade(initialGrade);
    }

    // Method to set the grade with validation
    public void setGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            grade = newGrade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }

    // Method to get the current grade
    public int getGrade() {
        return grade;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1: Valid Grade Test
        StudentGradeManager student1 = new StudentGradeManager(85);
        System.out.println("Grade after setting to 85: " + student1.getGrade()); // Expected: 85

        // Test Case 2: Invalid High Grade Test
        student1.setGrade(110);
        System.out.println("Grade after setting to 110: " + student1.getGrade()); // Expected: 85 (unchanged)

        // Test Case 3: Invalid Low Grade Test
        student1.setGrade(-10);
        System.out.println("Grade after setting to -10: " + student1.getGrade()); // Expected: 85 (unchanged)

        // Test Case 4: Edge Case Low Grade Test
        student1.setGrade(0);
        System.out.println("Grade after setting to 0: " + student1.getGrade()); // Expected: 0

        // Test Case 5: Edge Case High Grade Test
        student1.setGrade(100);
        System.out.println("Grade after setting to 100: " + student1.getGrade()); // Expected: 100
    }
}
