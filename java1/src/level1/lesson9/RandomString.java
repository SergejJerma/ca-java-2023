package level1.lesson9;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        generateRandomString();
        generateRandomInt();
    }

    private static void generateRandomInt() {
        Random randomGenerator = new Random();
        for (int i = 0; i < 20; i++) {
            int randomInt = (int) Math.round(randomGenerator.nextDouble() * 2);
            System.out.println(randomInt);
        }
    }

    private static void generateRandomString() {
        Random randomGenerator = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            char randomChar = (char) Math.round(randomGenerator.nextDouble() * 255);
            System.out.println(randomChar);
            stringBuilder.append(randomChar);
        }
        String randomString = stringBuilder.toString();
        System.out.println("randomString = " + randomString);
    }
}
