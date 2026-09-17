public class BankAccount {
    public String accountNumber;
    public double balance;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();

        a1.accountNumber = "P4X2553834030823";
        a1.balance = 100000.26;

        a1.deposit(1500);
        a1.withdraw(6000);  
        a1.displayBalance();
    }
}
