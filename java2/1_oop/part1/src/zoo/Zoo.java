package zoo;

/**
 * How to compile and run using command line:
 * open terminal at ca-java-2023\src and run
 * javac level2/oop/part1/Zoo.java
 * java level2.oop.part1.Zoo argument1 argument2
 *
 * Zoo.java - uncompiled java file
 * Zoo - name of class having main method
 * argument1, argument2, ..., argumentN - arguments passed to main method
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
