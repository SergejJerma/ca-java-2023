package enums;

public class Main {

    public static void main(String[] args) {

        showEnumWithAbstractMethods();

        CarStateEnum notStarted = CarStateEnum.NOT_STARTED;
        notStarted.consumer.accept("My car is ");

        CarStateEnum decelerating = CarStateEnum.DECELERATING;
        decelerating.consumer.accept("My car is ");

        //Actually only one instance of CarStateEnum enum exists in JVM at a time
        CarStateEnum accelerating = CarStateEnum.ACCELERATING;
        CarStateEnum alsoAccelerating = CarStateEnum.ACCELERATING;

        CarStateEnum.ACCELERATING.setStuff(false);
        System.out.println(CarStateEnum.ACCELERATING);

        System.out.println(accelerating);
        System.out.println(alsoAccelerating);

        //Comparing enums with == is safe (and is actually the recommended)
        MyCar myCar = new MyCar(null);
        MyCar anotherCar = new MyCar(CarStateEnum.NOT_STARTED);
        if (myCar.getState() == anotherCar.getState()) {
            System.out.println("Both cars have same state");
        }

        if (myCar.getState().equals(anotherCar.getState())) {
            System.out.println("Both cars have same state");
        }
    }

    private static void showEnumWithAbstractMethods() {
        Operation operation = Operation.PLUS;
        int answer = operation.apply(1, 2);
        System.out.println("Operation.PLUS given 1 and 2 returned: " + answer);

        System.out.println("Operation.DIVIDE given 10 and 5 returned: " + Operation.DIVIDE.apply(10, 5));
    }
}
