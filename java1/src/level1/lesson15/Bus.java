package level1.lesson15;

public class Bus extends Car {
    @Override
    void goCar() {
        System.out.println("bus from car");
    }

    void goBus() {
        System.out.println("bus from bus");
    }
}
