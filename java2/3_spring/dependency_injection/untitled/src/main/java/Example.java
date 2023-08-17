import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        //galim patogiai pakeisti implementacija +++
        //isivaizduokit, kaip liuks, jei padarom config faila, imetam i interneta kaip biblioteka, kaip visiem patogu naudot
        MarksDao marksDao = new UserMarksDao();
        GradeService gradeService = new GradeService(marksDao);
        System.out.println("Average grade: " + gradeService.averageGrade() + "\n");

    }
}

class GradeService {

    private MarksDao marksDao;

    public GradeService(MarksDao marksDao) {
        this.marksDao = marksDao;
    }

    public double averageGrade() {
        return marksDao.getMarks().stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }
}

interface MarksDao {

    List<Integer> getMarks();

}

class InternalMarksDao implements MarksDao {

    @Override
    public List<Integer> getMarks() {
        return List.of(5, 6, 3, 7, 8, 10);
    }
}

class UserMarksDao implements MarksDao {

    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Integer> getMarks() {
        System.out.println("Enter marks or x to return: ");
        List<Integer> marks = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.contains("x"))
                break;
            marks.add(Integer.parseInt(line));
        }

        return marks;
    }
}
