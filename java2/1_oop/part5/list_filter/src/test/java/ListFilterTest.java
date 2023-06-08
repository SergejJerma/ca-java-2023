import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ListFilterTest {

    private ListFilter listFilter = new ListFilter();

    @Test
    void countStrings_givenListAndSubstring_countsHowManyWordsStartWithSubstringInTheList() {
        //given
        List<String> sampleList = List.of("labas", "laba", "kokteilis", "vakaras", "laukiu");
        String subString = "la";

        //when
        int result = listFilter.countStrings(sampleList, subString);

        //then
        assertThat(result).isEqualTo(3);
    }
}