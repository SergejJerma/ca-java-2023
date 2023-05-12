package level1.tasks.lesson20.static_var_counter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();         //list of only cars
        List<Truck> trucks = new ArrayList<>();     //list of only trucks
        List<Vehicle> vehicles = new ArrayList<>(); //list of vehicles (cars and trucks)

        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            System.out.println("car.getCarId: " + car.getCarId());
            System.out.println("car.getVehicleId: " + car.getVehicleId());
            cars.add(car);
            vehicles.add(car);
        }

        for (int i = 0; i < 4; i++) {
            Truck truck = new Truck();
            System.out.println("truck.getTruckId: " + truck.getTruckId());
            System.out.println("truck.getVehicleId: " + truck.getVehicleId());
            trucks.add(truck);
            vehicles.add(truck);
        }

        //Vehicle is abstract class! - cannot instantiate
        //Vehicle vehicle = new Vehicle();


        System.out.println("cars.size(): " + cars.size());
        System.out.println("trucks.size(): " + trucks.size());
        System.out.println("vehicles.size(): " + vehicles.size());

    }
}
