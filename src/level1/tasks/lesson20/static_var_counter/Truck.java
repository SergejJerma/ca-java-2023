package level1.tasks.lesson20.static_var_counter;

public class Truck extends Vehicle {

    private static int totalTrucks = 0;

    private final int truckId;

    public Truck() {
        this.truckId = totalTrucks++;;
    }


    public int getTruckId() {
        return this.truckId;
    }
}
