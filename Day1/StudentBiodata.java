import java.util.Scanner;

public class StudentBiodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for student biodata
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student's grade: ");
        scanner.nextLine(); // Consume newline
        String grade = scanner.nextLine();

        System.out.print("Enter student's major: ");
        String major = scanner.nextLine();

        // Print the student's biodata
        System.out.println("Student Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);

        // Close the scanner
        scanner.close();
    }
}
