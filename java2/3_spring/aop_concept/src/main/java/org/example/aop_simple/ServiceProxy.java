package org.example.aop_simple;

public class ServiceProxy implements Service {

    private final Service target;

    public ServiceProxy(Service target) {
        this.target = target;
    }

    @Override
    public void doSomething() {
        System.out.println("Before doing something..."); // Before Advice
        target.doSomething();
        System.out.println("After doing something...");  // After Advice
    }
}
