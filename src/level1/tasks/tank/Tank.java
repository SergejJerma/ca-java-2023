package level1.tasks.tank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tank {
    private int xPosition;
    private int yPosition;
    private int shotToNorth;
    private int shotToEast;
    private int shotToWest;
    private int shotToSouth;
    private int allShots;
    private String direction;

    public void moveForward() {
        yPosition++;
        direction = Direction.NORTH.name();
        printActionDateTime();
        System.out.println(" Tank moves to NORTH " + "(" + xPosition + ";" + yPosition + ")\n");
    }

    public void moveRight() {
        xPosition++;
        direction = Direction.EAST.name();
        printActionDateTime();
        System.out.println(" Tank moves to EAST " + "(" + xPosition + ";" + yPosition + ")\n");
    }

    public void moveLeft() {
        xPosition--;
        direction = Direction.WEST.name();
        printActionDateTime();
        System.out.println(" Tank moves to WEST " + "(" + xPosition + ";" + yPosition + ")\n");
    }

    public void moveBack() {
        yPosition--;
        direction = Direction.SOUTH.name();
        printActionDateTime();
        System.out.println(" Tank moves to NORTH " + "(" + xPosition + ";" + yPosition + ")\n");
    }

    public void doShot() {
        allShots++;
        printActionDateTime();
        System.out.println(" SHOT to " + direction + "\n");
        if (direction == Direction.NORTH.name()) {
            shotToNorth++;
        } else if (direction == Direction.EAST.name()) {
            shotToEast++;
        } else if (direction == Direction.WEST.name()) {
            shotToWest++;
        } else if (direction == Direction.SOUTH.name()) {
            shotToSouth++;
        }
    }

    public void printTankInfo() {
        System.out.println("Tank shots: " + shotToNorth + " to NORTH, " + shotToEast + " to EAST, " + shotToWest + " to WEST, " + shotToSouth + " to NORTH. " + "All shots: " + allShots);
        System.out.println("Position:" + "(" + xPosition + ";" + yPosition + ")" + " Directio to " + direction + "\n");
    }

    public void printActionDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDateTime = dateTime.format(dtf);
        System.out.print("[" + formattedDateTime + "]");
    }

}