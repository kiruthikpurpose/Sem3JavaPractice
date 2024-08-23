public class StudentGreetings {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        greetStudents(students);
    }
    
    public static void greetStudents(String[] students) {
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }
}
