package level1.lesson1;

public class Figure {
    private String name;
    private int length;
    private int height;

    public Figure() {
    }

    public Figure(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}

