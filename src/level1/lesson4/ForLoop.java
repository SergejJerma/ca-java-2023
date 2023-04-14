package level1.lesson4;

public class ForLoop {
    public static void main(String[] args) {

        int[] age = {12, 4, 5};
        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("hello " + i);
        }
    }
}
