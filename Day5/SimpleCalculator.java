import java.util.Scanner;

public class SimpleCalculator {
    private double number1;
    private double number2;
    private char operation;

    // Method to perform calculations
    private void calculate() {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please select +, -, *, or /.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            boolean continueCalculating = true;

            while (continueCalculating) {
                System.out.print("Enter number 1: ");
                double number1 = scanner.nextDouble();

                System.out.print("Enter number 2: ");
                double number2 = scanner.nextDouble();

                System.out.print("Enter operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                SimpleCalculator calculator = new SimpleCalculator();
                calculator.number1 = number1;
                calculator.number2 = number2;
                calculator.operation = operation;
                calculator.calculate();

                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String response = scanner.next();
                continueCalculating = response.equalsIgnoreCase("yes");
            }
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}
