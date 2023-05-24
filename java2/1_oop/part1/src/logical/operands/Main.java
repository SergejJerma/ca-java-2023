package logical.operands;

public class Main {
    public static void main(String[] args) {

        testExclusiveOr(false, false);
        testExclusiveOr(false, true);
        testExclusiveOr(true, false);
        testExclusiveOr(true, true);

        testDoubleAnd();
        testAnd();

        testAndWithBytes();
        useCaseOfASingleAndOperand();
    }

    private static void useCaseOfASingleAndOperand() {
        //1111_0000 :mask
        //1100_0000 :ip
        // &
        //1100_0000 is same as ip (the good one)
        int maskThatAllowsToPass = 0b1111_0000;
        int goodIp = 192;   //1100_0000
        System.out.println("ip " + goodIp + " can pass firewall? " + canItPassFireWall(maskThatAllowsToPass, goodIp));

        //1111_0000 :mask
        //1010_1000 :ip
        // &
        //1010_0000 is not same as ip (the bad one)
        int badIp = 168;   //1010 1000
        System.out.println("ip " + badIp + " can pass firewall? " + canItPassFireWall(maskThatAllowsToPass, badIp));
    }

    private static boolean canItPassFireWall(int maskThatAllowsToPass, int ip) {
//        return (maskThatAllowsToPass && ip) == ip; //does not compile
        return (maskThatAllowsToPass & ip) == ip;       //bitwise AND operation
    }

    private static void testAndWithBytes() {
        System.out.println(192 & 255);
    }

    //&& way more safe and efficient
    private static void testDoubleAnd() {
        //prints: returnTrue returnTrue returnFalse
        if (returnTrue() && returnTrue() && returnFalse() && returnTrue()) {
            System.out.println("Both are true");
        } else {
            System.out.println("err");
        }
    }

    private static void testAnd() {
        //prints: returnTrue returnTrue returnFalse returnTrue
        if (returnTrue() & returnTrue() & returnFalse() & returnTrue()) {
            System.out.println("Both are true");
        } else {
            System.out.println("err");
        }
    }

    private static boolean returnFalse() {
        System.out.println("returnFalse");
        return false;
    }

    private static boolean returnTrue() {
        System.out.println("returnTrue");
        return true;
    }

    private static void testExclusiveOr(boolean a, boolean b) {
        if (a ^ b) {
            System.out.println("Either only a is true or only b is true");
        } else {
            System.out.println("err");
        }
    }
}
