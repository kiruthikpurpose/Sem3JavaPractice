import java.util.Scanner;

class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    // Constructor
    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    // Method to display student details and average grade
    public void displayDetails() {
        double average = (homeworkGrade + finalExamGrade) / 2;
        System.out.println("Student Name: " + name);
        System.out.println("Homework Grade: " + homeworkGrade);
        System.out.println("Final Exam Grade: " + finalExamGrade);
        System.out.println("Average Grade: " + average);
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter homework grade: ");
            double homeworkGrade = scanner.nextDouble();

            System.out.print("Enter final exam grade: ");
            double finalExamGrade = scanner.nextDouble();

            Student student = new Student(name, homeworkGrade, finalExamGrade);
            student.displayDetails();
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}
