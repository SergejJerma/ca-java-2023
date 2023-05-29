package inheritance.constructors_super;

public class Main {
    public static void main(String[] args) {

        Bike defaultBike = new Bike();
        System.out.println("\ndefaultBike: ");
        defaultBike.print();

        Bike customBike = new Bike(3, "White", 6);
        System.out.println("\ncustomBike: ");
        customBike.print();


        Car defaultCar = new Car();
        System.out.println("\ndefaultCar: ");
        defaultCar.print();

        Car customCar = new Car(3, "Yellow", FuelType.GAS, 0.6f, 3);
        System.out.println("\ncustomCar: ");
        customCar.print();


        Truck defaultTruck = new Truck();
        System.out.println("\ndefaultTruck: ");
        defaultTruck.print();

        Truck customTruck = new Truck(3, "Yellow", FuelType.DIESEL, 18.0f, 12, 25_000, 18_000);
        System.out.println("\ncustomTruck: ");
        customTruck.print();
    }
}
