//import some_package.NonInnerClass;
import some_package.OuterClass;

public class Main {

    public static void main(String[] args) {
        //Jei vidinė ir išorinė yra public, kitos klasės taip pat gali kurti vidinės klasės tipo egzempliorius.
        //Tai daroma tokiu būdu:
        OuterClass outerClassInstance = new OuterClass();
        OuterClass.InnerClassNonStatic innerClassNonStaticInstance = outerClassInstance.new InnerClassNonStatic();

        OuterClass.InnerStaticClass innerStaticClassInstance = new OuterClass.InnerStaticClass();
        //OuterClass.NonPublicInnerStaticClass nonPublicInnerStaticClassInstance = new OuterClass.NonPublicInnerStaticClass();

        //NonInnerClass nonInnerClass = new NonInnerClass();

    }

}
