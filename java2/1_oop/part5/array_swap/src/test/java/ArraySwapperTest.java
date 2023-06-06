import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySwapperTest {

    ArraySwapper swapper = new ArraySwapper();

    /* 14. Write a Java program that swaps two elements in an array list.  */
    @Test
    public void testSwap_withListAndValidIndexes_swapsListElementsByIndex() {
        //given
        final String element0 = "Element0";
        final String element3 = "Element3";
        final int index0 = 0;
        final int index3 = 3;

        List<String> givenArrayList = new ArrayList<>();
        givenArrayList.add(element0);
        givenArrayList.add("Element1");
        givenArrayList.add("Element2");
        givenArrayList.add(element3);

        //when
        swapper.swap(givenArrayList, index0, index3);

        //then
        assertEquals(givenArrayList.get(index0), element3);
        assertEquals(givenArrayList.get(index3), element0);
    }
}
