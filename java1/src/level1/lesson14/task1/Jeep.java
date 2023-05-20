package level1.lesson14.task1;

public class Jeep implements IsLandVehicle {

	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int wheels;
	
	public Jeep(String name, int maxPassengers, int maxSpeed, int wheels) {
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
	}
	
	@Override
	public void drive() {
		System.out.println("Jeep drive");
	}
	
	public void soundHorn() {
		System.out.println("Jeep sound horn");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getMaxPassengers() {
		return maxPassengers;
	}

	@Override
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(int speed) {
		maxSpeed = speed;
	}

	@Override
	public int getNumWheels() {
		return wheels;
	}

	@Override
	public void setNumWheels(int wheels) {
		this.wheels = wheels;

	}

}
