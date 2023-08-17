package org.example.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        manualInjectionExample();
        injectionWithSpring();
    }

    private static void injectionWithSpring() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContextConfig.class);
        GradeService gradeService = applicationContext.getBean(GradeService.class);

        System.out.println("Average grade: " + gradeService.averageGrade() + "\n");
    }

    private static void manualInjectionExample() {
        //galim patogiai pakeisti implementacija +++
        //isivaizduokit, kaip liuks, jei padarom config faila, imetam i interneta kaip biblioteka, kaip visiem patogu naudot
        MarksDao marksDao = new UserMarksDao();
        GradeService gradeService = new GradeService(marksDao);
        System.out.println("Average grade: " + gradeService.averageGrade() + "\n");

    }
}

