import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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


}