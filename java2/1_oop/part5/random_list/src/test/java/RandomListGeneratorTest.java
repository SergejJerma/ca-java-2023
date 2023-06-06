import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    //  2. Add test and test that given size<0 it will generate an empty list
    @Disabled("Because the requirements have changed and I did not delete this test just so you have an example")
    @Test
    void generateArrayList_givenNegativeSize_generatesEmptyList() {
        //given
        final int sizeBelowZero = -1;

        //when
        List<Integer> integerList = randomListGenerator.generateArrayList(sizeBelowZero);

        //then
        assertEquals(0, integerList.size());
    }

    /* 3. Create MyIllegalArgumentException
         Update the test and test that given size=0 it will generate an empty list...
         but given size=-1 it will throw MyIllegalArgumentException
     */
    @Test
    void generateArrayList_givenNegativeSize_throwsMyIllegalArgumentException() {
        //given
        final int sizeBelowZero = -1;

        //when - then   //off-topic: Hey! - there's a lambda!
        assertThrows(MyIllegalArgumentException.class, () -> randomListGenerator.generateArrayList(sizeBelowZero));
    }

    /*  4. Add another method to your RandomListGenerator...
     The method must have 1 more input argument - upper bound, that would limit the randomly generated number
     For example: generateArrayList(int sizeToGenerate, int randomIntUpperBound)
     Make a test that would call generateArrayList 10 times ...
      and assert that none of randomly generated numbers exceed the upper bound.
     */
    @Test
    void generateArrayList_givenPositiveSizeAndUpperBound_generatesListOfIntegersWithin0AndUpperBound() {
        //given
        final int givenSize = 3;
        final int upperBound = 10;
        List<List<Integer>> listOfIntegerLists = new ArrayList<>();

        //when
        for (int i = 0; i < 10; i++)
            listOfIntegerLists.add(randomListGenerator.generateArrayList(givenSize, upperBound));

        //then
        for (int i = 0; i < 10; i++) {
            List<Integer> listToValidate = listOfIntegerLists.get(i);
            assertEquals(givenSize, listToValidate.size());
            listValuesAreWithinBounds(upperBound, listToValidate);
        }
    }

    private static void listValuesAreWithinBounds(int upperBound, List<Integer> integerList) {
        for (Integer integer : integerList)
            assertTrue(integer >= 0 && integer <= upperBound);
    }


}