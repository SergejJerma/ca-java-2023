package level1.lesson17;

public class MainNull {
    public static void main(String[] args) {
        Classs1 cl = new Classs1();

        if (cl != null) {
            System.out.println("cl not NULL");
        }
        cl.name = "name";
        if (cl.name == null) {
            System.out.println("field name is NULL");
        }

//        AA a = null;
//        a.test();
//
//        if (a != null) {
//            a.test();
//            System.out.println("!= null");
//        }

//        if (a.equals(null)) {
//            System.out.println("equals null");
//        }

//        if (Objects.isNull(a)) {
//            System.out.println("Objects Is null");
//        }

        //  a.test();
    }
}
