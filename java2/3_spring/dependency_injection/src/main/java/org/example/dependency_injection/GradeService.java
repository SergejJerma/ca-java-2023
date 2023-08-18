package org.example.dependency_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class GradeService {

    private final MarksDao marksDao;

    public GradeService(@Qualifier("internalMarksDao") MarksDao marksDao) {
        this.marksDao = marksDao;
    }

    public double averageGrade() {
        return marksDao.getMarks().stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }
}
