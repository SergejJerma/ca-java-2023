package level1.tasks.lesson20.static_var_counter;

public class Car extends Vehicle {

    private static int totalCars = 0;

    private final int carId;

    public Car() {
        this.carId = totalCars++;;
    }

    public int getCarId() {
        return this.carId;
    }
}
