package level1.lesson18.failai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("failas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            /* Acts in a similar way to System.out
                - can print a line
                - can print formatted
                - appends to file instead of overwriting */
            PrintWriter out = new PrintWriter(bw);

            Automobilis automobilis = new Automobilis(4, 180);
            //out.println("the text");

            out.printf("%d,%d%n", automobilis.getRatuSkaicius(), automobilis.getMaxGreitis());

            out.close();
        } catch (IOException ignore) { }
    }

}
