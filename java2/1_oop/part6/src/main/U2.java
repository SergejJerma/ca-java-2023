import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class U2 {

    public static void main(String[] args) {

        char[] tekstas = {'L', 'a', 'b', 'a', 's'};

        try (OutputStream os = new FileOutputStream("java2/1_oop/part6/src/main/testas.txt")) {

            for (int i = 0; i < tekstas.length; i++) {
                os.write(tekstas[i]);

            }

            os.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}