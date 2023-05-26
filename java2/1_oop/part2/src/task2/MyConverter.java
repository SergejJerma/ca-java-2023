package task2;

import java.util.Arrays;

public class MyConverter {

    public String convertToText(String userInput) {
        //"555 2 22 2 7777"
        String[] letterPresses = userInput.split(" ");
        System.out.println(Arrays.toString(letterPresses));

        StringBuilder stringBuilder = new StringBuilder();
        for (String letterPress : letterPresses)
            stringBuilder.append(getLetter(letterPress));

        return stringBuilder.toString();
    }

    //Aciu Mantas Sasnauskas!
    private String getLetter(String digits) {
        switch (digits) {
            case "2":
                return "A";
            case "22":
                return "B";
            case "222":
                return "C";

            case "3":
                return "D";
            case "33":
                return "E";
            case "333":
                return "F";

            case "4":
                return "G";
            case "44":
                return "H";
            case "444":
                return "I";

            case "5":
                return "J";
            case "55":
                return "K";
            case "555":
                return "L";

            case "6":
                return "M";
            case "66":
                return "N";
            case "666":
                return "O";

            case "7":
                return "P";
            case "77":
                return "Q";
            case "777":
                return "R";
            case "7777":
                return "S";

            case "8":
                return "T";
            case "88":
                return "U";
            case "888":
                return "V";

            case "9":
                return "W";
            case "99":
                return "X";
            case "999":
                return "Y";
            case "9999":
                return "Z";

            case "0":
                return " ";
            case "00":
                return "\n";

            default:
                return "";
        }
    }

    public String convertToKeyPresses(String userInput) {
        //"super"
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            String character = String.valueOf(userInput.charAt(i));
            String digits = getDigits(character);
            stringBuilder.append(digits).append(" ");
        }

        return stringBuilder.toString();
    }

    //Aciu Mantas Sasnauskas!
    private String getDigits(String letters) {
        switch (letters) {
            case "a":
                return "2";
            case "b":
                return "22";
            case "c":
                return "222";

            case "d":
                return "3";
            case "e":
                return "33";
            case "f":
                return "333";

            case "g":
                return "4";
            case "h":
                return "44";
            case "i":
                return "444";

            case "j":
                return "5";
            case "k":
                return "55";
            case "l":
                return "555";

            case "m":
                return "6";
            case "n":
                return "66";
            case "o":
                return "666";

            case "p":
                return "7";
            case "q":
                return "77";
            case "r":
                return "777";
            case "s":
                return "7777";

            case "t":
                return "8";
            case "u":
                return "88";
            case "v":
                return "888";

            case "w":
                return "9";
            case "x":
                return "99";
            case "y":
                return "999";
            case "z":
                return "9999";

            case " ":
                return "0";
            case "\n":
                return "00";

            default:
                return "";
        }
    }
}
