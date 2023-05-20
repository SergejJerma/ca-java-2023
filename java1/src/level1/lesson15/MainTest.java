package level1.lesson15;

public class MainTest {
    public static void main(String[] args) {
        Train a = new Train();
        Bus b = new Bus();
        Car c = new Bus();

        b.goBus();
        b.goCar();

        c.goCar();

        ((Bus) c).goBus();

        make(a);
        make(b);
        make(c);
    }
    static void make(Car car) {
        car.goCar();
    }
}
