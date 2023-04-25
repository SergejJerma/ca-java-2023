package level1.lesson7.test.q4;

public class ArrayExample {
    public static void main(String[] args) {
        String[] ar = {"1", "2", "3", "4"};
        printLastElement(ar);
    }

    static void printLastElement(String[] myArray) {
        System.out.println("Last element below:");
        System.out.println(myArray[myArray.length-1]);
    }
}
