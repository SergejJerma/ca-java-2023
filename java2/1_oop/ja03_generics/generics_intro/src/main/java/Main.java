import currencies.Currency;
import currencies.Dollar;
import currencies.Euro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showSafeBox();
    }

    private static void showSafeBox() {
        System.out.println("What currency would you like to put into box - Dollar[D] / Euro[E] ?: ");
        String decision = scanner.nextLine();

        String currency = decision.substring(0, 1);
        String[] amount = decision.substring(2).split(",");

        Box<Currency> box = new CurrencyBox(new Currency[10]);

        if (currency.equals("D")) {
            //box.putItem(new Dollar(1));
            Dollar[] dollars = Arrays.asList(amount)
                            .stream()
                            .map(amountStr -> new Dollar(Integer.parseInt(amountStr)))
                            .toArray(Dollar[]::new);
            box.putItems(dollars);
        }
        else if (currency.equals("E")) {
            Euro[] dollars = Arrays.asList(amount)
                    .stream()
                    .map(amountStr -> new Euro(Integer.parseInt(amountStr)))
                    .toArray(Euro[]::new);
            box.putItems(dollars);
        }

        box.printItems();
    }
}


