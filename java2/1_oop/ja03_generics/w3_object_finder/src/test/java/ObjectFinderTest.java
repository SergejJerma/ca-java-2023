import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
}