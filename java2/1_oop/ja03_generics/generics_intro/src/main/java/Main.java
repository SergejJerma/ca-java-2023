import currencies.Currency;
import currencies.Dollar;
import currencies.Euro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        showSafeBox();
        showUnsafeBox();
    }

    private static void showUnsafeBox() {
        System.out.println("String[S] / Integer[I] ?: ");
        String decision = scanner.nextLine();
        Box<Integer> safeBox = new UnspecifiedBox();

        if (decision.equals("S")) {
            //cannot put String, because we defined box would only store <Integer> values
            //safeBox.putItem("Some String");
        } else if (decision.equals("I")) {
            safeBox.putItem(1);
        }

        Box unsafeBox = new UnspecifiedBox();
        if (decision.equals("S")) {
            unsafeBox.putItem("Some String");
        } else if (decision.equals("I")) {
            unsafeBox.putItem(1);
        }

        /* will throw a runtime exception if you've put a wrong object (not an integer) into the box
         */
        System.out.println("The integer * 10 you've put is: " + (Integer)unsafeBox.getItems()[0] * 10);

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


