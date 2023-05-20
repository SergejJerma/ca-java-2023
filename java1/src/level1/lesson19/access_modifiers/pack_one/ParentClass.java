package level1.lesson19.access_modifiers.pack_one;

public class ParentClass {

    private int x;
    int x_default;
    protected int x_protected;
    public int x_public;

    private int getX_private() {
        return x;
    }

    int getX_default() {
        return x;
    }

    protected int getX_protected() {
        return x;
    }

    public int getX_public() {
        return x;
    }


}
