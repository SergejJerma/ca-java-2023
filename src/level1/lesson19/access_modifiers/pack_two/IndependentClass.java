package level1.lesson19.access_modifiers.pack_two;

import level1.lesson19.access_modifiers.pack_one.ParentClass;


public class IndependentClass {

    public void method() {
        ParentClass someonesElseParent = new ParentClass();

        //this keyword'o cia nepanaudosim - juk IndependentClass neekstendina ParentClass
//        this.getX_private();

        // Private nepasiekiama
//        someonesElseParent.getX_private();
//        int x_private = someonesElseParent.x;

        // Protected nepasiekiama (nes IndependentClass neextend'ina ParentClass)
//        someonesElseParent.getX_default();
//        int x_default = someonesElseParent.x_default();

        // Protected nepasiekiama (nes IndependentClass neextend'ina ParentClass)
//        someonesElseParent.getX_protected();
//        int x_default = someonesElseParent.x_protected;

        //public pasiekiama visada
        someonesElseParent.getX_public();
        int x_public = someonesElseParent.x_public;
    }
}
