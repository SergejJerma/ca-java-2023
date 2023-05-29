package inheritance.constructors_super;

class Bike extends Vehicle {
    protected int gearCount;

    public Bike(int wheelCount, String color, int gearCount) {
        super(wheelCount, color);
        this.gearCount = gearCount;
    }

    //default constructor is setting default values
    public Bike() {
        this.gearCount = 21;
    }

    @Override

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " gearCount=" + gearCount;
    }
}
