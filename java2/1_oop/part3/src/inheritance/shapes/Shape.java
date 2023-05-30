package inheritance.shapes;

public abstract class Shape {
    private final String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String setColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Color: %s;\tArea: %f", this.color, this.getArea());
    }
}
