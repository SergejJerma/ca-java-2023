package arrays1;

public class ParentClass {

    // The term "class variable" is another name for static field
    static int classVariable = 10;  //all instances share the same value

    // The term "instance variable" is another name for <nonstatic field>
    private int instanceVariable;   //every instance (every object instantiated) has its own value

    private Integer uninitializedVariable;

    public ParentClass(int instanceVariable) {
        //System.out.println(uninitializedVariable);  // prints null
        //uninitializedVariable.doubleValue();  // throws NullPointerException
        this.instanceVariable = instanceVariable;
    }

    @Override
    public String toString() {
        return "I am parent having instanceVariable " + instanceVariable + " and sharing classVariable " + classVariable;
    }

    public int getInstanceVariable() {//char double float int byte boolean short long
        return instanceVariable;
    }
}
