import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListCutterTest {

    private ListCutter cutter = new ListCutter();

    @Test
    void cut() {
        //given
        List<String> givenList = List.of("a", "b", "c", "d", "b", "c");

        //when
        List<String> result = cutter.cut(givenList, 1, 3);

        //then
        assertThat(result).isNotNull().isNotEmpty()
                .containsSequence("b", "c", "d");

    }
}