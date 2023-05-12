package level1.tasks.lesson20.static_var_counter;

public class Vehicle {

    private static int totalVehicles = 0;

    private final int vehicleId;

    public Vehicle() {
        this.vehicleId = totalVehicles++;;
    }

    public int getVehicleId() {
        return this.vehicleId;
    }

}
