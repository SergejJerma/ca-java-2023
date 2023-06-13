import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static final String delimiter = ",";

    public static void main(String[] args) throws IOException {
        List<String> modifiedList = readCsvFile();
        //writeToCsvFile();
       // appendDataToFile();
        overwriteDataToFile(modifiedList);
    }

    private static void overwriteDataToFile(List<String> modifiedList) throws IOException {

        File csvFile = new File("java2/1_oop/part6/src/main/auto.csv");
        FileWriter fw = new FileWriter(csvFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        modifiedList.forEach(el -> {
            try {
                bw.write(el + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.close();
    }

    private static void appendDataToFile() throws IOException {
        File csvFile = new File("java2/1_oop/part6/src/main/employees.csv");
        FileWriter fw = new FileWriter(csvFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("Gran,Jagoe,gjagoe4@springhow.com,Business Development");
        bw.close();
    }

    private static void writeToCsvFile() throws IOException {

        String[][] employees = {
                {"Man", "Sparkes", "msparkes0@springhow.com", "Engineering"},
                {"Dulcinea", "Terzi", "dterzi1@springhow.com", "Engineering"},
                {"Tamar", "Bedder", "tbedder2@springhow.com", "Legal"},
                {"Vance", "Scouller", "vscouller3@springhow.com", "Sales"},
                {"Gran", "Jagoe", "gjagoe4@springhow.com", "Business Development"}
        };

        File csvFile = new File("java2/1_oop/part6/src/main/employees.csv");
        FileWriter fileWriter = new FileWriter(csvFile);

        for (String[] data : employees) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < data.length; i++) {

                line.append(data[i]);
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString().toUpperCase());
        }
        fileWriter.close();
    }

    private static List<String> readCsvFile() {
        List<String> tempList = new ArrayList<>();
        try {
            File file = new File("java2/1_oop/part6/src/main/auto.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] tempArr;

            while ((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                StringBuilder sb = new StringBuilder();

                for (String tempStr : tempArr) {
                    sb.append(tempStr).append(";");
              //      System.out.print(tempStr + ";");
                }

                tempList.add(sb.toString().toUpperCase());
                System.out.println();
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return tempList;
    }
}
