package conditions;

public class Main {

    public static void main(String[] args) {

        tryShorthandIf(8, 6, 5);

        trySwitch(-1);
        trySwitch2(2);
        trySwitch3(2);
    }

    private static void tryShorthandIf(int a, int b, int c) {
        String result = (a > b && a > c) ? "A is the greatest number" : "A is NOT the greatest number";
        System.out.println("result is: " + result);

        //the above is same as:
        if (a > b && a > c) {
            System.out.println("A is the greatest number");
        } else {
            System.out.println("A is NOT the greatest number");
        }
    }

    private static void trySwitch(int i) {
        switch (i) {
            case 1:
                System.out.println("1");
                break;  //don't forget the 'break'!
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                return;// return is allowed here (will return from method, not only switch statement)!
            case 4, 5, 6:   //multiple cases with same outcome
                System.out.println("4");
                break;
            default:
                System.out.println("default");
        }
    }

    private static void trySwitch2(int i) {
        String result = switch (i) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "default";
        };
        System.out.println(result);
    }

    private static void trySwitch3(int i) {
        String result = switch (i) {
            case 1 -> "A";
            case 2 -> {
                //return;// return is NOT allowed here

                //if we have more than one statement, we can use the 'yield' keyword
                int answer = 2+2;
                yield returnString(answer);
            }
            case 3 -> "C";
            case 4, 5, 6 -> "D";    //multiple cases with same outcome
            default -> "default";
        };
        System.out.println(result);
    }

    private static String returnString(int answer) {
        return "answer as String: " + answer;
    }


}
