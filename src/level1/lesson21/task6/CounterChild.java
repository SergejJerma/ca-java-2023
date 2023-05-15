package level1.lesson21.task6;

public class CounterChild extends Counter {

    @Override
    public void increment() {
        super.increment();
        System.out.println("CounterChild prints count = " + count);
    }
}
