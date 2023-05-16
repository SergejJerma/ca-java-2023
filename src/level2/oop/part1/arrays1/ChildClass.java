package level2.oop.part1.arrays1;

public class ChildClass extends ParentClass {

    public ChildClass(int instanceVariable) {
        super(instanceVariable);
    }

    @Override
    public String toString() {
        //A local variable stores temporary state; it is declared inside a local variable
        String local = "localVariable";
        System.out.println(local);
        return "I am parent having instanceVariable " + getInstanceVariable() + " and sharing classVariable " + classVariable;
    }
}
