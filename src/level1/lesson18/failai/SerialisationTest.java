package level1.lesson18.failai;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationTest {
    public static void main(String[] args) throws IOException {
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
