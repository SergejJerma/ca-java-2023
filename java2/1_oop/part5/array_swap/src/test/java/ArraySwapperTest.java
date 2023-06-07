import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    void sort_givenListOfStrings_sortsThemAlphabetically() {
        //given
        List<String> listToSort = new ArrayList<>();
        listToSort.add("b");
        listToSort.add("a");
        listToSort.add("c");

        //when
        swapper.sort(listToSort);

        //then (assert using assertj (library; look into .pom file))
        assertThat(listToSort).size().isEqualTo(3);

        assertThat(listToSort.get(0)).isEqualTo("a");
        assertThat(listToSort.get(1)).isEqualTo("b");
        assertThat(listToSort.get(2)).isEqualTo("c");
    }
}
