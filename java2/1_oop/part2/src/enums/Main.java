package enums;

public class Main {
    public static void main(String[] args) {

        showEnumWithAbstractMethods();

        CarStateEnum notStarted = CarStateEnum.NOT_STARTED;
        notStarted.consumer.accept("My car is ");

        CarStateEnum decelerating = CarStateEnum.DECELERATING;
        decelerating.consumer.accept("My car is ");

        CarStateEnum.ACCELERATING.setStuff(false);
        System.out.println(CarStateEnum.ACCELERATING);
    }

    private static void showEnumWithAbstractMethods() {
        Operation operation = Operation.PLUS;
        int answer = operation.apply(1, 2);
        System.out.println("Operation.PLUS given 1 and 2 returned: " + answer);

        System.out.println("Operation.DIVIDE given 10 and 5 returned: " + Operation.DIVIDE.apply(10, 5));
    }
}
