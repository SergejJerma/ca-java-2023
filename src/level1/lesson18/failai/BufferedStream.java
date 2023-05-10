package level1.lesson18.failai;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("automobiliai.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        FileReader fileReader = new FileReader("automobiliai.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        writeVehicles(bufferedWriter);
        readVehicles(bufferedReader);


        bufferedWriter.close();
    }

    private static void readVehicles(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();

        while ( (line = bufferedReader.readLine()) != null) {
            Automobilis automobilis = Automobilis.fromString(line);
            System.out.println(automobilis.toJsonString());
        }
    }

    private static void writeVehicles(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write("ratu skaicius,max greitis\n");
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

