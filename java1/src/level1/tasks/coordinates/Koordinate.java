package level1.tasks.coordinates;

import java.util.Objects;

public class Koordinate {
    private int x;
    private int y;

    public Koordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Koordinate that)) return false;
//        return x == that.x && y == that.y;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Koordinate clone() {
        return new Koordinate(x, y);
    }


}
