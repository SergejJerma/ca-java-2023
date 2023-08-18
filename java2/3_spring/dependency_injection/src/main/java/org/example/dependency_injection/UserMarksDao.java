package org.example.dependency_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Primary
//@Component("userMarksDao5555")
@Component
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
