public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping numbers
        a = a + b;
        b = a - b;
        a = a - b;

        // After swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
