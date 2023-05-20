package level1.lesson18.failai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
    private static String RELATIVE_FILE_DIR = "neegzistuojantisFolderis/darVienas";
    private static String FILE_NAME = "failas.txt";
    private static String FILE_PATH = RELATIVE_FILE_DIR + "/" + FILE_NAME;

    public static void main(String[] args) {
        try {

            //Creates directory if not exists
            Path path = Paths.get(RELATIVE_FILE_DIR);
            Files.createDirectories(path);

            String content = "This is the content to write into file";
            File file = new File(FILE_PATH);
            FileWriter fw = new FileWriter(file);

            System.out.println("Absolute file path: " + file.getAbsoluteFile());

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
