import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's mark: ");
        int mark = scanner.nextInt();

        String result = (mark >= 50) ? "Pass" : "Fail";
        System.out.println(result);

        scanner.close();
    }
}
