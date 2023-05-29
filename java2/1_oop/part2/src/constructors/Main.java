package constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
}

class SomeClass {

    final Map<String, String> finalProperty;
    String dynamicProperty;

    //no args constructor (constructor without arguments)
    public SomeClass() {
        this.finalProperty = null;
    }

    //required args constructor (constructor with arguments)
    public SomeClass(Map<String, String> finalProperty) {
        this.finalProperty = finalProperty;
    }

    //all args constructor (constructor with arguments)
    public SomeClass(Map<String, String> finalProperty, String dynamicProperty) {
        this.finalProperty = finalProperty;
        this.dynamicProperty = dynamicProperty;
    }

    public void setFinalProperty(Map<String, String> finalProperty) {
        //Shallowly immutable property: we cannot change reference to it. But we can change it.
        //this.finalProperty = finalProperty;  //cannot set final property
        finalProperty.put("key", "value");
    }

    public void doSomething() {
        //you won't see that often nowadays, but 'final' is good for performance
        final List<String> whateverVariable = new ArrayList<>();
        //whateverVariable = new ArrayList<>();     //reference to variable declared as final cannot be changed
        whateverVariable.add("some value");         //...but you can still modify the value itself
    }


    //method declared as final cannot be overridden
    public final void finalMethod() {
        System.out.println("I shall not override me!");
    }
}


//class declared as final cannot extended
final class SomeChildClass extends SomeClass {

    //method declared as final cannot be overridden
//    @Override
//    public final void finalMethod() {
//
//    }

}

//cannot extend class that's declared as final
//class SomeAnotherClass extends SomeChildClass {
//
//}


