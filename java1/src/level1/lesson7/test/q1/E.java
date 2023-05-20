package level1.lesson7.test.q1;

class E {
    static int i = 1;

    void didintiI() {
        i++;
    }

    int nuskaitytiI() {
        return i;
    }

    public static void main(String[] args) {
        E e1 = new E();
        E e2 = new E();
        e1.didintiI();
        e2.didintiI();
        System.out.println(e1.nuskaitytiI()); // 3

        System.out.println(e2.nuskaitytiI()); //3
        System.out.println(E.i); // 3
    }
}