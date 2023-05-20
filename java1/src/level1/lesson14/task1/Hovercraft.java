package level1.lesson14.task1;

public class Hovercraft implements IsLandVehicle, IsSeaVessel {

	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int wheels;
	private int displacement;
	
	public Hovercraft(String name, int maxPassengers, int maxSpeed, int wheels, int displacement) {
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
		this.displacement = displacement;
	}

	@Override
	public void launch() {
		System.out.println("Hovercraft launch");
	}
	
	@Override
	public void drive() {
		System.out.println("Hovercraft drive");
	}
	
	public void enterLand() {
		System.out.println("Hovercraft enter land");
	}
	
	public void enterSea() {
		System.out.println("Hovercraft enter sea");
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
	public void setMaxPassengers(int max) {
		maxPassengers = max;
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
	public int getDisplacement() {
		return displacement;
	}

	@Override
	public void setDisplacements(int displacement) {
		this.displacement = displacement;
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
