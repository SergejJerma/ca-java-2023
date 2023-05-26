package enums;

public class MyCar {

    private final CarStateEnum state;

    public MyCar(CarStateEnum state) {
        this.state = state;
    }

    public CarStateEnum getState() {
        return state;
    }
}
