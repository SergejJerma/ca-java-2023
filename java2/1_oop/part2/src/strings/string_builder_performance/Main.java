package strings.string_builder_performance;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        long startTime = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            sb.append(String.valueOf(i));
        }
        long stringBuilderExecutionTime = System.nanoTime() - startTime;
        System.out.println("Time wasted = " + stringBuilderExecutionTime + " nanoseconds");


        long startTime2 = System.nanoTime();
        String s = "";
        for (int i = 0; i < 10_000; i++) {
            s += String.valueOf(i);
        }
        long stringAdditionTime = System.nanoTime() - startTime2;
        System.out.println("Time wasted = " + stringAdditionTime + " nanoseconds");

        System.out.println("String builder is " + stringAdditionTime / stringBuilderExecutionTime + " times faster!");



        long startTime3 = System.nanoTime();
        String s3 = "";
        for (int i = 0; i < 10_000; i++) {
            s3 = s3.join(String.valueOf(i));
        }
        long stringAdditionTime3 = System.nanoTime() - startTime3;
        System.out.println("Time wasted = " + stringAdditionTime3 + " nanoseconds");
        System.out.println("String builder is " + stringAdditionTime3 / stringBuilderExecutionTime + " times faster!");

    }
}
