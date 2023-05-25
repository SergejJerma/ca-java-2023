package loops;

public class Main {


    public static void main(String[] args) {
        int rows = 11;
        StringBuilder pattern = new StringBuilder();

        pattern.append(String.format("%s%s"," ".repeat(rows), "*\n"));
        for (int i = 1; i <= rows; i++) {
            int numOfSpaces = rows - i;
            pattern.append(" ".repeat(numOfSpaces))
                    .append("*".repeat(i))
                    .append(" ")
                    .append("*".repeat(i))
                    .append("\n");
        }

        System.out.println(pattern);
    }
}
