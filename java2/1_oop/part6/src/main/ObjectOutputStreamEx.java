import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectOutputStreamEx {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream in = new  FileInputStream("objdata.ser");

        ObjectInputStream s   = new ObjectInputStream(in);
      //  Date date= (Date)s.readObject();
        ExampleA date= (ExampleA) s.readObject();
        System.out.println(date);

        s.close();
    }
}
