package inheritance.shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return this.base * this.height / 2;
    }

}
