package inheritance.constructors_super;

class Car extends Vehicle {
    protected FuelType fuelType;
    protected float engineVolume;
    protected int cylinderCount;

    public Car(int wheelCount, String color, FuelType fuelType, float engineVolume, int cylinderCount) {
        super(wheelCount, color);
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
        this.cylinderCount = cylinderCount;
    }

    //default constructor is setting default values
    public Car() {
        this.fuelType = FuelType.ELECTRIC;
        this.engineVolume = 1.0f;
        this.cylinderCount = 4;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " fuelType=" + fuelType + ", engineVolume=" + engineVolume + ", cylinderCount=" + cylinderCount;
    }

}
