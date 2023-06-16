import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListMergerTest {

    @Test
    void merge() {
        //given
        List<String> list1 = new ArrayList<>();
        list1.add("first0");
        list1.add("first1");
        list1.add("first2");

        List<String> list2 = new ArrayList<>();
        list2.add("second0");
        list2.add("second1");
        list2.add("second2");

        //when
        List<String> result = ListMerger.merge(list1, list2);

        //then
        assertThat(result).isNotNull()
                .isNotEmpty()
                .hasSize(6)
                .contains("first0");
    }
}