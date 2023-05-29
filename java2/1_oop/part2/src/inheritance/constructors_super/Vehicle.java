package inheritance.constructors_super;

public abstract class Vehicle {
    protected int wheelCount;
    protected String color;

    public Vehicle() {
        this.wheelCount = 4;
        this.color = "black";
    }

    public Vehicle(int wheelCount, String color) {
        this.wheelCount = wheelCount;
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "wheelCount=" + wheelCount + ", color=" + color;
    }
}

