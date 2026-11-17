abstract class BankAccount {
    abstract void processTransaction();
}

class SavingsAccount extends BankAccount {
    @Override
    void processTransaction() {
        System.out.println("Processing transaction for Savings Account.");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void processTransaction() {
        System.out.println("Processing transaction for Current Account.");
    }
}

public class BankingSystemAbstraction {
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount();
        account1.processTransaction();

        BankAccount account2 = new CurrentAccount();
        account2.processTransaction();
    }
}
