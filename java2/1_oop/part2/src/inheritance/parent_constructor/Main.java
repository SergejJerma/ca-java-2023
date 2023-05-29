package inheritance.parent_constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nInstantiating First - creating first1");
        First first1 = new First();

        System.out.println("\nInstantiating Second - creating second1");
        Second second1 = new Second();

        System.out.println("\nInstantiating Third - creating third1");
        Third third1 = new Third();

        System.out.println("Parent class constructor is always called before the child class constructor!");

        System.out.println("\nInstantiating First - creating first2");
        First first2 = new First("paramA");

        System.out.println("\nInstantiating Second - creating second2");
        Second second2 = new Second("paramB");

        System.out.println("\nInstantiating Third - creating third2");
        Third third2 = new Third("paramC");

    }
}

class First {

    private String someParameterFirst;

    //if there's no default constructor (comment this out)
    // then you must use super() in child class and provide arguments for parent class constructor
    public First() {
        System.out.println("\tNoArgsConstructor in First");
    }

    public First(String someParameterFirst) {
        System.out.println("\tAllArgsConstructor in First\tsomeParameterFirst: " + someParameterFirst);
        this.someParameterFirst = someParameterFirst;
    }
}

class Second extends First {

    private String someParameterSecond;

    public Second() {
        //super();  //not required - parent class constructor is always called before child class constructor anyway
        System.out.println("\tNoArgsConstructor in Second");
        //super();    //super must be the first statement in the constructor (if it's used at all)
    }

    public Second(String someParameterSecond) {
        //super(someParameterSecond);
        System.out.println("\tConstructor in Second\tsomeParameterSecond: " + someParameterSecond);
        this.someParameterSecond = someParameterSecond;
    }

}

class Third extends Second {

    private String someParameterThird;

    public Third() {
        System.out.println("\tNoArgsConstructor in Third");
    }

    public Third(String someParameterThird) {
        System.out.println("\tConstructor in Third\tsomeParameterThird: " + someParameterThird);
        this.someParameterThird = someParameterThird;
    }

}
