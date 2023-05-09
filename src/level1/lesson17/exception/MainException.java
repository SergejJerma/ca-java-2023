package level1.lesson17.exception;

public class MainException {
    public static void main(String[] args) throws Exception {


        try {
            int i = 5/0;
        }
          catch (NullPointerException exception) {
            System.out.println("OK, pagavom nullpointer");

        } finally {
            System.out.println("vistiek suveikė");
        }
        System.out.println("po try");
    }
}
