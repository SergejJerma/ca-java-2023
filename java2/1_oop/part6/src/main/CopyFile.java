import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        // copyFile("java2/1_oop/part6/src/main/filename.txt", "java2/1_oop/part6/src/main/filenameTEST_NEW.txt");

        try {
            readFile1(new File("java2/1_oop/part6/src/main/filename.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void copyFile(String inputFilename, String outputFilename) {

        try {

            FileInputStream fpin = new FileInputStream(inputFilename);
            FileOutputStream fpout = new FileOutputStream(outputFilename);
            byte[] buffer = new byte[10000];

            int length = 0;

            while ((length = fpin.read(buffer, 0, buffer.length)) > 0) {
                fpout.write(buffer, 0, length);

            }

            fpout.flush();
            fpout.close();
            fpin.close();

        } catch (IOException x) {
            System.err.println("Error:" + x);

        }

    }

    private static void readFile1(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);

//Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }

}

