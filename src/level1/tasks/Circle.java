package level1.tasks;

import java.util.Scanner;

public class Circle {
    public static final double PI_NUMBER = 3.1428;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius: ");
        double radius = sc.nextDouble();

        countCircleSquare(radius);
    }

    private static void countCircleSquare(double radius) {
        double square = 2 * PI_NUMBER * radius;
        System.out.println("square: " + square);
    }
}
