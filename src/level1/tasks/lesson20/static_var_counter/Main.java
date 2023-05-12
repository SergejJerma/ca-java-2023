package level1.tasks.lesson20.static_var_counter;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            System.out.println("car.getCarId: " + car.getCarId());
            System.out.println("car.getVehicleId: " + car.getVehicleId());
        }


        for (int i = 0; i < 5; i++) {
            Truck truck = new Truck();
            System.out.println("truck.getTruckId: " + truck.getTruckId());
            System.out.println("truck.getVehicleId: " + truck.getVehicleId());
        }

    }
}
