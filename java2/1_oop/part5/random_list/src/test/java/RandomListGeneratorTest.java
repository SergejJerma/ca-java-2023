import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RandomListGeneratorTest {

    private RandomListGenerator randomListGenerator = new RandomListGenerator();

    //0. Write a Java program to create an array list of random integers of a specified size
    @Test
    void generateArrayList_givenPozitiveSize_generatesListOfIntegers() {
        //given
        final int givenSize = 3;

        //when
        List<Integer> integerList = randomListGenerator.generateArrayList(givenSize);

        //then
        assertEquals(givenSize, integerList.size());
        assertNotNull(integerList.get(0));
        assertNotNull(integerList.get(1));
        assertNotNull(integerList.get(2));
    }

    //   1. Test that given size=0 it will generate an empty list
    @Test
    void generateArrayList_givenZeroSize_generatesEmptyList() {
        //given
        final int size0 = 0;

        //when
        List<Integer> integerList = randomListGenerator.generateArrayList(size0);

        //then
        assertEquals(size0, integerList.size());
    }
}