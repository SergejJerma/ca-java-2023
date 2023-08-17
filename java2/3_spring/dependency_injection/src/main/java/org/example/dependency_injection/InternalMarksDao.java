package org.example.dependency_injection;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class InternalMarksDao implements MarksDao {

    @Override
    public List<Integer> getMarks() {
//        return List.of(5, 6, 3, 7, 8, 10);
        List<Integer> marks = new ArrayList<Integer>();

        marks.add(5);
        return marks;

    }
}
