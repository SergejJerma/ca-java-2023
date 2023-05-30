package object_init;

import java.util.ArrayList;
import java.util.List;

class Whatever {
    //you can initialize a variable with value returned from a method
    public static List<String> myVar = initializeClassVariable();

    private static List<String> initializeClassVariable() {
        return new ArrayList<>() {{ //not recommended (Sonar Lint won't be happy)
            add("foo");
            add("bar");
        }};
    }

    public static void main(String[] args) {
        System.out.println(myVar);
    }
}
