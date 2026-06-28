import java.util.Scanner;

public class AtmMachine {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double depositAmount;
        double withdrawAmount;
        int choice;

        do {
            System.out.println("=== ATM Machine ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount you want to deposit: ");
                depositAmount = sc.nextDouble();
                balance += depositAmount;
            } else if (choice == 2) {
                System.out.print("Enter amount you want to withdraw: ");
                withdrawAmount = sc.nextDouble();

                if (withdrawAmount > balance) {
                    System.out.println("INSUFFICIENT BALANCE!");
                } else {
                    balance -= withdrawAmount;
                }
            } else if (choice == 3) {
                System.out.println("Current balance: " + balance);
            } else {
                System.out.println("INVALID CHOICE!");
            }
        } while (choice != 4);
        sc.close();
    }
}
