package level1.lesson18.failai;

import java.io.*;

public class CopyBytesPP {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("orig.txt");
        OutputStream out = new FileOutputStream("copy.txt");

        for (int c; (c = in.read()) != -1; ) {
            out.write(c);
        }

        in.close();
        out.close();
    }

}
