package level1.lesson18.failai;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("orig.txt");
        out.write("test".getBytes());
        out.close();
    }

}
