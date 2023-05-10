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

        fileWriter.close();
        fileReader.close();
    }

}
