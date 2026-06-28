import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static double money = 50.0;

    public static void printStatus() {
        System.out.println("--- CURRENT STATUS ---");
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " g");
        System.out.println("Cups: " + cups);
        System.out.printf("Money: $%.2f%n", money);
    }

    public static void buyCoffee(Scanner sc) {
        System.out.print(
            "What do you want to buy? 1-Espresso, 2-Latte, 3-Cappuccino: "
        );
        int choice = sc.nextInt();
        if (choice == 1) {
            if (water >= 250 && beans >= 16 && cups >= 1) {
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4.00;

                System.out.println("Making your coffee...Enjoy!");
            } else {
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                }
                if (beans < 16) {
                    System.out.println("Sorry, not enough beans!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
            }
        } else if (choice == 2) {
            if (water >= 350 && beans >= 20 && cups >= 1 && milk >= 75) {
                water -= 350;
                beans -= 20;
                cups -= 1;
                milk -= 75;
                money += 7.00;

                System.out.println("Making your coffee...Enjoy!");
            } else {
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                }
                if (beans < 20) {
                    System.out.println("Sorry, not enough beans!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
            }
        } else if (choice == 3) {
            if (water >= 200 && beans >= 12 && cups >= 1 && milk >= 100) {
                water -= 200;
                beans -= 12;
                cups -= 1;
                milk -= 100;
                money += 6.00;

                System.out.println("Making your coffee...Enjoy!");
            } else {
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                }
                if (beans < 12) {
                    System.out.println("Sorry, not enough beans!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
            }
        } else {
            System.out.println("INVALID CHOICE!");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int userChoice;

        do {
            System.out.println("=== COFFEE MACHINE MENU ===");
            System.out.println("1. Buy a coffee");
            System.out.println("2. Take the money");
            System.out.println("3. Check machine status");
            System.out.println("4. Turn off machine");
            System.out.println("================================");

            System.out.print("What would you like to do? (1-4): ");
            userChoice = sc.nextInt();

            if (userChoice == 1) {
                buyCoffee(sc);
            } else if (userChoice == 2) {
                System.out.printf("I gave you $%.2f%n", money);
                money = 0;
            } else if (userChoice == 3) {
                printStatus();
            }
        } while (userChoice != 4);

        sc.close();
    }
}
