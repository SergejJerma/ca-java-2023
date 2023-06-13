import java.io.*;
import java.util.Scanner;

public class Friends {

    private static Scanner sc = new Scanner(System.in);
    private static Scanner sc1 = new Scanner(System.in);

    private static final String PATH_TO_MANO_FILE = "java2/1_oop/part6/src/main/mano111";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        System.out.println("Pasirinkite: [1] - perziureti, ar [2] - papildyti");
        int choice = sc.nextInt();

        if (choice == 1) {

            File file = new File(PATH_TO_MANO_FILE);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }

        } else {
            String text = "";
            System.out.println("Iveskite 5 draugu vardus");

            for (int i = 0; i < 5; i++) {
                String friendName = sc1.nextLine() + NEW_LINE;
                text += friendName;
            }

            String fileName = PATH_TO_MANO_FILE;

            try (FileOutputStream outputStream
                         = new FileOutputStream(fileName, true)) {

                byte[] strToBytes = text.getBytes();
                outputStream.write(strToBytes);
            }
        }
    }
}
