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

        assertThat(result.get("")).isNotNull()
                .hasSize(2)
                .contains(0, 7);

        assertThat(result.get("a")).isNotNull()
                .hasSize(1)
                .contains(1);

        assertThat(result.get("b")).isNotNull()
                .hasSize(1)
                .contains(2);

        assertThat(result.get("c")).isNotNull()
                .hasSize(1)
                .contains(3);

        assertThat(result.get("d")).isNotNull()
                .hasSize(3)
                .contains(4, 5, 6);
    }
}