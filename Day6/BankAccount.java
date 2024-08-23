public class BankAccount {
    // Private attribute to store the balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds for this withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1: Initial Balance Test
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance()); // Expected: 1000.0

        // Test Case 2: Deposit Test
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance()); // Expected: 1500.0

        // Test Case 3: Withdraw Test
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance()); // Expected: 1300.0

        // Test Case 4: Overdraw Test
        account.withdraw(2000.0);
        System.out.println("Balance after overdraw attempt: " + account.getBalance()); // Expected: 1300.0

        // Test Case 5: Negative Deposit Test
        account.deposit(-500.0);
        System.out.println("Balance after negative deposit attempt: " + account.getBalance()); // Expected: 1300.0
    }
}
