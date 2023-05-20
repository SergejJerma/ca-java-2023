package pass_by_ref;

import java.util.Arrays;

public class PassByRef {

    public static void main(String[] args) {
        boolean testPrimitive = false;
        attemptToChangeValuePassedByCopyOfValue(testPrimitive);
        System.out.println(testPrimitive);  // nepasikeicia - islieka false (nes nukopijavom pacia verte)


        Asmuo asmuo = new Asmuo("a", "p", "a");
        changeObjectPassedByCopyOfReference(asmuo);
        System.out.println(asmuo.getPavarde()); //pasikeicia pavarde (nes perdaveme nuoroda i objekta)

        int[] integerArray = {1, 2, 3};
        changeArrayPassedByCopyOfReference(integerArray);
        System.out.println(Arrays.toString(integerArray));  //pasikeicia (nes perdaveme nuoroda i objekta)
    }

    private static void changeArrayPassedByCopyOfReference(int[] copyOfRReferenceToIntegerArray) {
        copyOfRReferenceToIntegerArray[1] = 55;
        System.out.println("changedTo: " + Arrays.toString(copyOfRReferenceToIntegerArray));
    }

    public static void changeObjectPassedByCopyOfReference(Asmuo copyOfReferenceToObject) {
        copyOfReferenceToObject.setPavarde("pavarde");
        System.out.println("changedTo: " + copyOfReferenceToObject);
    }

    public static void attemptToChangeValuePassedByCopyOfValue(boolean copyOfActualValue) {
        copyOfActualValue = true;
        System.out.println("changedTo: " + copyOfActualValue);
    }


}
