import java.util.Scanner;

// Bank Account Class
class BankAccount {

    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Withdraw money
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Transaction failed: Insufficient balance.");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount: Rs. " + amount);
        }
    }

    // Deposit money
    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposit successful.");
            System.out.println("Deposited Amount: Rs. " + amount);
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}


// ATM Class
public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create bank account
        BankAccount account = new BankAccount(10000);

        int choice;

        do {
            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
