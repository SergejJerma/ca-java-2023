import java.util.ArrayList;
import java.util.List;

public class ListMerger {

    public static <T> List<T> merge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>(list1.size() + list2.size());
        boolean pointer = false;
        int a = 0;
        int b = 0;
        boolean done = false;

        while (!done) {
            if (pointer && a < list1.size()) {
                mergedList.add(list1.get(a));
                pointer = false;
                a++;
            } else if (!pointer && b < list2.size()) {
                mergedList.add(list2.get(b));
                pointer = true;
                b++;
            } else {
                done = true;
            }
        }

        return mergedList;
    }
}
