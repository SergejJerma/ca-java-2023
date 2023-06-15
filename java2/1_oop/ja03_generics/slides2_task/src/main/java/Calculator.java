import java.util.List;

public  class Calculator <T extends Number> {

    private T varA;
    private T varB;

    public Calculator(T varA, T varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public  Number sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public  Number sum() {
        return varA.doubleValue() + varB.doubleValue();
    }

    public void printList(List<? extends Number> list) {
        System.out.println("wildcard method reads items from list");
        for (Number n : list) {
            System.out.println(n.doubleValue());
        }
    }

    public  void addTenNumbers(List<? super Integer> list) {
        System.out.println("Lower bound wildcard method adds to list");
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Object object = list.get(0);
        //Integer integer = list.get(0);    //cannot properly read from list (but can write into it)
    }

    public  void  printListInAVeryAbstractWay(List<?> list) {
        System.out.println("Wildcard method only reads Object from list");
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
