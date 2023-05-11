package level1.lesson19.access_modifiers.pack_one;

public class ChildClassInSamePackage extends ParentClass {

    public void method() {

        //private nepasiekiama
//        this.getX_private();
//        int x = this.x;

        //default pasiekiama (ChildClassInSamePackage yra tam paciam pakete "pack_one", kaip ir ParentClass)
        this.getX_default();
        int x_default = this.x_default;

        //protected pasiekiama (nes ChildClassInAnotherPackage extends ParentClass)
        this.getX_protected();
        int x_protected = this.x_protected;

        //public pasiekiama visada
        this.getX_public();
    }
}
