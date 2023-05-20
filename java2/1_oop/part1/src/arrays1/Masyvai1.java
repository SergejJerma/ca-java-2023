package arrays1;

public class Masyvai1 {
    public static void main(String[] args) {

        ParentClass[] myObjects = new ParentClass[5];
        myObjects[0] = new ChildClass(1);
        myObjects[1] = new ParentClass(2);
        myObjects[2] = new ChildClass(3);
        myObjects[3] = new ChildClass(4);
        myObjects[4] = new ParentClass(5);

        //Kokio ilgio masyvas;
        System.out.println("Print myObjects.length=" + myObjects.length);

        //Pirmą elementą;
        System.out.println("Print firstElement=" + myObjects[0]);

        //Paskutinį elementą;
        System.out.println("Print lastElement=" + myObjects[myObjects.length - 1]);

        //Visus elementus.
        System.out.println("Print allElements:");
        for (ParentClass arrayElemnt : myObjects) {
            System.out.println(arrayElemnt);
        }

    }
}
