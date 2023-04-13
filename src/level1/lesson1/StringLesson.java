package level1.lesson1;

public class StringLesson {
    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println(figure.getName());

        Figure figure1 = new Figure("xxx", 2, 5);
        System.out.println(figure1);
    }
}