import java.io.*;

public class U1 {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("java2/1_oop/part6/src/main/U1.java")) {
            //InputStream in = new FileInputStream("src/U1.java"); need to be closed
            int raidesKodas;

            while ((raidesKodas = in.read()) > 0) {
                char raide = (char) raidesKodas;
                System.out.print(raide);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}