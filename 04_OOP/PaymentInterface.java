interface Payment {
    public void pay(int amount);
}

class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("Paid PKR " + amount + " using Credit Card.");
    }
}

class JazzCash implements Payment {
    public void pay(int amount) {
        System.out.println("Paid PKR " + amount + " using JazzCash.");
    }
}

class EasyPaisa implements Payment {
    public void pay(int amount) {
        System.out.println("Paid PKR " + amount + " using EasyPaisa.");
    }
}

public class PaymentInterface {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        JazzCash j = new JazzCash();
        EasyPaisa e = new EasyPaisa();

        c.pay(2500);
        j.pay(1500);
        e.pay(1000);
    }
}