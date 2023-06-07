import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LinkedListDescriberTest {

    private LinkedListDescriber describer = new LinkedListDescriber();

    @Test
    void describe() {
        //given
        List<String> sampleList = Arrays.asList("", "a", "b", "c", "d", "d", "d", "");

        //when
        Map<String, Integer[]> result = describer.describe(sampleList);

        //then
        assertThat(result).isNotNull()
                .hasSize(5)
                .containsKeys("", "a", "b", "c", "d");
    }
}