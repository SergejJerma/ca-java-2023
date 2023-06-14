import currencies.Currency;
import currencies.Dollar;
import currencies.Euro;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showSafeBox();
    }

    private static void showSafeBox() {
        System.out.println("What currency would you like to put into box - Dollar[D] / Euro[E] ?: ");
        String decision = scanner.nextLine();

        Box<Currency> box = new CurrencyBox(new Currency[10]);

        if (decision.equals("D"))
           box.putItems(new Dollar(1));
        else if (decision.equals("E"))
            box.putItems(new Euro(1));

        box.printItems();
    }
}


