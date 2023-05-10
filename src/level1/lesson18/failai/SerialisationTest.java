package level1.lesson18.failai;

import java.io.*;

public class SerialisationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectToFile();
        readObjectFromFile();
    }

    private static void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("objdata.ser");
        ObjectInputStream s = new ObjectInputStream(in);
        A a = (A) s.readObject();
        System.out.println(a.getI());
        s.close();
    }

    private static void writeObjectToFile() throws IOException {
        FileOutputStream out = new FileOutputStream("objdata.ser");
        ObjectOutputStream s = new ObjectOutputStream(out);
        s.writeObject(new A(200));
        s.flush();
        s.close();
    }
}

class A implements Serializable {
    private int i;

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
