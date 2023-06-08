import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class UserInterfaceTest {


    @Test
    void getWordList() {
        //given
        Consumer<String> userWillObserveQuestion = (s) -> assertThat(s).isNotNull().isNotEmpty();
        Supplier<String> userWillTypeToConsole = () -> "Hello testable world!";

        UserInterface ui = new UserInterface(userWillTypeToConsole, userWillObserveQuestion);

        //when
        List<String> wordList = ui.getWordList();

        //then
        assertThat(wordList).isNotNull().isNotEmpty();
        assertThat(wordList.get(0)).isEqualTo("Hello");
        assertThat(wordList.get(1)).isEqualTo("testable");
        assertThat(wordList.get(2)).isEqualTo("world!");
    }

    @Test
    void getListBounds() {
        //given
        Consumer<String> userWillObserveQuestion = (s) -> assertThat(s).isNotNull().isNotEmpty();
        Supplier<String> userWillTypeToConsole = () -> "2 3";

        UserInterface ui = new UserInterface(userWillTypeToConsole, userWillObserveQuestion);

        //when
        int[] bounds = ui.getListBounds();

        //then
        assertThat(bounds).isNotNull().isNotEmpty().hasSize(2);
        assertThat(bounds[0]).isEqualTo(2);
        assertThat(bounds[1]).isEqualTo(3);
    }

    @Test
    void formatResult() {
        //given
        List<String> words = List.of("Hello", "testable", "world!");
        int[] bounds = {2, 3};
        List<String> result = List.of("testable", "world!");

        AtomicReference<String> resultToPrint = new AtomicReference<>();
        Consumer<String> userWillObserveResult = (s) -> resultToPrint.set(s);

        UserInterface ui = new UserInterface(null, userWillObserveResult);

        //when
        ui.showResult(words, bounds, result);

        //then
        assertThat(resultToPrint.get()).isNotNull().isNotEmpty()
                .contains("Hello")
                .contains("testable")
                .contains("world!")
                .contains("2")
                .contains("3");

        assertThat(containsWordTimes(resultToPrint.get(), "testable") ).isEqualTo(2);
        assertThat(containsWordTimes(resultToPrint.get(), "world!") ).isEqualTo(2);

    }

    private int containsWordTimes(String resultSentence, String word) {
        int sentenceLengthInitial = resultSentence.length();
        String whatIsLeft = resultSentence.replace(word, "");
        int sentenceLengthAfterWordRemoved = whatIsLeft.length();

        return (sentenceLengthInitial - sentenceLengthAfterWordRemoved) / word.length();
    }
}