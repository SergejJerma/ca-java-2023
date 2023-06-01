package polymorphism.interfaces.example;

public class MainInt {
    public static void main(String[] args) {
        C cc = new C();
        cc.af();
        cc.bf();

        A aa = cc;
        aa.af();

        B bb = cc;
        bb.bf();
    }

}
