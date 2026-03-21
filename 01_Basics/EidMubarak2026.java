import java.util.Scanner;

public class EidMubarak2026 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println(
            "Eid Mubarak, " + name + "! Wishing you a blessed day."
        );
    }
}
