public class Main {

    public static void main(String[] args) {
        concreteMethodImplementation();
        abstractMethodImplementation();
        functionAsAnonymousInnerClass();
        functionAsLambda();
    }

    private static void concreteMethodImplementation() {
        System.out.println("\nconcreteMethodImplementation:");
        MyCustomClass instanceOfMyClass = new MyCustomClass();
        String result = instanceOfMyClass.myMethod("Input for concrete implementation");
        System.out.println("myMethod result is: " + result);
    }

    private static void abstractMethodImplementation() {
        System.out.println("\nabstractMethodImplementation:");
        MyCustomFunctionality instanceOfMyClass = new MyCustomClass();
        String result = instanceOfMyClass.myMethod("Input for hidden implementation");
        System.out.println("myMethod result is: " + result);
    }

    /* MyCustomClass is not used in this method. Great - it's needless! */
    private static void functionAsAnonymousInnerClass() {
        System.out.println("\nfunctionAsAnonymousInnerClass:");
        MyCustomFunctionality instanceOfMyClass = new MyCustomFunctionality() {
            //What's the name of this class? Well there's no class name mentioned. Thus it's an anonymous class.
            //And also - it (the anonymous class) defined within some other class (Main). Therefore it's an inner class.
            //That's what an anonymous inner class is!
            @Override
            public String myMethod(String someInputArgument) {
                System.out.println("This is some functionality implemented within an anonymous inner class");
                return someInputArgument + " from anonymous inner class";
            }
        };
        String result = instanceOfMyClass.myMethod("Input for anonymous inner class");
        System.out.println("myMethod result is: " + result);
    }

    /* Here's all that's left after we take all the needless things from functionAsAnonymousInnerClass() */
    private static void functionAsLambda() {
        System.out.println("\nfunctionAsLambda:");
        MyCustomFunctionality pureFunctionalityImplementation = (someInputArgument) -> {
            System.out.println("This is some functionality implemented as a lambda");
            return someInputArgument + " from a lambda expression";
        };
        String result = pureFunctionalityImplementation.myMethod("Hello");
        System.out.println("myMethod result is: " + result);
    }
}
