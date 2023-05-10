package level1.lesson18.tasks.task1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("vardas.txt");
        fileWriter.write("Tomas Žvinys");
        fileWriter.close();
    }
}
