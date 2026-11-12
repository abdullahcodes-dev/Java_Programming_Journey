class Payment {
    void makePayment(int amount) {
        System.out.println("Processing payment of PKR " + amount + ".");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment(int amount) {
        System.out.println("Processing credit card payment of PKR " + amount + ".");
    }
}

class JazzCash extends Payment {
    @Override
    void makePayment(int amount) {
        System.out.println("Processing JazzCash payment of PKR " + amount + ".");
    }
}

class BankTransfer extends Payment {
    @Override
    void makePayment(int amount) {
        System.out.println("Processing bank transfer of PKR " + amount + ".");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.makePayment(2500);

        payment = new JazzCash();
        payment.makePayment(1500);

        payment = new BankTransfer();
        payment.makePayment(5000);
    }
}
