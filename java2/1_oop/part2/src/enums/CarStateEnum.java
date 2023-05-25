package enums;

import java.util.function.Consumer;
import java.lang.Enum;

//No enum can be extended! Because they all (behind the scenes) already extend `java.lang.Enum
//public enum CarStateEnum /* extends CarStateEnum2 */ {
public enum CarStateEnum {

    NOT_STARTED(0,false, test -> {
        System.out.println(test + "is standing still");
    }),

    STARTED_STAND_STILL(1,true, test -> {
        System.out.println(test + "is standing still");
    }),

    ACCELERATING(50,true, test -> {
                System.out.println(test + "is moving");
            }),

    DRIVING_CONSTANT_SPEED(100,true, test -> {
                System.out.println(test + "is moving");
            }),

    DECELERATING(-50,true, test -> {
        System.out.println(test + "is moving");
    });

    final int status;
    boolean isHazardous;    //Normally - all variables should be final!
    final Consumer<String> consumer;

    CarStateEnum(int status, boolean isMoving, Consumer<String> consumer) {
        this.status = status;
        this.isHazardous = isMoving;
        this.consumer = consumer;
    }

    /* Definitely NOT something you would do! */
    void setStuff(boolean isMoving) {
        this.isHazardous = isMoving;
    }

    @Override
    public String toString() {
        return "CarStateEnum{" +
                "status=" + status +
                ", isHazardous=" + isHazardous +
                ", consumer=" + consumer +
                '}';
    }
}
