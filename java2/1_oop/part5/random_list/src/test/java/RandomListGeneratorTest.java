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
}