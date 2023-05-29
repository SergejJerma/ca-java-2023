package inheritance.constructors_super;

class Truck extends Car {
    protected int loadVolume;
    protected int loadWeight;

    public Truck(int wheelCount, String color, FuelType fuelType, float engineVolume, int cylinderCount, int loadVolume, int loadWeight) {
        super(wheelCount, color, fuelType, engineVolume, cylinderCount);
        this.loadVolume = loadVolume;
        this.loadWeight = loadWeight;
    }

    //default constructor is setting default values
    public Truck() {
        this.loadVolume = 30_000;
        this.loadWeight = 10_000;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " loadVolume=" + loadVolume + ", loadWeight=" + loadWeight;
    }
}
