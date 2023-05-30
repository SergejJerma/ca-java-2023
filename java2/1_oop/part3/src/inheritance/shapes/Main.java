package inheritance.shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 1.980, 1.024);
        System.out.printf("Rectangle%n\t%s;\tIs area over 50?: %s%n%n", rectangle, validateShapeArea(rectangle));

        Shape triangle = new Triangle("Green", 10.0, 6.0);
        System.out.printf("Triangle%n\t%s;\tIs area over 50?: %s%n%n", triangle, validateShapeArea(triangle));

        Shape circle = new Circle("Blue", 30.0);
        System.out.printf("Circle%n\t%s;\tIs area over 50?: %s%n%n", circle, validateShapeArea(circle));
    }

    public static boolean validateShapeArea(Shape s) {
        return s.getArea() > 50;
    }
}
