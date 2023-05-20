package level1.lesson18.tasks.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vairuotojas v1 = new Vairuotojas("Vardenis1", "Audi", "ABC 001", 1000);
        Vairuotojas v2 = new Vairuotojas("Vardenis2", "VW", "ABC 002", 2000);
        Vairuotojas v3 = new Vairuotojas("Vardenis3", "NIO", "ABC 003", 3000);

        List<Vairuotojas> vairuotojai = List.of(v1, v2, v3);
        writeToFile(vairuotojai);
    }

    private static void writeToFile(List<Vairuotojas> vairuotojai) {
        File file = new File("vairuotojai.csv");

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file))) {
            vairuotojai.forEach(vairuotojas -> printWriter.println(vairuotojas.asCsvLine()));
            printWriter.close();
            System.out.println("Saved to file at " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed saving to file");
        }
    }
}
