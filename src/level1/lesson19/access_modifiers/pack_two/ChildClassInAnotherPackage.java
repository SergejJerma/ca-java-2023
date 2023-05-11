package level1.lesson19.access_modifiers.pack_two;

import level1.lesson19.access_modifiers.pack_one.ParentClass;

public class ChildClassInAnotherPackage extends ParentClass {

    public void method() {
        ParentClass parentInstance = new ParentClass();

        //private nepasiekiama
//        this.getX_private();
//        int x = this.x;

        //default nepasiekiama (nes ChildClassInAnotherPackage yra kitam pakete "pack_two", nei ParentClass "pack_one")
//        this.getX_default();
//        int x_default = this.x_default;

        //protected pasiekiama (nes ChildClassInAnotherPackage extends ParentClass)
        this.getX_protected();
        int x_protected = this.x_protected;

        //public pasiekiama visada
        this.getX_public();
    }
}
