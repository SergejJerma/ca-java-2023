package level1.lesson17.exception;

public class MainException {
    public static void main(String[] args) throws Exception {

        try {
            int i = 5/1;
            String s = "null";
            s.toUpperCase();
            throw  new Exception();
        }
          catch (ArithmeticException | NullPointerException exception) {
            System.out.println("OK, pagavom nullpointer/aritmetine ");
        }
          catch (Exception exception) {
              System.out.println(exception.getStackTrace());
            System.out.println("OK, pagavom bendra");
        } finally {
            System.out.println("vistiek suveikė");
        }
        System.out.println("po try");
    }
}
