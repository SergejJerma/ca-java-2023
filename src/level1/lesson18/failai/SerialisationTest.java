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
        System.out.println("Transient data read: " + a.getTransientVariableDoesNotGetSaved());
        s.close();
    }

    private static void writeObjectToFile() throws IOException {
        FileOutputStream out = new FileOutputStream("objdata.ser");
        ObjectOutputStream s = new ObjectOutputStream(out);
        A someObject = new A(200);
        someObject.setTransientVariableDoesNotGetSaved("should not get saved");
        System.out.println("transient data written: " + someObject.getTransientVariableDoesNotGetSaved());
        s.writeObject(someObject);
        s.flush();
        s.close();
    }
}

//Must be serializable
class A implements Serializable {
    /* class version id - we can make it manually (or else java will generate it for us);
        should be unique in whole system and uniquely identify class */
    private static final long serialVersionUID = 1;

    private int i;
    private int additionalData_thatChangesClassAutoGeneratedUID;
    private transient String transientVariableDoesNotGetSaved;

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getTransientVariableDoesNotGetSaved() {
        return transientVariableDoesNotGetSaved;
    }

    public void setTransientVariableDoesNotGetSaved(String transientVariableDoesNotGetSaved) {
        this.transientVariableDoesNotGetSaved = transientVariableDoesNotGetSaved;
    }
}