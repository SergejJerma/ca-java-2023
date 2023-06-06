public class MyCustomClass implements MyCustomFunctionality {

    @Override
    public String myMethod(String someInputArgument) {
        System.out.println("This is myMethod with someInputArgument=" + someInputArgument);
        return someInputArgument + " from MyCustomClass";
    }
}
