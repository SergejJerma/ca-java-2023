import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class U3 {

    public static void main(String args[]) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("java2/1_oop/part6/src/main/U1.java"));
        String tekstas = new String(bytes);
        System.out.println(tekstas);


        Files.write(Paths.get("java2/1_oop/part6/src/main/mano.txt")

                , "Einame namo!!!".getBytes());

    }

}