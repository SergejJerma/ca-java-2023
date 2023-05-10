package level1.lesson18.tasks.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("vardas.txt");
        fileWriter.write("Tomas Žvinys");
        fileWriter.flush();

        FileReader fileReader = new FileReader("vardas.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String vardas = bufferedReader.readLine();
        System.out.println(vardas);

        StringBuilder stringBuilder = new StringBuilder(vardas);
        FileWriter fileWriter2 = new FileWriter("vardas_kitasFailas.txt");
        fileWriter2.write(stringBuilder.reverse().toString());

        fileWriter.close();
        fileReader.close();
        fileWriter2.close();
    }

}
