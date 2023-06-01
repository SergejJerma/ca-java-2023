package polymorphism.keywords;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainNull extends SuperClass {

    private String name;

    MainNull() {
        super();
        System.out.println(super.name);
        super.method();
        System.out.println("MainNull cons");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Date now;

        SimpleDateFormat fmt;
        now = new Date();

        fmt = new SimpleDateFormat ("dd MM yyyy HH:mm:ss");
        System.out.println ("Today's date: " + fmt.format(now));







//        obj.setName("xxx");
//
//        System.out.println(obj.getName());
    }

    private static void extracted(String text) {
        if (text != null) {

        }
    }
}
