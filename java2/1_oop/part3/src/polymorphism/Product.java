package polymorphism;

//Abstract class provides common functionality for all subclasses
public abstract class Product {

    //common functionality for all subclasses (every subclass will have this method implemented)
    //abstract method only has (is) a declaration; with no realization (no implementation) of the functionality
    abstract boolean isNotExpired();

    //method having declaration and realization (implementation) of some functionality
    public boolean isNotExpired2() {
        return false;
    }

}
