public class Main {

    public static void main(String[] args) {
        concreteMethodImplementation();
        abstractMethodImplementation();
        functionAsAnonymousInnerClass();
        functionAsLambda();
    }

    /* Here's all that's left after we take all the needless things from functionAsAnonymousInnerClass() */
    private static void functionAsLambda() {
        MyCustomFunctionality pureFunctionalityImplementation = (someInputArgument) -> {
                System.out.println("This is some functionality implemented as a lambda");
                return someInputArgument + " from a lambda expression";
        };
        pureFunctionalityImplementation.myMethod("Hello");
    }

    /* MyCustomClass is not used in this method. Great - it's needless! */
    private static void functionAsAnonymousInnerClass() {
        MyCustomFunctionality instanceOfMyClass = new MyCustomFunctionality() {
            @Override
            public String myMethod(String someInputArgument) {
                System.out.println("This is some functionality implemented within an anonymous inner class");
                return someInputArgument + " from anonymous inner class";
            }
        };
        instanceOfMyClass.myMethod("Hello");
    }

    private static void concreteMethodImplementation() {
        MyCustomClass instanceOfMyClass = new MyCustomClass();
        instanceOfMyClass.myMethod("Hello");
    }

    private static void abstractMethodImplementation() {
        MyCustomFunctionality instanceOfMyClass = new MyCustomClass();
        instanceOfMyClass.myMethod("Hello");
    }
}
