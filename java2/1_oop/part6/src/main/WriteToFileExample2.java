import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample2 {

    private static final String FILENAME = "java2/1_oop/part6/src/main/filename.txt";

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            String content = "This is the content to write into file\n";
            String content1 = "This is the content to write into fileTEST";
            bw.write(content);
            bw.write(content1);

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}