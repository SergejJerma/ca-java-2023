package architecture;

public class Square {

    int lengthA;

    public int perimeter() {
        return 4 * lengthA;
    }

    public int area() {
        return lengthA * lengthA;
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }
}
