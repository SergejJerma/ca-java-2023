package org.example.aop_simple;

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Service proxy = new ServiceProxy(service);
        proxy.doSomething(); // This will print before and after messages around the core functionality.
    }
}
