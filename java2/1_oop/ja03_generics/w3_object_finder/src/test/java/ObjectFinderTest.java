import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ObjectFinderTest {

    @Test
    void find_listOfStringContainingObjectToFind_returnsObjectIndex() {
        //given
        List<String> objectList = new ArrayList<>();
        objectList.add("haveToFind");
        objectList.add("someStuff");
        objectList.add("someMoreStuff");

        //when
        int index = ObjectFinder.find(objectList, "haveToFind");

        //then
        assertThat(index).isEqualTo(0);
    }

    @Test
    void find_listOfIntegerContainingObjectToFind_returnsObjectIndex() {
        //given
        List<Integer> objectLists = new ArrayList<>();
        objectLists.add(-5);
        objectLists.add(99);
        objectLists.add(1);

        //when
        int index = ObjectFinder.find(objectLists, 1);

        //then
        assertThat(index).isEqualTo(2);
    }

    @Test
    void find_listOfStringNotContainingObjectToFind_returnsMinusOne() {
        //given
        List<String> objectList = new ArrayList<>();
        objectList.add("cannotFind");
        objectList.add("theStuff");
        objectList.add("youAreLookingFor");

        //when
        int index = ObjectFinder.find(objectList, "haveToFind");

        //then
        assertThat(index).isEqualTo(-1);
    }

    @Test
    void find_listOfNumbersAndValidCondition_returnsListContainingElementsThatSatisfyCondition() {
        //given
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1.0);
        numberList.add(0);
        numberList.add(10);
        numberList.add(12.3f);
        numberList.add(-51.0d);
        numberList.add(1);
        numberList.add(-1);
        numberList.add(4);

        //when
        List<Number> filteredList = ObjectFinder.filterFind(numberList, (number) -> number.doubleValue() < 4.5d);

        //then
        assertThat(filteredList).isNotNull()
                .isNotEmpty()
                .hasSize(7)
                .contains(-51.0, -1, 1, 1.0, 0, 4);

        assertThat(filteredList.stream()
                .filter(number -> number.equals(1))
                .collect(Collectors.toList()))
                .hasSize(2);
    }
}