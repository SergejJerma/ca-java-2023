package level1.tasks.tank;

import java.util.Scanner;

public class MainTank {

	public static void main(String[] args) {
		String command = "";

		Scanner sc = new Scanner(System.in);
		Tank tank = new Tank();
		boolean isProcessing = true;

		while (isProcessing) {
			System.out.println("Enter command: \n"
					+ "[n] - move to NORTH \n"
					+ "[s] - move to SOUTH \n"
					+ "[e] - move to EAST \n"
					+ "[w] - move to WEST \n"
					+ "[q] - SHOT \n"
					+ "[i] - print INFO \n"
					+ "[x] - EXIT");
			command = sc.next();
			
			switch(command.toLowerCase()) {
			case "n": tank.moveForward();
			break;
			case "s": tank.moveBack();
			break;
			case "e": tank.moveRight();
			break;
			case "w": tank.moveLeft();
			break;
			case "q": tank.doShot();
			break;
			case "i": System.out.println(tank);
			break;
			case "x": isProcessing = false;
			System.out.println("Gave Over");
			break;
			default: System.out.println("Wrong command!!!");
			}
		} 
			sc.close();
	}

}