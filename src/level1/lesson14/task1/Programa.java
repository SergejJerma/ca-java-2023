package level1.lesson14.task1;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		IsVehicle vehicle1 = new Jeep("First jeep", 5, 150, 4);
		IsVehicle vehicle2 = new Jeep("Second jeep", 7, 2000, 4);
		IsVehicle vehicle3 = new Hovercraft("First hovercraft", 6, 30, 6, 1);
		IsVehicle vehicle4 = new Hovercraft("Second hovercraft", 12, 20, 8, 2);
		IsVehicle vehicle5 = new Hovercraft("Third hovercraft", 10, 30, 10, 3);
		IsVehicle vehicle6 = new Frigate("First frigate", 12, 20, 4);
		IsVehicle vehicle7 = new Frigate("Second frigate", 20, 40, 5);
		
		ArrayList<IsVehicle> vehicleList = new ArrayList<>();
		vehicleList.add(vehicle1);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);
		vehicleList.add(vehicle5);
		vehicleList.add(vehicle6);
		vehicleList.add(vehicle7);
		
		for(IsVehicle v : vehicleList) {
			System.out.println("Name: " + v.getName());
			System.out.println("Max passengers: " + v.getMaxPassengers());
			System.out.println("Max speed: " + v.getMaxSpeed());
			if (v instanceof IsLandVehicle) {
				IsLandVehicle landV = (IsLandVehicle) v;
				System.out.println("Number of wheels: " + landV.getNumWheels());
				landV.drive();
			}
			if (v instanceof IsSeaVessel) {
				IsSeaVessel seaV = (IsSeaVessel) v;
				System.out.println("Displacement: " + seaV.getDisplacement());
				seaV.launch();
			}
			if (v instanceof Jeep) {
				Jeep jeepV = (Jeep) v;
				jeepV.soundHorn();
			}
			if (v instanceof Hovercraft) {
				Hovercraft hovV = (Hovercraft) v;
				hovV.enterLand();
				hovV.enterSea();
			}
			if (v instanceof Frigate) {
				Frigate frigV = (Frigate) v;
				frigV.fireGun();
			}
			System.out.println("-----------------------");
		}
		
		
	}

}
