import java.util.*;

public class MultiplicationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 * num2;

            System.out.printf("What is %d * %d?\n", num1, num2);
            System.out.print("Enter your answer (or 0 to exit): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == 0) {
                System.out.println("Thank you for practicing multiplication!");
                break;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.printf("Incorrect. The correct answer is %d.\n", correctAnswer);
            }
        }

        scanner.close();
    }
}
