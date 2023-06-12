import java.io.*;

public class CopyBytesPP {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("orig.txt");

        OutputStream out = new FileOutputStream("copy.txt");

        for (int c; (c = in.read()) != -1; ) {
            System.out.println("ASCII code " + c);
            out.write(c);

        }

        in.close();

        out.close();

    }
}