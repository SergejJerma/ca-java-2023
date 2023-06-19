package java.some_package;

public class OuterClass {

    private String privateVariable = "privateVariable_inOuterClass";


    public class InnerClassNonStatic {

    }

    public static class InnerStaticClass {

    }

    public void someMethod() {
        //ony available in method scope
        class SomeInnerClassInMethod {
            int a, b;
            public void print() {
                System.out.println("SomeInnerClassInMethod is printing! OuterClass.this.privateVariable:"
                        + OuterClass.this.privateVariable);
            }
        }

        SomeInnerClassInMethod instance = new SomeInnerClassInMethod();
        instance.print();
    }

    public void someAnotherMethod() {
        //cannot reach - defined in another method
        //SomeInnerClassInMethod instance = new SomeInnerClassInMethod();
    }

    static class NonPublicInnerStaticClass {

    }

}


class NonInnerClass {

}