import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new  FileOutputStream("objdata.ser");

        ObjectOutputStream s = new ObjectOutputStream(out);
   //     s.writeObject(new Date());
        s.writeObject(new ExampleA("xxx", "zzzz", 25));
        s.flush();
        s.close();

    }
}
