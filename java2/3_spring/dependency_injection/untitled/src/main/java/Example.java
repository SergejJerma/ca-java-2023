import java.util.List;

public class Example {
    public static void main(String[] args) {

        GradeService gradeService = new GradeService();
        System.out.println("Average grade: " + gradeService.averageGrade() + "\n");

    }
}

class GradeService {

    private MarksDao marksDao;

    //Niekas nera inject'inama (paduodama)
    public GradeService() {
        this.marksDao = new InternalMarksDao();;
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
