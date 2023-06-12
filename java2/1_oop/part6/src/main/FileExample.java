import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try {
            String content = "This is the content to write into file TEST";


            File file = new File("java2/1_oop/part6/src/main/TESTAS_1111.txt");


// if file doesnt exists, then create it  if (!file.exists()) {

//            file.createNewFile();


//           FileWriter fw = new FileWriter(file.getAbsoluteFile());
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);

            bw.close();


            System.out.println("Done");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}