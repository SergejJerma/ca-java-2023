package level1.lesson19.access_modifiers.pack_one;


public class IndependentClassInSamePackage {

    public void method() {
        ParentClass someonesElseParent = new ParentClass();

        //this keyword'o cia nepanaudosim - juk IndependentClass neekstendina ParentClass
//        this.getX_private();

        //private nepasiekiama
//        someonesElseParent.getX_private();
//        int x_private = someonesElseParent.x;

        //default pasiekiama (nes IndependentClassInSamePackage tam paciam pakete kaip ir ParentClass)
        someonesElseParent.getX_default();
        int x_default = someonesElseParent.x_default;

        //protected pasiekiama (nes IndependentClassInSamePackage tam paciam pakete kaip ir ParentClass)
        someonesElseParent.getX_protected();
        int x_protected = someonesElseParent.x_protected;

        //public pasiekiama visada
        someonesElseParent.getX_public();
        int x_public = someonesElseParent.x_public;
    }
}
