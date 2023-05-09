package level1.lesson17;

import java.util.Objects;

public class MainNull {
    public static void main(String[] args) {
        AA a = null;

        if (a != null) {
            a.test();
            System.out.println("!= null");
        }

//        if (a.equals(null)) {
//            System.out.println("equals null");
//        }

        if (Objects.isNull(a)) {
            System.out.println("Objects Is null");
        }

      //  a.test();
    }
}
