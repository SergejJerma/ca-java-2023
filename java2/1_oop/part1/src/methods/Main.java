package methods;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        methodSample("str", 10, 20);
    }

    //static - static pazymi, kad metodas (kintamasis) priklauso klasei (visiems klases instance bendrai)
    /* access modifier */public /* method type modifier */ static /* return type */ void /* method name */ methodSample( /* arguments */ String strArg, int ...arguments) {

        /* method body */

        System.out.println(arguments[0]);
        System.out.println(Arrays.toString(arguments));
    }

}
