package org.example.dependency_injection;

import org.springframework.stereotype.Service;

@Service
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
