import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 0. Write a Java program to create an array list of random integers of a specified size
  1. Test that given size=0 it will generate an empty list
  2. Add test and test that given size<0 it will generate an empty list
  3. Create MyIllegalArgumentException
     Update the test and test that given size=0 it will generate an empty list...
     but given size=-1 it will throw MyIllegalArgumentException
  4. Add another method to your RandomListGenerator...
     The method must have 1 more input argument - upper bound, that would limit the randomly generated number
     For example: generateArrayList(int sizeToGenerate, int randomIntUpperBound)
     Make a test that would call generateArrayList 10 times ...
      and assert that none of randomly generated numbers exceed the upper bound.
  5. Add another method to your RandomListGenerator...
     The method must have 1 more input argument - lower bound, that would limit the randomly generated number
     For example: generateArrayList(int sizeToGenerate, int randomIntUpperBound, int lowerBound)
     Make a test that would call generateArrayList 10 times ...
      and assert that none of randomly generated numbers exceed the upper and lower bounds.
 */
public class RandomListGenerator {

    private Random random = new Random();

    // 0. Write a Java program to create an array list of random integers of a specified size
    public ArrayList<Integer> generateArrayList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        return list;
    }

}
