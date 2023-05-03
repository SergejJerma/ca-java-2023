package level1.lesson14.task1;

public class Frigate implements IsSeaVessel {

	private String name;
	private int maxPassengers;
	private int maxSpeed;
	private int displacement;
	
	public Frigate(String name, int maxPassengers, int maxSpeed, int displacement) {
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
		this.displacement = displacement;
	}

	@Override
	public void launch() {
		System.out.println("Frigate launch");
	}
	
	public void fireGun() {
		System.out.println("Frigate fire gun");
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

}
