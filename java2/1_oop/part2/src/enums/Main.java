package enums;

public class Main {
    public static void main(String[] args) {

        CarStateEnum notStarted = CarStateEnum.NOT_STARTED;
        notStarted.consumer.accept("My car is ");

        CarStateEnum decelerating = CarStateEnum.DECELERATING;
        decelerating.consumer.accept("My car is ");

        CarStateEnum.ACCELERATING.setStuff(false);
        System.out.println(CarStateEnum.ACCELERATING);
    }
}
