package level1.lesson18.failai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("automobiliai.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        writeSomething(bufferedWriter);

        bufferedWriter.close();
    }

    private static void writeSomething(BufferedWriter bufferedWriter) throws IOException {
        for (int i = 0; i < 10; i++) {
            Automobilis automobilis = new Automobilis(4, 220 + i);

            //writes to RAM, not to file
            bufferedWriter.write(automobilis.toString());

            /* writes to file
             actually - its java - it's using JVM (java virtual machine) - so it doesn't control our hard drive -
             therefore it simply asks our OS (operating system) to handle file writing for us */
            bufferedWriter.flush();
        }
    }


}

